package src;

import java.util.HashSet;
import java.util.Set;

import org.json.simple.JSONObject;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class Process {
	public OWLOntology onto;
	public OWLOntologyManager manager;

	public Process() {
		this.onto = OurOntology.getOurOntology();
		this.manager = OWLManager.createOWLOntologyManager();
	}

	@SuppressWarnings("deprecation")
	public void createIndividualOfProcess(JSONObject json) {
		// reference to OWL Class -> like example line 1569

		// create Individuals Factor -> like example line 1479

		// specify class of individual -> like example line 1593

		// reference to ObjectProperty -> like example line 1493
		Set<OWLAxiom> axioms = new HashSet<OWLAxiom>();
		// specify all changes in between here

		manager.addAxioms(onto, axioms);

		// specify relationships between Individuals -> like example line 1498

		// save changes to Ontology
		OurOntology.saveOntology(onto);
	}
}
