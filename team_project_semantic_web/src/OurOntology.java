package src;

import java.io.File;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.StreamDocumentTarget;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static void saveOntology(OWLOntology onto) {
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		try {
			RDFXMLDocumentFormat owlxmlFormat = new RDFXMLDocumentFormat();
			manager.saveOntology(onto, owlxmlFormat, new StreamDocumentTarget(System.out));
		} catch (OWLOntologyStorageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
