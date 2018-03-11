package src;

import java.util.HashSet;
import java.util.Set;

import org.json.simple.JSONObject;
import org.semanticweb.kaon2.api.owl.elements.OWLClass;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class Process {
	public OWLOntology onto;
	public OWLOntologyManager manager;
	public final String ontologyIRI = "http://purl.org/net/team_project_semantic_web/";
	public OWLDataFactory factory = manager.getOWLDataFactory();

	public Process() {
		this.onto = OurOntology.getOurOntology();
		this.manager = OWLManager.createOWLOntologyManager();
	}

	@SuppressWarnings("deprecation")
	public void createIndividualOfProcess(JSONObject json) {
		// reference to OWL Class -> like example line 1569
	
		OWLClass approvedCodeOfConduct = (OWLClass) factory.getOWLClass(ontologyIRI +"approvedCodeOfConduct");
		OWLClass assessmentOfNecessityOfProcessing = (OWLClass) factory.getOWLClass(ontologyIRI + "assessmentOfNecessityOfProcessing");
		OWLClass assessmentOfProportionalityOfProcessing = (OWLClass) factory.getOWLClass(ontologyIRI + "assessmentOfProportionalityOfProcessing");
		OWLClass assessmentOfRisksToRightsAndFreedoms = (OWLClass) factory.getOWLClass(ontologyIRI + "assessmentOfRisksToRightsAndFreedoms");
		OWLClass automatedProcessing = (OWLClass) factory.getOWLClass(ontologyIRI + "automatedProcessing");
		OWLClass biometricData = (OWLClass) factory.getOWLClass(ontologyIRI + "biometricData");
		OWLClass commercialInterest = (OWLClass) factory.getOWLClass(ontologyIRI + "commercialInterest");
		OWLClass consistencymechanism = (OWLClass) factory.getOWLClass(ontologyIRI + "consistencymechanism");
		OWLClass contextOfProcessing = (OWLClass) factory.getOWLClass(ontologyIRI + "contextOfProcessing");
		OWLClass controller = (OWLClass) factory.getOWLClass(ontologyIRI + "controller");
		OWLClass creationDate = (OWLClass) factory.getOWLClass(ontologyIRI + "creationDate");
		OWLClass criminalConviction = (OWLClass) factory.getOWLClass(ontologyIRI + "criminalConviction");
		OWLClass criminalOffense = (OWLClass) factory.getOWLClass(ontologyIRI + "criminalOffense");
		OWLClass data = (OWLClass) factory.getOWLClass(ontologyIRI + "data");
		OWLClass dataProtectionImpactAssessment = (OWLClass) factory.getOWLClass(ontologyIRI + "dataProtectionImpactAssessment");
		OWLClass dataProtectionOfficer = (OWLClass) factory.getOWLClass(ontologyIRI + "dataProtectionOfficer");
		OWLClass dataSubject = (OWLClass) factory.getOWLClass(ontologyIRI + "dataSubject");
		OWLClass ethnicOrigin = (OWLClass) factory.getOWLClass(ontologyIRI + "ethnicOrigin");
		OWLClass evaluation = (OWLClass) factory.getOWLClass(ontologyIRI + "evaluation");
		OWLClass firstProcessingDate = (OWLClass) factory.getOWLClass(ontologyIRI + "firstProcessingDate");
		OWLClass freeMovementOfData = (OWLClass) factory.getOWLClass(ontologyIRI + "freeMovementOfData");
		OWLClass gdpr = (OWLClass) factory.getOWLClass(ontologyIRI + "gdpr");
		OWLClass geneticData = (OWLClass) factory.getOWLClass(ontologyIRI + "geneticData");
		OWLClass health = (OWLClass) factory.getOWLClass(ontologyIRI + "health");
		OWLClass legalEffect = (OWLClass) factory.getOWLClass(ontologyIRI + "legalEffect");
		OWLClass legitimateInterestOfProcessing = (OWLClass) factory.getOWLClass(ontologyIRI + "legitimateInterestOfProcessing");
		OWLClass listWithProcessesThatDoNotNeedDpia = (OWLClass) factory.getOWLClass(ontologyIRI + "listWithProcessesThatDoNotNeedDpia");
		OWLClass listWithProcessesThatNeedDpia = (OWLClass) factory.getOWLClass(ontologyIRI + "listWithProcessesThatNeedDpia");
		OWLClass measureToAddressRisk = (OWLClass) factory.getOWLClass(ontologyIRI + "measureToAddressRisk");
		OWLClass mechanismsToEnsureProtectionOfData = (OWLClass) factory.getOWLClass(ontologyIRI + "firstProcessingDate");
		OWLClass memberStateLaw = (OWLClass) factory.getOWLClass(ontologyIRI + "memberStateLaw");
		OWLClass monitoringOfDataInMemberstate = (OWLClass) factory.getOWLClass(ontologyIRI + "monitoringOfDataInMemberstate");
		OWLClass offeringOfGoods = (OWLClass) factory.getOWLClass(ontologyIRI + "offeringOfGoods");
		OWLClass offeringOfServices = (OWLClass) factory.getOWLClass(ontologyIRI + "offeringOfServices");
		OWLClass personalData = (OWLClass) factory.getOWLClass(ontologyIRI + "personalData");
		OWLClass personalInterest = (OWLClass) factory.getOWLClass(ontologyIRI + "personalInterest");
		OWLClass philosophicalBelief = (OWLClass) factory.getOWLClass(ontologyIRI + "philosophicalBelief");
		OWLClass politicalOpinion = (OWLClass) factory.getOWLClass(ontologyIRI + "politicalOpinion");
		OWLClass process = (OWLClass) factory.getOWLClass(ontologyIRI + "process");
		OWLClass processor = (OWLClass) factory.getOWLClass(ontologyIRI + "processor");
		OWLClass profiling = (OWLClass) factory.getOWLClass(ontologyIRI + "profiling");
		OWLClass publicArea = (OWLClass) factory.getOWLClass(ontologyIRI + "publicArea");
		OWLClass publicInterest = (OWLClass) factory.getOWLClass(ontologyIRI + "publicInterest");
		OWLClass purposeOfProcessing = (OWLClass) factory.getOWLClass(ontologyIRI + "purposeOfProcessing");
		OWLClass racialOrigin = (OWLClass) factory.getOWLClass(ontologyIRI + "racialOrigin");
		OWLClass religiousBelief = (OWLClass) factory.getOWLClass(ontologyIRI + "religiousBelief");
		OWLClass representativeOfDataSubject = (OWLClass) factory.getOWLClass(ontologyIRI + "representativeOfDataSubject");
		OWLClass review = (OWLClass) factory.getOWLClass(ontologyIRI + "review");
		OWLClass rights = (OWLClass) factory.getOWLClass(ontologyIRI + "rights");
		OWLClass risk = (OWLClass) factory.getOWLClass(ontologyIRI + "risk");
		OWLClass safeguard = (OWLClass) factory.getOWLClass(ontologyIRI + "safeguard");
		OWLClass scopeOfProcessing = (OWLClass) factory.getOWLClass(ontologyIRI + "scopeOfProcessing");
		OWLClass securityMeasure = (OWLClass) factory.getOWLClass(ontologyIRI + "securityMeasure");
		OWLClass securityOfProcessingOperation = (OWLClass) factory.getOWLClass(ontologyIRI + "securityOfProcessingOperation");
		OWLClass sexLife = (OWLClass) factory.getOWLClass(ontologyIRI + "sexLife");
		OWLClass sexualOrientation = (OWLClass) factory.getOWLClass(ontologyIRI + "sexualOrientation");
		OWLClass supervisoryAuthority = (OWLClass) factory.getOWLClass(ontologyIRI + "supervisoryAuthority");
		OWLClass systematicDescriptionOfProcessing = (OWLClass) factory.getOWLClass(ontologyIRI + "systematicDescriptionOfProcessing");
		OWLClass technologyOfProcessing = (OWLClass) factory.getOWLClass(ontologyIRI + "technologyOfProcessing");
		OWLClass tradeUnionMembership = (OWLClass) factory.getOWLClass(ontologyIRI + "tradeUnionMembership");
		OWLClass view = (OWLClass) factory.getOWLClass(ontologyIRI + "view");
		OWLClass europeanDataProtectionBoard = (OWLClass) factory.getOWLClass(ontologyIRI + "europeanDataProtectionBoard");
		OWLClass unionLaw = (OWLClass) factory.getOWLClass(ontologyIRI + "unionLaw");

		// create Individuals Factor -> like example line 1479
		OWLIndividual approvedCodeOfConductIndividual = factory.getOWLNamedIndividual(ontologyIRI + "approvedCodeOfConductIndividual");
		OWLIndividual assessmentOfNecessityOfProcessingIndividual = factory.getOWLNamedIndividual(ontologyIRI + "assessmentOfNecessityOfProcessingIndividual");
		OWLIndividual assessmentOfProportionalityOfProcessingIndividual= factory.getOWLNamedIndividual(ontologyIRI + "assessmentOfProportionalityOfProcessingIndividual");
		OWLIndividual assessmentOfRisksToRightsAndFreedomsIndividual = factory.getOWLNamedIndividual(ontologyIRI + "assessmentOfRisksToRightsAndFreedomsIndividual");
		OWLIndividual automatedProcessingIndividual = factory.getOWLNamedIndividual(ontologyIRI + "automatedProcessingIndividual");
		OWLIndividual biometricDataIndividual = factory.getOWLNamedIndividual(ontologyIRI + "biometricDataIndividual");
		OWLIndividual commercialInterestIndividual = factory.getOWLNamedIndividual(ontologyIRI + "commercialInterestIndividual");
		OWLIndividual consistencymechanismIndividual = factory.getOWLNamedIndividual(ontologyIRI + "consistencymechanismIndividual");
		OWLIndividual contextOfProcessingIndividual = factory.getOWLNamedIndividual(ontologyIRI + "contextOfProcessingIndividual");
		OWLIndividual controllerIndividual = factory.getOWLNamedIndividual(ontologyIRI + "controllerIndividual");
		OWLIndividual creationDateIndividual = factory.getOWLNamedIndividual(ontologyIRI + "creationDateIndividual");
		OWLIndividual criminalConvictionIndividual = factory.getOWLNamedIndividual(ontologyIRI + "criminalConvictionIndividual");
		OWLIndividual criminalOffenseIndividual = factory.getOWLNamedIndividual(ontologyIRI + "criminalOffenseIndividual");
		OWLIndividual dataIndividual = factory.getOWLNamedIndividual(ontologyIRI + "dataIndividual");
		OWLIndividual dataProtectionImpactAssessmentIndividual = factory.getOWLNamedIndividual(ontologyIRI + "dataProtectionImpactAssessmentIndividual");
		OWLIndividual dataProtectionOfficerIndividual = factory.getOWLNamedIndividual(ontologyIRI + "dataProtectionOfficerIndividual");
		OWLIndividual dataSubjectIndividual = factory.getOWLNamedIndividual(ontologyIRI + "dataSubjectIndividual");
		OWLIndividual ethnicOriginIndividual = factory.getOWLNamedIndividual(ontologyIRI + "ethnicOriginIndividual");
		OWLIndividual evaluationIndividual = factory.getOWLNamedIndividual(ontologyIRI + "evaluationIndividual");
		OWLIndividual firstProcessingDateIndividual = factory.getOWLNamedIndividual(ontologyIRI + "firstProcessingDateIndividual");
		OWLIndividual freeMovementOfDataIndividual = factory.getOWLNamedIndividual(ontologyIRI + "freeMovementOfDataIndividual");
		OWLIndividual gdprIndividual = factory.getOWLNamedIndividual(ontologyIRI + "gdprIndividual");
		OWLIndividual geneticDataIndividual = factory.getOWLNamedIndividual(ontologyIRI + "geneticDataIndividual");
		OWLIndividual healthIndividual = factory.getOWLNamedIndividual(ontologyIRI + "healthIndividual");
		OWLIndividual legalEffectIndividual = factory.getOWLNamedIndividual(ontologyIRI + "legalEffectIndividual");
		OWLIndividual legitimateInterestOfProcessingIndividual = factory.getOWLNamedIndividual(ontologyIRI + "legitimateInterestOfProcessingIndividual");
		OWLIndividual listWithProcessesThatDoNotNeedDpiaIndividual = factory.getOWLNamedIndividual(ontologyIRI + "listWithProcessesThatDoNotNeedDpiaIndividual");
		OWLIndividual listWithProcessesThatNeedDpiaIndividual = factory.getOWLNamedIndividual(ontologyIRI + "listWithProcessesThatNeedDpiaIndividual");
		OWLIndividual measureToAddressRiskIndividual = factory.getOWLNamedIndividual(ontologyIRI + "measureToAddressRiskIndividual");
		OWLIndividual mechanismsToEnsureProtectionOfDataIndividual = factory.getOWLNamedIndividual(ontologyIRI + "mechanismsToEnsureProtectionOfDataIndividual");
		OWLIndividual memberStateLawIndividual = factory.getOWLNamedIndividual(ontologyIRI + "memberStateLawIndividual");
		OWLIndividual monitoringOfDataInMemberstateIndividual = factory.getOWLNamedIndividual(ontologyIRI + "monitoringOfDataInMemberstateIndividual");
		OWLIndividual offeringOfGoodsIndividual = factory.getOWLNamedIndividual(ontologyIRI + "offeringOfGoodsIndividual");
		OWLIndividual offeringOfServicesIndividual = factory.getOWLNamedIndividual(ontologyIRI + "offeringOfServicesIndividual");
		OWLIndividual personalDataIndividual = factory.getOWLNamedIndividual(ontologyIRI + "personalDataIndividual");
		OWLIndividual personalInterestIndividual = factory.getOWLNamedIndividual(ontologyIRI + "personalInterestIndividual");
		OWLIndividual philosophicalBeliefIndividual = factory.getOWLNamedIndividual(ontologyIRI + "philosophicalBeliefIndividual");
		OWLIndividual politicalOpinionIndividual = factory.getOWLNamedIndividual(ontologyIRI + "politicalOpinionIndividual");
		OWLIndividual processIndividual = factory.getOWLNamedIndividual(ontologyIRI + "processIndividual");
		OWLIndividual processorIndividual = factory.getOWLNamedIndividual(ontologyIRI + "processorIndividual");
		OWLIndividual profilingIndividual = factory.getOWLNamedIndividual(ontologyIRI + "profilingIndividual");
		OWLIndividual publicAreaIndividual = factory.getOWLNamedIndividual(ontologyIRI + "publicAreaIndividual");
		OWLIndividual publicInterestIndividual = factory.getOWLNamedIndividual(ontologyIRI + "publicInterestIndividual");
		OWLIndividual purposeOfProcessingIndividual = factory.getOWLNamedIndividual(ontologyIRI + "purposeOfProcessingIndividual");
		OWLIndividual racialOriginIndividual = factory.getOWLNamedIndividual(ontologyIRI + "racialOriginIndividual");
		OWLIndividual religiousBeliefIndividual = factory.getOWLNamedIndividual(ontologyIRI + "religiousBeliefIndividual");
		OWLIndividual representativeOfDataSubjectIndividual = factory.getOWLNamedIndividual(ontologyIRI + "representativeOfDataSubjectIndividual");
		OWLIndividual reviewIndividual = factory.getOWLNamedIndividual(ontologyIRI + "reviewIndividual");
		OWLIndividual rightsIndividual = factory.getOWLNamedIndividual(ontologyIRI + "rightsIndividual");
		OWLIndividual riskIndividual = factory.getOWLNamedIndividual(ontologyIRI + "riskIndividual");
		OWLIndividual safeguardIndividual = factory.getOWLNamedIndividual(ontologyIRI + "safeguardIndividual");
		OWLIndividual scopeOfProcessingIndividual = factory.getOWLNamedIndividual(ontologyIRI + "scopeOfProcessingIndividual");
		OWLIndividual securityMeasureIndividual = factory.getOWLNamedIndividual(ontologyIRI + "securityMeasureIndividual");
		OWLIndividual securityOfProcessingOperationIndividual = factory.getOWLNamedIndividual(ontologyIRI + "securityOfProcessingOperationIndividual");
		OWLIndividual sexLifeIndividual = factory.getOWLNamedIndividual(ontologyIRI + "sexLifeIndividual");
		OWLIndividual sexualOrientationIndividual = factory.getOWLNamedIndividual(ontologyIRI + "sexualOrientationIndividual");
		OWLIndividual supervisoryAuthorityIndividual = factory.getOWLNamedIndividual(ontologyIRI + "supervisoryAuthorityIndividual");
		OWLIndividual systematicDescriptionOfProcessingIndividual = factory.getOWLNamedIndividual(ontologyIRI + "systematicDescriptionOfProcessingIndividual");
		OWLIndividual technologyOfProcessingIndividual = factory.getOWLNamedIndividual(ontologyIRI + "technologyOfProcessingIndividual");
		OWLIndividual tradeUnionMembershipIndividual = factory.getOWLNamedIndividual(ontologyIRI + "tradeUnionMembershipIndividual");
		OWLIndividual viewIndividual = factory.getOWLNamedIndividual(ontologyIRI + "viewIndividual");
		OWLIndividual europeanDataProtectionBoardIndividual = factory.getOWLNamedIndividual(ontologyIRI + "europeanDataProtectionBoardIndividual");
		OWLIndividual unionLawIndividual = factory.getOWLNamedIndividual(ontologyIRI + "unionLawIndividual");
		
		// specify class of individual -> like example line 1593
		OWLClassAssertionAxiom classAssertionApprovedCodeOfConduct = factory.getOWLClassAssertionAxiom((OWLClassExpression) approvedCodeOfConduct, approvedCodeOfConductIndividual);
		OWLClassAssertionAxiom classAssertionAssessmentOfNecessityOfProcessing = factory.getOWLClassAssertionAxiom(assessmentOfNecessityOfProcessing, assessmentOfNecessityOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionAssessmentOfProportionalityOfProcessing = factory.getOWLClassAssertionAxiom(assessmentOfProportionalityOfProcessing, assessmentOfProportionalityOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionAssessmentOfRisksToRightsAndFreedoms = factory.getOWLClassAssertionAxiom(assessmentOfRisksToRightsAndFreedoms, assessmentOfRisksToRightsAndFreedomsIndividual);
		OWLClassAssertionAxiom classAssertionAutomatedProcessing = factory.getOWLClassAssertionAxiom(automatedProcessing, automatedProcessingIndividual);
		OWLClassAssertionAxiom classAssertionBiometricData = factory.getOWLClassAssertionAxiom(biometricData, biometricDataIndividual);
		OWLClassAssertionAxiom classAssertionCommercialInterest = factory.getOWLClassAssertionAxiom(commercialInterest, commercialInterestIndividual);
		OWLClassAssertionAxiom classAssertionConsistencymechanism = factory.getOWLClassAssertionAxiom(consistencymechanism, consistencymechanismIndividual);
		OWLClassAssertionAxiom classAssertionContextOfProcessing = factory.getOWLClassAssertionAxiom(contextOfProcessing, contextOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionController = factory.getOWLClassAssertionAxiom(controller, controllerIndividual);
		OWLClassAssertionAxiom classAssertionCreationDate = factory.getOWLClassAssertionAxiom(creationDate, creationDateIndividual);
		OWLClassAssertionAxiom classAssertionCriminalConviction = factory.getOWLClassAssertionAxiom(criminalConviction, criminalConvictionIndividual);
		OWLClassAssertionAxiom classAssertionCriminalOffense = factory.getOWLClassAssertionAxiom(criminalOffense, criminalOffenseIndividual);
		OWLClassAssertionAxiom classAssertionData = factory.getOWLClassAssertionAxiom(data, dataIndividual);
		OWLClassAssertionAxiom classAssertionDataProtectionImpactAssessment = factory.getOWLClassAssertionAxiom(dataProtectionImpactAssessment, dataProtectionImpactAssessmentIndividual);
		OWLClassAssertionAxiom classAssertionDataProtectionOfficer = factory.getOWLClassAssertionAxiom(dataProtectionOfficer, dataProtectionOfficerIndividual);
		OWLClassAssertionAxiom classAssertionDataSubject = factory.getOWLClassAssertionAxiom(dataSubject, dataSubjectIndividual);
		OWLClassAssertionAxiom classAssertionEthnicOrigin = factory.getOWLClassAssertionAxiom(ethnicOrigin, ethnicOriginIndividual);
		OWLClassAssertionAxiom classAssertionEvaluation = factory.getOWLClassAssertionAxiom(evaluation, evaluationIndividual);
		OWLClassAssertionAxiom classAssertionFirstProcessingDate = factory.getOWLClassAssertionAxiom(firstProcessingDate1, firstProcessingDateIndividual);
		OWLClassAssertionAxiom classAssertionFreeMovementOfData = factory.getOWLClassAssertionAxiom(freeMovementOfData, freeMovementOfDataIndividual);
		OWLClassAssertionAxiom classAssertionGdpr = factory.getOWLClassAssertionAxiom(gdpr, gdprIndividual);
		OWLClassAssertionAxiom classAssertionGeneticData = factory.getOWLClassAssertionAxiom(geneticData, geneticDataIndividual);
		OWLClassAssertionAxiom classAssertionHealth = factory.getOWLClassAssertionAxiom(health, healthIndividual);
		OWLClassAssertionAxiom classAssertionLegalEffect = factory.getOWLClassAssertionAxiom(legalEffect, legalEffectIndividual);
		OWLClassAssertionAxiom classAssertionLegitimateInterestOfProcessing = factory.getOWLClassAssertionAxiom(legitimateInterestOfProcessing, legitimateInterestOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionListWithProcessesThatDoNotNeedDpia = factory.getOWLClassAssertionAxiom(listWithProcessesThatDoNotNeedDpia, listWithProcessesThatDoNotNeedDpiaIndividual);
		OWLClassAssertionAxiom classAssertionListWithProcessesThatNeedDpia = factory.getOWLClassAssertionAxiom(listWithProcessesThatNeedDpia, listWithProcessesThatNeedDpiaIndividual);
		OWLClassAssertionAxiom classAssertionMeasureToAddressRisk = factory.getOWLClassAssertionAxiom(measureToAddressRisk, measureToAddressRiskIndividual);
		OWLClassAssertionAxiom classAssertionMechanismsToEnsureProtectionOfData = factory.getOWLClassAssertionAxiom(mechanismsToEnsureProtectionOfData, mechanismsToEnsureProtectionOfDataIndividual);
		OWLClassAssertionAxiom classAssertionMemberStateLaw = factory.getOWLClassAssertionAxiom(memberStateLaw, memberStateLawIndividual);
		OWLClassAssertionAxiom classAssertionMonitoringOfDataInMemberstate = factory.getOWLClassAssertionAxiom(monitoringOfDataInMemberstate, monitoringOfDataInMemberstateIndividual);
		OWLClassAssertionAxiom classAssertionOfferingOfGoods = factory.getOWLClassAssertionAxiom(offeringOfGoods, offeringOfGoodsIndividual);
		OWLClassAssertionAxiom classAssertionOfferingOfServices = factory.getOWLClassAssertionAxiom(offeringOfServices, offeringOfServicesIndividual);
		OWLClassAssertionAxiom classAssertionPersonalData = factory.getOWLClassAssertionAxiom(personalData, personalDataIndividual);
		OWLClassAssertionAxiom classAssertionPersonalInterest = factory.getOWLClassAssertionAxiom(personalInterest, personalInterestIndividual);
		OWLClassAssertionAxiom classAssertionPhilosophicalBelief = factory.getOWLClassAssertionAxiom(philosophicalBelief, philosophicalBeliefIndividual);
		OWLClassAssertionAxiom classAssertionPoliticalOpinion = factory.getOWLClassAssertionAxiom(politicalOpinion, politicalOpinionIndividual);
		OWLClassAssertionAxiom classAssertionAxProcess= factory.getOWLClassAssertionAxiom(process, processIndividual);
		OWLClassAssertionAxiom classAssertionAxProcessor = factory.getOWLClassAssertionAxiom(processor, processorIndividual);
		OWLClassAssertionAxiom classAssertionAxProfiling = factory.getOWLClassAssertionAxiom(profiling, profilingIndividual);
		OWLClassAssertionAxiom classAssertionAxPublicArea = factory.getOWLClassAssertionAxiom(publicArea, publicAreaIndividual);
		OWLClassAssertionAxiom classAssertionAxPublicInterest = factory.getOWLClassAssertionAxiom(publicInterest, publicInterestIndividual);
		OWLClassAssertionAxiom classAssertionAxPurposeOfProcessing = factory.getOWLClassAssertionAxiom(purposeOfProcessing, purposeOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionAxRacialOrigin = factory.getOWLClassAssertionAxiom(racialOrigin, racialOriginIndividual);
		OWLClassAssertionAxiom classAssertionAxReligiousBelief = factory.getOWLClassAssertionAxiom(religiousBelief, religiousBeliefIndividual);
		OWLClassAssertionAxiom classAssertionAxRepresentativeOfDataSubject = factory.getOWLClassAssertionAxiom(representativeOfDataSubject, representativeOfDataSubjectIndividual);
		OWLClassAssertionAxiom classAssertionAxReview = factory.getOWLClassAssertionAxiom(review, reviewIndividual);
		OWLClassAssertionAxiom classAssertionAxRights = factory.getOWLClassAssertionAxiom(rights, rightsIndividual);
		OWLClassAssertionAxiom classAssertionAxRisk = factory.getOWLClassAssertionAxiom(risk, riskIndividual);
		OWLClassAssertionAxiom classAssertionAxSafeguard = factory.getOWLClassAssertionAxiom(safeguard, safeguardIndividual);
		OWLClassAssertionAxiom classAssertionAxScopeOfProcessing = factory.getOWLClassAssertionAxiom(scopeOfProcessing, scopeOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionAxSecurityMeasure = factory.getOWLClassAssertionAxiom(securityMeasure, securityMeasureIndividual);
		OWLClassAssertionAxiom classAssertionAxSecurityOfProcessing = factory.getOWLClassAssertionAxiom(securityOfProcessingOperation, securityOfProcessingOperationIndividual);
		OWLClassAssertionAxiom classAssertionAxSexLife = factory.getOWLClassAssertionAxiom(sexLife, sexLifeIndividual);
		OWLClassAssertionAxiom classAssertionAxSexualOrientation = factory.getOWLClassAssertionAxiom(sexualOrientation, sexualOrientationIndividual);
		OWLClassAssertionAxiom classAssertionAxSupervisoryAuthority = factory.getOWLClassAssertionAxiom(supervisoryAuthority, supervisoryAuthorityIndividual);
		OWLClassAssertionAxiom classAssertionAxSystematicDescriptionOfProcessing = factory.getOWLClassAssertionAxiom(systematicDescriptionOfProcessing, systematicDescriptionOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionAxTechnologyOfProcessing = factory.getOWLClassAssertionAxiom(technologyOfProcessing, technologyOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionAxTradeUnionMembership = factory.getOWLClassAssertionAxiom(tradeUnionMembership, tradeUnionMembershipIndividual);
		OWLClassAssertionAxiom classAssertionAxView = factory.getOWLClassAssertionAxiom(view, viewIndividual);
		OWLClassAssertionAxiom classAssertionAxEuropeanDataProtectionBoard = factory.getOWLClassAssertionAxiom(europeanDataProtectionBoard, europeanDataProtectionBoardIndividual);
		OWLClassAssertionAxiom classAssertionAxUnionLaw = factory.getOWLClassAssertionAxiom(unionLaw, unionLawIndividual);

		// reference to ObjectProperty -> like example line 1493
		Set<OWLAxiom> axioms = new HashSet<OWLAxiom>();
		
		OWLObjectProperty affects = factory.getOWLObjectProperty(ontologyIRI + "affects");
		OWLObjectProperty involves = factory.getOWLObjectProperty(ontologyIRI + "involves");
		OWLObjectProperty isLikelyToResultIn = factory.getOWLObjectProperty(ontologyIRI + "isLikelyToResultIn");
		OWLObjectProperty assesses = factory.getOWLObjectProperty(ontologyIRI + "assesses");
		OWLObjectProperty carriesOut = factory.getOWLObjectProperty(ontologyIRI + "carriesOut");
		OWLObjectProperty creates = factory.getOWLObjectProperty(ontologyIRI + "creates");
		OWLObjectProperty isCompliantTo = factory.getOWLObjectProperty(ontologyIRI + "isCompliantTo");
		OWLObjectProperty seeksAdviceOf = factory.getOWLObjectProperty(ontologyIRI + "seeksAdviceOf");
		OWLObjectProperty seeksViewOf = factory.getOWLObjectProperty(ontologyIRI + "seeksViewOf");
		OWLObjectProperty occursBefore = factory.getOWLObjectProperty(ontologyIRI + "occursBefore");
		OWLObjectProperty contains = factory.getOWLObjectProperty(ontologyIRI + "contains");
		OWLObjectProperty isMonitoredIn = factory.getOWLObjectProperty(ontologyIRI + "isMonitoredIn");
		OWLObjectProperty relatesTo = factory.getOWLObjectProperty(ontologyIRI + "relatesTo");
		OWLObjectProperty revealsInformationAbout = factory.getOWLObjectProperty(ontologyIRI + "revealsInformationAbout");
		OWLObjectProperty isDesignated = factory.getOWLObjectProperty(ontologyIRI + "isDesignated");
		OWLObjectProperty receives = factory.getOWLObjectProperty(ontologyIRI + "receives");
		OWLObjectProperty produces = factory.getOWLObjectProperty(ontologyIRI + "produces");
		OWLObjectProperty concerns = factory.getOWLObjectProperty(ontologyIRI + "concerns");
		OWLObjectProperty compliesTo = factory.getOWLObjectProperty(ontologyIRI + "compliesTo");
		OWLObjectProperty takesIntoAccount = factory.getOWLObjectProperty(ontologyIRI + "takesIntoAccount");
		OWLObjectProperty basesOn = factory.getOWLObjectProperty(ontologyIRI + "basesOn");
		OWLObjectProperty isPartOf = factory.getOWLObjectProperty(ontologyIRI + "isPartOf");
		OWLObjectProperty isPerformedAccordingTo = factory.getOWLObjectProperty(ontologyIRI + "isPerformedAccordingTo");
		OWLObjectProperty controls = factory.getOWLObjectProperty(ontologyIRI + "controls");
		OWLObjectProperty isAuthorizedBy = factory.getOWLObjectProperty(ontologyIRI + "isAuthorizedBy");
		OWLObjectProperty checks = factory.getOWLObjectProperty(ontologyIRI + "checks");
		OWLObjectProperty changes = factory.getOWLObjectProperty(ontologyIRI + "changes");
		OWLObjectProperty applies = factory.getOWLObjectProperty(ontologyIRI + "applies");
		OWLObjectProperty publishes = factory.getOWLObjectProperty(ontologyIRI + "publishes");
		OWLObjectProperty respects = factory.getOWLObjectProperty(ontologyIRI + "respects");
		
		OWLObjectProperty has = factory.getOWLObjectProperty(ontologyIRI + "has");
		OWLObjectProperty isAppliedTo = factory.getOWLObjectProperty(ontologyIRI + "isAppliedTo");
		
		// specify all changes in between here

		manager.addAxioms(onto, axioms);

		// specify relationships between Individuals -> like example line 1498
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_Affects_FreeMovementOfData = factory.getOWLObjectPropertyAssertionAxiom(affects, contextOfProcessingIndividual, freeMovementOfDataIndividual);
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_Involves_MonitoringOfDataInMemberState = factory.getOWLObjectPropertyAssertionAxiom(involves, contextOfProcessingIndividual, mechanismsToEnsureProtectionOfDataIndividual);
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_Involves_OfferingOfGoods = factory.getOWLObjectPropertyAssertionAxiom(involves, contextOfProcessingIndividual, offeringOfGoodsIndividual);
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_Involves_OfferingOfServices = factory.getOWLObjectPropertyAssertionAxiom(involves, contextOfProcessingIndividual, offeringOfServicesIndividual);
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLObjectPropertyAssertionAxiom(isLikelyToResultIn, contextOfProcessingIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom Controller_Assesses_PurposeOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(assesses, controllerIndividual, purposeOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom Controller_CarriesOut_Review = factory.getOWLObjectPropertyAssertionAxiom(carriesOut, controllerIndividual, reviewIndividual);
		OWLObjectPropertyAssertionAxiom Controller_Creates_DataProtectonImpactAssessment = factory.getOWLObjectPropertyAssertionAxiom(creates, controllerIndividual, dataProtectionImpactAssessmentIndividual);
		OWLObjectPropertyAssertionAxiom Controller_IsCompliantTo_ApprovedCodeOfConduct = factory.getOWLObjectPropertyAssertionAxiom(isCompliantTo, controllerIndividual, approvedCodeOfConductIndividual);
		OWLObjectPropertyAssertionAxiom Controller_SeeksAdviceOf_DataProtectionOfficer = factory.getOWLObjectPropertyAssertionAxiom(seeksAdviceOf, controllerIndividual, dataProtectionOfficerIndividual);
		
		OWLObjectPropertyAssertionAxiom Controller_SeeksViewOf_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf, controllerIndividual, dataSubjectIndividual);
		OWLObjectPropertyAssertionAxiom Controller_SeeksViewOf_RepresentativeOfDataSubject = factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf, controllerIndividual, representativeOfDataSubjectIndividual);
		OWLObjectPropertyAssertionAxiom CreationDate_OccursBefore_FirstProcessingDate = factory.getOWLObjectPropertyAssertionAxiom(occursBefore, creationDateIndividual, firstProcessingDateIndividual);
		OWLObjectPropertyAssertionAxiom Data_Contains_BiometricData = factory.getOWLObjectPropertyAssertionAxiom(contains, dataIndividual, biometricDataIndividual);
		OWLObjectPropertyAssertionAxiom Data_IsMonitoredIn_PublicArea = factory.getOWLObjectPropertyAssertionAxiom(isMonitoredIn, dataIndividual, publicAreaIndividual);
		OWLObjectPropertyAssertionAxiom Data_Contains_GeneticData = factory.getOWLObjectPropertyAssertionAxiom(contains, dataIndividual, geneticDataIndividual);
		OWLObjectPropertyAssertionAxiom Data_RelatesTo_CriminalConviction = factory.getOWLObjectPropertyAssertionAxiom(relatesTo, dataIndividual, criminalConvictionIndividual);
		OWLObjectPropertyAssertionAxiom Data_RelatesTo_CriminalOffense = factory.getOWLObjectPropertyAssertionAxiom(relatesTo, dataIndividual, criminalOffenseIndividual);
		OWLObjectPropertyAssertionAxiom Data_RelatesTo_SecurityMeasure = factory.getOWLObjectPropertyAssertionAxiom(relatesTo, dataIndividual, securityMeasureIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_EthnicOrigin = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout, dataIndividual, ethnicOriginIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_Health = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout, dataIndividual, healthIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_PhilosophicalBelief = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout, dataIndividual, philosophicalBeliefIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_PoliticalOpinion = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout, dataIndividual, politicalOpinionIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_RacialOrigin = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout, dataIndividual, racialOriginIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_ReligiousBelief = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout, dataIndividual, religiousBeliefIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_SexLife = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout, dataIndividual, sexLifeIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_SexualOrientation = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout, dataIndividual, sexualOrientationIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_TradeUnionMembership = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout, dataIndividual, tradeUnionMembershipIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, assessmentOfNecessityOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, assessmentOfProportionalityOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms = factory.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, assessmentOfRisksToRightsAndFreedomsIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, legitimateInterestOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_MeasureToAddressRisks = factory.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, measureToAddressRiskIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_PurposeOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, purposeOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, systematicDescriptionOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionOfficer_IsDesignated = factory.getOWLObjectPropertyAssertionAxiom(isDesignated, dataProtectionOfficerIndividual);
		OWLObjectPropertyAssertionAxiom EuropeanDataProtectionBoard_Receives_ListWithProcessesThatDoNotNeedDpiaIndividual = factory.getOWLObjectPropertyAssertionAxiom(receives, europeanDataProtectionBoardIndividual, listWithProcessesThatDoNotNeedDpiaIndividual);
		OWLObjectPropertyAssertionAxiom EuropeanDataProtectionBoard_Receives_ListWithProcessesThatDoNeedDpiaIndividual = factory.getOWLObjectPropertyAssertionAxiom(receives, europeanDataProtectionBoardIndividual, listWithProcessesThatNeedDpiaIndividual);
		OWLObjectPropertyAssertionAxiom Evaluation_BasesOn_AutomatedProcessing = factory.getOWLObjectPropertyAssertionAxiom(basesOn, evaluationIndividual, automatedProcessingIndividual);
		OWLObjectPropertyAssertionAxiom Evaluation_BasesOn_Profiling = factory.getOWLObjectPropertyAssertionAxiom(basesOn, evaluationIndividual, profilingIndividual);
		OWLObjectPropertyAssertionAxiom Evaluation_Produces_LegalEffect = factory.getOWLObjectPropertyAssertionAxiom(produces, evaluationIndividual, legalEffectIndividual);
		OWLObjectPropertyAssertionAxiom LegalEffect_Concerns_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(concerns, legalEffectIndividual, dataSubjectIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisk_CompliesTo_GDPR = factory.getOWLObjectPropertyAssertionAxiom(compliesTo, measureToAddressRiskIndividual, gdprIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisk_TakesIntoAccount_Rights = factory.getOWLObjectPropertyAssertionAxiom(takesIntoAccount, measureToAddressRiskIndividual, rightsIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfData = factory.getOWLObjectPropertyAssertionAxiom(contains, measureToAddressRiskIndividual, mechanismsToEnsureProtectionOfDataIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_Contains_Safeguard = factory.getOWLObjectPropertyAssertionAxiom(contains, measureToAddressRiskIndividual, safeguardIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_Contains_SecurityMeasure = factory.getOWLObjectPropertyAssertionAxiom(contains, measureToAddressRiskIndividual, securityMeasureIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_TakesIntoAccount_PersonalInterest = factory.getOWLObjectPropertyAssertionAxiom(takesIntoAccount, measureToAddressRiskIndividual, personalInterestIndividual);
		OWLObjectPropertyAssertionAxiom PersonalData_IsPartOf_Evaluation = factory.getOWLObjectPropertyAssertionAxiom(isPartOf, personalDataIndividual, evaluationIndividual);
		OWLObjectPropertyAssertionAxiom PersonalData_RelatesTo_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(relatesTo, personalDataIndividual, dataSubjectIndividual);
		
		OWLObjectPropertyAssertionAxiom Process_IsPerformed_AccordingToDataProtectionImpactAssessment = factory.getOWLObjectPropertyAssertionAxiom(isPerformedAccordingTo, processIndividual, dataProtectionImpactAssessmentIndividual); 
		OWLObjectPropertyAssertionAxiom Processor_Assesses_PurposeOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(assesses, processorIndividual, purposeOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom Processor_Controls_Process = factory.getOWLObjectPropertyAssertionAxiom(controls, processorIndividual, processIndividual);
		OWLObjectPropertyAssertionAxiom Processor_IsAuthorizedBy_MemberStateLaw = factory.getOWLObjectPropertyAssertionAxiom(isAuthorizedBy, processorIndividual, memberStateLawIndividual);
		OWLObjectPropertyAssertionAxiom Processor_IsAuthorizedBy_UnionLaw = factory.getOWLObjectPropertyAssertionAxiom(isAuthorizedBy, processorIndividual, unionLawIndividual);
		OWLObjectPropertyAssertionAxiom Processor_IsCompliantTo_ApprovedCodeOfConduct = factory.getOWLObjectPropertyAssertionAxiom(isCompliantTo, processorIndividual, approvedCodeOfConductIndividual);
		OWLObjectPropertyAssertionAxiom Processor_SeeksViewOf_RepresentativeOfDataSubject = factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf, processorIndividual, representativeOfDataSubjectIndividual);
		OWLObjectPropertyAssertionAxiom PurposeOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLObjectPropertyAssertionAxiom(isLikelyToResultIn, purposeOfProcessingIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom Review_Checks_Process = factory.getOWLObjectPropertyAssertionAxiom(checks, reviewIndividual, processIndividual);
		
		OWLObjectPropertyAssertionAxiom Risk_Changes = factory.getOWLObjectPropertyAssertionAxiom(changes, riskIndividual);
		OWLObjectPropertyAssertionAxiom ScopeOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLObjectPropertyAssertionAxiom(isLikelyToResultIn, scopeOfProcessingIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Applies_ConsistencyMechanism = factory.getOWLObjectPropertyAssertionAxiom(applies, supervisoryAuthorityIndividual, consistencymechanismIndividual);
		OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Controls_Process = factory.getOWLObjectPropertyAssertionAxiom(controls, supervisoryAuthorityIndividual, processIndividual);
		OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Creates_ListOfProcessesThatDoNotNeedDPIA = factory.getOWLObjectPropertyAssertionAxiom(creates, supervisoryAuthorityIndividual, listWithProcessesThatDoNotNeedDpiaIndividual);
		OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Creates_ListOfProcessesThatNeedDPIA  = factory.getOWLObjectPropertyAssertionAxiom(creates, supervisoryAuthorityIndividual, listWithProcessesThatNeedDpiaIndividual);
		OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotNeedDPIA  = factory.getOWLObjectPropertyAssertionAxiom(publishes, supervisoryAuthorityIndividual, listWithProcessesThatDoNotNeedDpiaIndividual);
		OWLObjectPropertyAssertionAxiom TechnologyOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLObjectPropertyAssertionAxiom(isLikelyToResultIn, technologyOfProcessingIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom View_Respects_CommercialInterest = factory.getOWLObjectPropertyAssertionAxiom(respects, viewIndividual, commercialInterestIndividual);
		
		OWLObjectPropertyAssertionAxiom View_Respects_PublicInterest = factory.getOWLObjectPropertyAssertionAxiom(respects, viewIndividual, publicInterestIndividual);
		OWLObjectPropertyAssertionAxiom View_Respects_SecurityOfProcessingOperation = factory.getOWLObjectPropertyAssertionAxiom(respects, viewIndividual, securityOfProcessingOperationIndividual);
		OWLObjectPropertyAssertionAxiom Process_Has_DataProtectionImpactAssessment = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual, dataProtectionImpactAssessmentIndividual);
		OWLObjectPropertyAssertionAxiom Process_Has_Processing = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual, processingIndividual);
		OWLObjectPropertyAssertionAxiom Processing_Has_ContextOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual, contextOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom Processing_Has_PurposeOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual, purposeOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom Processing_Has_Scope = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual, scopeIndividual);
		OWLObjectPropertyAssertionAxiom Processing_Has_Technology = factory.getOWLObjectPropertyAssertionAxiom(has, processingIndividual, technologyIndividual);
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_Has_Risk = factory.getOWLObjectPropertyAssertionAxiom(has, contextOfProcessingIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom PurposeOfProcessing_Has_Risk = factory.getOWLObjectPropertyAssertionAxiom(has, purposeOfProcessingIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom Scope_Has_Risk = factory.getOWLObjectPropertyAssertionAxiom(has, scopeIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom Technology_Has_Risk = factory.getOWLObjectPropertyAssertionAxiom(has, technologyIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom Process_Has_Data = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual, dataIndividual);
		OWLObjectPropertyAssertionAxiom Data_IsPartOf_Evaluation = factory.getOWLObjectPropertyAssertionAxiom(isPartOf, dataIndividual, evaluationIndividual);
		OWLObjectPropertyAssertionAxiom Data_Has_Monitoring = factory.getOWLObjectPropertyAssertionAxiom(has, dataIndividual, monitoringIndividual);
		OWLObjectPropertyAssertionAxiom DataSubject_Has_View = factory.getOWLObjectPropertyAssertionAxiom(has, dataSubjectIndividual, viewIndividual);
		OWLObjectPropertyAssertionAxiom ConsistencyMechanism_IsAppliedTo_Processing = factory.getOWLObjectPropertyAssertionAxiom(isAppliedTo, consistencyMechanismIndividual, processingIndividual);
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_Has_Activity = factory.getOWLObjectPropertyAssertionAxiom(has, contextOfProcessingIndividual, activityIndividual);
		
		
		
		
		// save changes to Ontology
		OurOntology.saveOntology(onto);
	}
}
