package team_project_semantic_web.src.addIndividuals;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.semanticweb.kaon2.api.DefaultOntologyResolver;
import org.semanticweb.kaon2.api.KAON2Manager;
import org.semanticweb.kaon2.api.Ontology;
import org.semanticweb.kaon2.api.OntologyChangeEvent;
import org.semanticweb.kaon2.api.OntologyManager;
import org.semanticweb.kaon2.api.formatting.OntologyFileFormat;
import org.semanticweb.kaon2.api.owl.elements.Individual;
import org.semanticweb.kaon2.api.owl.elements.OWLClass;

public class AddProcess {
	private String sProcessName;
	private String sProcessing;
	private String sData;
	private Date iFirstProcessingDate;
	private final String URI = "http://kaon2.semanticweb.org/gdprcheck";

	public AddProcess(String sProcessName, String sProcessing, String sData, Date iFirstProcessingDate) {
		// TODO Auto-generated constructor stub
		this.sProcessName = sProcessName;
		this.sProcessing = sProcessing;
		this.sData = sData;
		this.iFirstProcessingDate = iFirstProcessingDate;
	}

	public void createIndividualOfProcess() {// TODO add arguments that continue all necessary information that is needed for creating an
												// individual of the process
		try {
			OntologyManager ontologyManager = KAON2Manager.newOntologyManager();
			DefaultOntologyResolver resolver = new DefaultOntologyResolver();
			String physicalAdress = "";
			resolver.registerReplacement(URI, physicalAdress); // TODO specify the right URI //TODO specify the right physical address
			ontologyManager.setOntologyResolver(resolver);

			Ontology onto = ontologyManager.openOntology(URI, new HashMap<String, Object>());
			Ontology changedOnto = this.makeChangeToProcess(onto);
			String filename = "";// TODO change the file name to the file and location that we need
			String secondString = ""; // TODO rename it and find out what this string is used for
			changedOnto.saveOntology(OntologyFileFormat.OWL_XML, new File(filename), secondString);// TODO check if this is the file format
																									// that we want
			ontologyManager.close(); // close connection after individual is created
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Ontology makeChangeToProcess(Ontology onto) {
		try {
			List<OntologyChangeEvent> changes = new ArrayList<OntologyChangeEvent>();
			// TODO add individuals of processing, firstprocessingdate, data
			Individual process = KAON2Manager.factory().individual(URI + "#" + this.sProcessName);
			Individual processingIndividual = KAON2Manager.factory().individual(URI + "#" + this.sProcessing);
			Individual firstProcessingDateIndividual = KAON2Manager.factory().individual(URI + "#" + this.iFirstProcessingDate);
			// TODO for data -> create individuals directly of the subclass
			Individual data = KAON2Manager.factory().individual(URI + "#" + this.sData);
			OWLClass ethnicData;
			switch (sDatatype) {
			// TODO create cases for all subclasses of data
			case sEthnicData:
				ethnicData = KAON2Manager.factory().owlClass(URI + "#" + "ethnicData");
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(ethnicData, data), OntologyChangeEvent.ChangeType.ADD));
				break;
			default:
				break;

			}
			// TODO for processing add individuals for the things that are related to processing (...)

			onto.applyChanges(changes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return onto;
	}
}
