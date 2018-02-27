package team_project_semantic_web.src.addIndividuals;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.semanticweb.kaon2.api.DefaultOntologyResolver;
import org.semanticweb.kaon2.api.KAON2Exception;
import org.semanticweb.kaon2.api.KAON2Manager;
import org.semanticweb.kaon2.api.Ontology;
import org.semanticweb.kaon2.api.OntologyChangeEvent;
import org.semanticweb.kaon2.api.OntologyManager;
import org.semanticweb.kaon2.api.formatting.OntologyFileFormat;

public class AddProcess {

	public AddProcess() {
		// TODO Auto-generated constructor stub
	}

	public void createIndividualOfProcess() {// TODO add arguments that continue all necessary information that is needed for creating an
												// individual of the process
		try {
			OntologyManager ontologyManager = KAON2Manager.newOntologyManager();
			DefaultOntologyResolver resolver = new DefaultOntologyResolver();
			String uri = "";
			String physicalAdress = "";
			resolver.registerReplacement(uri, physicalAdress); // TODO specify the right URI //TODO specify the right physical address
			ontologyManager.setOntologyResolver(resolver);

			Ontology onto = ontologyManager.openOntology(uri, new HashMap<String, Object>());
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
			// TODO for data -> create individuals directly of the subclass
			// TODO for processing add individuals for the things that are related to processing (...)

			onto.applyChanges(changes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return onto;
	}

	private void createIndividualOfProcessing(Ontology onto) {
		try {
			List<OntologyChangeEvent> changes = new ArrayList<OntologyChangeEvent>();
			onto.applyChanges(changes);
		} catch (KAON2Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void createIndividualOfData(Ontology onto) {
		try {
			List<OntologyChangeEvent> changes = new ArrayList<OntologyChangeEvent>();
			onto.applyChanges(changes);
		} catch (KAON2Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
