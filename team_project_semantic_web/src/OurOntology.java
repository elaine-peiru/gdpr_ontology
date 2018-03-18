package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Set;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.WriterDocumentTarget;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

public class OurOntology {

	public static final String OntologyUri = "<http://purl.org/net/team_project_semantic_web/";

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
		Set<OWLClass> classes = onto.getClassesInSignature();
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		OWLDataFactory factory = manager.getOWLDataFactory();
		OWLClass rule1_deontic = factory.getOWLClass(RuleName.Rule1_Deontic.getPath());
		OWLClass rule3_deontic = factory.getOWLClass(RuleName.Rule3_Deontic.getPath());
		OWLClass rule4_deontic = factory.getOWLClass(RuleName.Rule4_Deontic.getPath());
		OWLClass rule5_deontic = factory.getOWLClass(RuleName.Rule5_Deontic.getPath());
		OWLClass rule7_deontic = factory.getOWLClass(RuleName.Rule7_Deontic.getPath());
		OWLClass rule8_deontic = factory.getOWLClass(RuleName.Rule8_Deontic.getPath());
		OWLClass rule9_deontic = factory.getOWLClass(RuleName.Rule9_Deontic.getPath());
		OWLClass rule10_deontic = factory.getOWLClass(RuleName.Rule10_Deontic.getPath());
		OWLClass rule12_deontic = factory.getOWLClass(RuleName.Rule12_Deontic.getPath());
		OWLClass rule13_deontic = factory.getOWLClass(RuleName.Rule13_Deontic.getPath());
		OWLClass rule15_deontic = factory.getOWLClass(RuleName.Rule15_Deontic.getPath());
		OWLClass rule18_deontic = factory.getOWLClass(RuleName.Rule18_Deontic.getPath());
		OWLClass rule20_deontic = factory.getOWLClass(RuleName.Rule20_Deontic.getPath());
		OWLClass rule22_deontic = factory.getOWLClass(RuleName.Rule22_Deontic.getPath());
		OWLClass rule23_deontic = factory.getOWLClass(RuleName.Rule23_Deontic.getPath());
		OWLClass rule24_deontic = factory.getOWLClass(RuleName.Rule24_Deontic.getPath());
		OWLClass rule241_deontic = factory.getOWLClass(RuleName.Rule241_Deontic.getPath());
		OWLClass rule25_deontic = factory.getOWLClass(RuleName.Rule25_Deontic.getPath());
		OWLClass rule251_deontic = factory.getOWLClass(RuleName.Rule251_Deontic.getPath());
		OWLClass rule26_deontic = factory.getOWLClass(RuleName.Rule26_Deontic.getPath());
		OWLClass rule21_deontic = factory.getOWLClass(RuleName.Rule21_Deontic.getPath());
		OWLClass rule16_deontic = factory.getOWLClass(RuleName.Rule16_Deontic.getPath());
		System.out.println(classes.contains(rule1_deontic));

		/*
		 * for (OWLClass cls : onto.getClassesInSignature()) {
		 * // System.out.println(cls.toString());
		 * switch (cls.toString()) {
		 * case OntologyUri + "Rule1_Condition1>":
		 * System.out.println("It is there");
		 * break;
		 * // case OntologyUri + "Rule"
		 * }
		 * }
		 */

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
