package team_project_semantic_web;

import javax.swing.JOptionPane;

public class ProjectApplication {
	public static void main(String[] args) throws Exception {
		String inputProcessFile = JOptionPane.showInputDialog("Please enter the name of the process file here:");
		Input input = new Input();
		input.readInputFile(inputProcessFile);

		// TODO another input File with ProcessName -> search in the ontology for the processname and then do the check for for the
		// processname

	}
}
