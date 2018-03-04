package team_project_semantic_web;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.semanticweb.kaon2.api.DefaultOntologyResolver;
import org.semanticweb.kaon2.api.KAON2Manager;
import org.semanticweb.kaon2.api.Ontology;
import org.semanticweb.kaon2.api.OntologyChangeEvent;
import org.semanticweb.kaon2.api.OntologyManager;
import org.semanticweb.kaon2.api.formatting.OntologyFileFormat;
import org.semanticweb.kaon2.api.owl.elements.Individual;
import org.semanticweb.kaon2.api.owl.elements.OWLClass;
import org.semanticweb.kaon2.api.owl.elements.ObjectProperty;

public class Process {
	private String sProcessName;
	private String sProcessing;
	private String sData;
	private Date iFirstProcessingDate;
	private final String URI = "http://kaon2.semanticweb.org/gdprcheck";

	public Process() {
	}

	public void createIndividualOfProcess(JSONObject json) {// TODO add arguments that continue all necessary information that is needed for
															// creating an
		// individual of the process
		try {
			OntologyManager ontologyManager = KAON2Manager.newOntologyManager();
			DefaultOntologyResolver resolver = new DefaultOntologyResolver();
			String physicalAdress = "";
			resolver.registerReplacement(URI, physicalAdress); // TODO specify the right physical address
			ontologyManager.setOntologyResolver(resolver);

			Ontology onto = ontologyManager.openOntology(URI, new HashMap<String, Object>());
			Ontology changedOnto = this.makeChangeToProcess(onto, json);
			String filename = "";// TODO change the file name to the file and location that we need
			String secondString = ""; // TODO rename it and find out what this string is used for
			changedOnto.saveOntology(OntologyFileFormat.OWL_XML, new File(filename), secondString);// TODO check if this is the file format
																									// that we want
			ontologyManager.close(); // close connection after individual is created
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Ontology makeChangeToProcess(Ontology onto, JSONObject json) {
		try {
			List<OntologyChangeEvent> changes = new ArrayList<OntologyChangeEvent>();
			// TODO add individuals of processing, firstprocessingdate, data
			OWLClass process = KAON2Manager.factory().owlClass(URI + "#process");
			OWLClass processing = KAON2Manager.factory().owlClass(URI + "#processing");
			OWLClass firstProcessingDate = KAON2Manager.factory().owlClass(URI + "#firstProcessingDate");
			Individual processIndividual = KAON2Manager.factory().individual(URI + "#" + this.sProcessName);
			Individual processingIndividual = KAON2Manager.factory().individual(URI + "#" + this.sProcessing);
			Individual firstProcessingDateIndividual = KAON2Manager.factory().individual(URI + "#" + this.iFirstProcessingDate);
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(process, processIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(processing, processingIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(firstProcessingDate, firstProcessingDateIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			// TODO for data -> create individuals directly of the subclass
			Individual dataIndividual = KAON2Manager.factory().individual(URI + "#" + this.sData);
			OWLClass ethnicData;
			OWLClass data;
			switch (sDatatype) {
			// TODO create cases for all subclasses of data
			case sEthnicData:
				ethnicData = KAON2Manager.factory().owlClass(URI + "#ethnicData");
				data = ethnicData;
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(ethnicData, dataIndividual), OntologyChangeEvent.ChangeType.ADD));
				break;
			default:
				break;

			}
			// TODO add relationships between individuals
			ObjectProperty has = KAON2Manager.factory().objectProperty(URI + "#has");
			// process has processing, process has data and process has first processing date
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, process), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, processing), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, process), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, firstProcessingDate), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, process), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, data), OntologyChangeEvent.ChangeType.ADD));
			// TODO for processing add individuals for the things that are related to processing (...)

			onto.applyChanges(changes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return onto;
	}
}
