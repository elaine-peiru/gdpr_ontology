package team_project_semantic_web;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.semanticweb.kaon2.api.DefaultOntologyResolver;
import org.semanticweb.kaon2.api.KAON2Manager;
import org.semanticweb.kaon2.api.Ontology;
import org.semanticweb.kaon2.api.OntologyChangeEvent;
import org.semanticweb.kaon2.api.OntologyManager;
import org.semanticweb.kaon2.api.formatting.OntologyFileFormat;
import org.semanticweb.kaon2.api.owl.elements.Individual;
import org.semanticweb.kaon2.api.owl.elements.OWLClass;
import org.semanticweb.kaon2.api.owl.elements.ObjectProperty;

public class Process {
	private String sProcessName;
	private String sProcessing;
	private String sData;
	private Date iFirstProcessingDate;
	private final String URI = "http://kaon2.semanticweb.org/gdprcheck";

	public Process() {
	}

	public void createIndividualOfProcess(JSONObject json) {// TODO add arguments that continue all necessary information that is needed for
															// creating an
		// individual of the process
		try {
			OntologyManager ontologyManager = KAON2Manager.newOntologyManager();
			DefaultOntologyResolver resolver = new DefaultOntologyResolver();
			String physicalAdress = "";
			resolver.registerReplacement(URI, physicalAdress); // TODO specify the right physical address
			ontologyManager.setOntologyResolver(resolver);

			Ontology onto = ontologyManager.openOntology(URI, new HashMap<String, Object>());
			Ontology changedOnto = this.makeChangeToProcess(onto, json);
			String filename = "";// TODO change the file name to the file and location that we need
			String secondString = ""; // TODO rename it and find out what this string is used for
			changedOnto.saveOntology(OntologyFileFormat.OWL_XML, new File(filename), secondString);// TODO check if this is the file format
																									// that we want
			ontologyManager.close(); // close connection after individual is created
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Ontology makeChangeToProcess(Ontology onto, JSONObject json) {
		try {
			List<OntologyChangeEvent> changes = new ArrayList<OntologyChangeEvent>();
			// TODO add individuals of processing, firstprocessingdate, data
			OWLClass process = KAON2Manager.factory().owlClass(URI + "#process");
			OWLClass processing = KAON2Manager.factory().owlClass(URI + "#processing");
			OWLClass firstProcessingDate = KAON2Manager.factory().owlClass(URI + "#firstProcessingDate");
			Individual processIndividual = KAON2Manager.factory().individual(URI + "#" + this.sProcessName);
			Individual processingIndividual = KAON2Manager.factory().individual(URI + "#" + this.sProcessing);
			Individual firstProcessingDateIndividual = KAON2Manager.factory().individual(URI + "#" + this.iFirstProcessingDate);
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(process, processIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(processing, processingIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(firstProcessingDate, firstProcessingDateIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			// TODO for data -> create individuals directly of the subclass
			Individual dataIndividual = KAON2Manager.factory().individual(URI + "#" + this.sData);
			OWLClass ethnicOrigin;
			OWLClass racialOrigin;
			OWLClass politicalOpinion;
			OWLClass religiousBelief;
			OWLClass philosophicalBelief;
			OWLClass tradeUnionMembership;
			OWLClass geneticData;
			OWLClass biometricData;
			OWLClass health;
			OWLClass sexLife;
			OWLClass sexualOrientation;
			OWLClass criminalOffense;
			OWLClass criminalConviction;
			OWLClass data;
			if (json.getString("ethnicOrigin")) {
				ethnicOrigin = KAON2Manager.factory().owlClass(URI + "#ethnicData");
				Individual ethnicOriginIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("ethnicOrigin"));
				changes.add(
						new OntologyChangeEvent(KAON2Manager.factory().classMember(ethnicOrigin, ethnicOriginIndividual), OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(ethnicOrigin, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("racialOrigin")) {
				racialOrigin = KAON2Manager.factory().owlClass(URI + "#racialOrigin");
				Individual racialOriginIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("racialOrigin"));
				changes.add(
						new OntologyChangeEvent(KAON2Manager.factory().classMember(racialOrigin, racialOriginIndividual), OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(racialOrigin, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("politicalOpinion")) {
				politicalOpinion = KAON2Manager.factory().owlClass(URI + "#politicalOpinion");
				Individual politicalOpinionIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("politicalOpinion"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(politicalOpinion, politicalOpinionIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(politicalOpinion, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("religiousBelief")) {
				religiousBelief = KAON2Manager.factory().owlClass(URI + "#religiousBelief");
				Individual religiousBeliefIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("religiousBelief"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(religiousBelief, religiousBeliefIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(religiousBelief, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("philosophicalBelief")) {
				philosophicalBelief = KAON2Manager.factory().owlClass(URI + "#philosophicalBelief");
				Individual philosophicalBeliefIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("philosophicalBelief"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(philosophicalBelief, philosophicalBeliefIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(philosophicalBelief, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("tradeUnionMembership")) {
				tradeUnionMembership = KAON2Manager.factory().owlClass(URI + "#tradeUnionMembership");
				Individual tradeUnionMembershipIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("tradeUnionMembership"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(tradeUnionMembership, tradeUnionMembershipIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(tradeUnionMembership, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("geneticData")) {
				geneticData = KAON2Manager.factory().owlClass(URI + "#geneticData");
				Individual geneticDataIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("geneticData"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(geneticData, geneticDataIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(geneticData, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("biometricData")) {
				biometricData = KAON2Manager.factory().owlClass(URI + "#biometricData");
				Individual biometricDataIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("biometricData"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(biometricData, biometricDataIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(biometricData, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("health")) {
				health = KAON2Manager.factory().owlClass(URI + "#health");
				Individual healthIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("health"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(health, healthIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(health, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("sexLife")) {
				sexLife = KAON2Manager.factory().owlClass(URI + "#sexLife");
				Individual sexLifeIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("sexLife"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(sexLife, sexLifeIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(sexLife, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("sexualOrientation")) {
				sexualOrientation = KAON2Manager.factory().owlClass(URI + "#sexualOrientation");
				Individual sexualOrientationIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("sexualOrientation"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(sexualOrientation, sexualOrientationIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(sexualOrientation, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("criminalOffense")) {
				criminalOffense = KAON2Manager.factory().owlClass(URI + "#criminalOffense");
				Individual criminalOffenseIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("criminalOffense"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(criminalOffense, criminalOffenseIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(criminalOffense, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("criminalConviction")) {
				criminalConviction = KAON2Manager.factory().owlClass(URI + "#criminalConviction");
				Individual criminalConvictionIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("criminalConviction"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(criminalConviction, criminalConvictionIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(criminalConviction, data), OntologyChangeEvent.ChangeType.ADD));
			}

			// TODO add relationships between individuals
			ObjectProperty has = KAON2Manager.factory().objectProperty(URI + "#has");
			// process has processing, process has data and process has first processing date
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, process), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, processing), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, process), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, firstProcessingDate), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, process), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, data), OntologyChangeEvent.ChangeType.ADD));
			// TODO for processing add individuals for the things that are related to processing (...)

			onto.applyChanges(changes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return onto;
	}
}
