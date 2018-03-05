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
			Individual processIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("process"));
			Individual processingIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("processing"));
			Individual firstProcessingDateIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("firstProcessingDate"));
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

//add individual of Evaluation 
			
			OWLClass evaluation = KAON2Manager.factory().owlClass(URI + "#evaluation");
			OWLClass automatedProcessing = KAON2Manager.factory().owlClass(URI + "#automatedProcessing");
			OWLClass profiling = KAON2Manager.factory().owlClass(URI + "#profiling");
			OWLClass legalEffect = KAON2Manager.factory().owlClass(URI + "#legalEffect");
			Individual evaluationIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("evaluation"));
			Individual automatedProcessingIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("automatedProcessing"));
			Individual profilingIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("profiling"));
			Individual legalEffectIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("legalEffect"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(evaluation, evaluationIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(automatedProcessing, automatedProcessingIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(profiling, profilingIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(legalEffect, legalEffectIndividual), OntologyChangeEvent.ChangeType.ADD));
			
			
			//add individual of view, natural person, representative
			OWLClass view = KAON2Manager.factory().owlClass(URI + "#view");
			OWLClass publicInterest = KAON2Manager.factory().owlClass(URI + "#publicInterest");
			OWLClass commercialInterest = KAON2Manager.factory().owlClass(URI + "#commercialInterest");
			OWLClass securityOfProcessing = KAON2Manager.factory().owlClass(URI + "#securityOfProcessing");
			OWLClass representative = KAON2Manager.factory().owlClass(URI + "#representative");
			OWLClass naturalPerson = KAON2Manager.factory().owlClass(URI + "#naturalPerson");
			Individual viewIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("view"));
			Individual publicInterestIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("publicInterest"));
			Individual commercialInterestIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("commercialInterest"));
			Individual securityOfProcessingIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("securityOfProcessing"));
			Individual representativeIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("representative"));
			Individual naturalPersonIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("naturalPerson"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(view, viewIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(publicInterest, publicInterestIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(commercialInterest, commercialInterestIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(securityOfProcessing, securityOfProcessingIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(representative, representativeIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(naturalPerson, naturalPersonIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			
			
			// add measures to address risks, safeguard, security measure, mechanisms to ensure protection of data
			OWLClass measuresToAddressRisks = KAON2Manager.factory().owlClass(URI + "#measuresToAddressRisks");
			OWLClass safeguard = KAON2Manager.factory().owlClass(URI + "#safeguard");
			OWLClass securityMeasures = KAON2Manager.factory().owlClass(URI + "#securityMeasures");
			OWLClass mechanismsToEnsureProtectionOfData = KAON2Manager.factory().owlClass(URI + "#mechanismsToEnsureProtectionOfdata");
			Individual measuresToAddressRisksIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("measuresToAddressRisks"));
			Individual safeguardIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("safeguard"));
			Individual securityMeasuresIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("securityMeasures"));
			Individual mechanismsToEnsureProtectionOfDataIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("mechanismsToEnsureProtectionOfData"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(measuresToAddressRisks, measuresToAddressRisksIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(safeguard, safeguardIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(securityMeasures, securityMeasuresIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(mechanismsToEnsureProtectionOfData, mechanismsToEnsureProtectionOfDataIndividual), OntologyChangeEvent.ChangeType.ADD));
			
			//add individuals of DPIA
			OWLClass systematicDescriptionOfProcessing = KAON2Manager.factory().owlClass(URI + "#systematicDescriptionOfProcessing");
			OWLClass purposeOfProcessing = KAON2Manager.factory().owlClass(URI + "#purposeOfProcessing");
			OWLClass legitimateInterestOfProcessing = KAON2Manager.factory().owlClass(URI + "#legitimateInterestOfProcessing");
			OWLClass assessmentOfNecessityOfProcessing = KAON2Manager.factory().owlClass(URI + "#assessmentOfNecessityOfProcessing");
			OWLClass assessmentOfProportionalityOfProcessing = KAON2Manager.factory().owlClass(URI + "#assessmentOfProportionalityOfProcessing");
			OWLClass assessmentOfRisksAndRightsToFreedom = KAON2Manager.factory().owlClass(URI + "#assessmentOfRisksAndRightsToFreedom");
			Individual systematicDescriptionOfProcessingIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("systematicDescriptionOfProcessing"));
			Individual purposeOfProcessingIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("purposeOfProcessing"));
			Individual legitimateInterestOfProcessingIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("legitimateInterestOfProcessing"));
			Individual assessmentOfNecessityOfProcessingIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("assessmentOfNecessityOfProcessing"));
			Individual assessmentOfProportionalityOfProcessingIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("assessmentOfProportionalityOfProcessing"));
			Individual assessmentOfRisksAndRightsToFreedomIndividual = KAON2Manager.factory().individual(URI + "#" + json.getString("assessmentOfRisksAndRightsToFreedom"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(systematicDescriptionOfProcessing,systematicDescriptionOfProcessingIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(purposeOfProcessing, purposeOfProcessingIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(legitimateInterestOfProcessing, legitimateInterestOfProcessingIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(assessmentOfNecessityOfProcessing,assessmentOfNecessityOfProcessingIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(assessmentOfProportionalityOfProcessing, assessmentOfProportionalityOfProcessingIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(assessmentOfRisksAndRightsToFreedom, assessmentOfRisksAndRightsToFreedomIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			
			// TODO add relationships between individuals
			ObjectProperty has = KAON2Manager.factory().objectProperty(URI + "#has");
			ObjectProperty evaluationHasProcessing=KAON2Manager.factory().objectProperty(URI + "#evaluationHasProcessing");
			ObjectProperty evaluationHasLegalEffect=KAON2Manager.factory().objectProperty(URI + "#evaluationHasLegalEffect");
			
			ObjectProperty naturalPersonHasView=KAON2Manager.factory().objectProperty(URI + "#naturalPersonHasView");
			ObjectProperty representativeHasNaturalPerson=KAON2Manager.factory().objectProperty(URI + "#representativeHasNaturalPerson");
			ObjectProperty viewRisksPublicInterest=KAON2Manager.factory().objectProperty(URI + "#viewRisksPublicInterest");
			ObjectProperty viewRisksCommercialInterest=KAON2Manager.factory().objectProperty(URI + "#viewRisksCommercialInterest");
			ObjectProperty viewRisksSecurityOfProcessing=KAON2Manager.factory().objectProperty(URI + "#viewRisksSecurityOfProcessing");
			
			ObjectProperty naturalPersonRelatesToData=KAON2Manager.factory().objectProperty(URI + "#naturalPersonRelatesToData");
			
			ObjectProperty measuresToAddressRisksHasSafeguard=KAON2Manager.factory().objectProperty(URI + "#measuresToAddressRisksHasSafeguard");
			ObjectProperty measuresToAddressRisksHasSecurityMeasures=KAON2Manager.factory().objectProperty(URI + "#measuresToAddressRisksHasSecurityMeasures");
			ObjectProperty measuresToAddressRisksHasMechanismsToEnsureProtectionOfData=KAON2Manager.factory().objectProperty(URI + "#measuresToAddressRisksHasMechanismsToEnsureProtectionOfData");
			
			ObjectProperty DPIAHasMeasuresToAddressRisks=KAON2Manager.factory().objectProperty(URI + "#DPIAHasMeasuresToAddressRisks");
			ObjectProperty DPIAHasSystematicDescriptionOfProcessing=KAON2Manager.factory().objectProperty(URI + "#DPIAHasSystematicDescriptionOfProcessing");
			ObjectProperty DPIAHasPurposeOfProcessing=KAON2Manager.factory().objectProperty(URI + "#DPIAHasPurposeOfProcessing");
			ObjectProperty DPIAHasLegitimateInterestOfProcessing=KAON2Manager.factory().objectProperty(URI + "#DPIAHasLegitimateInterestOfProcessing");
			ObjectProperty DPIAHasAssessmentOfNecessityOfProcessing=KAON2Manager.factory().objectProperty(URI + "DPIAHasAssessmentOfNecessityOfProcessing");
			ObjectProperty DPIAHasAssessmentOfProportionalityOfProcessing=KAON2Manager.factory().objectProperty(URI + "DPIAHasAssessmentOfProportionalityOfProcessing");
			ObjectProperty DPIAHasAssessmentOfRisksAndRightsToFreedom=KAON2Manager.factory().objectProperty(URI + "DPIAHasAssessmentOfRisksAndRightsToFreedom");
			
			// process has processing, process has data and process has first processing date
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, process), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, processing), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, process), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, firstProcessingDate), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, process), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, data), OntologyChangeEvent.ChangeType.ADD));
			
			//subclass of evaluation
			 changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(automatedProcessing,evaluation),OntologyChangeEvent.ChangeType.ADD));
			 changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(profiling,evaluation),OntologyChangeEvent.ChangeType.ADD));
			 
			//evaluation has processing, evaluation has legal effect
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(evaluationHasProcessing,evaluation),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(evaluationHasProcessing,processing),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(evaluationHasLegalEffect,evaluation),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(evaluationHasLegalEffect,legalEffect),OntologyChangeEvent.ChangeType.ADD));
		
	       //natural person has view, representative has natural person, natural person relates to data, view risks public interest, commercial interest, security of processing
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(naturalPersonHasView,naturalPerson),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(naturalPersonHasView,view),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(representativeHasNaturalPerson,representative),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(representativeHasNaturalPerson,naturalPerson),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(viewRisksPublicInterest,view),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(viewRisksPublicInterest,publicInterest),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(viewRisksCommercialInterest,view),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(viewRisksCommercialInterest,commercialInterest),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(viewRisksSecurityOfProcessing,view),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(viewRisksSecurityOfProcessing,securityOfProcessing),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(naturalPersonRelatesToData,naturalPerson),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(naturalPersonRelatesToData,data),OntologyChangeEvent.ChangeType.ADD));
	        
	        
	       //mechanisms 
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(measuresToAddressRisksHasSafeguard, measuresToAddressRisks),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(measuresToAddressRisksHasSafeguard,safeguard),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(measuresToAddressRisksHasSecurityMeasures, measuresToAddressRisks),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(measuresToAddressRisksHasSecurityMeasures,securityMeasures),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(measuresToAddressRisksHasMechanismsToEnsureProtectionOfData, measuresToAddressRisks),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(measuresToAddressRisksHasMechanismsToEnsureProtectionOfData,mechanismsToEnsureProtectionOfData),OntologyChangeEvent.ChangeType.ADD));
	        
	        //some DPIA
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasMeasuresToAddressRisks, DPIA),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(DPIAHasMeasuresToAddressRisks,measuresToAddressRisks),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasSystematicDescriptionOfProcessing, DPIA),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(DPIAHasSystematicDescriptionOfProcessing,systematicDescriptionOfProcessing),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasPurposeOfProcessing, DPIA),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(DPIAHasPurposeOfProcessing,purposesOfProcessing),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasLegitimateInterestOfProcessing, DPIA),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(DPIAHasLegitimateInterestOfProcessing,legitimateInterestOfProcessing),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasAssessmentOfNecessityOfProcessing,DPIA ),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(DPIAHasAssessmentOfNecessityOfProcessing,assessmentOfNecessityOfProcessing),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasAssessmentOfProportionalityOfProcessing, DPIA),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(DPIAHasAssessmentOfProportionalityOfProcessing,assessmentOfProportionalityOfProcessing),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasAssessmentOfRisksAndRightsToFreedom, DPIA),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(DPIAHasAssessmentOfRisksAndRightsToFreedom,assessmentOfRisksAndRightsToFreedom),OntologyChangeEvent.ChangeType.ADD));
	        
	        
			onto.applyChanges(changes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return onto;
	}
}
