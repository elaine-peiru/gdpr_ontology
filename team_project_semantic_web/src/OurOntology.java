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
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

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
		Set<String> rulesError = new HashSet<String>();
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		OWLDataFactory factory = manager.getOWLDataFactory();
		OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();
		OWLReasoner reasoner = reasonerFactory.createReasoner(onto);

		OWLClass rule1_deontic = factory.getOWLClass(RuleName.Rule1_Deontic.getPath());
		OWLClass rule2_deontic = factory.getOWLClass(RuleName.Rule2_Deontic.getPath());
		OWLClass rule3_deontic = factory.getOWLClass(RuleName.Rule3_Deontic.getPath());
		OWLClass rule4_deontic = factory.getOWLClass(RuleName.Rule4_Deontic.getPath());

		OWLClass rule4_condition1 = factory.getOWLClass(RuleName.Rule4_Condition1.getPath());
		OWLClass rule4_condition2 = factory.getOWLClass(RuleName.Rule4_Condition2.getPath());
		OWLClass rule4_condition3 = factory.getOWLClass(RuleName.Rule4_Condition3.getPath());
		OWLClass rule4_condition4 = factory.getOWLClass(RuleName.Rule4_Condition4.getPath());
		OWLClass rule4_condition5 = factory.getOWLClass(RuleName.Rule4_Condition5.getPath());
		OWLClass rule4_condition6 = factory.getOWLClass(RuleName.Rule4_Condition6.getPath());

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

		OWLClass rule1_condition1 = factory.getOWLClass(RuleName.Rule1_Condition1.getPath());
		OWLClass rule1_condition2 = factory.getOWLClass(RuleName.Rule1_Condition2.getPath());
		OWLClass rule1_condition3 = factory.getOWLClass(RuleName.Rule1_Condition3.getPath());
		OWLClass rule1_condition4 = factory.getOWLClass(RuleName.Rule1_Condition4.getPath());
		OWLClass rule3_condition1 = factory.getOWLClass(RuleName.Rule3_Condition1.getPath());

		OWLClass rule5_condition1 = factory.getOWLClass(RuleName.Rule5_Condition1.getPath());
		OWLClass rule5_condition2 = factory.getOWLClass(RuleName.Rule5_Condition2.getPath());
		OWLClass rule7_condition1 = factory.getOWLClass(RuleName.Rule7_Condition1.getPath());
		OWLClass rule8_condition1 = factory.getOWLClass(RuleName.Rule8_Condition1.getPath());
		OWLClass rule9_condition1 = factory.getOWLClass(RuleName.Rule9_Condition1.getPath());
		OWLClass rule9_condition2 = factory.getOWLClass(RuleName.Rule9_Condition2.getPath());
		OWLClass rule9_condition3 = factory.getOWLClass(RuleName.Rule9_Condition3.getPath());
		OWLClass rule10_condition1 = factory.getOWLClass(RuleName.Rule10_Condition1.getPath());
		OWLClass rule12_condition1 = factory.getOWLClass(RuleName.Rule12_Condition1.getPath());
		OWLClass rule13_condition1 = factory.getOWLClass(RuleName.Rule13_Condition1.getPath());
		OWLClass rule15_condition1 = factory.getOWLClass(RuleName.Rule15_Condition1.getPath());
		OWLClass rule18_condition1 = factory.getOWLClass(RuleName.Rule18_Condition1.getPath());
		OWLClass rule18_condition2 = factory.getOWLClass(RuleName.Rule18_Condition2.getPath());
		OWLClass rule18_condition3 = factory.getOWLClass(RuleName.Rule18_Condition3.getPath());
		OWLClass rule18_condition4 = factory.getOWLClass(RuleName.Rule18_Condition4.getPath());
		OWLClass rule18_condition5 = factory.getOWLClass(RuleName.Rule18_Condition5.getPath());
		OWLClass rule18_condition6 = factory.getOWLClass(RuleName.Rule18_Condition6.getPath());
		OWLClass rule18_condition7 = factory.getOWLClass(RuleName.Rule18_Condition7.getPath());
		OWLClass rule18_condition8 = factory.getOWLClass(RuleName.Rule18_Condition8.getPath());
		OWLClass rule18_condition9 = factory.getOWLClass(RuleName.Rule18_Condition9.getPath());
		OWLClass rule18_condition10 = factory.getOWLClass(RuleName.Rule18_Condition10.getPath());
		OWLClass rule20_condition1 = factory.getOWLClass(RuleName.Rule20_Condition1.getPath());
		OWLClass rule22_Condition1 = factory.getOWLClass(RuleName.Rule22_Condition1.getPath());
		OWLClass rule23_condition1 = factory.getOWLClass(RuleName.Rule23_Condition1.getPath());
		OWLClass rule24_condition1 = factory.getOWLClass(RuleName.Rule24_Condition1.getPath());
		OWLClass rule24_condition2 = factory.getOWLClass(RuleName.Rule24_Condition2.getPath());
		OWLClass rule24_condition3 = factory.getOWLClass(RuleName.Rule24_Condition3.getPath());
		OWLClass rule24_condition4 = factory.getOWLClass(RuleName.Rule24_Condition4.getPath());
		OWLClass rule241_condition1 = factory.getOWLClass(RuleName.Rule241_Condition1.getPath());
		OWLClass rule26_Condition1 = factory.getOWLClass(RuleName.Rule26_Condition1.getPath());
		OWLClass rule26_Condition2 = factory.getOWLClass(RuleName.Rule26_Condition2.getPath());
		OWLClass rule26_Condition3 = factory.getOWLClass(RuleName.Rule26_Condition3.getPath());
		OWLClass rule26_Condition4 = factory.getOWLClass(RuleName.Rule26_Condition4.getPath());
		OWLClass rule26_Condition5 = factory.getOWLClass(RuleName.Rule26_Condition5.getPath());
		OWLClass rule26_Condition6 = factory.getOWLClass(RuleName.Rule26_Condition6.getPath());
		OWLClass rule26_Condition7 = factory.getOWLClass(RuleName.Rule26_Condition7.getPath());
		OWLClass rule26_Condition8 = factory.getOWLClass(RuleName.Rule26_Condition8.getPath());
		OWLClass rule26_Condition9 = factory.getOWLClass(RuleName.Rule26_Condition9.getPath());
		OWLClass rule26_Condition10 = factory.getOWLClass(RuleName.Rule26_Condition10.getPath());
		OWLClass rule26_Condition11 = factory.getOWLClass(RuleName.Rule26_Condition11.getPath());
		OWLClass rule21_condition1 = factory.getOWLClass(RuleName.Rule21_Condition1.getPath());
		OWLClass rule21_condition2 = factory.getOWLClass(RuleName.Rule21_Condition2.getPath());
		OWLClass rule16_condition1 = factory.getOWLClass(RuleName.Rule16_Condition1.getPath());
		OWLClass rule16_condition2 = factory.getOWLClass(RuleName.Rule16_Condition2.getPath());
		OWLClass rule16_condition3 = factory.getOWLClass(RuleName.Rule16_Condition3.getPath());

		if (reasoner.getEquivalentClasses(rule1_condition4).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule1_condition3).getSize() > 1) {
				if (reasoner.getEquivalentClasses(rule1_condition2).getSize() > 1) {
					if (reasoner.getEquivalentClasses(rule1_condition1).getSize() >= 1) {
						if (reasoner.getEquivalentClasses(rule1_deontic).getSize() == 1) {
							isCompliant = false;
							rulesError.add("No DPIA has been created. Refer to paragraph 1 of Article 35.");
						}
					}
				}
			}
		}

		if (reasoner.getEquivalentClasses(rule1_condition1).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule2_deontic).getSize() == 1) {
				isCompliant = false;
				rulesError.add(
						"You have performed the process before you have created the data protection impact assessment. This breaches paragraph 1 of Article 35.");
			}
		}

		if (reasoner.getEquivalentClasses(rule3_condition1).getSize() >= 1) {
			if (reasoner.getEquivalentClasses(rule3_deontic).getSize() == 1) {
				isCompliant = false;
				rulesError.add("You need to seek the advice of the Data Protection Officer. Refer to Paragraph 2 of Article 35.");
			}
		}

		if (reasoner.getEquivalentClasses(rule4_condition5).getSize() > 1 && reasoner.getEquivalentClasses(rule4_condition6).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule4_condition4).getSize() > 1) {
				if (reasoner.getEquivalentClasses(rule4_condition3).getSize() > 1) {
					if (reasoner.getEquivalentClasses(rule1_condition2).getSize() > 1) {
						if (reasoner.getEquivalentClasses(rule4_condition1).getSize() == 1) {
							if (reasoner.getEquivalentClasses(rule4_deontic).getSize() == 1) {
								isCompliant = false;
								rulesError.add("No DPIA has been created. Refer to paragraph 3a of Article 35.");
							}
						}
					}
				}
			}
		}

		if (reasoner.getEquivalentClasses(rule5_condition2).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule5_condition1).getSize() >= 1) {
				if (reasoner.getEquivalentClasses(rule5_deontic).getSize() == 1) {
					isCompliant = false;
					rulesError.add("No DPIA has been created. Refer to paragraph 3b of Article 35.");
				}
			}
		}

		if (reasoner.getEquivalentClasses(rule7_condition1).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule7_deontic).getSize() == 1) {
				isCompliant = false;
				rulesError.add("Supervisory authority needs to check this process. Refer to paragraph 3b of Article 35.");
			}
		}

		if (reasoner.getEquivalentClasses(rule8_deontic).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule8_condition1).getSize() == 1) {
				isCompliant = false;
				// TODO write text for output file
				rulesError.add("Processor is not authorized to work on the process.");

			}
		}
		if (reasoner.getEquivalentClasses(rule9_condition3).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule9_condition2).getSize() > 1) {
				if (reasoner.getEquivalentClasses(rule9_condition1).getSize() >= 1) {
					if (reasoner.getEquivalentClasses(rule9_deontic).getSize() == 1) {
						isCompliant = false;
						rulesError.add("No DPIA has been created. Refer to paragraph 3c of Article 35.");
					}
				}
			}
		}

		if (reasoner.getEquivalentClasses(rule10_condition1).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule10_deontic).getSize() == 1) {
				isCompliant = false;
				rulesError.add("You have to publish the list of processes that require a DPIA. Refer to paragraph 4 of Article 35.");

			}
		}
		if (reasoner.getEquivalentClasses(rule12_condition1).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule12_deontic).getSize() == 1) {
				isCompliant = false;
				rulesError.add(
						"You have to publish the list of processes that require a DPIA to the European Data Protection Board. Refer to paragraph 4 of Article 35.");

			}
		}
		if (reasoner.getEquivalentClasses(rule13_condition1).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule13_deontic).getSize() == 1) {
				isCompliant = false;
				rulesError.add("You have to publish the list of processes that require a DPIA. Refer to paragraph 5 of Article 35.");

			}
		}
		if (reasoner.getEquivalentClasses(rule15_condition1).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule15_deontic).getSize() == 1) {
				isCompliant = false;
				rulesError.add(
						"You have to publish the list of processes that require a DPIA to the European Data Protection Board. Refer to paragraph 5 of Article 35.");

			}
		}

		if (reasoner.getEquivalentClasses(rule18_deontic).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule18_condition10).getSize() == 1 || reasoner.getEquivalentClasses(rule18_condition9).getSize() == 1
					|| reasoner.getEquivalentClasses(rule18_condition8).getSize() == 1
					|| reasoner.getEquivalentClasses(rule18_condition7).getSize() == 1 || reasoner.getEquivalentClasses(rule18_condition6).getSize() == 1
					|| reasoner.getEquivalentClasses(rule18_condition5).getSize() == 1
					|| reasoner.getEquivalentClasses(rule18_condition4).getSize() == 1 || reasoner.getEquivalentClasses(rule18_condition3).getSize() == 1
					|| reasoner.getEquivalentClasses(rule18_condition2).getSize() == 1
					|| reasoner.getEquivalentClasses(rule18_condition1).getSize() == 1) {

				isCompliant = false;
				rulesError.add("DPIA is not complete. Refer to paragraph 7 of Article 35:");

				if (reasoner.getEquivalentClasses(rule18_condition10).getSize() == 1) {
					rulesError.add("-Mechanism to ensure protection of data missing.");
				}
				if (reasoner.getEquivalentClasses(rule18_condition9).getSize() == 1) {
					rulesError.add("-Securit Measures missing.");
				}
				if (reasoner.getEquivalentClasses(rule18_condition8).getSize() == 1) {
					rulesError.add("-Safeguards missing.");
				}
				if (reasoner.getEquivalentClasses(rule18_condition7).getSize() == 1) {
					rulesError.add("-Purpose of processing missing.");
				}
				if (reasoner.getEquivalentClasses(rule18_condition6).getSize() == 1) {
					rulesError.add("-Measures to address risks missing.");
				}
				if (reasoner.getEquivalentClasses(rule18_condition5).getSize() == 1) {
					rulesError.add("-Legitimate interest missing.");
				}
				if (reasoner.getEquivalentClasses(rule18_condition4).getSize() == 1) {
					rulesError.add("-Assessment of risks to rights and freedom missing.");
				}
				if (reasoner.getEquivalentClasses(rule18_condition3).getSize() == 1) {
					rulesError.add("-Assessment of Proportionality missing.");
				}
				if (reasoner.getEquivalentClasses(rule18_condition2).getSize() == 1) {
					rulesError.add("-Assessment of Necessity missing.");
				}
				if (reasoner.getEquivalentClasses(rule18_condition1).getSize() == 1) {
					rulesError.add("-Systematic description missing.");
				}

			}
		}

		if (reasoner.getEquivalentClasses(rule20_condition1).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule20_deontic).getSize() == 1) {
				isCompliant = false;
				rulesError.add("The measure to address risks does not show compliance to GDPR. Refer to paragraph 7d of Article 35.");
			}
		}

		if (reasoner.getEquivalentClasses(rule22_Condition1).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule22_deontic).getSize() == 1) {
				isCompliant = false;
				rulesError.add("Controller not compliant with Approved Code of Conduct. Refer to Paragraph 8 of Article 35.");
			}
		}

		if (reasoner.getEquivalentClasses(rule23_condition1).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule23_deontic).getSize() != reasoner.getEquivalentClasses(rule23_condition1).getSize()) {
				isCompliant = false;
				rulesError.add("The processor or not all processors are compliant to the approved code of conduct. Refer to paragraph 8 of Article 35.");
			}
		}

		if (reasoner.getEquivalentClasses(rule24_condition4).getSize() > 1 || reasoner.getEquivalentClasses(rule24_condition3).getSize() > 1
				|| reasoner.getEquivalentClasses(rule24_condition2).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule24_condition1).getSize() > 1) {
				if (reasoner.getEquivalentClasses(rule24_deontic).getSize() > 1) {
					isCompliant = false;
					rulesError.add("Controller should not seek view of the data subject. Refer to paragraph 9 of Article 35.");
				}
			}
		}

		if (reasoner.getEquivalentClasses(rule24_condition4).getSize() > 1 || reasoner.getEquivalentClasses(rule24_condition3).getSize() > 1
				|| reasoner.getEquivalentClasses(rule24_condition2).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule241_condition1).getSize() > 1) {
				if (reasoner.getEquivalentClasses(rule241_deontic).getSize() > 1) {
					isCompliant = false;
					rulesError.add("Controller should not seek view of the representative of data subject. Refer to paragraph 9 of Article 35.");
				}
			}
		}

		if (reasoner.getEquivalentClasses(rule24_condition4).getSize() > 1 || reasoner.getEquivalentClasses(rule24_condition3).getSize() > 1
				|| reasoner.getEquivalentClasses(rule24_condition2).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule24_condition1).getSize() > 1) {
				if (reasoner.getEquivalentClasses(rule25_deontic).getSize() > 1) {
					isCompliant = false;
					rulesError.add("Processor should not seek view of the data subject. Refer to paragraph 9 of Article 35.");
				}
			}
		}

		if (reasoner.getEquivalentClasses(rule24_condition4).getSize() > 1 || reasoner.getEquivalentClasses(rule24_condition3).getSize() > 1
				|| reasoner.getEquivalentClasses(rule24_condition2).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule241_condition1).getSize() > 1) {
				if (reasoner.getEquivalentClasses(rule251_deontic).getSize() > 1) {
					isCompliant = false;
					rulesError.add("Processor should not seek view of the representative of data subject. Refer to paragraph 9 of Article 35.");
				}
			}
		}

		if (reasoner.getEquivalentClasses(rule26_Condition5).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule26_Condition3).getSize() > 1 || reasoner.getEquivalentClasses(rule26_Condition6).getSize() > 1
					|| reasoner.getEquivalentClasses(rule26_Condition8).getSize() > 1 || reasoner.getEquivalentClasses(rule26_Condition10).getSize() > 1) {
				if (reasoner.getEquivalentClasses(rule26_Condition2).getSize() > 1) {
					if (reasoner.getEquivalentClasses(rule26_Condition1).getSize() == 1) {
						if (reasoner.getEquivalentClasses(rule26_deontic).getSize() == 1) {
							isCompliant = false;
							rulesError.add("Controller needs to review DPIA. Refer to paragraph 11 of Article 35.");
						}

					}
				}
			}
		}

		if (reasoner.getEquivalentClasses(rule21_deontic).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule21_condition1).getSize() == 1) {
				isCompliant = false;
				rulesError.add("The measure to address risks are not complete. Refer to paragraph 7d of Article 35.");
			}
		}

		if (reasoner.getEquivalentClasses(rule16_condition3).getSize() > 1) {
			if (reasoner.getEquivalentClasses(rule16_condition2).getSize() > 1) {
				if (reasoner.getEquivalentClasses(rule16_condition1).getSize() == 1) {
					if (reasoner.getEquivalentClasses(rule16_deontic).getSize() == 1) {
						isCompliant = false;
						rulesError.add("You have to apply the consistency mechanism. Refer to paragraph 6 of Article 35.");

					}
				}
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
