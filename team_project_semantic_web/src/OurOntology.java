package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.WriterDocumentTarget;
import org.semanticweb.owlapi.model.OWLClass;
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

			return o;

		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static OWLOntology getProcessOntology(String processId) {
		try {
			OWLOntologyManager man = OWLManager.createOWLOntologyManager();
			String stringPath = "team_project_semantic_web/src/" + processId + ".owl";
			File file = new File(stringPath);
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
			// Create a file for the new format
			String path = "./team_project_semantic_web/src/" + processId + ".owl";
			File fileformatted = new File(path);
			System.out.println(fileformatted);
			RDFXMLDocumentFormat rdfxmlFormat = new RDFXMLDocumentFormat();
			try {
				manager.saveOntology(onto, rdfxmlFormat, new WriterDocumentTarget(new PrintWriter(fileformatted)));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (OWLOntologyStorageException e) {
			e.printStackTrace();
		}
	}

	public static void checkRulesForProcess(OWLOntology onto, String processId) {
		for (OWLClass cls : onto.getClassesInSignature()) {
			System.out.println(cls);
		}

		String result = "";
		writeResultFile(result, processId);
	}

	public static void writeResultFile(String output, String processId) {
		String path = "./checkResults/" + processId + ".txt";
		try {
			PrintWriter writer = new PrintWriter(path);
			writer.print(output);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
