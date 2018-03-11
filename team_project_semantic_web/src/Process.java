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
		OWLClass approvedCodeOfConduct = factory.getOWLClass(ontologyIRI +"approvedCodeOfConduct");
		OWLClass assessmentOfNecessityOfProcessing = factory.getOWLClass(ontologyIRI + "assessmentOfNecessityOfProcessing");
		OWLClass assessmentOfProportionalityOfProcessing = factory.getOWLClass(ontologyIRI + "assessmentOfProportionalityOfProcessing");
		OWLClass assessmentOfRisksToRightsAndFreedoms = factory.getOWLClass(ontologyIRI + "assessmentOfRisksToRightsAndFreedoms");
		OWLClass automatedProcessing = factory.getOWLClass(ontologyIRI + "automatedProcessing");
		OWLClass biometricData = factory.getOWLClass(ontologyIRI + "biometricData");
		OWLClass commercialInterest = factory.getOWLClass(ontologyIRI + "commercialInterest");
		OWLClass consistencymechanism = factory.getOWLClass(ontologyIRI + "consistencymechanism");
		OWLClass contextOfProcessing = factory.getOWLClass(ontologyIRI + "contextOfProcessing");
		OWLClass controller = factory.getOWLClass(ontologyIRI + "controller");
		OWLClass creationDate = factory.getOWLClass(ontologyIRI + "creationDate");
		OWLClass criminalConviction = factory.getOWLClass(ontologyIRI + "criminalConviction");
		OWLClass criminalOffense = factory.getOWLClass(ontologyIRI + "criminalOffense");
		OWLClass data = factory.getOWLClass(ontologyIRI + "data");
		OWLClass dataProtectionImpactAssessment = factory.getOWLClass(ontologyIRI + "dataProtectionImpactAssessment");
		OWLClass dataProtectionOfficer = factory.getOWLClass(ontologyIRI + "dataProtectionOfficer");
		OWLClass dataSubject = factory.getOWLClass(ontologyIRI + "dataSubject");
		OWLClass ethnicOrigin = factory.getOWLClass(ontologyIRI + "ethnicOrigin");
		OWLClass evaluation = factory.getOWLClass(ontologyIRI + "evaluation");
		OWLClass firstProcessingDate = factory.getOWLClass(ontologyIRI + "firstProcessingDate");
		OWLClass freeMovementOfData = factory.getOWLClass(ontologyIRI + "freeMovementOfData");
		OWLClass gdpr = factory.getOWLClass(ontologyIRI + "gdpr");
		OWLClass geneticData = factory.getOWLClass(ontologyIRI + "geneticData");
		OWLClass health = factory.getOWLClass(ontologyIRI + "health");
		OWLClass legalEffect = factory.getOWLClass(ontologyIRI + "legalEffect");
		OWLClass legitimateInterestOfProcessing = factory.getOWLClass(ontologyIRI + "legitimateInterestOfProcessing");
		OWLClass listWithProcessesThatDoNotNeedDpia = factory.getOWLClass(ontologyIRI + "listWithProcessesThatDoNotNeedDpia");
		OWLClass listWithProcessesThatNeedDpia = factory.getOWLClass(ontologyIRI + "listWithProcessesThatNeedDpia");
		OWLClass measureToAddressRisk = factory.getOWLClass(ontologyIRI + "measureToAddressRisk");
		OWLClass mechanismsToEnsureProtectionOfData = factory.getOWLClass(ontologyIRI + "firstProcessingDate");
		OWLClass firstProcessingDate = factory.getOWLClass(ontologyIRI + "mechanismsToEnsureProtectionOfData");
		OWLClass memberStateLaw = factory.getOWLClass(ontologyIRI + "memberStateLaw");
		OWLClass monitoringOfDataInMemberstate = factory.getOWLClass(ontologyIRI + "monitoringOfDataInMemberstate");
		OWLClass offeringOfGoods = factory.getOWLClass(ontologyIRI + "offeringOfGoods");
		OWLClass offeringOfServices = factory.getOWLClass(ontologyIRI + "offeringOfServices");
		OWLClass personalData = factory.getOWLClass(ontologyIRI + "personalData");
		OWLClass personalInterest = factory.getOWLClass(ontologyIRI + "personalInterest");
		OWLClass philosophicalBelief = factory.getOWLClass(ontologyIRI + "philosophicalBelief");
		OWLClass politicalOpinion = factory.getOWLClass(ontologyIRI + "politicalOpinion");
		

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
		OWLIndividual firstProcessingDateIndividual = factory.getOWLNamedIndividual(ontologyIRI + "firstProcessingDateIndividual");
		OWLIndividual memberStateLawIndividual = factory.getOWLNamedIndividual(ontologyIRI + "memberStateLawIndividual");
		OWLIndividual monitoringOfDataInMemberstateIndividual = factory.getOWLNamedIndividual(ontologyIRI + "monitoringOfDataInMemberstateIndividual");
		OWLIndividual offeringOfGoodsIndividual = factory.getOWLNamedIndividual(ontologyIRI + "offeringOfGoodsIndividual");
		OWLIndividual offeringOfServicesIndividual = factory.getOWLNamedIndividual(ontologyIRI + "offeringOfServicesIndividual");
		OWLIndividual personalDataIndividual = factory.getOWLNamedIndividual(ontologyIRI + "personalDataIndividual");
		OWLIndividual personalInterestIndividual = factory.getOWLNamedIndividual(ontologyIRI + "personalInterestIndividual");
		OWLIndividual philosophicalBeliefIndividual = factory.getOWLNamedIndividual(ontologyIRI + "philosophicalBeliefIndividual");
		OWLIndividual politicalOpinionIndividual = factory.getOWLNamedIndividual(ontologyIRI + "politicalOpinionIndividual");
		
		
		// specify class of individual -> like example line 1593
		OWLClassAssertionAxiom classAssertionApprovedCodeOfConduct = factory.getOWLClassAssertionAxiom(approvedCodeOfConduct, approvedCodeOfConductIndividual);
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
		OWLClassAssertionAxiom classAssertionFirstProcessingDate = factory.getOWLClassAssertionAxiom(firstProcessingDate, firstProcessingDateIndividual);
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
		OWLClassAssertionAxiom classAssertionFirstProcessingDate = factory.getOWLClassAssertionAxiom(firstProcessingDate, firstProcessingDateIndividual);
		OWLClassAssertionAxiom classAssertionMemberStateLaw = factory.getOWLClassAssertionAxiom(memberStateLaw, memberStateLawIndividual);
		OWLClassAssertionAxiom classAssertionMonitoringOfDataInMemberstate = factory.getOWLClassAssertionAxiom(monitoringOfDataInMemberstate, monitoringOfDataInMemberstateIndividual);
		OWLClassAssertionAxiom classAssertionOfferingOfGoods = factory.getOWLClassAssertionAxiom(offeringOfGoods, offeringOfGoodsIndividual);
		OWLClassAssertionAxiom classAssertionOfferingOfServices = factory.getOWLClassAssertionAxiom(offeringOfServices, offeringOfServicesIndividual);
		OWLClassAssertionAxiom classAssertionPersonalData = factory.getOWLClassAssertionAxiom(personalData, personalDataIndividual);
		OWLClassAssertionAxiom classAssertionPersonalInterest = factory.getOWLClassAssertionAxiom(personalInterest, personalInterestIndividual);
		OWLClassAssertionAxiom classAssertionPhilosophicalBelief = factory.getOWLClassAssertionAxiom(philosophicalBelief, philosophicalBeliefIndividual);
		OWLClassAssertionAxiom classAssertionPoliticalOpinion = factory.getOWLClassAssertionAxiom(politicalOpinion, politicalOpinionIndividual);


		// reference to ObjectProperty -> like example line 1493
		Set<OWLAxiom> axioms = new HashSet<OWLAxiom>();
		
		// specify all changes in between here

		manager.addAxioms(onto, axioms);

		// specify relationships between Individuals -> like example line 1498
		OWLObjectPropertyAssertionAxiom Controller_SeeksViewOf_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf, controllerIndividual, dataSubjectIndividual);
		OWLObjectPropertyAssertionAxiom Controller_SeeksViewOf_RepresentativeOfDataSubject = factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf, controllerIndividual, representativeOfDataSubjectIndividual);
		OWLObjectPropertyAssertionAxiom CreationDate_OccursBefore_FirstProcessingDate = factory.getOWLObjectPropertyAssertionAxiom(occursBefore, creationDateIndividual, firstProcessingDateIndividual);
		OWLObjectPropertyAssertionAxiom Data_Contains_BiometricData = factory.getOWLObjectPropertyAssertionAxiom(contains, dataIndividual, biometricDataIndividual);
		OWLObjectPropertyAssertionAxiom Data_IsMonitoredIn_PublicArea = factory.getOWLObjectPropertyAssertionAxiom(isMonitoredIn, dataIndividual, publicAreaIndividual);
		OWLObjectPropertyAssertionAxiom Data_Contains_GeneticData = factory.getOWLObjectPropertyAssertionAxiom(contains, dataIndividual, geneticDataIndividual);
		OWLObjectPropertyAssertionAxiom Data_IsMonitoredIn_PublicArea = factory.getOWLObjectPropertyAssertionAxiom(isMonitoredIn, dataIndividual, publicAreaIndividual);
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
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_MeasureToAddressRisks = factory.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, measureToAddressRisksIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_PurposeOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, purposeOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, systematicDescriptionOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionOfficer_IsDesignated = factory.getOWLObjectPropertyAssertionAxiom(isDesignated, dataProtectionOfficerIndividual);
		OWLObjectPropertyAssertionAxiom EuropeanDataProtectionBoard_Receives_ListWithProcessesThatDoNotNeedDpiaIndividual = factory.getOWLObjectPropertyAssertionAxiom(receives, europeanDataProtectionBoardIndividual, listWithProcessesThatDoNotNeedDpiaIndividual);
		OWLObjectPropertyAssertionAxiom EuropeanDataProtectionBoard_Receives_ListWithProcessesThatDoNeedDpiaIndividual = factory.getOWLObjectPropertyAssertionAxiom(receives, europeanDataProtectionBoardIndividual, listWithProcessesThatDoNeedDpiaIndividual);
		OWLObjectPropertyAssertionAxiom Evaluation_BasesOn_AutomatedProcessing = factory.getOWLObjectPropertyAssertionAxiom(basesOn, evaluationIndividual, automatedProcessingIndividual);
		OWLObjectPropertyAssertionAxiom Evaluation_BasesOn_Profiling = factory.getOWLObjectPropertyAssertionAxiom(basesOn, evaluationIndividual, profilingIndividual);
		OWLObjectPropertyAssertionAxiom Evaluation_Produces_LegalEffect = factory.getOWLObjectPropertyAssertionAxiom(produces, evaluationIndividual, legalEffectIndividual);
		OWLObjectPropertyAssertionAxiom LegalEffect_Concerns_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(concerns, legalEffectIndividual, dataSubjectIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisk_CompliesTo_GDPR = factory.getOWLObjectPropertyAssertionAxiom(compliesTo, measureToAddressRiskIndividual, gdprIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisk_TakesIntoAccount_Rights = factory.getOWLObjectPropertyAssertionAxiom(takesIntoAccount, measureToAddressRiskIndividual, rightsIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfData = factory.getOWLObjectPropertyAssertionAxiom(contains, measureToAddressRiskIndividual, mechanismToEnsureProtectionOfDataIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_Contains_Safeguard = factory.getOWLObjectPropertyAssertionAxiom(contains, measureToAddressRiskIndividual, safeguardIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_Contains_SecurityMeasure = factory.getOWLObjectPropertyAssertionAxiom(contains, measureToAddressRiskIndividual, securityMeasureIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_TakesIntoAccount_PersonalInterest = factory.getOWLObjectPropertyAssertionAxiom(takesIntoAccount, measureToAddressRiskIndividual, personalInterestIndividual);
		OWLObjectPropertyAssertionAxiom PersonalData_IsPartOf_Evaluation = factory.getOWLObjectPropertyAssertionAxiom(isPartOf, personalDataIndividual, evaluationIndividual);
		OWLObjectPropertyAssertionAxiom PersonalData_RelatesTo_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(relatesTo, personalDataIndividual, dataSubjectIndividual);
		
		
		// save changes to Ontology
		OurOntology.saveOntology(onto);
	}
}
