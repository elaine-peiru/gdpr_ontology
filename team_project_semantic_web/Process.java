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
			
			// added new classes for risk, content, purpose, scope, technology, consistencyMechanism, dataProtectionOffier, creationDate
			OWLClass risk = KAON2Manager.factory().owlClass(URI + "#risk");
			OWLClass content = KAON2Manager.factory().owlClass(URI + "#content");
			OWLClass purpose = KAON2Manager.factory().owlClass(URI + "#purpose");
			OWLClass scope = KAON2Manager.factory().owlClass(URI + "#scope");
			OWLClass technology = KAON2Manager.factory().owlClass(URI + "#technology");
			
			OWLClass consistencyMechanism = KAON2Manager.factory().owlClass(URI + "#consistenyMechanism");
			
			OWLClass dataProtectionOfficer = KAON2Manager.factory().owlClass(URI + "#dataProtectionOfficer");
			
			OWLClass creationDate = KAON2Manager.factory().owlClass(URI + "#creationDate");
			
			// added new individuals for risk, content, purpose, scope, technology, consistencyMechanism, dataProtectionOffier, creationDate
			Individual riskIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("risk"));
			Individual contentIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("content"));
			Individual purposeIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("purpose"));
			Individual scopeIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("scope"));
			Individual technologyIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("technology"));
			
			Individual consistencyMechanismIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("consistencyMechanism"));
			
			Individual dataProtectionOfficerIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("dataProtectionOfficer"));
			
			Individual creationDateIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("creationDate"));
			
			// mapping
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(risk, riskIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(content, contentIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(purpose, purposeIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(scope, scopeIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(technology, technologyIndividual), OntologyChangeEvent.ChangeType.ADD));
			
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(consistencyMechanism, consistencyMechanismIndividual), OntologyChangeEvent.ChangeType.ADD));
			
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(dataProtectionOfficer, dataProtectionOfficerIndividual), OntologyChangeEvent.ChangeType.ADD));
			
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(creationDate, creationDateIndividual), OntologyChangeEvent.ChangeType.ADD));
			
			// subclass tradingData of Content?
			
			// subclasses of TradingData
			Individual tradingDataIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("tradingData"));
			OWLClass tradingData;
			OWLClass offeringOfGoods;
			OWLClass offeringOfServices;
			OWLClass behaviorInAtLeastOneMemberstate;
			
			if (json.getString("offeringOfGoods")) {
				offeringOfGoods = KAON2Manager.factory().owlClass(URI + "#offeringOfGoods");
				Individual offeringOfGoodsIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("offeringOfGoods"));
				changes.add(
						new OntologyChangeEvent(KAON2Manager.factory().classMember(offeringOfGoods, offeringOfGoodsIndividual), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("offeringOfServices")) {
				offeringOfServices = KAON2Manager.factory().owlClass(URI + "#offeringOfServices");
				Individual offeringOfServicesIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("offeringOfServices"));
				changes.add(
						new OntologyChangeEvent(KAON2Manager.factory().classMember(offeringOfServices, offeringOfServicesIndividual), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("behaviorInAtLeastOneMemberstate")) {
				behaviorInAtLeastOneMemberstate = KAON2Manager.factory().owlClass(URI + "#behaviorInAtLeastOneMemberstate");
				Individual behaviorInAtLeastOneMemberstateIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("behaviorInAtLeastOneMemberstate"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(behaviorInAtLeastOneMemberstate, behaviorInAtLeastOneMemberstateIndividual),
						OntologyChangeEvent.ChangeType.ADD));
			}
			
			
			// TODO for data -> create individuals directly of the subclass
			Individual dataIndividual = KAON2Manager.factory().individual(URI + "#" + this.sData);
			OWLClass ethnicOrigin;
			OWLClass racialOrigin;
			OWLClass politicalOpinion;
			OWLClass religiousBelief;
			OWLClass data;
			if (json.getString("ethnicOrigin")) {
				ethnicOrigin = KAON2Manager.factory().owlClass(URI + "#ethnicData");
				Individual ethnicOriginIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("ethnicOrigin"));
				changes.add(
						new OntologyChangeEvent(KAON2Manager.factory().classMember(ethnicOrigin, ethnicOriginIndividual), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("racialOrigin")) {
				racialOrigin = KAON2Manager.factory().owlClass(URI + "#racialOrigin");
				Individual racialOriginIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("racialOrigin"));
				changes.add(
						new OntologyChangeEvent(KAON2Manager.factory().classMember(racialOrigin, racialOriginIndividual), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("politicalOpinion")) {
				politicalOpinion = KAON2Manager.factory().owlClass(URI + "#politicalOpinion");
				Individual politicalOpinionIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("politicalOpinion"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(politicalOpinion, politicalOpinionIndividual),
						OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("religiousBelief")) {
				religiousBelief = KAON2Manager.factory().owlClass(URI + "#religiousBelief");
				Individual religiousBeliefIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("religiousBelief"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(religiousBelief, religiousBeliefIndividual),
						OntologyChangeEvent.ChangeType.ADD));
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
			
			//relationships
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, content), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, risk), OntologyChangeEvent.ChangeType.ADD));

			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, purpose), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, risk), OntologyChangeEvent.ChangeType.ADD));
			
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, scope), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, risk), OntologyChangeEvent.ChangeType.ADD));
			
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, technology), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, risk), OntologyChangeEvent.ChangeType.ADD));
			
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, content), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, processing), OntologyChangeEvent.ChangeType.ADD));
			
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, purpose), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, processing), OntologyChangeEvent.ChangeType.ADD));
			
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, scope), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, processing), OntologyChangeEvent.ChangeType.ADD));
			
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, technology), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, processing), OntologyChangeEvent.ChangeType.ADD));
			
			ObjectProperty isAppliedTo = KAON2Manager.factory().objectProperty(URI + "#isAppliedTo");
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(isAppliedTo, consistencyMechanism), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(isAppliedTo, tradingData), OntologyChangeEvent.ChangeType.ADD));
			
			ObjectProperty checks = KAON2Manager.factory().objectProperty(URI + "#checks");
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(checks, dataProtectionOfficer), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(checks, dpia), OntologyChangeEvent.ChangeType.ADD));
			
			ObjectProperty requires = KAON2Manager.factory().objectProperty(URI + "#requires");
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(requires, dpia), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(requires, creationDate), OntologyChangeEvent.ChangeType.ADD));
			
			ObjectProperty laterThan = KAON2Manager.factory().objectProperty(URI + "#laterThan");
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(laterThan, firstProcessingDate), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(laterThan, creationDate), OntologyChangeEvent.ChangeType.ADD));
			
			// TODO for processing add individuals for the things that are related to processing (...)

			onto.applyChanges(changes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return onto;
	}
}
