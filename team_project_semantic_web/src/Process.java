package src;

import java.util.HashSet;
import java.util.Set;

import org.json.simple.JSONObject;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
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

		OWLClass approvedCodeOfConduct = factory.getOWLClass(ontologyIRI + "approvedCodeOfConduct");
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
		OWLClass memberStateLaw = factory.getOWLClass(ontologyIRI + "memberStateLaw");
		OWLClass monitoringOfDataInMemberstate = factory.getOWLClass(ontologyIRI + "monitoringOfDataInMemberstate");
		OWLClass offeringOfGoods = factory.getOWLClass(ontologyIRI + "offeringOfGoods");
		OWLClass offeringOfServices = factory.getOWLClass(ontologyIRI + "offeringOfServices");
		OWLClass personalData = factory.getOWLClass(ontologyIRI + "personalData");
		OWLClass personalInterest = factory.getOWLClass(ontologyIRI + "personalInterest");
		OWLClass philosophicalBelief = factory.getOWLClass(ontologyIRI + "philosophicalBelief");
		OWLClass politicalOpinion = factory.getOWLClass(ontologyIRI + "politicalOpinion");
		OWLClass process = factory.getOWLClass(ontologyIRI + "process");
		OWLClass processor = factory.getOWLClass(ontologyIRI + "processor");
		OWLClass profiling = factory.getOWLClass(ontologyIRI + "profiling");
		OWLClass publicArea = factory.getOWLClass(ontologyIRI + "publicArea");
		OWLClass publicInterest = factory.getOWLClass(ontologyIRI + "publicInterest");
		OWLClass purposeOfProcessing = factory.getOWLClass(ontologyIRI + "purposeOfProcessing");
		OWLClass racialOrigin = factory.getOWLClass(ontologyIRI + "racialOrigin");
		OWLClass religiousBelief = factory.getOWLClass(ontologyIRI + "religiousBelief");
		OWLClass representativeOfDataSubject = factory.getOWLClass(ontologyIRI + "representativeOfDataSubject");
		OWLClass review = factory.getOWLClass(ontologyIRI + "review");
		OWLClass rights = factory.getOWLClass(ontologyIRI + "rights");
		OWLClass risk = factory.getOWLClass(ontologyIRI + "risk");
		OWLClass safeguard = factory.getOWLClass(ontologyIRI + "safeguard");
		OWLClass scope = factory.getOWLClass(ontologyIRI + "scope");
		OWLClass securityMeasure = factory.getOWLClass(ontologyIRI + "securityMeasure");
		OWLClass securityOfProcessingOperation = factory.getOWLClass(ontologyIRI + "securityOfProcessingOperation");
		OWLClass sexLife = factory.getOWLClass(ontologyIRI + "sexLife");
		OWLClass sexualOrientation = factory.getOWLClass(ontologyIRI + "sexualOrientation");
		OWLClass supervisoryAuthority = factory.getOWLClass(ontologyIRI + "supervisoryAuthority");
		OWLClass systematicDescriptionOfProcessing = factory.getOWLClass(ontologyIRI + "systematicDescriptionOfProcessing");
		OWLClass technology = factory.getOWLClass(ontologyIRI + "technology");
		OWLClass tradeUnionMembership = factory.getOWLClass(ontologyIRI + "tradeUnionMembership");
		OWLClass view = factory.getOWLClass(ontologyIRI + "view");
		OWLClass europeanDataProtectionBoard = factory.getOWLClass(ontologyIRI + "europeanDataProtectionBoard");
		OWLClass unionLaw = factory.getOWLClass(ontologyIRI + "unionLaw");
		OWLClass processing = factory.getOWLClass(ontologyIRI + "processing");
		OWLClass activity = factory.getOWLClass(ontologyIRI + "activity");
		OWLClass monitoring = factory.getOWLClass(ontologyIRI + "monitoring");

		// rule_deontic classes
		OWLClass rule1_deontic = factory.getOWLClass(ontologyIRI + "rule1_deontic");
		OWLClass rule3_deontic = factory.getOWLClass(ontologyIRI + "rule3_deontic");
		OWLClass rule4_deontic = factory.getOWLClass(ontologyIRI + "rule4_deontic");
		OWLClass rule5_deontic = factory.getOWLClass(ontologyIRI + "rule5_deontic");
		OWLClass rule7_deontic = factory.getOWLClass(ontologyIRI + "rule7_deontic");
		OWLClass rule8_deontic = factory.getOWLClass(ontologyIRI + "rule8_deontic");
		OWLClass rule9_deontic = factory.getOWLClass(ontologyIRI + "rule9_deontic");
		OWLClass rule10_deontic = factory.getOWLClass(ontologyIRI + "rule10_deontic");
		OWLClass rule12_deontic = factory.getOWLClass(ontologyIRI + "rule12_deontic");
		OWLClass rule13_deontic = factory.getOWLClass(ontologyIRI + "rule13_deontic");
		OWLClass rule15_deontic = factory.getOWLClass(ontologyIRI + "rule15_deontic");
		OWLClass rule18_deontic = factory.getOWLClass(ontologyIRI + "rule8_deontic");
		OWLClass rule20_deontic = factory.getOWLClass(ontologyIRI + "rule20_deontic");
		OWLClass rule22_deontic = factory.getOWLClass(ontologyIRI + "rule22_deontic");
		OWLClass rule23_deontic = factory.getOWLClass(ontologyIRI + "rule23_deontic");
		OWLClass rule24_deontic = factory.getOWLClass(ontologyIRI + "rule24_deontic");
		OWLClass rule241_deontic = factory.getOWLClass(ontologyIRI + "rule241_deontic");
		OWLClass rule25_deontic = factory.getOWLClass(ontologyIRI + "rule25_deontic");
		OWLClass rule251_deontic = factory.getOWLClass(ontologyIRI + "rule251_deontic");
		OWLClass rule26_deontic = factory.getOWLClass(ontologyIRI + "rule26_deontic");
		OWLClass rule21_deontic = factory.getOWLClass(ontologyIRI + "rule21_deontic");
		OWLClass rule16_deontic = factory.getOWLClass(ontologyIRI + "rule16_deontic");

		// verb concept class
		OWLClass consistencyMechanism_IsAppliedTo_Processing = factory.getOWLClass(ontologyIRI + "consistencyMechanism_IsAppliedTo_Processing");
		OWLClass contextOfProcessing_Affects_FreeMovementOfData = factory.getOWLClass(ontologyIRI + "contextOfProcessing_Affects_FreeMovementOfData");
		OWLClass contextOfProcessing_Has_Activity = factory.getOWLClass(ontologyIRI + "contextOfProcessing_Has_Activity");
		OWLClass contextOfProcessing_Has_Risk = factory.getOWLClass(ontologyIRI + "contextOfProcessing_Has_Risk");
		OWLClass contextOfProcessing_Involves_MonitoringOfDataInMemberstate = factory
				.getOWLClass(ontologyIRI + "contextOfProcessing_Involves_MonitoringOfDataInMemberstate");
		OWLClass contextOfProcessing_Involves_OfferingOfGood = factory.getOWLClass(ontologyIRI + "contextOfProcessing_Involves_OfferingOfGood");
		OWLClass contextOfProcessing_Involves_OfferingOfServices = factory.getOWLClass(ontologyIRI + "contextOfProcessing_Involves_OfferingOfServices");
		OWLClass contextOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLClass(ontologyIRI + "contextOfProcessing_IsLikelyToResultIn_Risk");
		OWLClass controller_Assesses_PurposeOfProcessing = factory.getOWLClass(ontologyIRI + "controller_Assesses_PurposeOfProcessing");
		OWLClass controller_CarriesOut_Review = factory.getOWLClass(ontologyIRI + "controller_CarriesOut_Review");
		OWLClass controller_Creates_DataProtectionImpactAssessment = factory.getOWLClass(ontologyIRI + "controller_Creates_DataProtectionImpactAssessment");
		OWLClass controller_IsCompliantWith_ApprovedCodeOfConduct = factory.getOWLClass(ontologyIRI + "controller_IsCompliantWith_ApprovedCodeOfConduct");
		OWLClass controller_SeeksAdviceOf_DataProtectionOfficer = factory.getOWLClass(ontologyIRI + "controller_SeeksAdviceOf_DataProtectionOfficer");
		OWLClass controller_SeeksViewOf_DataSubject = factory.getOWLClass(ontologyIRI + "controller_SeeksViewOf_DataSubject");
		OWLClass controller_SeeksViewOf_RepresentativeOfDataSubject = factory.getOWLClass(ontologyIRI + "controller_SeeksViewOf_RepresentativeOfDataSubject");
		OWLClass creationDate_OccursBefore_FirstProcessingDate = factory.getOWLClass(ontologyIRI + "creationDate_OccursBefore_FirstProcessingDate");
		OWLClass data_Contains_BiometricData = factory.getOWLClass(ontologyIRI + "data_Contains_BiometricData");
		OWLClass data_Contains_GeneticData = factory.getOWLClass(ontologyIRI + "data_Contains_GeneticData");
		OWLClass data_Has_Monitoring = factory.getOWLClass(ontologyIRI + "data_Has_Monitoring");
		OWLClass data_IsMonitoredIn_PublicArea = factory.getOWLClass(ontologyIRI + "data_IsMonitoredIn_PublicArea");

		OWLClass data_IsPartOf_Evaluation = factory.getOWLClass(ontologyIRI + "data_IsPartOf_Evaluation");
		OWLClass data_RelatesTo_CriminalConviction = factory.getOWLClass(ontologyIRI + "data_RelatesTo_CriminalConviction");
		OWLClass data_RelatesTo_CriminalOffense = factory.getOWLClass(ontologyIRI + "data_RelatesTo_CriminalOffense");
		OWLClass data_RelatesTo_SecurityMeasure = factory.getOWLClass(ontologyIRI + "data_RelatesTo_SecurityMeasure");
		OWLClass data_RevealsInformationAbout_EthnicOrigin = factory.getOWLClass(ontologyIRI + "data_RevealsInformationAbout_EthnicOrigin");
		OWLClass data_RevealsInformationAbout_Health = factory.getOWLClass(ontologyIRI + "data_RevealsInformationAbout_Health");
		OWLClass data_RevealsInformationAbout_PhilosophicalBelief = factory.getOWLClass(ontologyIRI + "data_RevealsInformationAbout_PhilosophicalBelief");
		OWLClass data_RevealsInformationAbout_PoliticalOpinion = factory.getOWLClass(ontologyIRI + "data_RevealsInformationAbout_PoliticalOpinion");
		OWLClass data_RevealsInformationAbout_RacialOrigin = factory.getOWLClass(ontologyIRI + "data_RevealsInformationAbout_RacialOrigin");
		OWLClass data_RevealsInformationAbout_ReligiousBelief = factory.getOWLClass(ontologyIRI + "data_RevealsInformationAbout_ReligiousBelief");
		OWLClass data_RevealsInformationAbout_SexLife = factory.getOWLClass(ontologyIRI + "data_RevealsInformationAbout_SexLife");
		OWLClass data_RevealsInformationAbout_SexualOrientation = factory.getOWLClass(ontologyIRI + "data_RevealsInformationAbout_SexualOrientation");
		OWLClass data_RevealsInformationAbout_TradeUnionMembership = factory.getOWLClass(ontologyIRI + "data_RevealsInformationAbout_TradeUnionMembership");

		OWLClass dataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing = factory
				.getOWLClass(ontologyIRI + "dataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing");
		OWLClass dataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing = factory
				.getOWLClass(ontologyIRI + "dataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing");
		OWLClass dataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms = factory
				.getOWLClass(ontologyIRI + "dataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms");
		OWLClass dataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing = factory
				.getOWLClass(ontologyIRI + "dataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing");
		OWLClass dataProtectionImpactAssessment_Contains_MeasureToAddressRisks = factory
				.getOWLClass(ontologyIRI + "dataProtectionImpactAssessment_Contains_MeasureToAddressRisks");
		OWLClass dataProtectionImpactAssessment_Contains_PurposeOfProcessing = factory
				.getOWLClass(ontologyIRI + "dataProtectionImpactAssessment_Contains_PurposeOfProcessing");
		OWLClass dataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing = factory
				.getOWLClass(ontologyIRI + "dataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing");
		OWLClass dataProtectionOfficer_IsDesignated = factory.getOWLClass(ontologyIRI + "dataProtectionOfficer_IsDesignated");
		OWLClass dataSubject_Has_View = factory.getOWLClass(ontologyIRI + "dataSubject_Has_View");
		OWLClass measureToAddressRisks_TakesIntoAccount_PersonalInterest = factory
				.getOWLClass(ontologyIRI + "measureToAddressRisks_TakesIntoAccount_PersonalInterest");
		OWLClass evaluation_BasesOn_Profiling = factory.getOWLClass(ontologyIRI + "evaluation_BasesOn_Profiling");
		OWLClass evaluation_Produces_LegalEffect = factory.getOWLClass(ontologyIRI + "evaluation_Produces_LegalEffect");
		OWLClass legalEffect_Concerns_DataSubject = factory.getOWLClass(ontologyIRI + "legalEffect_Concerns_DataSubject");
		OWLClass measureToAddressRisk_CompliesTo_GDPR = factory.getOWLClass(ontologyIRI + "measureToAddressRisk_CompliesTo_GDPR");
		OWLClass measureToAddressRisk_TakesIntoAccount_Rights = factory.getOWLClass(ontologyIRI + "measureToAddressRisk_TakesIntoAccount_Rights");
		OWLClass measureToAddressRisks_Contains_MechanismToEnsureProtectionOfData = factory
				.getOWLClass(ontologyIRI + "measureToAddressRisks_Contains_MechanismToEnsureProtectionOfData");
		OWLClass measureToAddressRisks_Contains_Safeguard = factory.getOWLClass(ontologyIRI + "measureToAddressRisks_Contains_Safeguard");
		OWLClass measureToAddressRisks_Contains_SecurityMeasure = factory.getOWLClass(ontologyIRI + "measureToAddressRisks_Contains_SecurityMeasure");
		OWLClass personalData_IsPartOf_Evaluation = factory.getOWLClass(ontologyIRI + "personalData_IsPartOf_Evaluation");
		OWLClass personalData_RelatesTo_DataSubject = factory.getOWLClass(ontologyIRI + "personalData_RelatesTo_DataSubject");
		OWLClass process_Has_Data = factory.getOWLClass(ontologyIRI + "process_Has_Data");
		OWLClass process_Has_DataProtectionImpactAssessment = factory.getOWLClass(ontologyIRI + "process_Has_DataProtectionImpactAssessment");
		OWLClass process_Has_Processing = factory.getOWLClass(ontologyIRI + "process_Has_Processing");
		OWLClass process_Has_PurposeOfProcessing = factory.getOWLClass(ontologyIRI + "process_Has_PurposeOfProcessing");
		OWLClass process_IsPerformedAccordingTo_DataProtectionImpactAssessment = factory
				.getOWLClass(ontologyIRI + "process_IsPerformedAccordingTo_DataProtectionImpactAssessment");
		OWLClass processing_Has_ContextOfProcessing = factory.getOWLClass(ontologyIRI + "processing_Has_ContextOfProcessing");
		OWLClass processing_Has_Scope = factory.getOWLClass(ontologyIRI + "processing_Has_Scope");
		OWLClass processing_Has_Technology = factory.getOWLClass(ontologyIRI + "processing_Has_Technology");
		OWLClass processor_IsAuthorizedBy_MemberStatelaw = factory.getOWLClass(ontologyIRI + "processor_IsAuthorizedBy_ MemberStatelaw");
		OWLClass processor_IsAuthorizedBy_Unionlaw = factory.getOWLClass(ontologyIRI + "processor_IsAuthorizedBy_Unionlaw");
		OWLClass processor_Assesses_PurposeOfProcessing = factory.getOWLClass(ontologyIRI + "processor_Assesses_PurposeOfProcessing");
		OWLClass processor_Controls_Process = factory.getOWLClass(ontologyIRI + "processor_Controls_Process");
		OWLClass processor_IsCompliantWith_ApprovedCodeOfConduct = factory.getOWLClass(ontologyIRI + "processor_IsCompliantWith_ApprovedCodeOfConduct");
		OWLClass processor_SeeksViewOf_DataSubject = factory.getOWLClass(ontologyIRI + "processor_SeeksViewOf_DataSubject");
		OWLClass processor_SeeksViewOf_RepresentativeOfDataSubject = factory.getOWLClass(ontologyIRI + "processor_SeeksViewOf_RepresentativeOfDataSubject");
		OWLClass purposeOfProcessing_Has_Risk = factory.getOWLClass(ontologyIRI + "purposeOfProcessing_Has_Risk");
		OWLClass purposeOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLClass(ontologyIRI + "purposeOfProcessing_IsLikelyToResultIn_Risk");
		OWLClass review_Checks_Process = factory.getOWLClass(ontologyIRI + "review_Checks_Process");
		OWLClass risk_Changes = factory.getOWLClass(ontologyIRI + "risk_Changes");
		OWLClass scope_Has_Risk = factory.getOWLClass(ontologyIRI + "scope_Has_Risk");
		OWLClass scopeOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLClass(ontologyIRI + "scopeOfProcessing_IsLikelyToResultIn_Risk");
		OWLClass supervisoryAuthority_Applies_ConsistencyMechanism = factory.getOWLClass(ontologyIRI + "supervisoryAuthority_Applies_ConsistencyMechanism");
		OWLClass supervisoryAuthority_Controls_Process = factory.getOWLClass(ontologyIRI + "supervisoryAuthority_Controls_Process");
		OWLClass supervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment = factory
				.getOWLClass(ontologyIRI + "supervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment");
		OWLClass supervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment = factory
				.getOWLClass(ontologyIRI + "supervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment");
		OWLClass supervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessment = factory
				.getOWLClass(ontologyIRI + "supervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessment");
		OWLClass supervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessment = factory
				.getOWLClass(ontologyIRI + "supervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessment");
		OWLClass technology_Has_Risk = factory.getOWLClass(ontologyIRI + "technology_Has_Risk");
		OWLClass technologyOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLClass(ontologyIRI + "technologyOfProcessing_IsLikelyToResultIn_Risk");
		OWLClass view_Respects_CommercialInterest = factory.getOWLClass(ontologyIRI + "view_Respects_CommercialInterest");
		OWLClass view_Respects_PublicInterest = factory.getOWLClass(ontologyIRI + "view_Respects_PublicInterest");
		OWLClass view_Respects_SecurityOfProcessingOperation = factory.getOWLClass(ontologyIRI + "view_Respects_SecurityOfProcessingOperation");

		// create Individuals Factor -> like example line 1479
		OWLIndividual approvedCodeOfConductIndividual = factory.getOWLNamedIndividual(ontologyIRI + "approvedCodeOfConductIndividual");
		OWLIndividual assessmentOfNecessityOfProcessingIndividual = factory.getOWLNamedIndividual(ontologyIRI + "assessmentOfNecessityOfProcessingIndividual");
		OWLIndividual assessmentOfProportionalityOfProcessingIndividual = factory
				.getOWLNamedIndividual(ontologyIRI + "assessmentOfProportionalityOfProcessingIndividual");
		OWLIndividual assessmentOfRisksToRightsAndFreedomsIndividual = factory
				.getOWLNamedIndividual(ontologyIRI + "assessmentOfRisksToRightsAndFreedomsIndividual");
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
		OWLIndividual listWithProcessesThatDoNotNeedDpiaIndividual = factory
				.getOWLNamedIndividual(ontologyIRI + "listWithProcessesThatDoNotNeedDpiaIndividual");
		OWLIndividual listWithProcessesThatNeedDpiaIndividual = factory.getOWLNamedIndividual(ontologyIRI + "listWithProcessesThatNeedDpiaIndividual");
		OWLIndividual measureToAddressRiskIndividual = factory.getOWLNamedIndividual(ontologyIRI + "measureToAddressRiskIndividual");
		OWLIndividual mechanismsToEnsureProtectionOfDataIndividual = factory
				.getOWLNamedIndividual(ontologyIRI + "mechanismsToEnsureProtectionOfDataIndividual");
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
		OWLIndividual scopeIndividual = factory.getOWLNamedIndividual(ontologyIRI + "scopeIndividual");
		OWLIndividual securityMeasureIndividual = factory.getOWLNamedIndividual(ontologyIRI + "securityMeasureIndividual");
		OWLIndividual securityOfProcessingOperationIndividual = factory.getOWLNamedIndividual(ontologyIRI + "securityOfProcessingOperationIndividual");
		OWLIndividual sexLifeIndividual = factory.getOWLNamedIndividual(ontologyIRI + "sexLifeIndividual");
		OWLIndividual sexualOrientationIndividual = factory.getOWLNamedIndividual(ontologyIRI + "sexualOrientationIndividual");
		OWLIndividual supervisoryAuthorityIndividual = factory.getOWLNamedIndividual(ontologyIRI + "supervisoryAuthorityIndividual");
		OWLIndividual systematicDescriptionOfProcessingIndividual = factory.getOWLNamedIndividual(ontologyIRI + "systematicDescriptionOfProcessingIndividual");
		OWLIndividual technologyIndividual = factory.getOWLNamedIndividual(ontologyIRI + "technologyIndividual");
		OWLIndividual tradeUnionMembershipIndividual = factory.getOWLNamedIndividual(ontologyIRI + "tradeUnionMembershipIndividual");
		OWLIndividual viewIndividual = factory.getOWLNamedIndividual(ontologyIRI + "viewIndividual");
		OWLIndividual europeanDataProtectionBoardIndividual = factory.getOWLNamedIndividual(ontologyIRI + "europeanDataProtectionBoardIndividual");
		OWLIndividual unionLawIndividual = factory.getOWLNamedIndividual(ontologyIRI + "unionLawIndividual");
		OWLIndividual processingIndividual = factory.getOWLNamedIndividual(ontologyIRI + "processing");
		OWLIndividual monitoringIndividual = factory.getOWLNamedIndividual(ontologyIRI + "monitoring");
		OWLIndividual activityIndividual = factory.getOWLNamedIndividual(ontologyIRI + "activity");

		// specify class of individual -> like example line 1593
		OWLClassAssertionAxiom classAssertionApprovedCodeOfConduct = factory.getOWLClassAssertionAxiom(approvedCodeOfConduct, approvedCodeOfConductIndividual);
		OWLClassAssertionAxiom classAssertionAssessmentOfNecessityOfProcessing = factory.getOWLClassAssertionAxiom(assessmentOfNecessityOfProcessing,
				assessmentOfNecessityOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionAssessmentOfProportionalityOfProcessing = factory
				.getOWLClassAssertionAxiom(assessmentOfProportionalityOfProcessing, assessmentOfProportionalityOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionAssessmentOfRisksToRightsAndFreedoms = factory.getOWLClassAssertionAxiom(assessmentOfRisksToRightsAndFreedoms,
				assessmentOfRisksToRightsAndFreedomsIndividual);
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
		OWLClassAssertionAxiom classAssertionDataProtectionImpactAssessment = factory.getOWLClassAssertionAxiom(dataProtectionImpactAssessment,
				dataProtectionImpactAssessmentIndividual);
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
		OWLClassAssertionAxiom classAssertionLegitimateInterestOfProcessing = factory.getOWLClassAssertionAxiom(legitimateInterestOfProcessing,
				legitimateInterestOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionListWithProcessesThatDoNotNeedDpia = factory.getOWLClassAssertionAxiom(listWithProcessesThatDoNotNeedDpia,
				listWithProcessesThatDoNotNeedDpiaIndividual);
		OWLClassAssertionAxiom classAssertionListWithProcessesThatNeedDpia = factory.getOWLClassAssertionAxiom(listWithProcessesThatNeedDpia,
				listWithProcessesThatNeedDpiaIndividual);
		OWLClassAssertionAxiom classAssertionMeasureToAddressRisk = factory.getOWLClassAssertionAxiom(measureToAddressRisk, measureToAddressRiskIndividual);
		OWLClassAssertionAxiom classAssertionMechanismsToEnsureProtectionOfData = factory.getOWLClassAssertionAxiom(mechanismsToEnsureProtectionOfData,
				mechanismsToEnsureProtectionOfDataIndividual);
		OWLClassAssertionAxiom classAssertionMemberStateLaw = factory.getOWLClassAssertionAxiom(memberStateLaw, memberStateLawIndividual);
		OWLClassAssertionAxiom classAssertionMonitoringOfDataInMemberstate = factory.getOWLClassAssertionAxiom(monitoringOfDataInMemberstate,
				monitoringOfDataInMemberstateIndividual);
		OWLClassAssertionAxiom classAssertionOfferingOfGoods = factory.getOWLClassAssertionAxiom(offeringOfGoods, offeringOfGoodsIndividual);
		OWLClassAssertionAxiom classAssertionOfferingOfServices = factory.getOWLClassAssertionAxiom(offeringOfServices, offeringOfServicesIndividual);
		OWLClassAssertionAxiom classAssertionPersonalData = factory.getOWLClassAssertionAxiom(personalData, personalDataIndividual);
		OWLClassAssertionAxiom classAssertionPersonalInterest = factory.getOWLClassAssertionAxiom(personalInterest, personalInterestIndividual);
		OWLClassAssertionAxiom classAssertionPhilosophicalBelief = factory.getOWLClassAssertionAxiom(philosophicalBelief, philosophicalBeliefIndividual);
		OWLClassAssertionAxiom classAssertionPoliticalOpinion = factory.getOWLClassAssertionAxiom(politicalOpinion, politicalOpinionIndividual);
		OWLClassAssertionAxiom classAssertionProcess = factory.getOWLClassAssertionAxiom(process, processIndividual);
		OWLClassAssertionAxiom classAssertionProcessor = factory.getOWLClassAssertionAxiom(processor, processorIndividual);
		OWLClassAssertionAxiom classAssertionProfiling = factory.getOWLClassAssertionAxiom(profiling, profilingIndividual);
		OWLClassAssertionAxiom classAssertionPublicArea = factory.getOWLClassAssertionAxiom(publicArea, publicAreaIndividual);
		OWLClassAssertionAxiom classAssertionPublicInterest = factory.getOWLClassAssertionAxiom(publicInterest, publicInterestIndividual);
		OWLClassAssertionAxiom classAssertionPurposeOfProcessing = factory.getOWLClassAssertionAxiom(purposeOfProcessing, purposeOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionRacialOrigin = factory.getOWLClassAssertionAxiom(racialOrigin, racialOriginIndividual);
		OWLClassAssertionAxiom classAssertionReligiousBelief = factory.getOWLClassAssertionAxiom(religiousBelief, religiousBeliefIndividual);
		OWLClassAssertionAxiom classAssertionRepresentativeOfDataSubject = factory.getOWLClassAssertionAxiom(representativeOfDataSubject,
				representativeOfDataSubjectIndividual);
		OWLClassAssertionAxiom classAssertionReview = factory.getOWLClassAssertionAxiom(review, reviewIndividual);
		OWLClassAssertionAxiom classAssertionRights = factory.getOWLClassAssertionAxiom(rights, rightsIndividual);
		OWLClassAssertionAxiom classAssertionRisk = factory.getOWLClassAssertionAxiom(risk, riskIndividual);
		OWLClassAssertionAxiom classAssertionSafeguard = factory.getOWLClassAssertionAxiom(safeguard, safeguardIndividual);
		OWLClassAssertionAxiom classAssertionScope = factory.getOWLClassAssertionAxiom(scope, scopeIndividual);
		OWLClassAssertionAxiom classAssertionSecurityMeasure = factory.getOWLClassAssertionAxiom(securityMeasure, securityMeasureIndividual);
		OWLClassAssertionAxiom classAssertionSecurityOfProcessing = factory.getOWLClassAssertionAxiom(securityOfProcessingOperation,
				securityOfProcessingOperationIndividual);
		OWLClassAssertionAxiom classAssertionSexLife = factory.getOWLClassAssertionAxiom(sexLife, sexLifeIndividual);
		OWLClassAssertionAxiom classAssertionSexualOrientation = factory.getOWLClassAssertionAxiom(sexualOrientation, sexualOrientationIndividual);
		OWLClassAssertionAxiom classAssertionSupervisoryAuthority = factory.getOWLClassAssertionAxiom(supervisoryAuthority, supervisoryAuthorityIndividual);
		OWLClassAssertionAxiom classAssertionSystematicDescriptionOfProcessing = factory.getOWLClassAssertionAxiom(systematicDescriptionOfProcessing,
				systematicDescriptionOfProcessingIndividual);
		OWLClassAssertionAxiom classAssertionTechnology = factory.getOWLClassAssertionAxiom(technology, technologyIndividual);
		OWLClassAssertionAxiom classAssertionTradeUnionMembership = factory.getOWLClassAssertionAxiom(tradeUnionMembership, tradeUnionMembershipIndividual);
		OWLClassAssertionAxiom classAssertionView = factory.getOWLClassAssertionAxiom(view, viewIndividual);
		OWLClassAssertionAxiom classAssertionEuropeanDataProtectionBoard = factory.getOWLClassAssertionAxiom(europeanDataProtectionBoard,
				europeanDataProtectionBoardIndividual);
		OWLClassAssertionAxiom classAssertionUnionLaw = factory.getOWLClassAssertionAxiom(unionLaw, unionLawIndividual);
		OWLClassAssertionAxiom classAssertProcessing = factory.getOWLClassAssertionAxiom(processing, processingIndividual);
		OWLClassAssertionAxiom classAssertMonitoring = factory.getOWLClassAssertionAxiom(monitoring, monitoringIndividual);
		OWLClassAssertionAxiom classAssertActivity = factory.getOWLClassAssertionAxiom(activity, activityIndividual);

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
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_Affects_FreeMovementOfData = factory.getOWLObjectPropertyAssertionAxiom(affects,
				contextOfProcessingIndividual, freeMovementOfDataIndividual);
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_Involves_MonitoringOfDataInMemberState = factory.getOWLObjectPropertyAssertionAxiom(involves,
				contextOfProcessingIndividual, mechanismsToEnsureProtectionOfDataIndividual);
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_Involves_OfferingOfGoods = factory.getOWLObjectPropertyAssertionAxiom(involves,
				contextOfProcessingIndividual, offeringOfGoodsIndividual);
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_Involves_OfferingOfServices = factory.getOWLObjectPropertyAssertionAxiom(involves,
				contextOfProcessingIndividual, offeringOfServicesIndividual);
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLObjectPropertyAssertionAxiom(isLikelyToResultIn,
				contextOfProcessingIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom Controller_Assesses_PurposeOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(assesses, controllerIndividual,
				purposeOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom Controller_CarriesOut_Review = factory.getOWLObjectPropertyAssertionAxiom(carriesOut, controllerIndividual,
				reviewIndividual);
		OWLObjectPropertyAssertionAxiom Controller_Creates_DataProtectonImpactAssessment = factory.getOWLObjectPropertyAssertionAxiom(creates,
				controllerIndividual, dataProtectionImpactAssessmentIndividual);
		OWLObjectPropertyAssertionAxiom Controller_IsCompliantTo_ApprovedCodeOfConduct = factory.getOWLObjectPropertyAssertionAxiom(isCompliantTo,
				controllerIndividual, approvedCodeOfConductIndividual);
		OWLObjectPropertyAssertionAxiom Controller_SeeksAdviceOf_DataProtectionOfficer = factory.getOWLObjectPropertyAssertionAxiom(seeksAdviceOf,
				controllerIndividual, dataProtectionOfficerIndividual);

		OWLObjectPropertyAssertionAxiom Controller_SeeksViewOf_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf, controllerIndividual,
				dataSubjectIndividual);
		OWLObjectPropertyAssertionAxiom Controller_SeeksViewOf_RepresentativeOfDataSubject = factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf,
				controllerIndividual, representativeOfDataSubjectIndividual);
		OWLObjectPropertyAssertionAxiom CreationDate_OccursBefore_FirstProcessingDate = factory.getOWLObjectPropertyAssertionAxiom(occursBefore,
				creationDateIndividual, firstProcessingDateIndividual);
		OWLObjectPropertyAssertionAxiom Data_Contains_BiometricData = factory.getOWLObjectPropertyAssertionAxiom(contains, dataIndividual,
				biometricDataIndividual);
		OWLObjectPropertyAssertionAxiom Data_IsMonitoredIn_PublicArea = factory.getOWLObjectPropertyAssertionAxiom(isMonitoredIn, dataIndividual,
				publicAreaIndividual);
		OWLObjectPropertyAssertionAxiom Data_Contains_GeneticData = factory.getOWLObjectPropertyAssertionAxiom(contains, dataIndividual, geneticDataIndividual);
		OWLObjectPropertyAssertionAxiom Data_RelatesTo_CriminalConviction = factory.getOWLObjectPropertyAssertionAxiom(relatesTo, dataIndividual,
				criminalConvictionIndividual);
		OWLObjectPropertyAssertionAxiom Data_RelatesTo_CriminalOffense = factory.getOWLObjectPropertyAssertionAxiom(relatesTo, dataIndividual,
				criminalOffenseIndividual);
		OWLObjectPropertyAssertionAxiom Data_RelatesTo_SecurityMeasure = factory.getOWLObjectPropertyAssertionAxiom(relatesTo, dataIndividual,
				securityMeasureIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_EthnicOrigin = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
				dataIndividual, ethnicOriginIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_Health = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
				dataIndividual, healthIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_PhilosophicalBelief = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
				dataIndividual, philosophicalBeliefIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_PoliticalOpinion = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
				dataIndividual, politicalOpinionIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_RacialOrigin = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
				dataIndividual, racialOriginIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_ReligiousBelief = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
				dataIndividual, religiousBeliefIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_SexLife = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
				dataIndividual, sexLifeIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_SexualOrientation = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
				dataIndividual, sexualOrientationIndividual);
		OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_TradeUnionMembership = factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
				dataIndividual, tradeUnionMembershipIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing = factory
				.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, assessmentOfNecessityOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing = factory
				.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, assessmentOfProportionalityOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms = factory
				.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, assessmentOfRisksToRightsAndFreedomsIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing = factory
				.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, legitimateInterestOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_MeasureToAddressRisks = factory.getOWLObjectPropertyAssertionAxiom(contains,
				dataProtectionImpactAssessmentIndividual, measureToAddressRiskIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_PurposeOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(contains,
				dataProtectionImpactAssessmentIndividual, purposeOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing = factory
				.getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual, systematicDescriptionOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom DataProtectionOfficer_IsDesignated = factory.getOWLObjectPropertyAssertionAxiom(isDesignated,
				dataProtectionOfficerIndividual, null);
		OWLObjectPropertyAssertionAxiom EuropeanDataProtectionBoard_Receives_ListWithProcessesThatDoNotNeedDpiaIndividual = factory
				.getOWLObjectPropertyAssertionAxiom(receives, europeanDataProtectionBoardIndividual, listWithProcessesThatDoNotNeedDpiaIndividual);
		OWLObjectPropertyAssertionAxiom EuropeanDataProtectionBoard_Receives_ListWithProcessesThatDoNeedDpiaIndividual = factory
				.getOWLObjectPropertyAssertionAxiom(receives, europeanDataProtectionBoardIndividual, listWithProcessesThatNeedDpiaIndividual);
		OWLObjectPropertyAssertionAxiom Evaluation_BasesOn_AutomatedProcessing = factory.getOWLObjectPropertyAssertionAxiom(basesOn, evaluationIndividual,
				automatedProcessingIndividual);
		OWLObjectPropertyAssertionAxiom Evaluation_BasesOn_Profiling = factory.getOWLObjectPropertyAssertionAxiom(basesOn, evaluationIndividual,
				profilingIndividual);
		OWLObjectPropertyAssertionAxiom Evaluation_Produces_LegalEffect = factory.getOWLObjectPropertyAssertionAxiom(produces, evaluationIndividual,
				legalEffectIndividual);
		OWLObjectPropertyAssertionAxiom LegalEffect_Concerns_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(concerns, legalEffectIndividual,
				dataSubjectIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisk_CompliesTo_GDPR = factory.getOWLObjectPropertyAssertionAxiom(compliesTo,
				measureToAddressRiskIndividual, gdprIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisk_TakesIntoAccount_Rights = factory.getOWLObjectPropertyAssertionAxiom(takesIntoAccount,
				measureToAddressRiskIndividual, rightsIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfData = factory.getOWLObjectPropertyAssertionAxiom(contains,
				measureToAddressRiskIndividual, mechanismsToEnsureProtectionOfDataIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_Contains_Safeguard = factory.getOWLObjectPropertyAssertionAxiom(contains,
				measureToAddressRiskIndividual, safeguardIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_Contains_SecurityMeasure = factory.getOWLObjectPropertyAssertionAxiom(contains,
				measureToAddressRiskIndividual, securityMeasureIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_TakesIntoAccount_PersonalInterest = factory.getOWLObjectPropertyAssertionAxiom(takesIntoAccount,
				measureToAddressRiskIndividual, personalInterestIndividual);
		OWLObjectPropertyAssertionAxiom PersonalData_IsPartOf_Evaluation = factory.getOWLObjectPropertyAssertionAxiom(isPartOf, personalDataIndividual,
				evaluationIndividual);
		OWLObjectPropertyAssertionAxiom PersonalData_RelatesTo_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(relatesTo, personalDataIndividual,
				dataSubjectIndividual);

		OWLObjectPropertyAssertionAxiom Process_IsPerformed_AccordingToDataProtectionImpactAssessment = factory
				.getOWLObjectPropertyAssertionAxiom(isPerformedAccordingTo, processIndividual, dataProtectionImpactAssessmentIndividual);
		OWLObjectPropertyAssertionAxiom Processor_Assesses_PurposeOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(assesses, processorIndividual,
				purposeOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom Processor_Controls_Process = factory.getOWLObjectPropertyAssertionAxiom(controls, processorIndividual,
				processIndividual);
		OWLObjectPropertyAssertionAxiom Processor_IsAuthorizedBy_MemberStateLaw = factory.getOWLObjectPropertyAssertionAxiom(isAuthorizedBy,
				processorIndividual, memberStateLawIndividual);
		OWLObjectPropertyAssertionAxiom Processor_IsAuthorizedBy_UnionLaw = factory.getOWLObjectPropertyAssertionAxiom(isAuthorizedBy, processorIndividual,
				unionLawIndividual);
		OWLObjectPropertyAssertionAxiom Processor_IsCompliantTo_ApprovedCodeOfConduct = factory.getOWLObjectPropertyAssertionAxiom(isCompliantTo,
				processorIndividual, approvedCodeOfConductIndividual);
		OWLObjectPropertyAssertionAxiom Processor_SeeksViewOf_RepresentativeOfDataSubject = factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf,
				processorIndividual, representativeOfDataSubjectIndividual);
		OWLObjectPropertyAssertionAxiom PurposeOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLObjectPropertyAssertionAxiom(isLikelyToResultIn,
				purposeOfProcessingIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom Review_Checks_Process = factory.getOWLObjectPropertyAssertionAxiom(checks, reviewIndividual, processIndividual);

		OWLObjectPropertyAssertionAxiom Risk_Changes = factory.getOWLObjectPropertyAssertionAxiom(changes, riskIndividual, null);
		OWLObjectPropertyAssertionAxiom TechnologyOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLObjectPropertyAssertionAxiom(isLikelyToResultIn,
				scopeIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Applies_ConsistencyMechanism = factory.getOWLObjectPropertyAssertionAxiom(applies,
				supervisoryAuthorityIndividual, consistencymechanismIndividual);
		OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Controls_Process = factory.getOWLObjectPropertyAssertionAxiom(controls,
				supervisoryAuthorityIndividual, processIndividual);
		OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Creates_ListOfProcessesThatDoNotNeedDPIA = factory.getOWLObjectPropertyAssertionAxiom(creates,
				supervisoryAuthorityIndividual, listWithProcessesThatDoNotNeedDpiaIndividual);
		OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Creates_ListOfProcessesThatNeedDPIA = factory.getOWLObjectPropertyAssertionAxiom(creates,
				supervisoryAuthorityIndividual, listWithProcessesThatNeedDpiaIndividual);
		OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotNeedDPIA = factory.getOWLObjectPropertyAssertionAxiom(publishes,
				supervisoryAuthorityIndividual, listWithProcessesThatDoNotNeedDpiaIndividual);
		OWLObjectPropertyAssertionAxiom View_Respects_CommercialInterest = factory.getOWLObjectPropertyAssertionAxiom(respects, viewIndividual,
				commercialInterestIndividual);

		OWLObjectPropertyAssertionAxiom View_Respects_PublicInterest = factory.getOWLObjectPropertyAssertionAxiom(respects, viewIndividual,
				publicInterestIndividual);
		OWLObjectPropertyAssertionAxiom View_Respects_SecurityOfProcessingOperation = factory.getOWLObjectPropertyAssertionAxiom(respects, viewIndividual,
				securityOfProcessingOperationIndividual);

		OWLObjectPropertyAssertionAxiom Processor_SeeksViewOf_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf, processorIndividual,
				dataSubjectIndividual);
		OWLObjectPropertyAssertionAxiom MeasureToAddressRisk_Contains_MechanismToEnsureProtectionOfData = factory.getOWLObjectPropertyAssertionAxiom(contains,
				measureToAddressRiskIndividual, mechanismsToEnsureProtectionOfDataIndividual);

		OWLObjectPropertyAssertionAxiom Process_Has_DataProtectionImpactAssessment = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual,
				dataProtectionImpactAssessmentIndividual);
		OWLObjectPropertyAssertionAxiom Process_Has_Processing = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual, processingIndividual);
		OWLObjectPropertyAssertionAxiom Processing_Has_ContextOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual,
				contextOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom Processing_Has_PurposeOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual,
				purposeOfProcessingIndividual);
		OWLObjectPropertyAssertionAxiom Processing_Has_Scope = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual, scopeIndividual);
		OWLObjectPropertyAssertionAxiom Processing_Has_Technology = factory.getOWLObjectPropertyAssertionAxiom(has, processingIndividual, technologyIndividual);
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_Has_Risk = factory.getOWLObjectPropertyAssertionAxiom(has, contextOfProcessingIndividual,
				riskIndividual);
		OWLObjectPropertyAssertionAxiom PurposeOfProcessing_Has_Risk = factory.getOWLObjectPropertyAssertionAxiom(has, purposeOfProcessingIndividual,
				riskIndividual);
		OWLObjectPropertyAssertionAxiom Scope_Has_Risk = factory.getOWLObjectPropertyAssertionAxiom(has, scopeIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom Technology_Has_Risk = factory.getOWLObjectPropertyAssertionAxiom(has, technologyIndividual, riskIndividual);
		OWLObjectPropertyAssertionAxiom Process_Has_Data = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual, dataIndividual);
		OWLObjectPropertyAssertionAxiom Data_IsPartOf_Evaluation = factory.getOWLObjectPropertyAssertionAxiom(isPartOf, dataIndividual, evaluationIndividual);
		OWLObjectPropertyAssertionAxiom Data_Has_Monitoring = factory.getOWLObjectPropertyAssertionAxiom(has, dataIndividual, monitoringIndividual);
		OWLObjectPropertyAssertionAxiom DataSubject_Has_View = factory.getOWLObjectPropertyAssertionAxiom(has, dataSubjectIndividual, viewIndividual);

		OWLObjectPropertyAssertionAxiom ConsistencyMechanism_IsAppliedTo_Processing = factory.getOWLObjectPropertyAssertionAxiom(isAppliedTo, consistencymechanismIndividual, processingIndividual);
		OWLObjectPropertyAssertionAxiom ContextOfProcessing_Has_Activity = factory.getOWLObjectPropertyAssertionAxiom(has, contextOfProcessingIndividual, activityIndividual);

		//OWLObjectPropertyAssertionAxiom Consistencymechanism_IsAppliedTo_Processing = factory.getOWLObjectPropertyAssertionAxiom(isAppliedTo,
				//consistencymechanismIndividual, processingIndividual);
		//OWLObjectPropertyAssertionAxiom ContextOfProcessing_Has_Activity = factory.getOWLObjectPropertyAssertionAxiom(has, contextOfProcessingIndividual,
				//activityIndividual);

		// save changes to Ontology
		OurOntology.saveOntology(onto);
	}
}
