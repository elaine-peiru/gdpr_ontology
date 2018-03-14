package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.json.simple.JSONObject;
import org.semanticweb.kaon2.api.owl.axioms.OWLAxiom;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
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
	public Optional<IRI> ontologyIRI;
	public OWLDataFactory factory;

	public Process() {
		this.onto = OurOntology.getOurOntology();
		this.manager = OWLManager.createOWLOntologyManager();
		this.factory = this.manager.getOWLDataFactory();
		this.ontologyIRI = this.onto.getOntologyID().getOntologyIRI();
	}

	@SuppressWarnings("deprecation")
	public void createIndividualOfProcess(JSONObject json) {
		// reference to OWL Class -> like example line 1569

		
		String processName = json.get("proess").toString();
		
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

		OWLIndividual processIndividual = factory.getOWLNamedIndividual(ClassName.process.getPath());
		OWLClass approvedCodeOfConduct = factory.getOWLClass(ClassName.approved_code_of_conduct.getPath());
		OWLClass assessmentOfNecessityOfProcessing = factory.getOWLClass(ClassName.assessment_of_necessity_of_processing.getPath());
		OWLClass assessmentOfProportionalityOfProcessing = factory.getOWLClass(ClassName.assessment_of_proportionality_of_processing.getPath());
		OWLClass assessmentOfRisksToRightsAndFreedoms = factory.getOWLClass(ClassName.assessment_of_risks_to_rights_and_freedoms.getPath());
		OWLClass automatedProcessing = factory.getOWLClass(ClassName.automated_processing.getPath());
		OWLClass biometricData = factory.getOWLClass(ClassName.biometric_data.getPath());
		OWLClass commercialInterest = factory.getOWLClass(ClassName.commercial_interest.getPath());
		OWLClass consistencymechanism = factory.getOWLClass(ClassName.consistency_mechanism.getPath());
		OWLClass contextOfProcessing = factory.getOWLClass(ClassName.context_of_processing.getPath());
		OWLClass controller = factory.getOWLClass(ClassName.controller.getPath());
		OWLClass creationDate = factory.getOWLClass(ClassName.creation_date.getPath());
		OWLClass criminalConviction = factory.getOWLClass(ClassName.criminal_conviction.getPath());
		OWLClass criminalOffense = factory.getOWLClass(ClassName.criminal_offense.getPath());
		OWLClass data = factory.getOWLClass(ClassName.data.getPath());
		OWLClass dataProtectionImpactAssessment = factory.getOWLClass(ClassName.data_protection_impact_assessment.getPath());
		OWLClass dataProtectionOfficer = factory.getOWLClass(ClassName.data_protection_officer.getPath());
		OWLClass dataSubject = factory.getOWLClass(ClassName.data_subject.getPath());
		OWLClass ethnicOrigin = factory.getOWLClass(ClassName.ethnic_origin.getPath());
		OWLClass evaluation = factory.getOWLClass(ClassName.evaluation.getPath());
		OWLClass firstProcessingDate = factory.getOWLClass(ClassName.first_processing_date.getPath());
		OWLClass freeMovementOfData = factory.getOWLClass(ClassName.free_movement_of_data.getPath());
		OWLClass gdpr = factory.getOWLClass(ClassName.gdpr.getPath());
		OWLClass geneticData = factory.getOWLClass(ClassName.genetic_data.getPath());
		OWLClass health = factory.getOWLClass(ClassName.health.getPath());
		OWLClass legalEffect = factory.getOWLClass(ClassName.legal_effect.getPath());
		OWLClass legitimateInterestOfProcessing = factory.getOWLClass(ClassName.legitimate_interest_of_processing.getPath());
		OWLClass listWithProcessesThatDoNotNeedDpia = factory.getOWLClass(ClassName.list_with_processes_that_do_not_need_dpia.getPath());
		OWLClass listWithProcessesThatNeedDpia = factory.getOWLClass(ClassName.list_with_processes_that_need_dpia.getPath());
		OWLClass measureToAddressRisk = factory.getOWLClass(ClassName.measure_to_address_risk.getPath());
		OWLClass mechanismsToEnsureProtectionOfData = factory.getOWLClass(ClassName.mechanisms_to_ensure_protection_of_data.getPath());
		OWLClass memberStateLaw = factory.getOWLClass(ClassName.member_state_law.getPath());
		OWLClass monitoringOfDataInMemberstate = factory.getOWLClass(ClassName.monitoring_of_data_in_memberstate.getPath());
		OWLClass offeringOfGoods = factory.getOWLClass(ClassName.offering_of_goods.getPath());
		OWLClass offeringOfServices = factory.getOWLClass(ClassName.offering_of_services.getPath());
		OWLClass personalData = factory.getOWLClass(ClassName.personal_data.getPath());
		OWLClass personalInterest = factory.getOWLClass(ClassName.personal_interest.getPath());
		OWLClass philosophicalBelief = factory.getOWLClass(ClassName.philosophical_belief.getPath());
		OWLClass politicalOpinion = factory.getOWLClass(ClassName.political_opinion.getPath());

		OWLClass process = factory.getOWLClass(ClassName.process.getPath());
		OWLClass processor = factory.getOWLClass(ClassName.processor.getPath());
		OWLClass profiling = factory.getOWLClass(ClassName.profiling.getPath());
		OWLClass publicArea = factory.getOWLClass(ClassName.public_area.getPath());
		OWLClass publicInterest = factory.getOWLClass(ClassName.public_interest.getPath());
		OWLClass purposeOfProcessing = factory.getOWLClass(ClassName.purpose_of_processing.getPath());
		OWLClass racialOrigin = factory.getOWLClass(ClassName.racial_origin.getPath());
		OWLClass religiousBelief = factory.getOWLClass(ClassName.religious_belief.getPath());
		OWLClass representativeOfDataSubject = factory.getOWLClass(ClassName.representative_of_data_subject.getPath());
		OWLClass review = factory.getOWLClass(ClassName.review.getPath());
		OWLClass rights = factory.getOWLClass(ClassName.rights.getPath());
		OWLClass risk = factory.getOWLClass(ClassName.risk.getPath());
		OWLClass safeguard = factory.getOWLClass(ClassName.safeguard.getPath());
		OWLClass scopeOfProcessing = factory.getOWLClass(ClassName.scope_of_processing.getPath());
		OWLClass securityMeasure = factory.getOWLClass(ClassName.security_measure.getPath());
		OWLClass securityOfProcessingOperation = factory.getOWLClass(ClassName.security_of_processing_operation.getPath());
		OWLClass sexLife = factory.getOWLClass(ClassName.sex_life.getPath());
		OWLClass sexualOrientation = factory.getOWLClass(ClassName.sexual_orientation.getPath());
		OWLClass supervisoryAuthority = factory.getOWLClass(ClassName.supervisory_authority.getPath());
		OWLClass systematicDescriptionOfProcessing = factory.getOWLClass(ClassName.systematic_description_of_processing.getPath());
		OWLClass technology = factory.getOWLClass(ClassName.technology_of_processing.getPath());
		OWLClass tradeUnionMembership = factory.getOWLClass(ClassName.trade_union_membership.getPath());
		OWLClass view = factory.getOWLClass(ClassName.view.getPath());
		OWLClass europeanDataProtectionBoard = factory.getOWLClass(ClassName.european_data_protection_board.getPath());
		OWLClass unionLaw = factory.getOWLClass(ClassName.union_law.getPath());
		OWLClass processing = factory.getOWLClass(ClassName.processing.getPath());
		OWLClass activity = factory.getOWLClass(ClassName.activity.getPath());
		OWLClass monitoring = factory.getOWLClass(ClassName.monitoring.getPath());

		// rule_deontic classes
		OWLClass rule1_deontic = factory.getOWLClass(RuleName.Rule1_Deontic.getPath());
		OWLClass rule3_deontic = factory.getOWLClass(RuleName.Rule3_Deontic.getPath());
		OWLClass rule4_deontic = factory.getOWLClass(RuleName.Rule4_Deontic.getPath());
		OWLClass rule5_deontic = factory.getOWLClass(RuleName.Rule5_Deontic.getPath());
		OWLClass rule7_deontic = factory.getOWLClass(RuleName.Rule7_Deontic.getPath());
		OWLClass rule8_deontic = factory.getOWLClass(RuleName.Rule8_Deontic.getPath());
		OWLClass rule9_deontic = factory.getOWLClass(RuleName.Rule9_Deontic.getPath());
		OWLClass rule10_deontic = factory.getOWLClass(RuleName.Rule10_Deontic.getPath());
		OWLClass rule12_deontic = factory.getOWLClass(RuleName.Rule12_Deontic.getPath());
		OWLClass rule13_deontic = factory.getOWLClass(RuleName.Rule13_Deontic.getPath());
		OWLClass rule15_deontic = factory.getOWLClass(RuleName.Rule15_Deontic.getPath());
		OWLClass rule18_deontic = factory.getOWLClass(RuleName.Rule18_Deontic.getPath());
		OWLClass rule20_deontic = factory.getOWLClass(RuleName.Rule20_Deontic.getPath());
		OWLClass rule22_deontic = factory.getOWLClass(RuleName.Rule22_Deontic.getPath());
		OWLClass rule23_deontic = factory.getOWLClass(RuleName.Rule23_Deontic.getPath());
		OWLClass rule24_deontic = factory.getOWLClass(RuleName.Rule24_Deontic.getPath());
		OWLClass rule241_deontic = factory.getOWLClass(RuleName.Rule241_Deontic.getPath());
		OWLClass rule25_deontic = factory.getOWLClass(RuleName.Rule25_Deontic.getPath());
		OWLClass rule251_deontic = factory.getOWLClass(RuleName.Rule251_Deontic.getPath());
		OWLClass rule26_deontic = factory.getOWLClass(RuleName.Rule26_Deontic.getPath());
		OWLClass rule21_deontic = factory.getOWLClass(RuleName.Rule21_Deontic.getPath());
		OWLClass rule16_deontic = factory.getOWLClass(RuleName.Rule16_Deontic.getPath());

		//verb individual uri 
		
		
		// verb concept class
		OWLClass consistencyMechanism_IsAppliedTo_Processing = factory.getOWLClass(VerbConceptNames.ConsistencyMechanism_IsAppliedTo_Processing.getPath());
		OWLClass contextOfProcessing_Affects_FreeMovementOfData = factory
				.getOWLClass(VerbConceptNames.ContextOfProcessing_Affects_FreeMovementOfData.getPath());
		OWLClass contextOfProcessing_Has_Activity = factory.getOWLClass(VerbConceptNames.ContextOfProcessing_Has_Activity.getPath());
		OWLClass contextOfProcessing_Has_Risk = factory.getOWLClass(VerbConceptNames.ContextOfProcessing_Has_Risk.getPath());
		OWLClass contextOfProcessing_Involves_MonitoringOfDataInMemberstate = factory
				.getOWLClass(VerbConceptNames.ContextOfProcessing_Involves_MonitoringOfDataInMemberstate.getPath());
		OWLClass contextOfProcessing_Involves_OfferingOfGood = factory.getOWLClass(VerbConceptNames.ContextOfProcessing_Involves_OfferingOfGood.getPath());
		OWLClass contextOfProcessing_Involves_OfferingOfServices = factory
				.getOWLClass(VerbConceptNames.ContextOfProcessing_Involves_OfferingOfServices.getPath());
		OWLClass contextOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLClass(VerbConceptNames.ContextOfProcessing_IsLikelyToResultIn_Risk.getPath());
		OWLClass controller_Assesses_PurposeOfProcessing = factory.getOWLClass(VerbConceptNames.Controller_Assesses_PurposeOfProcessing.getPath());
		OWLClass controller_CarriesOut_Review = factory.getOWLClass(VerbConceptNames.Controller_CarriesOut_Review.getPath());
		OWLClass controller_Creates_DataProtectionImpactAssessment = factory
				.getOWLClass(VerbConceptNames.Controller_Creates_DataProtectionImpactAssessment.getPath());
		OWLClass controller_IsCompliantWith_ApprovedCodeOfConduct = factory
				.getOWLClass(VerbConceptNames.Controller_IsCompliantWith_ApprovedCodeOfConduct.getPath());
		OWLClass controller_SeeksAdviceOf_DataProtectionOfficer = factory
				.getOWLClass(VerbConceptNames.Controller_SeeksAdviceOf_DataProtectionOfficer.getPath());
		OWLClass controller_SeeksViewOf_DataSubject = factory.getOWLClass(VerbConceptNames.Controller_SeeksViewOf_DataSubject.getPath());
		OWLClass controller_SeeksViewOf_RepresentativeOfDataSubject = factory
				.getOWLClass(VerbConceptNames.Controller_SeeksViewOf_RepresentativeOfDataSubject.getPath());
		OWLClass creationDate_OccursBefore_FirstProcessingDate = factory.getOWLClass(VerbConceptNames.CreationDate_OccursBefore_FirstProcessingDate.getPath());
		OWLClass data_Contains_BiometricData = factory.getOWLClass(VerbConceptNames.Data_Contains_BiometricData.getPath());
		OWLClass data_Contains_GeneticData = factory.getOWLClass(VerbConceptNames.Data_Contains_GeneticData.getPath());
		OWLClass data_Has_Monitoring = factory.getOWLClass(VerbConceptNames.Data_Has_Monitoring.getPath());
		OWLClass data_IsMonitoredIn_PublicArea = factory.getOWLClass(VerbConceptNames.Data_IsMonitoredIn_PublicArea.getPath());

		OWLClass data_IsPartOf_Evaluation = factory.getOWLClass(VerbConceptNames.Data_IsPartOf_Evaluation.getPath());
		OWLClass data_RelatesTo_CriminalConviction = factory.getOWLClass(VerbConceptNames.Data_RelatesTo_CriminalConviction.getPath());
		OWLClass data_RelatesTo_CriminalOffense = factory.getOWLClass(VerbConceptNames.Data_RelatesTo_CriminalOffense.getPath());
		OWLClass data_RelatesTo_SecurityMeasure = factory.getOWLClass(VerbConceptNames.Data_RelatesTo_SecurityMeasure.getPath());
		OWLClass data_RevealsInformationAbout_EthnicOrigin = factory.getOWLClass(VerbConceptNames.Data_RevealsInformationAbout_EthnicOrigin.getPath());
		OWLClass data_RevealsInformationAbout_Health = factory.getOWLClass(VerbConceptNames.Data_RevealsInformationAbout_Health.getPath());
		OWLClass data_RevealsInformationAbout_PhilosophicalBelief = factory
				.getOWLClass(VerbConceptNames.Data_RevealsInformationAbout_PhilosophicalBelief.getPath());
		OWLClass data_RevealsInformationAbout_PoliticalOpinion = factory.getOWLClass(VerbConceptNames.Data_RevealsInformationAbout_PoliticalOpinion.getPath());
		OWLClass data_RevealsInformationAbout_RacialOrigin = factory.getOWLClass(VerbConceptNames.Data_RevealsInformationAbout_RacialOrigin.getPath());
		OWLClass data_RevealsInformationAbout_ReligiousBelief = factory.getOWLClass(VerbConceptNames.Data_RevealsInformationAbout_ReligiousBelief.getPath());
		OWLClass data_RevealsInformationAbout_SexLife = factory.getOWLClass(VerbConceptNames.Data_RevealsInformationAbout_SexLife.getPath());
		OWLClass data_RevealsInformationAbout_SexualOrientation = factory
				.getOWLClass(VerbConceptNames.Data_RevealsInformationAbout_SexualOrientation.getPath());
		OWLClass data_RevealsInformationAbout_TradeUnionMembership = factory
				.getOWLClass(VerbConceptNames.Data_RevealsInformationAbout_TradeUnionMembership.getPath());

		OWLClass dataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing = factory
				.getOWLClass(VerbConceptNames.DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing.getPath());
		OWLClass dataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing = factory
				.getOWLClass(VerbConceptNames.DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing.getPath());
		OWLClass dataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms = factory
				.getOWLClass(VerbConceptNames.DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms.getPath());
		OWLClass dataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing = factory
				.getOWLClass(VerbConceptNames.DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing.getPath());
		OWLClass dataProtectionImpactAssessment_Contains_MeasureToAddressRisks = factory
				.getOWLClass(VerbConceptNames.DataProtectionImpactAssessment_Contains_MeasureToAddressRisks.getPath());
		OWLClass dataProtectionImpactAssessment_Contains_PurposeOfProcessing = factory
				.getOWLClass(VerbConceptNames.DataProtectionImpactAssessment_Contains_PurposeOfProcessing.getPath());
		OWLClass dataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing = factory
				.getOWLClass(VerbConceptNames.DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing.getPath());
		OWLClass dataProtectionOfficer_IsDesignated = factory.getOWLClass(VerbConceptNames.DataProtectionOfficer_IsDesignated.getPath());
		OWLClass dataSubject_Has_View = factory.getOWLClass(VerbConceptNames.DataSubject_Has_View.getPath());
		OWLClass evaluation_BasesOn_Profiling = factory.getOWLClass(VerbConceptNames.Evaluation_BasesOn_Profiling.getPath());
		OWLClass evaluation_Produces_LegalEffect = factory.getOWLClass(VerbConceptNames.Evaluation_BasesOn_AutomatedProcessing.getPath());
		OWLClass legalEffect_Concerns_DataSubject = factory.getOWLClass(VerbConceptNames.LegalEffect_Concerns_DataSubject.getPath());
		OWLClass measureToAddressRisk_CompliesTo_GDPR = factory.getOWLClass(VerbConceptNames.MeasureToAddressRisk_CompliesTo_GDPR.getPath());
		OWLClass measureToAddressRisk_TakesIntoAccount_Rights = factory.getOWLClass(VerbConceptNames.MeasureToAddressRisk_TakesIntoAccount_Rights.getPath());
		OWLClass measureToAddressRisks_Contains_MechanismToEnsureProtectionOfData = factory
				.getOWLClass(VerbConceptNames.MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfData.getPath());
		OWLClass measureToAddressRisks_Contains_Safeguard = factory.getOWLClass(VerbConceptNames.MeasureToAddressRisks_Contains_Safeguard.getPath());
		OWLClass measureToAddressRisks_Contains_SecurityMeasure = factory
				.getOWLClass(VerbConceptNames.MeasureToAddressRisks_Contains_SecurityMeasure.getPath());
		OWLClass personalData_IsPartOf_Evaluation = factory.getOWLClass(VerbConceptNames.PersonalData_IsPartOf_Evaluation.getPath());
		OWLClass personalData_RelatesTo_DataSubject = factory.getOWLClass(VerbConceptNames.Data_RelatesTo_DataSubject.getPath());
		OWLClass process_Has_Data = factory.getOWLClass(VerbConceptNames.Process_Has_Data.getPath());
		OWLClass process_Has_DataProtectionImpactAssessment = factory.getOWLClass(VerbConceptNames.Process_Has_DataProtectionImpactAssessment.getPath());
		OWLClass process_Has_Processing = factory.getOWLClass(VerbConceptNames.Process_Has_Processing.getPath());
		OWLClass process_Has_PurposeOfProcessing = factory.getOWLClass(VerbConceptNames.Process_Has_Processing.getPath());
		OWLClass process_IsPerformedAccordingTo_DataProtectionImpactAssessment = factory
				.getOWLClass(VerbConceptNames.Process_IsPerformedAccordingTo_DataProtectionImpactAssessment.getPath());
		OWLClass processing_Has_ContextOfProcessing = factory.getOWLClass(VerbConceptNames.Processing_Has_ContextOfProcessing.getPath());
		OWLClass processing_Has_Scope = factory.getOWLClass(VerbConceptNames.Processing_Has_Scope.getPath());
		OWLClass processing_Has_Technology = factory.getOWLClass(VerbConceptNames.Processing_Has_Technology.getPath());
		OWLClass processor_IsAuthorizedBy_MemberStatelaw = factory.getOWLClass(VerbConceptNames.Processor_IsAuthorizedBy_MemberStatelaw.getPath());
		OWLClass processor_IsAuthorizedBy_Unionlaw = factory.getOWLClass(VerbConceptNames.Processor_IsAuthorizedBy_Unionlaw.getPath());
		OWLClass processor_Assesses_PurposeOfProcessing = factory.getOWLClass(VerbConceptNames.Processor_Assesses_PurposeOfProcessing.getPath());
		OWLClass processor_Controls_Process = factory.getOWLClass(VerbConceptNames.Processor_Controls_Process.getPath());
		OWLClass processor_IsCompliantWith_ApprovedCodeOfConduct = factory.getOWLClass(VerbConceptNames.Processor_IsCompliantWith_ApprovedCodeOfConduct.getPath());
		OWLClass processor_SeeksViewOf_DataSubject = factory.getOWLClass(VerbConceptNames.Processor_SeeksViewOf_DataSubject.getPath());
		OWLClass processor_SeeksViewOf_RepresentativeOfDataSubject = factory.getOWLClass(VerbConceptNames.Processor_SeeksViewOf_RepresentativeOfDataSubject.getPath());
		OWLClass purposeOfProcessing_Has_Risk = factory.getOWLClass(VerbConceptNames.PurposeOfProcessing_Has_Risk.getPath());
		OWLClass purposeOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLClass(VerbConceptNames.PurposeOfProcessing_IsLikelyToResultIn_Risk.getPath());
		OWLClass review_Checks_Process = factory.getOWLClass(VerbConceptNames.Review_Checks_Process.getPath());
		OWLClass risk_Changes = factory.getOWLClass(VerbConceptNames.Risk_Changes.getPath());
		OWLClass scope_Has_Risk = factory.getOWLClass(VerbConceptNames.Scope_Has_Risk.getPath());
		OWLClass scopeOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLClass(VerbConceptNames.ScopeOfProcessing_IsLikelyToResultIn_Risk.getPath());
		OWLClass supervisoryAuthority_Applies_ConsistencyMechanism = factory.getOWLClass(VerbConceptNames.SupervisoryAuthority_Applies_ConsistencyMechanism.getPath());
		OWLClass supervisoryAuthority_Controls_Process = factory.getOWLClass(VerbConceptNames.SupervisoryAuthority_Controls_Process.getPath());
		OWLClass supervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment = factory
				.getOWLClass(VerbConceptNames.SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment.getPath());
		OWLClass supervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment = factory
				.getOWLClass(VerbConceptNames.SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment.getPath());
		OWLClass supervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessment = factory
				.getOWLClass(VerbConceptNames.SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessment.getPath());
		OWLClass supervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessment = factory
				.getOWLClass(VerbConceptNames.SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessment.getPath());
		OWLClass technology_Has_Risk = factory.getOWLClass(VerbConceptNames.Technology_Has_Risk.getPath());
		OWLClass technologyOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLClass(VerbConceptNames.TechnologyOfProcessing_IsLikelyToResultIn_Risk.getPath());
		OWLClass view_Respects_CommercialInterest = factory.getOWLClass(VerbConceptNames.View_Respects_CommercialInterest.getPath());
		OWLClass view_Respects_PublicInterest = factory.getOWLClass(VerbConceptNames.View_Respects_PublicInterest.getPath());
		OWLClass view_Respects_SecurityOfProcessingOperation = factory.getOWLClass(VerbConceptNames.View_Respects_SecurityOfProcessingOperation.getPath());

		// create Individuals Factor -> like example line 1479
		String approvedCodeOfConductControllerString = json.get("controllerAppliedApprovedCodeOfConduct").toString();
		ArrayList<OWLIndividual> approvedCodeOfConductControllerIndividuals = new ArrayList<OWLIndividual>();
		String[] approvedCodeOfCoductInformationController = approvedCodeOfConductControllerString.split(";");
		for (int i = 0; i < approvedCodeOfCoductInformationController.length; i++) {
			OWLIndividual approvedCodeOfConductIndividual = factory
					.getOWLNamedIndividual(IRI.create(ontologyIRI + approvedCodeOfCoductInformationController[i]));
			approvedCodeOfConductControllerIndividuals.add(approvedCodeOfConductIndividual);
		}

		String approvedCodeOfConductProcessorString = json.get("processorAppliedAppovedCodeOfConduct").toString();
		ArrayList<OWLIndividual> approvedCodeOfConductProcessorIndividuals = new ArrayList<OWLIndividual>();
		String[] approvedCodeOfCoductInformationProcessor = approvedCodeOfConductProcessorString.split(";");
		for (int i = 0; i < approvedCodeOfCoductInformationController.length; i++) {
			OWLIndividual approvedCodeOfConductIndividual = factory
					.getOWLNamedIndividual(IRI.create(ontologyIRI + approvedCodeOfCoductInformationProcessor[i]));
			approvedCodeOfConductProcessorIndividuals.add(approvedCodeOfConductIndividual);
		}

		String controllerString = json.get("nameOfController").toString();
		ArrayList<OWLIndividual> controllerIndividuals = new ArrayList<OWLIndividual>();
		String[] controllerInformation = controllerString.split(";");
		for (int i = 0; i < controllerInformation.length; i++) {
			OWLIndividual controllerIndividual = factory
					.getOWLNamedIndividual(IRI.create(ontologyIRI + controllerInformation[i]));
			controllerIndividuals.add(controllerIndividual);
		}
		String processorString = json.get("nameOfProcessor").toString();
		ArrayList<OWLIndividual> processorIndividuals = new ArrayList<OWLIndividual>();
		String[] processorInformation = processorString.split(";");
		for (int i = 0; i < processorInformation.length; i++) {
			OWLIndividual processorIndividual = factory
					.getOWLNamedIndividual(IRI.create(ontologyIRI + processorInformation[i]));
			processorIndividuals.add(processorIndividual);
		}

		
		OWLIndividual dataProtectionImpactAssessmentIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + json.get("dpiaName").toString()));
		OWLObjectProperty has = factory.getOWLObjectProperty("http://webprotege.stanford.edu/R8h4rVC26XxU97HIqrnyBpK");
		OWLObjectPropertyAssertionAxiom Process_Has_DataProtectionImpactAssessment = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual,
				dataProtectionImpactAssessmentIndividual);
		AddAxiom add = new AddAxiom(onto, Process_Has_DataProtectionImpactAssessment);
		manager.applyChange(add);

		
		 OWLIndividual assessmentOfNecessityOfProcessingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("assessmentOfNecessity").toString()));
		 OWLIndividual assessmentOfProportionalityOfProcessingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("assessmentOfProportionality").toString()));
		 OWLIndividual assessmentOfRisksToRightsAndFreedomsIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("assessmentOfRisks").toString()));
		 OWLIndividual automatedProcessingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("automatedProcessing").toString()));
		 OWLIndividual biometricDataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("biometricData").toString()));
		 OWLIndividual commercialInterestIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual consistencymechanismIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("consistencyMechanism").toString()));
		 OWLIndividual contextOfProcessingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual creationDateIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("dpiaCreationDate").toString()));
		 OWLIndividual criminalConvictionIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("criminalConviction").toString()));
		 OWLIndividual criminalOffenseIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("criminalOffense").toString()));
		 OWLIndividual dataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual dataProtectionImpactAssessmentIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("dpiaName").toString()));
		 OWLIndividual dataProtectionOfficerIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("nameDataProtectionOfficer").toString()));
		 OWLIndividual dataSubjectIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual ethnicOriginIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("ethnicOrigin").toString()));
		 OWLIndividual evaluationIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("evaluation").toString()));
		 OWLIndividual firstProcessingDateIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("firstProcessingDate").toString()));
		 OWLIndividual freeMovementOfDataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual gdprIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual geneticDataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("geneticData").toString()));
		 OWLIndividual healthIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("health").toString()));
		 OWLIndividual legalEffectIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("legalEffect").toString()));
		 OWLIndividual legitimateInterestOfProcessingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("legitimateInterestOfProcessing").toString()));
		 OWLIndividual listWithProcessesThatDoNotNeedDpiaIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameOfListwithAllProcessesThatDoNotNeedDpia").toString()));
		 OWLIndividual listWithProcessesThatNeedDpiaIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameOfListWithAllProcessesThatNeedDpia").toString()));
	     OWLIndividual measureToAddressRiskIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual mechanismsToEnsureProtectionOfDataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("mechanismsToEnsureProtectionOfData").toString()));
		 OWLIndividual memberStateLawIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual monitoringOfDataInMemberstateIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("monitoringBehaviorInMemberstate").toString()));
		 OWLIndividual offeringOfGoodsIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("offeringOfGoods").toString()));
		 OWLIndividual offeringOfServicesIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("offeringOfServices").toString()));
		 OWLIndividual personalDataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual personalInterestIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual philosophicalBeliefIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("philosophicalBelief").toString()));
		 OWLIndividual politicalOpinionIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("politicalOpinion").toString()));
		  // OWLIndividual processIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("process").toString()));
		 
		 OWLIndividual profilingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("profiling").toString()));
		 OWLIndividual publicAreaIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("nameOfPublicAreaWhereDataWasMonitored").toString()));
		 OWLIndividual publicInterestIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual purposeOfProcessingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("purposeOfProcessing").toString()));
		 OWLIndividual racialOriginIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("racialOrigin").toString()));
		 OWLIndividual religiousBeliefIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("religiousBelief").toString()));
		 OWLIndividual representativeOfDataSubjectIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual reviewIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual rightsIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual riskOfContextIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("riskRelatedToContent").toString()));
		 OWLIndividual riskOfPurposeIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("riskRelatedToPurpose").toString()));
		 OWLIndividual riskOfTechnologyIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("riskRelatedToTechnology").toString()));
         OWLIndividual riskOfScopeIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("riskRelatedToScope").toString()));
		 OWLIndividual safeguardIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("safeguard").toString()));
		 OWLIndividual scopeIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("scopeOfProcessing").toString()));
		 OWLIndividual securityMeasureIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("securityMeasure").toString()));
		 OWLIndividual securityOfProcessingOperationIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual sexLifeIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("sexLife").toString()));
		 OWLIndividual sexualOrientationIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("sexualOrientation").toString()));
		 OWLIndividual supervisoryAuthorityCriminalConvictionIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameOfSupervisoryAuthorityThatControlsProcessCriminalConviction").toString()));
		 OWLIndividual supervisoryAuthorityCriminalOffensiveIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameOfSupervisoryAuthorityThatControlsProcessCriminalOffense").toString()));
		 OWLIndividual supervisoryAuthorityListNeedDPIAIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameSupervisoryAuthotityThatCreatedListDpia").toString()));
		 OWLIndividual supervisoryAuthorityListNoDPIAIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameSupervisoryAuthorityThatCreatedListNoDpia").toString()));
		 OWLIndividual systematicDescriptionOfProcessingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("systematicDescriptionOfProcessing").toString()));
		 OWLIndividual technologyIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("technologyOfProcessing").toString()));
		 OWLIndividual tradeUnionMembershipIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +json.get("tradeUnionMembership").toString()));
		 OWLIndividual viewDataSubjectIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("viewOfPerson").toString()));
		 OWLIndividual viewRepresenativeDataSubjectIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("viewOfRepresentativeOfPerson").toString()));
		 OWLIndividual europeanDataProtectionBoardIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual unionLawIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual processingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual monitoringIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		 OWLIndividual activityIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		  
		  // specify class of individual -> like example line 1593
		  // OWLClassAssertionAxiom classAssertionApprovedCodeOfConduct = factory.getOWLClassAssertionAxiom(approvedCodeOfConduct,
		 // approvedCodeOfConductIndividual);
		 OWLClassAssertionAxiom classAssertionAssessmentOfNecessityOfProcessing = factory.getOWLClassAssertionAxiom(assessmentOfNecessityOfProcessing,assessmentOfNecessityOfProcessingIndividual);
		 OWLClassAssertionAxiom classAssertionAssessmentOfProportionalityOfProcessing = factory.getOWLClassAssertionAxiom(assessmentOfProportionalityOfProcessing, assessmentOfProportionalityOfProcessingIndividual);
		 OWLClassAssertionAxiom classAssertionAssessmentOfRisksToRightsAndFreedoms =factory.getOWLClassAssertionAxiom(assessmentOfRisksToRightsAndFreedoms,assessmentOfRisksToRightsAndFreedomsIndividual);
		 OWLClassAssertionAxiom classAssertionAutomatedProcessing = factory.getOWLClassAssertionAxiom(automatedProcessing,automatedProcessingIndividual);
		 OWLClassAssertionAxiom classAssertionBiometricData = factory.getOWLClassAssertionAxiom(biometricData, biometricDataIndividual);
		 OWLClassAssertionAxiom classAssertionCommercialInterest = factory.getOWLClassAssertionAxiom(commercialInterest,commercialInterestIndividual);
		 OWLClassAssertionAxiom classAssertionConsistencymechanism = factory.getOWLClassAssertionAxiom(consistencymechanism,consistencymechanismIndividual);
		 OWLClassAssertionAxiom classAssertionContextOfProcessing = factory.getOWLClassAssertionAxiom(contextOfProcessing,contextOfProcessingIndividual);
		 // OWLClassAssertionAxiom classAssertionController = factory.getOWLClassAssertionAxiom(controller, controllerIndividual);
		 OWLClassAssertionAxiom classAssertionCreationDate = factory.getOWLClassAssertionAxiom(creationDate, creationDateIndividual);
		 OWLClassAssertionAxiom classAssertionCriminalConviction = factory.getOWLClassAssertionAxiom(criminalConviction,criminalConvictionIndividual);
		 OWLClassAssertionAxiom classAssertionCriminalOffense = factory.getOWLClassAssertionAxiom(criminalOffense,criminalOffenseIndividual);
		 OWLClassAssertionAxiom classAssertionData = factory.getOWLClassAssertionAxiom(data, dataIndividual);
		 OWLClassAssertionAxiom classAssertionDataProtectionImpactAssessment =factory.getOWLClassAssertionAxiom(dataProtectionImpactAssessment,dataProtectionImpactAssessmentIndividual);
		 OWLClassAssertionAxiom classAssertionDataProtectionOfficer = factory.getOWLClassAssertionAxiom(dataProtectionOfficer,dataProtectionOfficerIndividual);
		 OWLClassAssertionAxiom classAssertionDataSubject = factory.getOWLClassAssertionAxiom(dataSubject, dataSubjectIndividual);
		 OWLClassAssertionAxiom classAssertionEthnicOrigin = factory.getOWLClassAssertionAxiom(ethnicOrigin, ethnicOriginIndividual);
		 OWLClassAssertionAxiom classAssertionEvaluation = factory.getOWLClassAssertionAxiom(evaluation, evaluationIndividual);
		 OWLClassAssertionAxiom classAssertionFirstProcessingDate = factory.getOWLClassAssertionAxiom(firstProcessingDate,firstProcessingDateIndividual);
		 OWLClassAssertionAxiom classAssertionFreeMovementOfData = factory.getOWLClassAssertionAxiom(freeMovementOfData,freeMovementOfDataIndividual);
		 OWLClassAssertionAxiom classAssertionGdpr = factory.getOWLClassAssertionAxiom(gdpr, gdprIndividual);
		 OWLClassAssertionAxiom classAssertionGeneticData = factory.getOWLClassAssertionAxiom(geneticData, geneticDataIndividual);
		 OWLClassAssertionAxiom classAssertionHealth = factory.getOWLClassAssertionAxiom(health, healthIndividual);
		 OWLClassAssertionAxiom classAssertionLegalEffect = factory.getOWLClassAssertionAxiom(legalEffect, legalEffectIndividual);
		 OWLClassAssertionAxiom classAssertionLegitimateInterestOfProcessing =factory.getOWLClassAssertionAxiom(legitimateInterestOfProcessing,legitimateInterestOfProcessingIndividual);
		 OWLClassAssertionAxiom classAssertionListWithProcessesThatDoNotNeedDpia =factory.getOWLClassAssertionAxiom(listWithProcessesThatDoNotNeedDpia,listWithProcessesThatDoNotNeedDpiaIndividual);
		 OWLClassAssertionAxiom classAssertionListWithProcessesThatNeedDpia =factory.getOWLClassAssertionAxiom(listWithProcessesThatNeedDpia,listWithProcessesThatNeedDpiaIndividual);
		 OWLClassAssertionAxiom classAssertionMeasureToAddressRisk = factory.getOWLClassAssertionAxiom(measureToAddressRisk,measureToAddressRiskIndividual);
		 OWLClassAssertionAxiom classAssertionMechanismsToEnsureProtectionOfData =factory.getOWLClassAssertionAxiom(mechanismsToEnsureProtectionOfData, mechanismsToEnsureProtectionOfDataIndividual);
		 OWLClassAssertionAxiom classAssertionMemberStateLaw = factory.getOWLClassAssertionAxiom(memberStateLaw,memberStateLawIndividual);
		 OWLClassAssertionAxiom classAssertionMonitoringOfDataInMemberstate =factory.getOWLClassAssertionAxiom(monitoringOfDataInMemberstate,monitoringOfDataInMemberstateIndividual);
		 OWLClassAssertionAxiom classAssertionOfferingOfGoods = factory.getOWLClassAssertionAxiom(offeringOfGoods,offeringOfGoodsIndividual);
		 OWLClassAssertionAxiom classAssertionOfferingOfServices = factory.getOWLClassAssertionAxiom(offeringOfServices,offeringOfServicesIndividual);
		 OWLClassAssertionAxiom classAssertionPersonalData = factory.getOWLClassAssertionAxiom(personalData, personalDataIndividual);
		 OWLClassAssertionAxiom classAssertionPersonalInterest = factory.getOWLClassAssertionAxiom(personalInterest,personalInterestIndividual);
		 OWLClassAssertionAxiom classAssertionPhilosophicalBelief = factory.getOWLClassAssertionAxiom(philosophicalBelief, philosophicalBeliefIndividual);
		 OWLClassAssertionAxiom classAssertionPoliticalOpinion = factory.getOWLClassAssertionAxiom(politicalOpinion,politicalOpinionIndividual);
		 OWLClassAssertionAxiom classAssertionProcess = factory.getOWLClassAssertionAxiom(process, processIndividual);
		 // OWLClassAssertionAxiom classAssertionProcessor = factory.getOWLClassAssertionAxiom(processor, processorIndividual);
		 OWLClassAssertionAxiom classAssertionProfiling = factory.getOWLClassAssertionAxiom(profiling, profilingIndividual);
		 OWLClassAssertionAxiom classAssertionPublicArea = factory.getOWLClassAssertionAxiom(publicArea, publicAreaIndividual);
		 OWLClassAssertionAxiom classAssertionPublicInterest = factory.getOWLClassAssertionAxiom(publicInterest, publicInterestIndividual);
		 OWLClassAssertionAxiom classAssertionPurposeOfProcessing = factory.getOWLClassAssertionAxiom(purposeOfProcessing,purposeOfProcessingIndividual);
		 OWLClassAssertionAxiom classAssertionRacialOrigin = factory.getOWLClassAssertionAxiom(racialOrigin, racialOriginIndividual);
		 OWLClassAssertionAxiom classAssertionReligiousBelief = factory.getOWLClassAssertionAxiom(religiousBelief,religiousBeliefIndividual);
		 OWLClassAssertionAxiom classAssertionRepresentativeOfDataSubject = factory.getOWLClassAssertionAxiom(representativeOfDataSubject,representativeOfDataSubjectIndividual);
		 OWLClassAssertionAxiom classAssertionReview = factory.getOWLClassAssertionAxiom(review, reviewIndividual);
		 OWLClassAssertionAxiom classAssertionRights = factory.getOWLClassAssertionAxiom(rights, rightsIndividual);
		 // OWLClassAssertionAxiom classAssertionRisk = factory.getOWLClassAssertionAxiom(risk, riskIndividual);
		 OWLClassAssertionAxiom classAssertionSafeguard = factory.getOWLClassAssertionAxiom(safeguard, safeguardIndividual);
		 OWLClassAssertionAxiom classAssertionScope = factory.getOWLClassAssertionAxiom(scopeOfProcessing, scopeIndividual);
		 OWLClassAssertionAxiom classAssertionSecurityMeasure = factory.getOWLClassAssertionAxiom(securityMeasure,securityMeasureIndividual);
		 OWLClassAssertionAxiom classAssertionSecurityOfProcessing = factory.getOWLClassAssertionAxiom(securityOfProcessingOperation, securityOfProcessingOperationIndividual);
		 OWLClassAssertionAxiom classAssertionSexLife = factory.getOWLClassAssertionAxiom(sexLife, sexLifeIndividual);
		 OWLClassAssertionAxiom classAssertionSexualOrientation = factory.getOWLClassAssertionAxiom(sexualOrientation,sexualOrientationIndividual);
		 // OWLClassAssertionAxiom classAssertionSupervisoryAuthority = factory.getOWLClassAssertionAxiom(supervisoryAuthority,
		 // supervisoryAuthorityIndividual);
		 OWLClassAssertionAxiom classAssertionSystematicDescriptionOfProcessing =factory.getOWLClassAssertionAxiom(systematicDescriptionOfProcessing,systematicDescriptionOfProcessingIndividual);
		 OWLClassAssertionAxiom classAssertionTechnology = factory.getOWLClassAssertionAxiom(technology, technologyIndividual);
		 OWLClassAssertionAxiom classAssertionTradeUnionMembership = factory.getOWLClassAssertionAxiom(tradeUnionMembership,
		 tradeUnionMembershipIndividual);
		 // OWLClassAssertionAxiom classAssertionView = factory.getOWLClassAssertionAxiom(view, viewIndividual);
		 OWLClassAssertionAxiom classAssertionEuropeanDataProtectionBoard = factory.getOWLClassAssertionAxiom(europeanDataProtectionBoard,europeanDataProtectionBoardIndividual);
		 OWLClassAssertionAxiom classAssertionUnionLaw = factory.getOWLClassAssertionAxiom(unionLaw, unionLawIndividual);
		 OWLClassAssertionAxiom classAssertProcessing = factory.getOWLClassAssertionAxiom(processing, processingIndividual);
		 OWLClassAssertionAxiom classAssertMonitoring = factory.getOWLClassAssertionAxiom(monitoring, monitoringIndividual);
		 OWLClassAssertionAxiom classAssertActivity = factory.getOWLClassAssertionAxiom(activity, activityIndividual);
		 
		 
		 OWLIndividual ConsistencyMechanism_IsAppliedTo_ProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ConsistencyMechanism_IsAppliedTo_Processing -"+ processName));
		 OWLIndividual ContextOfProcessing_Affects_FreeMovementOfDataIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_Affects_FreeMovementOfData -"+ processName));
		 OWLIndividual ContextOfProcessing_Has_ActivityIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_Has_Activity -"+ processName));
		 OWLIndividual ContextOfProcessing_Has_RiskIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_Has_Risk -"+ processName));
		 OWLIndividual ContextOfProcessing_Involves_MonitoringOfDataInMemberstateIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_Involves_MonitoringOfDataInMemberstate -"+ processName));
		 OWLIndividual ContextOfProcessing_Involves_OfferingOfGoodIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_Involves_OfferingOfGood -"+ processName));
		 OWLIndividual ContextOfProcessing_Involves_OfferingOfServicesIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_Involves_OfferingOfServices -"+ processName));
		 OWLIndividual ContextOfProcessing_IsLikelyToResultIn_RiskIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_IsLikelyToResultIn_Risk -"+ processName));
		 OWLIndividual Controller_Assesses_PurposeOfProcessingIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_Assesses_PurposeOfProcessing -"+ processName));
		 OWLIndividual Controller_CarriesOut_ReviewIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_CarriesOut_Review -"+ processName));
		 OWLIndividual Controller_Creates_DataProtectionImpactAssessmentIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_Creates_DataProtectionImpactAssessment -"+ processName));
		 OWLIndividual Controller_IsCompliantWith_ApprovedCodeOfConductIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_IsCompliantWith_ApprovedCodeOfConduct -"+ processName));
		 OWLIndividual Controller_SeeksAdviceOf_DataProtectionOfficerIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_SeeksAdviceOf_DataProtectionOfficer -"+ processName));
		 OWLIndividual Controller_SeeksViewOf_DataSubjectIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_SeeksViewOf_DataSubject -"+ processName));
		 OWLIndividual Controller_SeeksViewOf_RepresentativeOfDataSubjectIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_SeeksViewOf_RepresentativeOfDataSubject -"+ processName));
		 OWLIndividual CreationDate_OccursBefore_FirstProcessingDateIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "CreationDate_OccursBefore_FirstProcessingDate -"+ processName));
		 OWLIndividual Data_Contains_BiometricDataIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_Contains_BiometricData -"+ processName));
		 OWLIndividual Data_Contains_GeneticDataIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_Contains_GeneticData -"+ processName));
		 OWLIndividual Data_Has_MonitoringIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_Has_Monitoring -"+ processName));
		 OWLIndividual Data_IsMonitoredIn_PublicAreaIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_IsMonitoredIn_PublicArea -"+ processName));
		 OWLIndividual Data_IsPartOf_EvaluationIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_IsPartOf_Evaluation -"+ processName));
		 OWLIndividual Data_RelatesTo_CriminalConvictionIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RelatesTo_CriminalConviction -"+ processName));
		 OWLIndividual Data_RelatesTo_CriminalOffenseIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RelatesTo_CriminalOffense -"+ processName));
		 OWLIndividual Data_RelatesTo_DataSubjectIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RelatesTo_DataSubject -"+ processName));
		 OWLIndividual Data_RelatesTo_SecurityMeasureIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RelatesTo_SecurityMeasure -"+ processName));
		 OWLIndividual Data_RevealsInformationAbout_EthnicOriginIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_EthnicOrigin -"+ processName));
		 OWLIndividual Data_RevealsInformationAbout_HealthIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_Health -"+ processName));
		 OWLIndividual Data_RevealsInformationAbout_PhilosophicalBeliefIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_PhilosophicalBelief -"+ processName));
		 OWLIndividual Data_RevealsInformationAbout_PoliticalOpinionIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_PoliticalOpinion -"+ processName));
		 OWLIndividual Data_RevealsInformationAbout_RacialOriginIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_RacialOrigin -"+ processName));
		 OWLIndividual Data_RevealsInformationAbout_ReligiousBeliefIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_ReligiousBelief -"+ processName));
		 OWLIndividual Data_RevealsInformationAbout_SexLifeIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_SexLife -"+ processName));
		 OWLIndividual Data_RevealsInformationAbout_SexualOrientationIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_SexualOrientation -"+ processName));
		 OWLIndividual Data_RevealsInformationAbout_TradeUnionMembershipIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_TradeUnionMembership -"+ processName));
		 OWLIndividual DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessingIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing -"+ processName));
		 OWLIndividual DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessingIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing -"+ processName));
		 OWLIndividual DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedomsIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms -"+ processName));
		 OWLIndividual DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessingIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing -"+ processName));
		 OWLIndividual DataProtectionImpactAssessment_Contains_MeasureToAddressRisksIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "DataProtectionImpactAssessment_Contains_MeasureToAddressRisks -"+ processName));
		 OWLIndividual DataProtectionImpactAssessment_Contains_PurposeOfProcessingIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "DataProtectionImpactAssessment_Contains_PurposeOfProcessing -"+ processName));
		 OWLIndividual DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessingIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing -"+ processName));
		 OWLIndividual DataProtectionOfficer_IsDesignatedIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "DataProtectionOfficer_IsDesignated -"+ processName));
		 OWLIndividual DataSubject_Has_ViewIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "DataSubject_Has_View -"+ processName));
		 OWLIndividual EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessment -"+ processName));
		 OWLIndividual EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessmentIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessment -"+ processName));
		 OWLIndividual Evaluation_BasesOn_AutomatedProcessingIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Evaluation_BasesOn_AutomatedProcessing -"+ processName));
		 OWLIndividual Evaluation_BasesOn_ProfilingIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Evaluation_BasesOn_Profiling -"+ processName));
		 OWLIndividual Evaluation_Produces_LegalEffectIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Evaluation_Produces_LegalEffect -"+ processName));
		 OWLIndividual LegalEffect_Concerns_DataSubjectIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "LegalEffect_Concerns_DataSubject -"+ processName));
		 OWLIndividual MeasureToAddressRisk_CompliesTo_GDPRIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "MeasureToAddressRisk_CompliesTo_GDPR -"+ processName));
		 OWLIndividual MeasureToAddressRisk_TakesIntoAccount_RightsIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "MeasureToAddressRisk_TakesIntoAccount_Rights -"+ processName));
		 OWLIndividual MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfDataIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfData -"+ processName));
		 OWLIndividual MeasureToAddressRisks_Contains_SafeguardIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "MeasureToAddressRisks_Contains_Safeguard -"+ processName));
		 OWLIndividual MeasureToAddressRisks_Contains_SecurityMeasureIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "MeasureToAddressRisks_Contains_SecurityMeasure -"+ processName));
		 OWLIndividual PersonalData_IsPartOf_EvaluationIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "PersonalData_IsPartOf_Evaluation -"+ processName));
		 OWLIndividual Process_Has_DataIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Process_Has_Data -"+ processName));
		 OWLIndividual Process_Has_DataProtectionImpactAssessmentIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Process_Has_DataProtectionImpactAssessment -"+ processName));
		 OWLIndividual Process_Has_ProcessingIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Process_Has_Processing -"+ processName));
		 OWLIndividual Process_IsPerformedAccordingTo_DataProtectionImpactAssessmentIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Process_IsPerformedAccordingTo_DataProtectionImpactAssessment -"+ processName));
		 OWLIndividual Processing_Has_ContextOfProcessingIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processing_Has_ContextOfProcessing -"+ processName));
		 OWLIndividual Processing_Has_PurposeOfProcessingIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processing_Has_PurposeOfProcessing -"+ processName));
		 OWLIndividual Processing_Has_ScopeIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processing_Has_Scope -"+ processName));
		 OWLIndividual Processing_Has_TechnologyIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processing_Has_Technology -"+ processName));
		 OWLIndividual Processor_Assesses_PurposeOfProcessingIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_Assesses_PurposeOfProcessing -"+ processName));
		 OWLIndividual Processor_Controls_ProcessIndividual = factory
			.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_Controls_Process -"+ processName));
		 OWLIndividual Processor_IsAuthorizedBy_MemberStatelawIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_IsAuthorizedBy_MemberStatelaw -"+ processName));
		 OWLIndividual Processor_IsAuthorizedBy_UnionlawIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_IsAuthorizedBy_Unionlaw -"+ processName));
		 OWLIndividual Processor_IsCompliantWith_ApprovedCodeOfConductIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_IsCompliantWith_ApprovedCodeOfConduct -"+ processName));
		 OWLIndividual Processor_SeeksViewOf_DataSubjectIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_SeeksViewOf_DataSubject -"+ processName));
		 OWLIndividual Processor_SeeksViewOf_RepresentativeOfDataSubjectIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_SeeksViewOf_RepresentativeOfDataSubject -"+ processName));
		 OWLIndividual PurposeOfProcessing_Has_RiskIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "PurposeOfProcessing_Has_Risk -"+ processName));
		 OWLIndividual PurposeOfProcessing_IsLikelyToResultIn_RiskIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "PurposeOfProcessing_IsLikelyToResultIn_Risk -"+ processName));
		 OWLIndividual Review_Checks_ProcessIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Review_Checks_Process -"+ processName));
		 OWLIndividual Risk_ChangesIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Risk_Changes -"+ processName));
		 OWLIndividual Scope_Has_RiskIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Scope_Has_Risk -"+ processName));
		 OWLIndividual ScopeOfProcessing_IsLikelyToResultIn_RiskIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ScopeOfProcessing_IsLikelyToResultIn_Risk -"+ processName));
		 OWLIndividual SupervisoryAuthority_Applies_ConsistencyMechanismIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "SupervisoryAuthority_Applies_ConsistencyMechanism -"+ processName));
		 OWLIndividual SupervisoryAuthority_Controls_ProcessIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "SupervisoryAuthority_Controls_Process -"+ processName));
		 OWLIndividual SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessmentIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment -"+ processName));
		 OWLIndividual SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessmentIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment -"+ processName));
		 OWLIndividual SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessmentIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessment -"+ processName));
		 OWLIndividual SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessmentIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessment -"+ processName));
		 OWLIndividual Technology_Has_RiskIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Technology_Has_Risk -"+ processName));
		 OWLIndividual TechnologyOfProcessing_IsLikelyToResultIn_RiskIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "TechnologyOfProcessing_IsLikelyToResultIn_Risk -"+ processName));
		 OWLIndividual PView_Respects_CommercialInterestIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "View_Respects_CommercialInterest -"+ processName));
		 OWLIndividual View_Respects_PublicInterestIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "View_Respects_PublicInterest -"+ processName));
		 OWLIndividual View_Respects_SecurityOfProcessingOperationIndividual = factory
					.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "View_Respects_SecurityOfProcessingOperation -"+ processName));
		 
		 		 // reference to ObjectProperty -> like example line 1493
		
		 OWLObjectProperty affects = factory.getOWLObjectProperty("http://webprotege.stanford.edu/R8eQKJJJZMxsZi9rQkgqq2a");
		  OWLObjectProperty involves = factory.getOWLObjectProperty("http://webprotege.stanford.edu/R7RGx7PWPnG0sR6wGg3AXcH");
		  OWLObjectProperty isLikelyToResultIn = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RBqX2wThottIIaw32D2aa3d");
		  OWLObjectProperty assesses = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RqNBSia6wh0aAzt0Arji9P");
		  OWLObjectProperty carriesOut = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RDSdGrHXYl9Eu0s8r5IS5Oj");
		  OWLObjectProperty creates = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RDUw9NjJehTigZ1ubbFTyb7");
		  OWLObjectProperty isCompliantTo = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RDgobhFnBfMJ0Si0IWDXkFV");
		  OWLObjectProperty seeksAdviceOf = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RRtBczGxkl8IyzzoK7bmKd");
		  OWLObjectProperty seeksViewOf = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RBTt5tSKFKMnmTF7KJT6H6A");
		  OWLObjectProperty occursBefore = factory.getOWLObjectProperty("http://webprotege.stanford.edu/R86mMcJndHzoTUpE4c4Y2vJ");
		  OWLObjectProperty contains = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RBZ8tfMQZ9DFl31P8ahuruf");
		  OWLObjectProperty isMonitoredIn = factory.getOWLObjectProperty("http://purl.org/net/team_project_semantic_web/is_monitored_in");
		  OWLObjectProperty relatesTo = factory.getOWLObjectProperty("http://webprotege.stanford.edu/R8DRZGUkQJfvrF8Jrmx7sS");
		  OWLObjectProperty revealsInformationAbout = factory.getOWLObjectProperty("http://webprotege.stanford.edu/R9eNRBPdXpdJL7m4aG4ItLK");
		  OWLObjectProperty isDesignated = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RV7kczTIRtjPdaLFeqbJio");
		 OWLObjectProperty receives = factory.getOWLObjectProperty("http://webprotege.stanford.edu/R87t7dgn6sgWrizmrIVVss6");
		  OWLObjectProperty produces = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RBjc6dioKfLQXvdY6AOWJrg");
		  OWLObjectProperty concerns = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RC1BTLj1hUpMHhqJcTjKqzm");
		  OWLObjectProperty compliesTo = factory.getOWLObjectProperty("http://purl.org/net/team_project_semantic_web/complies_to");
		  OWLObjectProperty takesIntoAccount = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RBG7sVWc5jZZhT4N0sEdYTs");
		  OWLObjectProperty basesOn = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RicP6oSkrmhtRFrztSkOt");
		  OWLObjectProperty isPartOf = factory.getOWLObjectProperty("http://purl.org/net/team_project_semantic_web/is_part_of");
		  OWLObjectProperty isPerformedAccordingTo = factory.getOWLObjectProperty("http://webprotege.stanford.edu/R9sgi5889wsvWlxuMvptCZ");
		  OWLObjectProperty controls = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RCqaHkvYZRIAUX1AvBgtdlL");
		  OWLObjectProperty isAuthorizedBy = factory.getOWLObjectProperty("http://webprotege.stanford.edu/R7xC20eAzvGgT0bncekMlN2");
		  OWLObjectProperty checks = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RyaKJMMydAydlR8BS6Gi7I");
		 OWLObjectProperty changes = factory.getOWLObjectProperty("http://webprotege.stanford.edu/R8byyFZU9KweuTjs6z6rZLF");
		  OWLObjectProperty applies = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RCf1IsHQ3nlxgPdbFez7gY1");
		  OWLObjectProperty publishes = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RCdSDoXDS1NWnqJuIxLCAp4");
		  OWLObjectProperty respects = factory.getOWLObjectProperty("http://webprotege.stanford.edu/RCKEQ0Zh74CtDnUT3oC7PIU");
		 
		 OWLObjectProperty has = factory.getOWLObjectProperty("http://webprotege.stanford.edu/R8h4rVC26XxU97HIqrnyBpK");
		  OWLObjectProperty isAppliedTo = factory.getOWLObjectProperty("http://purl.org/net/team_project_semantic_web/is_applied_to");
		  
		  OWLObjectProperty hasSubject = factory.getOWLObjectProperty(RuleName.hasSubject.getPath());
		  OWLObjectProperty hasObject = factory.getOWLObjectProperty(RuleName.hasObject.getPath());
		  OWLObjectProperty hasVerb = factory.getOWLObjectProperty(RuleName.hasVerb.getPath());
		  
		  
		  // specify all changes in between here
		 
		// manager.addAxioms(onto, axioms);
		 
		  // specify relationships between Individuals -> like example line 1498
		  OWLObjectPropertyAssertionAxiom ContextOfProcessing_Affects_FreeMovementOfData = factory.getOWLObjectPropertyAssertionAxiom(affects,contextOfProcessingIndividual, freeMovementOfDataIndividual);
		 
		  OWLObjectPropertyAssertionAxiom ContextOfProcessing_Involves_MonitoringOfDataInMemberState = factory.getOWLObjectPropertyAssertionAxiom(involves,contextOfProcessingIndividual, mechanismsToEnsureProtectionOfDataIndividual);
		 OWLObjectPropertyAssertionAxiom ContextOfProcessing_Involves_OfferingOfGoods =
		 factory.getOWLObjectPropertyAssertionAxiom(involves, contextOfProcessingIndividual, offeringOfGoodsIndividual);
		 OWLObjectPropertyAssertionAxiom ContextOfProcessing_Involves_OfferingOfServices =
		 * factory.getOWLObjectPropertyAssertionAxiom(involves,
		 * contextOfProcessingIndividual, offeringOfServicesIndividual);
		 * // OWLObjectPropertyAssertionAxiom ContextOfProcessing_IsLikelyToResultIn_Risk =
		 * // factory.getOWLObjectPropertyAssertionAxiom(isLikelyToResultIn,
		 * // contextOfProcessingIndividual, riskIndividual);
		 * // OWLObjectPropertyAssertionAxiom Controller_Assesses_PurposeOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(assesses,
		 * // controllerIndividual,
		 * // purposeOfProcessingIndividual);
		 * // OWLObjectPropertyAssertionAxiom Controller_CarriesOut_Review = factory.getOWLObjectPropertyAssertionAxiom(carriesOut,
		 * // controllerIndividual,
		 * // reviewIndividual);
		 * // OWLObjectPropertyAssertionAxiom Controller_Creates_DataProtectonImpactAssessment =
		 * // factory.getOWLObjectPropertyAssertionAxiom(creates,
		 * // controllerIndividual, dataProtectionImpactAssessmentIndividual);
		 * // OWLObjectPropertyAssertionAxiom Controller_IsCompliantTo_ApprovedCodeOfConduct =
		 * // factory.getOWLObjectPropertyAssertionAxiom(isCompliantTo,
		 * // controllerIndividual, approvedCodeOfConductIndividual);
		 * // OWLObjectPropertyAssertionAxiom Controller_SeeksAdviceOf_DataProtectionOfficer =
		 * // factory.getOWLObjectPropertyAssertionAxiom(seeksAdviceOf,
		 * // controllerIndividual, dataProtectionOfficerIndividual);
		 * 
		 * // OWLObjectPropertyAssertionAxiom Controller_SeeksViewOf_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf,
		 * // controllerIndividual,
		 * // dataSubjectIndividual);
		 * // OWLObjectPropertyAssertionAxiom Controller_SeeksViewOf_RepresentativeOfDataSubject =
		 * // factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf,
		 * // controllerIndividual, representativeOfDataSubjectIndividual);
		 * // OWLObjectPropertyAssertionAxiom CreationDate_OccursBefore_FirstProcessingDate =
		 * // factory.getOWLObjectPropertyAssertionAxiom(occursBefore,
		 * // creationDateIndividual, firstProcessingDateIndividual);
		 * // OWLObjectPropertyAssertionAxiom Data_Contains_BiometricData = factory.getOWLObjectPropertyAssertionAxiom(contains,
		 * // dataIndividual,
		 * // biometricDataIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_IsMonitoredIn_PublicArea = factory.getOWLObjectPropertyAssertionAxiom(isMonitoredIn,
		 * dataIndividual,
		 * publicAreaIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_Contains_GeneticData = factory.getOWLObjectPropertyAssertionAxiom(contains, dataIndividual,
		 * geneticDataIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_RelatesTo_CriminalConviction = factory.getOWLObjectPropertyAssertionAxiom(relatesTo,
		 * dataIndividual,
		 * criminalConvictionIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_RelatesTo_CriminalOffense = factory.getOWLObjectPropertyAssertionAxiom(relatesTo,
		 * dataIndividual,
		 * criminalOffenseIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_RelatesTo_SecurityMeasure = factory.getOWLObjectPropertyAssertionAxiom(relatesTo,
		 * dataIndividual,
		 * securityMeasureIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_EthnicOrigin =
		 * factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
		 * dataIndividual, ethnicOriginIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_Health =
		 * factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
		 * dataIndividual, healthIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_PhilosophicalBelief =
		 * factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
		 * dataIndividual, philosophicalBeliefIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_PoliticalOpinion =
		 * factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
		 * dataIndividual, politicalOpinionIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_RacialOrigin =
		 * factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
		 * dataIndividual, racialOriginIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_ReligiousBelief =
		 * factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
		 * dataIndividual, religiousBeliefIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_SexLife =
		 * factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
		 * dataIndividual, sexLifeIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_SexualOrientation =
		 * factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
		 * dataIndividual, sexualOrientationIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_RevealsInformationAbout_TradeUnionMembership =
		 * factory.getOWLObjectPropertyAssertionAxiom(revealsInformationAbout,
		 * dataIndividual, tradeUnionMembershipIndividual);
		 * OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing = factory
		 * .getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual,
		 * assessmentOfNecessityOfProcessingIndividual);
		 * OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing = factory
		 * .getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual,
		 * assessmentOfProportionalityOfProcessingIndividual);
		 * OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms = factory
		 * .getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual,
		 * assessmentOfRisksToRightsAndFreedomsIndividual);
		 * OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing = factory
		 * .getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual,
		 * legitimateInterestOfProcessingIndividual);
		 * OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_MeasureToAddressRisks =
		 * factory.getOWLObjectPropertyAssertionAxiom(contains,
		 * dataProtectionImpactAssessmentIndividual, measureToAddressRiskIndividual);
		 * OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_PurposeOfProcessing =
		 * factory.getOWLObjectPropertyAssertionAxiom(contains,
		 * dataProtectionImpactAssessmentIndividual, purposeOfProcessingIndividual);
		 * OWLObjectPropertyAssertionAxiom DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing = factory
		 * .getOWLObjectPropertyAssertionAxiom(contains, dataProtectionImpactAssessmentIndividual,
		 * systematicDescriptionOfProcessingIndividual);
		 * // OWLObjectPropertyAssertionAxiom DataProtectionOfficer_IsDesignated = factory.getOWLObjectPropertyAssertionAxiom(isDesignated,
		 * // dataProtectionOfficerIndividual, null);
		 * OWLObjectPropertyAssertionAxiom EuropeanDataProtectionBoard_Receives_ListWithProcessesThatDoNotNeedDpiaIndividual = factory
		 * .getOWLObjectPropertyAssertionAxiom(receives, europeanDataProtectionBoardIndividual,
		 * listWithProcessesThatDoNotNeedDpiaIndividual);
		 * OWLObjectPropertyAssertionAxiom EuropeanDataProtectionBoard_Receives_ListWithProcessesThatDoNeedDpiaIndividual = factory
		 * .getOWLObjectPropertyAssertionAxiom(receives, europeanDataProtectionBoardIndividual, listWithProcessesThatNeedDpiaIndividual);
		 * OWLObjectPropertyAssertionAxiom Evaluation_BasesOn_AutomatedProcessing = factory.getOWLObjectPropertyAssertionAxiom(basesOn,
		 * evaluationIndividual,
		 * automatedProcessingIndividual);
		 * OWLObjectPropertyAssertionAxiom Evaluation_BasesOn_Profiling = factory.getOWLObjectPropertyAssertionAxiom(basesOn,
		 * evaluationIndividual,
		 * profilingIndividual);
		 * OWLObjectPropertyAssertionAxiom Evaluation_Produces_LegalEffect = factory.getOWLObjectPropertyAssertionAxiom(produces,
		 * evaluationIndividual,
		 * legalEffectIndividual);
		 * OWLObjectPropertyAssertionAxiom LegalEffect_Concerns_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(concerns,
		 * legalEffectIndividual,
		 * dataSubjectIndividual);
		 * OWLObjectPropertyAssertionAxiom MeasureToAddressRisk_CompliesTo_GDPR = factory.getOWLObjectPropertyAssertionAxiom(compliesTo,
		 * measureToAddressRiskIndividual, gdprIndividual);
		 * OWLObjectPropertyAssertionAxiom MeasureToAddressRisk_TakesIntoAccount_Rights =
		 * factory.getOWLObjectPropertyAssertionAxiom(takesIntoAccount,
		 * measureToAddressRiskIndividual, rightsIndividual);
		 * OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfData =
		 * factory.getOWLObjectPropertyAssertionAxiom(contains,
		 * measureToAddressRiskIndividual, mechanismsToEnsureProtectionOfDataIndividual);
		 * OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_Contains_Safeguard = factory.getOWLObjectPropertyAssertionAxiom(contains,
		 * measureToAddressRiskIndividual, safeguardIndividual);
		 * OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_Contains_SecurityMeasure =
		 * factory.getOWLObjectPropertyAssertionAxiom(contains,
		 * measureToAddressRiskIndividual, securityMeasureIndividual);
		 * OWLObjectPropertyAssertionAxiom MeasureToAddressRisks_TakesIntoAccount_PersonalInterest =
		 * factory.getOWLObjectPropertyAssertionAxiom(takesIntoAccount,
		 * measureToAddressRiskIndividual, personalInterestIndividual);
		 * OWLObjectPropertyAssertionAxiom PersonalData_IsPartOf_Evaluation = factory.getOWLObjectPropertyAssertionAxiom(isPartOf,
		 * personalDataIndividual,
		 * evaluationIndividual);
		 * OWLObjectPropertyAssertionAxiom PersonalData_RelatesTo_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(relatesTo,
		 * personalDataIndividual,
		 * dataSubjectIndividual);
		 * 
		 * OWLObjectPropertyAssertionAxiom Process_IsPerformed_AccordingToDataProtectionImpactAssessment = factory
		 * .getOWLObjectPropertyAssertionAxiom(isPerformedAccordingTo, processIndividual, dataProtectionImpactAssessmentIndividual);
		 * // OWLObjectPropertyAssertionAxiom Processor_Assesses_PurposeOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(assesses,
		 * // processorIndividual,
		 * // purposeOfProcessingIndividual);
		 * // OWLObjectPropertyAssertionAxiom Processor_Controls_Process = factory.getOWLObjectPropertyAssertionAxiom(controls,
		 * // processorIndividual,
		 * // processIndividual);
		 * // OWLObjectPropertyAssertionAxiom Processor_IsAuthorizedBy_MemberStateLaw =
		 * // factory.getOWLObjectPropertyAssertionAxiom(isAuthorizedBy,
		 * // processorIndividual, memberStateLawIndividual);
		 * // OWLObjectPropertyAssertionAxiom Processor_IsAuthorizedBy_UnionLaw = factory.getOWLObjectPropertyAssertionAxiom(isAuthorizedBy,
		 * // processorIndividual,
		 * // unionLawIndividual);
		 * // OWLObjectPropertyAssertionAxiom Processor_IsCompliantTo_ApprovedCodeOfConduct =
		 * // factory.getOWLObjectPropertyAssertionAxiom(isCompliantTo,
		 * // processorIndividual, approvedCodeOfConductIndividual);
		 * // OWLObjectPropertyAssertionAxiom Processor_SeeksViewOf_RepresentativeOfDataSubject =
		 * // factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf,
		 * // processorIndividual, representativeOfDataSubjectIndividual);
		 * // OWLObjectPropertyAssertionAxiom PurposeOfProcessing_IsLikelyToResultIn_Risk =
		 * // factory.getOWLObjectPropertyAssertionAxiom(isLikelyToResultIn,
		 * // purposeOfProcessingIndividual, riskIndividual);
		 * OWLObjectPropertyAssertionAxiom Review_Checks_Process = factory.getOWLObjectPropertyAssertionAxiom(checks, reviewIndividual,
		 * processIndividual);
		 * 
		 * // OWLObjectPropertyAssertionAxiom Risk_Changes = factory.getOWLObjectPropertyAssertionAxiom(changes, riskIndividual, null);
		 * // OWLObjectPropertyAssertionAxiom TechnologyOfProcessing_IsLikelyToResultIn_Risk =
		 * // factory.getOWLObjectPropertyAssertionAxiom(isLikelyToResultIn,
		 * // scopeIndividual, riskIndividual);
		 * // OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Applies_ConsistencyMechanism =
		 * // factory.getOWLObjectPropertyAssertionAxiom(applies,
		 * // supervisoryAuthorityIndividual, consistencymechanismIndividual);
		 * // OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Controls_Process = factory.getOWLObjectPropertyAssertionAxiom(controls,
		 * // supervisoryAuthorityIndividual, processIndividual);
		 * // OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Creates_ListOfProcessesThatDoNotNeedDPIA =
		 * // factory.getOWLObjectPropertyAssertionAxiom(creates,
		 * // supervisoryAuthorityIndividual, listWithProcessesThatDoNotNeedDpiaIndividual);
		 * // OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Creates_ListOfProcessesThatNeedDPIA =
		 * // factory.getOWLObjectPropertyAssertionAxiom(creates,
		 * // supervisoryAuthorityIndividual, listWithProcessesThatNeedDpiaIndividual);
		 * // OWLObjectPropertyAssertionAxiom SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotNeedDPIA =
		 * // factory.getOWLObjectPropertyAssertionAxiom(publishes,
		 * // supervisoryAuthorityIndividual, listWithProcessesThatDoNotNeedDpiaIndividual);
		 * // OWLObjectPropertyAssertionAxiom View_Respects_CommercialInterest = factory.getOWLObjectPropertyAssertionAxiom(respects,
		 * // viewIndividual,
		 * // commercialInterestIndividual);
		 * 
		 * // OWLObjectPropertyAssertionAxiom View_Respects_PublicInterest = factory.getOWLObjectPropertyAssertionAxiom(respects,
		 * // viewIndividual,
		 * // publicInterestIndividual);
		 * // OWLObjectPropertyAssertionAxiom View_Respects_SecurityOfProcessingOperation =
		 * // factory.getOWLObjectPropertyAssertionAxiom(respects, viewIndividual,
		 * // securityOfProcessingOperationIndividual);
		 * 
		 * // OWLObjectPropertyAssertionAxiom Processor_SeeksViewOf_DataSubject = factory.getOWLObjectPropertyAssertionAxiom(seeksViewOf,
		 * // processorIndividual,
		 * // dataSubjectIndividual);
		 * OWLObjectPropertyAssertionAxiom MeasureToAddressRisk_Contains_MechanismToEnsureProtectionOfData =
		 * factory.getOWLObjectPropertyAssertionAxiom(contains,
		 * measureToAddressRiskIndividual, mechanismsToEnsureProtectionOfDataIndividual);
		 * 
		 * OWLObjectPropertyAssertionAxiom Process_Has_DataProtectionImpactAssessment = factory.getOWLObjectPropertyAssertionAxiom(has,
		 * processIndividual,
		 * dataProtectionImpactAssessmentIndividual);
		 * OWLObjectPropertyAssertionAxiom Process_Has_Processing = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual,
		 * processingIndividual);
		 * OWLObjectPropertyAssertionAxiom Processing_Has_ContextOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(has,
		 * processIndividual,
		 * contextOfProcessingIndividual);
		 * OWLObjectPropertyAssertionAxiom Processing_Has_PurposeOfProcessing = factory.getOWLObjectPropertyAssertionAxiom(has,
		 * processIndividual,
		 * purposeOfProcessingIndividual);
		 * OWLObjectPropertyAssertionAxiom Processing_Has_Scope = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual,
		 * scopeIndividual);
		 * OWLObjectPropertyAssertionAxiom Processing_Has_Technology = factory.getOWLObjectPropertyAssertionAxiom(has, processingIndividual,
		 * technologyIndividual);
		 * // OWLObjectPropertyAssertionAxiom ContextOfProcessing_Has_Risk = factory.getOWLObjectPropertyAssertionAxiom(has,
		 * // contextOfProcessingIndividual,
		 * // riskIndividual);
		 * // OWLObjectPropertyAssertionAxiom PurposeOfProcessing_Has_Risk = factory.getOWLObjectPropertyAssertionAxiom(has,
		 * // purposeOfProcessingIndividual,
		 * // riskIndividual);
		 * // OWLObjectPropertyAssertionAxiom Scope_Has_Risk = factory.getOWLObjectPropertyAssertionAxiom(has, scopeIndividual,
		 * // riskIndividual);
		 * // OWLObjectPropertyAssertionAxiom Technology_Has_Risk = factory.getOWLObjectPropertyAssertionAxiom(has, technologyIndividual,
		 * // riskIndividual);
		 * OWLObjectPropertyAssertionAxiom Process_Has_Data = factory.getOWLObjectPropertyAssertionAxiom(has, processIndividual,
		 * dataIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_IsPartOf_Evaluation = factory.getOWLObjectPropertyAssertionAxiom(isPartOf, dataIndividual,
		 * evaluationIndividual);
		 * OWLObjectPropertyAssertionAxiom Data_Has_Monitoring = factory.getOWLObjectPropertyAssertionAxiom(has, dataIndividual,
		 * monitoringIndividual);
		 * // OWLObjectPropertyAssertionAxiom DataSubject_Has_View = factory.getOWLObjectPropertyAssertionAxiom(has, dataSubjectIndividual,
		 * // viewIndividual);
		 * OWLObjectPropertyAssertionAxiom ConsistencyMechanism_IsAppliedTo_Processing =
		 * factory.getOWLObjectPropertyAssertionAxiom(isAppliedTo,
		 * consistencymechanismIndividual, processingIndividual);
		 * OWLObjectPropertyAssertionAxiom ContextOfProcessing_Has_Activity = factory.getOWLObjectPropertyAssertionAxiom(has,
		 * contextOfProcessingIndividual,
		 * activityIndividual);
		 * 
		 * // OWLObjectPropertyAssertionAxiom Consistencymechanism_IsAppliedTo_Processing =
		 * // factory.getOWLObjectPropertyAssertionAxiom(isAppliedTo,
		 * // consistencymechanismIndividual, processingIndividual);
		 * // OWLObjectPropertyAssertionAxiom ContextOfProcessing_Has_Activity = factory.getOWLObjectPropertyAssertionAxiom(has,
		 * // contextOfProcessingIndividual,
		 * // activityIndividual);
		 

		
	 Set<OWLAxiom> axioms = new HashSet<OWLAxiom>();
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, consistency_Mechanism_IsAppliedTo_Processing_Individual, consistency_mechanismIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, consistency_Mechanism_IsAppliedTo_Processing_Individual, processingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, consistency_Mechanism_IsAppliedTo_Processing_Individual, isAppliedTo));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, contextOfProcessing_Affects_FreeMovementOfData_Individual, contextOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, contextOfProcessing_Affects_FreeMovementOfData_Individual, freeMovementOfDataIndividual ));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, contextOfProcessing_Affects_FreeMovementOfData_Individual, affects));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, contextOfProcessing_Has_Activity_Individual, contextOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, contextOfProcessing_Has_Activity_Individual, activityIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, contextOfProcessing_Has_Activity_Individual, affects));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, contextOfProcessing_Has_Risk_Individual, contextOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, contextOfProcessing_Has_Risk_Individual, riskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, contextOfProcessing_Has_Risk_Individual, has));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, contextOfProcessing_Involves_MonitoringOfDataInMemberstate_Individual, contextOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, contextOfProcessing_Involves_MonitoringOfDataInMemberstate_Individual, monitoringOfDataInMemberStateIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, contextOfProcessing_Involves_MonitoringOfDataInMemberstate_Individual, involves));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, contextOfProcessing_Involves_OfferingOfGood_Individual, contextOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, contextOfProcessing_Involves_OfferingOfGood_Individual, offeringOfGoodIndividual ));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, contextOfProcessing_Involves_OfferingOfGood_Individual, involves));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, contextOfProcessing_Involves_OfferingOfServices_Individual, contextOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, contextOfProcessing_Involves_OfferingOfServices_Individual, offeringOfServicesIndividual);
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, contextOfProcessing_Involves_OfferingOfServices_Individual, involves));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, contextOfProcessing_IsLikelyToResultIn_Risk_Individual, contextOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, contextOfProcessing_IsLikelyToResultIn_Risk_Individual, riskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, contextOfProcessing_IsLikelyToResultIn_Risk_Individual, isLikelyToResultIn));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, controller_Assesses_PurposeOfProcessing_Individual, controllerIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, controller_Assesses_PurposeOfProcessing_Individual, purposeOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, controller_Assesses_PurposeOfProcessing_Individual, assesses));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, controller_CarriesOut_Review_Individual, controllerIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, controller_CarriesOut_Review_Individual , reviewIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, controller_CarriesOut_Review_Individual, carriesOut));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, controller_Creates_DataProtectionImpactAssessment_Individual, controllerIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, controller_Creates_DataProtectionImpactAssessment_Individual, dataProtectionImpactAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, controller_Creates_DataProtectionImpactAssessment_Individual, creates));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, controller_IsCompliantWith_ApprovedCodeOfConduct_Individual, controllerIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, controller_IsCompliantWith_ApprovedCodeOfConduct_Individual, approvedCodeOfConductIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, controller_IsCompliantWith_ApprovedCodeOfConduct_Individual, isCompliantWith));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, controller_SeeksAdviceOf_DataProtectionOfficer_Individual, controllerIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, controller_SeeksAdviceOf_DataProtectionOfficer_Individual, dataProtectionOfficerIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, controller_SeeksAdviceOf_DataProtectionOfficer_Individual, seeksAdviceOf));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, controller_SeeksViewOf_DataSubject_Individual, controllerIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, controller_SeeksViewOf_DataSubject_Individual, dataSubjectIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, controller_SeeksViewOf_DataSubject_Individual, seeksViewOf));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, controller_SeeksViewOf_RepresentativeOfDataSubject_Individual, controllerIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, controller_SeeksViewOf_RepresentativeOfDataSubject_Individual, representativeOfDataSubject_Individual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, controller_SeeksViewOf_RepresentativeOfDataSubject_Individual, seeksViewOf));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, creationDate_OccursBefore_FirstProcessingDate_Individual, creationDateIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, creationDate_OccursBefore_FirstProcessingDate_Individual, firstProcessingDateIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, creationDate_OccursBefore_FirstProcessingDate_Individual, occursBefore));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_Contains_BiometricData_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_Contains_BiometricData_Individual, biometricDataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_Contains_BiometricData_Individual, contains));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_Contains_GeneticData_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_Contains_GeneticData_Individual, geneticDataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_Contains_GeneticData_Individual, contains));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_Has_Monitoring_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_Has_Monitoring_Individual, monitoringIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_Has_Monitoring_Individual, has));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_IsMonitoredIn_PublicArea_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_IsMonitoredIn_PublicArea_Individual, publicAreaIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_IsMonitoredIn_PublicArea_Individual, isMonitoredIn));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_IsPartOf_Evaluation_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_IsPartOf_Evaluation_Individual, evaluationIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_IsPartOf_Evaluation_Individual, isPartOf));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RelatesTo_CriminalConviction_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RelatesTo_CriminalConviction_Individual, criminalConvictioIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RelatesTo_CriminalConviction_Individual, relatesTo));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RelatesTo_CriminalOffense_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RelatesTo_CriminalOffense_Individual, criminalOffenseIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RelatesTo_CriminalOffense_Individual, relatesTo));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RelatesTo_DataSubject_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RelatesTo_DataSubject_Individual, dataSubjectIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RelatesTo_DataSubject_Individual, relatesTo));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RelatesTo_SecurityMeasure_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RelatesTo_SecurityMeasure_Individual, securityMeasureIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RelatesTo_SecurityMeasure_Individual, relatesTo));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RevealsInformationAbout_EthnicOrigin_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RevealsInformationAbout_EthnicOrigin_Individual, ethnicOriginIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RevealsInformationAbout_EthnicOrigin_Individual, revealsInformationAbout));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RevealsInformationAbout_Health_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RevealsInformationAbout_Health_Individual, healthIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RevealsInformationAbout_Health_Individual, revealsInformationAbout));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RevealsInformationAbout_PhilosophicalBelief_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RevealsInformationAbout_PhilosophicalBelief_Individual, philosophicalBeliefIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RevealsInformationAbout_PhilosophicalBelief_Individual, revealsInformationAbout));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RevealsInformationAbout_PoliticalOpinion_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RevealsInformationAbout_PoliticalOpinion_Individual, politicalOpinionIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RevealsInformationAbout_PoliticalOpinion_Individual, revealsInformationAbout));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RevealsInformationAbout_RacialOrigin_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RevealsInformationAbout_RacialOrigin_Individual, racialOriginIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RevealsInformationAbout_RacialOrigin_Individual, revealsInformationAbout));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RevealsInformationAbout_ReligiousBelief_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RevealsInformationAbout_ReligiousBelief_Individual, religiousBeliefIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RevealsInformationAbout_ReligiousBelief_Individual, revealsInformationAbout));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RevealsInformationAbout_SexLife_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RevealsInformationAbout_SexLife_Individual, sexLifenIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RevealsInformationAbout_SexLife_Individual, revealsInformationAbout));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RevealsInformationAbout_SexualOrientation_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RevealsInformationAbout_SexualOrientation_Individual, sexualOrientationIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RevealsInformationAbout_SexualOrientation_Individual, revealsInformationAbout));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, data_RevealsInformationAbout_TradeUnionMembership_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, data_RevealsInformationAbout_TradeUnionMembership_Individual, tradeUnionMembershipIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, data_RevealsInformationAbout_TradeUnionMembership_Individual, revealsInformationAbout));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, dataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing_Individual, dataProtectionImpactAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, dataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing_Individual, assessmentOfNecessityOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, dataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing_Individual, contains));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, dataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing_Individual, dataProtectionImpactAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, dataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing_Individual, assessmentOfProportionalityOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, dataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing_Individual, contains));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, dataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms_Individual, dataProtectionImpactAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, dataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms_Individual, assessmentOfRisksToRightsAndFreedomsIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, dataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms_Individual, contains));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, dataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing_Individual, dataProtectionImpactAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, dataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing_Individual, legitimateInterestOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, dataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing_Individual, contains));
		 
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, dataProtectionImpactAssessment_Contains_MeasureToAddressRisks_Individual, dataProtectionImpactAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, dataProtectionImpactAssessment_Contains_MeasureToAddressRisks_Individual, measureToAddressRisksIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, dataProtectionImpactAssessment_Contains_MeasureToAddressRisks_Individual, contains));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, dataProtectionImpactAssessment_Contains_PurposeOfProcessing_Individual, dataProtectionImpactAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, dataProtectionImpactAssessment_Contains_PurposeOfProcessing_Individual, purposeOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, dataProtectionImpactAssessment_Contains_PurposeOfProcessing_Individual, contains));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, dataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing_Individual, dataProtectionImpactAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, dataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing_Individual, SystematicDescriptionOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, dataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing_Individual, contains));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, dataProtectionOfficer_IsDesignated_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, dataProtectionOfficer_IsDesignated_Individual, null));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, dataProtectionOfficer_IsDesignated_Individual, isDesignated));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, dataSubject_Has_View_Individual, dataSubjectIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, dataSubject_Has_View_Individual, viewIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, dataSubject_Has_View_Individual, has));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, europeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessment_Individual, europeanDataProtectionBoardIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, europeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessment_Individual, listOfProcessesThatDoNotRequireAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, europeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessment_Individual, receives));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, europeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessment_Individual, europeanDataProtectionBoardIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, europeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessment_Individual, listOfProcessesThatRequireAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, europeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessment_Individual, receives));
		 
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, evaluation_BasesOn_AutomatedProcessing_Individual, evaluationIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, evaluation_BasesOn_AutomatedProcessing_Individual, automatedProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, evaluation_BasesOn_AutomatedProcessing_Individual, basesOn));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, evaluation_BasesOn_Profiling_Individual, evaluationIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, evaluation_BasesOn_Profiling_Individual, profilingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, evaluation_BasesOn_Profiling_Individual, basesOn));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, evaluation_Produces_LegalEffect_Individual, evaluationIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, evaluation_Produces_LegalEffect_Individual, legalEffectIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Evaluation_Produces_LegalEffect_Individual, produces));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, legalEffect_Concerns_DataSubject_Individual, legalEffectIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, legalEffect_Concerns_DataSubject_Individual, dataSubjectIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, legalEffect_Concerns_DataSubject_Individual, concerns));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, measureToAddressRisk_CompliesTo_GDPR_Individual, measureToAddressRiskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, measureToAddressRisk_CompliesTo_GDPR_Individual, gdprIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, measureToAddressRisk_CompliesTo_GDPR_Individual, compliesTo));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, measureToAddressRisk_TakesIntoAccount_Rights_Individual, measureToAddressRiskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, measureToAddressRisk_TakesIntoAccount_Rights_Individual, rightsIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, measureToAddressRisk_TakesIntoAccount_Rights_Individual, takesIntoAccount));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, measureToAddressRisk_Contains_MechanismToEnsureProtectionOfData_Individual, measureToAddressRiskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, measureToAddressRisk_Contains_MechanismToEnsureProtectionOfData_Individual, mechanismToEnsureProtectionOfDataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, measureToAddressRisk_Contains_MechanismToEnsureProtectionOfData_Individual, contains));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, measureToAddressRisk_Contains_Safeguard_Individual, measureToAddressRiskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, measureToAddressRisk_Contains_Safeguard_Individual, safeguardIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, measureToAddressRisk_Contains_Safeguard_Individual, contains));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, measureToAddressRisk_Contains_SecurityMeasure_Individual, measureToAddressRiskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, measureToAddressRisk_Contains_SecurityMeasure_Individual, securityMeasureIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, measureToAddressRisk_Contains_SecurityMeasure_Individual, contains));
		
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, personalData_IsPartOf_Evaluation_Individual, personalDataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, personalData_IsPartOf_Evaluation_Individual, evaluationIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, personalData_IsPartOf_Evaluation_Individual, isPartOf));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, process_Has_Data_Individual, processIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, process_Has_Data_Individual, dataIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, process_Has_Data_Individual, has));

		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, process_Has_DataProtectionImpactAssessment_Individual, processIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, process_Has_DataProtectionImpactAssessment_Individual, dataProtectionImpactAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, process_Has_DataProtectionImpactAssessment_Individual, has));

		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, process_Has_Processing_Individual, processIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, process_Has_Processing_Individual, processingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, process_Has_Processing_Individual, has));

		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, process_IsPerformedAccordingTo_DataProtectionImpactAssessment_Individual, processIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, process_IsPerformedAccordingTo_DataProtectionImpactAssessment_Individual, dataProtectionImpactAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, process_IsPerformedAccordingTo_DataProtectionImpactAssessment_Individual, isPerformedAccordingTo));

		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, processing_Has_ContextOfProcessing_Individual, processingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, processing_Has_ContextOfProcessing_Individual, contextOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, processing_Has_ContextOfProcessing_Individual, has));

		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, processing_Has_PurposeOfProcessing_Individual, processingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, processing_Has_PurposeOfProcessing_Individual, purposeOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, processing_Has_PurposeOfProcessing_Individual, has));

		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, processing_Has_Scope_Individual, processingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, processing_Has_Scope_Individual, scopeIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, processing_Has_Scope_Individual, has));

		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, processing_Has_Technology_Individual, processingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, processing_Has_Technology_Individual, technologyIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, processing_Has_Technology_Individual, has));
		 
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, processor_Assesses_PurposeOfProcessing_Individual, processorIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, processor_Assesses_PurposeOfProcessing_Individual, purposeOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, processor_Assesses_PurposeOfProcessing_Individual, assesses));

		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, processor_Controls_Process_Individual, processorIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, processor_Controls_Process_Individual, processIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, processor_Controls_Process_Individual, controls));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, processor_IsAuthorizedBy_MemberStatelaw_Individual, processorIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, processor_IsAuthorizedBy_MemberStatelaw_Individual, memberStatelawIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, processor_IsAuthorizedBy_MemberStatelaw_Individual, isAuthorizedBy));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, processor_IsAuthorizedBy_Unionlaw_Individual, processorIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, processor_IsAuthorizedBy_Unionlaw_Individual, unionlawIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, processor_IsAuthorizedBy_Unionlaw_Individual, isAuthorizedBy));
		 
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, processor_IsCompliantWith_ApprovedCodeOfConduct_Individual, processorIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, processor_IsCompliantWith_ApprovedCodeOfConduct_Individual, approvedCodeOfConductIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, processor_IsCompliantWith_ApprovedCodeOfConduct_Individual, isCompliantWith));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, processor_SeeksViewOf_DataSubject_Individual, processorIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, processor_SeeksViewOf_DataSubject_Individual, dataSubjectIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, processor_SeeksViewOf_DataSubject_Individual, seeksViewOf));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, processor_SeeksViewOf_RepresentativeOfDataSubject_Individual, processorIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, processor_SeeksViewOf_RepresentativeOfDataSubject_Individual, representativeOfDataSubjectIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, processor_SeeksViewOf_RepresentativeOfDataSubject_Individual, seeksViewOf));
		 
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, purposeOfProcessing_Has_Risk_Individual, purposeOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, purposeOfProcessing_Has_Risk_Individual, riskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, purposeOfProcessing_Has_Risk_Individual, has));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, purposeOfProcessing_IsLikelyToResultIn_Risk_Individual, purposeOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, purposeOfProcessing_IsLikelyToResultIn_Risk_Individual, riskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, purposeOfProcessing_IsLikelyToResultIn_Risk_Individual, isLikelyToResultIn));
		 
		 
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, review_Checks_Process_Individual, reviewIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, review_Checks_Process_Individual, processIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, review_Checks_Process_Individual, checks));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, risk_Changes_Individual, riskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, risk_Changes_Individual, null));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, risk_Changes_Individual, changes));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, scope_Has_Risk_Individual, scopeIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, scope_Has_Risk_Individual, riskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, scope_Has_Risk_Individual, has));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, scopeOfProcessing_IsLikelyToResultIn_RiskIndividual, scopeOfProcessingIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, scopeOfProcessing_IsLikelyToResultIn_RiskIndividual, riskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, scopeOfProcessing_IsLikelyToResultIn_RiskIndividual, isLikelyToResultIn));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, supervisoryAuthority_Applies_ConsistencyMechanism_Individual, supervisoryAuthorityIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, supervisoryAuthority_Applies_ConsistencyMechanism_Individual, consistencyMechanismIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, supervisoryAuthority_Applies_ConsistencyMechanism_Individual, applies));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, supervisoryAuthority_Controls_Process_Individual, supervisoryAuthorityIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, supervisoryAuthority_Controls_Process_Individual, processIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, supervisoryAuthority_Controls_ProcessMechanism_Individual, controls));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, supervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment_Individual, supervisoryAuthorityIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, supervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment_Individual, listOfProcessesThatDoNotRequireAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, supervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment_Individual, creates));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, supervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment_Individual, supervisoryAuthorityIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, supervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment_Individual, listOfProcessesThatRequireAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, supervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment_Individual, creates));

		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, supervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessment_Individual, supervisoryAuthorityIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, supervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessment_Individual, listOfProcessesThatDoNotRequireAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, supervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessment_Individual, publishes));

		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, supervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessment_Individual, supervisoryAuthorityIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, supervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessment_Individual, listOfProcessesThatDoNotRequireAssessmentIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, supervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessment_Individual, publishes));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, technology_Has_Risk_Individual, technologyIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, technology_Has_Risk_Individual, riskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, technology_Has_Risk_Individual, has));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, technologyOfProcessing_IsLikelyToResultIn_Risk_Individual, technologyIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, technologyOfProcessing_IsLikelyToResultIn_Risk_Individual, riskIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, technologyOfProcessing_IsLikelyToResultIn_Risk_Individual, isLikelyToResultIn));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, view_Respects_CommercialInterest_Individual, viewIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, view_Respects_CommercialInterest_Individual, commercialInterestIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, view_Respects_CommercialInterest_Individual, respects));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, view_Respects_PublicInterest_Individual, viewIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, view_Respects_PublicInterest_Individual, publicInterestIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, view_Respects_PublicInterest_Individual, respects));
		 
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, view_Respects_SecurityOfProcessingOperation_Individual, viewIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, view_Respects_SecurityOfProcessingOperation_Individual, securityOfProcessingOperationIndividual));
		 axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, view_Respects_SecurityOfProcessingOperation_Individual, respects));
		 
		 manager.addAxioms(onto, axioms);
		 
		// save changes to Ontology
		OurOntology.saveOntology(onto);
	}

	public boolean compareDates(String creationDate, String processingDate) {
		boolean creationBeforeProcessing = false;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date dCreationDate = sdf.parse(creationDate);
			Date dProcessingDate = sdf.parse(processingDate);
			creationBeforeProcessing = dCreationDate.before(dProcessingDate);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return creationBeforeProcessing;
	}
}
