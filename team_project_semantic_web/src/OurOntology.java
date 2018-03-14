package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

public class OurOntology {

	public OurOntology() {

	}

	public static OWLOntology getOurOntology() {
		try {
			OWLOntologyManager man = OWLManager.createOWLOntologyManager();
			String fileName = "./team_project_semantic_web/src/root-ontology.owl";
			File file = new File(fileName);

			OWLOntology o = man.loadOntologyFromOntologyDocument(file);
			System.out.println(o);
			/*
			 * OWLDataFactory df = man.getOWLDataFactory();
			 * OWLReasonerFactory rf = new ReasonerFactory();
			 * OWLReasoner r = rf.createReasoner(o);
			 * r.precomputeInferences(InferenceType.CLASS_HIERARCHY);
			 * r.getSubClasses(df.getOWLClass("http://webprotege.stanford.edu/R7H4bmcf6rOqPHpkWrWU0iA"), false);
			 * System.out.println(o);
			 */
			return o;

		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static OWLOntology getProcessOntology(String processId) {
		try {
			OWLOntologyManager man = OWLManager.createOWLOntologyManager();
			String path = "./documents" + File.pathSeparator + processId + File.pathSeparator + ".owl";
			File file = new File(path);

			OWLOntology onto = man.loadOntologyFromOntologyDocument(file);

			return onto;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void saveOntology(OWLOntology onto, String processId) {
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		try {
			String path = "./documents" + File.pathSeparator + processId + File.pathSeparator + ".owl";
			File file = new File(path);
			RDFXMLDocumentFormat rdfxmlFormat = new RDFXMLDocumentFormat();
			manager.saveOntology(onto, rdfxmlFormat, IRI.create(file.toURI()));
		} catch (OWLOntologyStorageException e) {
			e.printStackTrace();
		}
	}

	public static void checkRulesForProcess(OWLOntology onto, String processId) {

		String result = "";
		writeResultFile(result, processId);
	}

	public static void writeResultFile(String output, String processId) {
		String path = "./checkResults" + File.pathSeparator + processId + ".txt";
		try {
			PrintWriter writer = new PrintWriter(path);
			writer.print(output);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
