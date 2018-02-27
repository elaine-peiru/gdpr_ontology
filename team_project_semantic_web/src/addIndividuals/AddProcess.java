package team_project_semantic_web.src.addIndividuals;

import org.semanticweb.kaon2.api.DefaultOntologyResolver;
import org.semanticweb.kaon2.api.KAON2Manager;
import org.semanticweb.kaon2.api.OntologyManager;
import org.semanticweb.kaon2.api.OntologyResolver;

public class AddProcess {

	public AddProcess() {
		// TODO Auto-generated constructor stub
	}

	public static void createIndividual() {
		OntologyManager ontologyManager = KAON2Manager.newOntologyManager();
		OntologyResolver resolver = new DefaultOntologyResolver();
		String URI = "";
		String physicalAdress = "";
		resolver.registerReplacement(URI, physicalAdress); // TODO
		ontologyManager.setOntologyResolver(resolver);
	}

}
