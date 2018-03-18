package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
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
		boolean isCompliant = true;
		Set<OWLClass> classes = onto.getClassesInSignature();
		Set<String> rulesError = new HashSet<String>();
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		OWLDataFactory factory = manager.getOWLDataFactory();
		OWLClass rule1_deontic = factory.getOWLClass(RuleName.Rule1_Deontic.getPath());
		OWLClass rule1_condition1 = factory.getOWLClass(RuleName.Rule1_Condition1.getPath());
		OWLClass rule3_deontic = factory.getOWLClass(RuleName.Rule3_Deontic.getPath());
		OWLClass rule3_condition1 = factory.getOWLClass(RuleName.Rule3_Condition1.getPath());
		OWLClass rule4_deontic = factory.getOWLClass(RuleName.Rule4_Deontic.getPath());
		OWLClass rule4_condition1 = factory.getOWLClass(RuleName.Rule4_Condition1.getPath());
		OWLClass rule5_deontic = factory.getOWLClass(RuleName.Rule5_Deontic.getPath());
		OWLClass rule5_condition1 = factory.getOWLClass(RuleName.Rule5_Condition1.getPath());
		OWLClass rule7_deontic = factory.getOWLClass(RuleName.Rule7_Deontic.getPath());
		OWLClass rule7_condition1 = factory.getOWLClass(RuleName.Rule7_Condition1.getPath());
		OWLClass rule8_deontic = factory.getOWLClass(RuleName.Rule8_Deontic.getPath());
		OWLClass rule8_condition1 = factory.getOWLClass(RuleName.Rule8_Condition1.getPath());
		OWLClass rule9_deontic = factory.getOWLClass(RuleName.Rule9_Deontic.getPath());
		OWLClass rule9_condition1 = factory.getOWLClass(RuleName.Rule9_Condition1.getPath());
		OWLClass rule10_deontic = factory.getOWLClass(RuleName.Rule10_Deontic.getPath());
		OWLClass rule10_condition1 = factory.getOWLClass(RuleName.Rule10_Condition1.getPath());
		OWLClass rule12_deontic = factory.getOWLClass(RuleName.Rule12_Deontic.getPath());
		OWLClass rule12_condition1 = factory.getOWLClass(RuleName.Rule12_Condition1.getPath());
		OWLClass rule13_deontic = factory.getOWLClass(RuleName.Rule13_Deontic.getPath());
		OWLClass rule13_condition1 = factory.getOWLClass(RuleName.Rule13_Condition1.getPath());
		OWLClass rule15_deontic = factory.getOWLClass(RuleName.Rule15_Deontic.getPath());
		OWLClass rule15_condition1 = factory.getOWLClass(RuleName.Rule15_Condition1.getPath());
		OWLClass rule18_deontic = factory.getOWLClass(RuleName.Rule18_Deontic.getPath());
		OWLClass rule18_condition1 = factory.getOWLClass(RuleName.Rule18_Condition1.getPath());
		OWLClass rule20_deontic = factory.getOWLClass(RuleName.Rule20_Deontic.getPath());
		OWLClass rule20_condition1 = factory.getOWLClass(RuleName.Rule20_Condition1.getPath());
		OWLClass rule22_deontic = factory.getOWLClass(RuleName.Rule22_Deontic.getPath());
		OWLClass rule22_condition1 = factory.getOWLClass(RuleName.Rule22_Condition1.getPath());
		OWLClass rule23_deontic = factory.getOWLClass(RuleName.Rule23_Deontic.getPath());
		OWLClass rule23_condition1 = factory.getOWLClass(RuleName.Rule23_Condition1.getPath());
		OWLClass rule24_deontic = factory.getOWLClass(RuleName.Rule24_Deontic.getPath());
		OWLClass rule24_condition1 = factory.getOWLClass(RuleName.Rule24_Condition1.getPath());
		OWLClass rule241_deontic = factory.getOWLClass(RuleName.Rule241_Deontic.getPath());
		OWLClass rule241_condition1 = factory.getOWLClass(RuleName.Rule241_Condition1.getPath());
		OWLClass rule25_deontic = factory.getOWLClass(RuleName.Rule25_Deontic.getPath());
		OWLClass rule251_deontic = factory.getOWLClass(RuleName.Rule251_Deontic.getPath());
		OWLClass rule26_deontic = factory.getOWLClass(RuleName.Rule26_Deontic.getPath());
		OWLClass rule26_condition1 = factory.getOWLClass(RuleName.Rule26_Condition1.getPath());
		OWLClass rule21_deontic = factory.getOWLClass(RuleName.Rule21_Deontic.getPath());
		OWLClass rule21_condition1 = factory.getOWLClass(RuleName.Rule21_Condition1.getPath());
		OWLClass rule16_deontic = factory.getOWLClass(RuleName.Rule16_Deontic.getPath());
		OWLClass rule16_condition1 = factory.getOWLClass(RuleName.Rule16_Condition1.getPath());
		System.out.println(classes.contains(rule1_deontic));

		if (classes.contains(rule1_condition1)) {
			if (!classes.contains(rule1_deontic)) {
				isCompliant = false;
				rulesError.add("No DPIA has been created. Refer to paragraph 1");
			}
		}

		if (classes.contains(rule3_condition1)) {
			System.out.println("hghgh");
			int i = 2;
			int j = 1;
			if (i != j) { /// * !classes.contains(rule3_deontic) */
				System.out.println("test rule3");
				isCompliant = false;
				rulesError.add("You need to seek the advice of the Data Protection Officer.");

			}
		}

		if (classes.contains(rule4_condition1)) {
			if (!classes.contains(rule4_deontic)) {
				isCompliant = false;
				rulesError.add("No DPIA has been created. Refer to paragraph 3a");

			}
		}
		if (classes.contains(rule5_condition1)) {
			if (!classes.contains(rule5_deontic)) {
				isCompliant = false;
				rulesError.add("No DPIA has been created. Refer to paragraph 3b");

			}
		}
		if (classes.contains(rule7_condition1)) {
			if (!classes.contains(rule7_deontic)) {
				isCompliant = false;
				rulesError.add("Supervisory authority needs to check this process. Refer to paragraph 3b");

			}
		}

		if (classes.contains(rule8_condition1)) {
			if (!classes.contains(rule8_deontic)) {
				isCompliant = false;
				// TODO write text for output file
				rulesError.add("Processor is not authorized to work on the process.");

			}
		}
		if (classes.contains(rule9_condition1)) {
			if (!classes.contains(rule9_deontic)) {
				isCompliant = false;
				rulesError.add("No DPIA has been created. Refer to paragraph 3c.");

			}
		}
		if (classes.contains(rule10_condition1)) {
			if (!classes.contains(rule10_deontic)) {
				isCompliant = false;
				rulesError.add("You have to publish the list of processes that require a DPIA. Refer to paragraph 4.");

			}
		}
		if (classes.contains(rule12_condition1)) {
			if (!classes.contains(rule12_deontic)) {
				isCompliant = false;
				rulesError.add("You have to publish the list of processes that require a DPIA to the European Data Protection Board. Refer to paragraph 4.");

			}
		}
		if (classes.contains(rule13_condition1)) {
			if (!classes.contains(rule13_deontic)) {
				isCompliant = false;
				rulesError.add("You have to publish the list of processes that require a DPIA. Refer to paragraph 5.");

			}
		}
		if (classes.contains(rule15_condition1)) {
			if (!classes.contains(rule15_deontic)) {
				isCompliant = false;
				rulesError.add("You have to publish the list of processes that require a DPIA to the European Data Protection Board. Refer to paragraph 5.");

			}
		}

		if (classes.contains(rule18_condition1)) {

			if (!classes.contains(rule18_deontic)) {
				isCompliant = false;
				rulesError.add("DPIA is not complete. Refer to paragraph 7.");
			}
		}

		if (classes.contains(rule20_condition1)) {

			if (!classes.contains(rule20_deontic)) {
				isCompliant = false;
				rulesError.add("The measure to address risks does not show compliance to GDPR. Refer to paragraph 7d.");
			}
		}

		if (classes.contains(rule22_condition1)) {

			if (!classes.contains(rule22_deontic)) {
				isCompliant = false;
				rulesError.add("Controller not compliant with Approved Code of Conduct. Refer to Paragraph 8.");
			}
		}

		if (classes.contains(rule23_condition1)) {

			if (!classes.contains(rule23_deontic)) {
				isCompliant = false;
				rulesError.add("Processor not compliant with approved code of conduct. Refer to paragraph 8");
			}
		}

		if (classes.contains(rule24_condition1)) {

			if (!classes.contains(rule24_deontic)) {
				isCompliant = false;
				rulesError.add("Controller should not seek view of the data subject. Refer to paragraph 9");
			}
		}

		if (classes.contains(rule241_condition1)) {

			if (!classes.contains(rule241_deontic)) {
				isCompliant = false;
				rulesError.add("Controller should not seek view of the representative of data subject. Refer to paragraph 9");
			}
		}

		if (classes.contains(rule24_condition1)) {

			if (!classes.contains(rule25_deontic)) {
				isCompliant = false;
				rulesError.add("Processor should not seek view of the data subject. Refer to paragraph 9");
			}
		}

		if (classes.contains(rule24_condition1)) {

			if (!classes.contains(rule251_deontic)) {
				isCompliant = false;
				rulesError.add("Processor should not seek view of the representative of data subject. Refer to paragraph 9");

			}
		}

		if (classes.contains(rule26_condition1)) {

			if (!classes.contains(rule26_deontic)) {
				isCompliant = false;
				rulesError.add("Controller needs to review DPIA. Refer to paragraph 11.");

			}
		}

		if (classes.contains(rule21_condition1)) {

			if (!classes.contains(rule21_deontic)) {
				isCompliant = false;
				rulesError.add("The measure to address risks are not complete. Refer to paragraph 7d.");

			}
		}

		if (classes.contains(rule16_condition1)) {

			if (!classes.contains(rule16_deontic)) {
				isCompliant = false;
				rulesError.add("You have to apply the consistency mechanism. Refer to paragraph 6.");

			}
		}

		if (isCompliant) {
			rulesError.add("The process " + processId + " is compliant to Article 35 of GDPR.");
		}

		writeResultFile(rulesError, processId);

	}

	public static void writeResultFile(Set<String> output, String processId) {
		String path = "./checkResults/" + processId + ".txt";
		try {
			PrintWriter writer = new PrintWriter(path);
			for (String line : output) {
				writer.println(line);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
