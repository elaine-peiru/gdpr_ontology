package src;

import javax.swing.JOptionPane;

import org.semanticweb.owlapi.model.OWLOntology;

public class TestApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OWLOntology o = OurOntology.getOurOntology();

		String userInput = JOptionPane
				.showInputDialog(
						"To add a new process type in the name of the process file. To check existing processes type in their names and separate them with a semicolon.");

		if (userInput != null) {
			if (userInput.indexOf(".txt") > 0) {
				Input input = new Input();
				input.readInputFile(userInput);
			} else {
				String[] processNames = userInput.split(";");

				/*
				 * for (int i = 0; i < processNames.length; i++) {
				 * String processName = processNames[i];
				 * 
				 * if(checkProcessAlreadyExists(processName) {
				 * TODO something, error
				 * }
				 * 
				 * // TODO check rules for each process
				 * // TODO write all errors in a file. If no error occurs for a process write, that the process complies to all rules
				 * }
				 */
			}
		}

	}

}
