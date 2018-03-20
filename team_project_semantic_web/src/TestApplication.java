package src;

import javax.swing.JOptionPane;

import org.semanticweb.owlapi.model.OWLOntology;

public class TestApplication {

	public static void main(String[] args) throws Exception {
		// OWLOntology o = OurOntology.getOurOntology();

		String userInput = JOptionPane
				.showInputDialog(
						"To add a new process type in the path of the process file. To check existing processes type in their names and separate them with a semicolon.");

		if (userInput != null) {
			if (userInput.indexOf(".txt") > 0) {
				Input input = new Input();
				input.readInputFile(userInput);
			} else {
				String[] processIds = userInput.split(";");

				for (int i = 0; i < processIds.length; i++) {
					System.out.println(i);
					String processId = processIds[i];

					OWLOntology onto = OurOntology.getProcessOntology(processId);

					OurOntology.checkRulesForProcess(onto, processId);

					// TODO check rules for each process
					// TODO write all errors in a file. If no error occurs for a process write, that the process complies to all rules
				}

			}
		}

	}

}
