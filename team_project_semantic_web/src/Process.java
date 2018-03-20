package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.json.simple.JSONObject;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
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

		String processName = json.get("process").toString();
		String processId = json.get("processId").toString();
		/**
		 * reference to OWL Class Factors
		 */
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

		/**
		 * Reference to OWL Class deontic conditions
		 */
		OWLClass rule1_deontic = factory.getOWLClass(RuleName.Rule1_Deontic.getPath());
		OWLClass rule2_deontic = factory.getOWLClass(RuleName.Rule2_Deontic.getPath());
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

		OWLClass rule1_condition1 = factory.getOWLClass(RuleName.Rule1_Condition1.getPath());
		OWLClass rule1_condition2 = factory.getOWLClass(RuleName.Rule1_Condition2.getPath());
		OWLClass rule1_condition3 = factory.getOWLClass(RuleName.Rule1_Condition3.getPath());
		OWLClass rule1_condition4 = factory.getOWLClass(RuleName.Rule1_Condition4.getPath());
		OWLClass rule3_condition1 = factory.getOWLClass(RuleName.Rule3_Condition1.getPath());
		OWLClass rule4_condition1 = factory.getOWLClass(RuleName.Rule4_Condition1.getPath());
		OWLClass rule4_condition2 = factory.getOWLClass(RuleName.Rule4_Condition2.getPath());
		OWLClass rule4_condition3 = factory.getOWLClass(RuleName.Rule4_Condition3.getPath());
		OWLClass rule4_condition4 = factory.getOWLClass(RuleName.Rule4_Condition4.getPath());
		OWLClass rule4_condition5 = factory.getOWLClass(RuleName.Rule4_Condition5.getPath());
		OWLClass rule4_condition6 = factory.getOWLClass(RuleName.Rule4_Condition6.getPath());
		OWLClass rule5_condition1 = factory.getOWLClass(RuleName.Rule5_Condition1.getPath());
		OWLClass rule5_condition2 = factory.getOWLClass(RuleName.Rule5_Condition2.getPath());
		OWLClass rule7_condition1 = factory.getOWLClass(RuleName.Rule7_Condition1.getPath());
		OWLClass rule8_condition1 = factory.getOWLClass(RuleName.Rule8_Condition1.getPath());
		OWLClass rule9_condition1 = factory.getOWLClass(RuleName.Rule9_Condition1.getPath());
		OWLClass rule9_condition2 = factory.getOWLClass(RuleName.Rule9_Condition2.getPath());
		OWLClass rule9_condition3 = factory.getOWLClass(RuleName.Rule9_Condition3.getPath());
		OWLClass rule10_condition1 = factory.getOWLClass(RuleName.Rule10_Condition1.getPath());
		OWLClass rule12_condition1 = factory.getOWLClass(RuleName.Rule12_Condition1.getPath());
		OWLClass rule13_condition1 = factory.getOWLClass(RuleName.Rule13_Condition1.getPath());
		OWLClass rule15_condition1 = factory.getOWLClass(RuleName.Rule15_Condition1.getPath());
		OWLClass rule18_condition1 = factory.getOWLClass(RuleName.Rule18_Condition1.getPath());
		OWLClass rule18_condition2 = factory.getOWLClass(RuleName.Rule18_Condition2.getPath());
		OWLClass rule18_condition3 = factory.getOWLClass(RuleName.Rule18_Condition3.getPath());
		OWLClass rule18_condition4 = factory.getOWLClass(RuleName.Rule18_Condition4.getPath());
		OWLClass rule18_condition5 = factory.getOWLClass(RuleName.Rule18_Condition5.getPath());
		OWLClass rule18_condition6 = factory.getOWLClass(RuleName.Rule18_Condition6.getPath());
		OWLClass rule18_condition7 = factory.getOWLClass(RuleName.Rule18_Condition7.getPath());
		OWLClass rule18_condition8 = factory.getOWLClass(RuleName.Rule18_Condition8.getPath());
		OWLClass rule18_condition9 = factory.getOWLClass(RuleName.Rule18_Condition9.getPath());
		OWLClass rule18_condition10 = factory.getOWLClass(RuleName.Rule18_Condition10.getPath());
		OWLClass rule20_condition1 = factory.getOWLClass(RuleName.Rule20_Condition1.getPath());
		OWLClass rule22_Condition1 = factory.getOWLClass(RuleName.Rule22_Condition1.getPath());
		OWLClass rule23_condition1 = factory.getOWLClass(RuleName.Rule23_Condition1.getPath());
		OWLClass rule24_condition1 = factory.getOWLClass(RuleName.Rule24_Condition1.getPath());
		OWLClass rule24_condition2 = factory.getOWLClass(RuleName.Rule24_Condition2.getPath());
		OWLClass rule24_condition3 = factory.getOWLClass(RuleName.Rule24_Condition3.getPath());
		OWLClass rule24_condition4 = factory.getOWLClass(RuleName.Rule24_Condition4.getPath());
		OWLClass rule241_condition1 = factory.getOWLClass(RuleName.Rule241_Condition1.getPath());
		OWLClass rule26_Condition1 = factory.getOWLClass(RuleName.Rule26_Condition1.getPath());
		OWLClass rule26_Condition2 = factory.getOWLClass(RuleName.Rule26_Condition2.getPath());
		OWLClass rule26_Condition3 = factory.getOWLClass(RuleName.Rule26_Condition3.getPath());
		OWLClass rule26_Condition4 = factory.getOWLClass(RuleName.Rule26_Condition4.getPath());
		OWLClass rule26_Condition5 = factory.getOWLClass(RuleName.Rule26_Condition5.getPath());
		OWLClass rule26_Condition6 = factory.getOWLClass(RuleName.Rule26_Condition6.getPath());
		OWLClass rule26_Condition7 = factory.getOWLClass(RuleName.Rule26_Condition7.getPath());
		OWLClass rule26_Condition8 = factory.getOWLClass(RuleName.Rule26_Condition8.getPath());
		OWLClass rule26_Condition9 = factory.getOWLClass(RuleName.Rule26_Condition9.getPath());
		OWLClass rule26_Condition10 = factory.getOWLClass(RuleName.Rule26_Condition10.getPath());
		OWLClass rule26_Condition11 = factory.getOWLClass(RuleName.Rule26_Condition11.getPath());
		OWLClass rule21_condition1 = factory.getOWLClass(RuleName.Rule21_Condition1.getPath());
		OWLClass rule21_condition2 = factory.getOWLClass(RuleName.Rule21_Condition2.getPath());
		OWLClass rule16_condition1 = factory.getOWLClass(RuleName.Rule16_Condition1.getPath());
		OWLClass rule16_condition2 = factory.getOWLClass(RuleName.Rule16_Condition2.getPath());
		OWLClass rule16_condition3 = factory.getOWLClass(RuleName.Rule16_Condition3.getPath());

		/**
		 * reference to OWL Class Verbconcepts
		 */
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
		OWLClass processor_IsCompliantWith_ApprovedCodeOfConduct = factory
				.getOWLClass(VerbConceptNames.Processor_IsCompliantWith_ApprovedCodeOfConduct.getPath());
		OWLClass processor_SeeksViewOf_DataSubject = factory.getOWLClass(VerbConceptNames.Processor_SeeksViewOf_DataSubject.getPath());
		OWLClass processor_SeeksViewOf_RepresentativeOfDataSubject = factory
				.getOWLClass(VerbConceptNames.Processor_SeeksViewOf_RepresentativeOfDataSubject.getPath());
		OWLClass purposeOfProcessing_Has_Risk = factory.getOWLClass(VerbConceptNames.PurposeOfProcessing_Has_Risk.getPath());
		OWLClass purposeOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLClass(VerbConceptNames.PurposeOfProcessing_IsLikelyToResultIn_Risk.getPath());
		OWLClass review_Checks_Process = factory.getOWLClass(VerbConceptNames.Review_Checks_Process.getPath());
		OWLClass risk_Changes = factory.getOWLClass(VerbConceptNames.Risk_Changes.getPath());
		OWLClass scope_Has_Risk = factory.getOWLClass(VerbConceptNames.Scope_Has_Risk.getPath());
		OWLClass scopeOfProcessing_IsLikelyToResultIn_Risk = factory.getOWLClass(VerbConceptNames.ScopeOfProcessing_IsLikelyToResultIn_Risk.getPath());
		OWLClass supervisoryAuthority_Applies_ConsistencyMechanism = factory
				.getOWLClass(VerbConceptNames.SupervisoryAuthority_Applies_ConsistencyMechanism.getPath());
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
		OWLClass technologyOfProcessing_IsLikelyToResultIn_Risk = factory
				.getOWLClass(VerbConceptNames.TechnologyOfProcessing_IsLikelyToResultIn_Risk.getPath());
		OWLClass view_Respects_CommercialInterest = factory.getOWLClass(VerbConceptNames.View_Respects_CommercialInterest.getPath());
		OWLClass view_Respects_PublicInterest = factory.getOWLClass(VerbConceptNames.View_Respects_PublicInterest.getPath());
		OWLClass view_Respects_SecurityOfProcessingOperation = factory.getOWLClass(VerbConceptNames.View_Respects_SecurityOfProcessingOperation.getPath());
		OWLClass EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessment = factory
				.getOWLClass(VerbConceptNames.EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessment.getPath());
		OWLClass EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessment = factory
				.getOWLClass(VerbConceptNames.EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessment.getPath());
		OWLClass evaluation_BasesOn_AutomatedProcessing = factory.getOWLClass(VerbConceptNames.Evaluation_BasesOn_AutomatedProcessing.getPath());
		OWLClass processing_Has_PurposeOfProcessing = factory.getOWLClass(VerbConceptNames.Processing_Has_PurposeOfProcessing.getPath());
		/**
		 * create Individuals of Factors
		 */
		String approvedCodeOfConductProcessorString = json.get("processorAppliedApprovedCodeOfConduct").toString();
		ArrayList<OWLIndividual> approvedCodeOfConductProcessorIndividuals = new ArrayList<OWLIndividual>();
		String[] approvedCodeOfCoductInformationProcessor = approvedCodeOfConductProcessorString.split(";");
		for (int i = 0; i < approvedCodeOfCoductInformationProcessor.length; i++) {
			OWLIndividual approvedCodeOfConductIndividual = factory
					.getOWLNamedIndividual(IRI.create(ontologyIRI + approvedCodeOfCoductInformationProcessor[i]));
			approvedCodeOfConductProcessorIndividuals.add(approvedCodeOfConductIndividual);
			AddAxiom add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(approvedCodeOfConduct,
					approvedCodeOfConductIndividual));
			manager.applyChange(add);
		}

		String processorString = json.get("nameOfProcessor").toString();
		ArrayList<OWLIndividual> processorIndividuals = new ArrayList<OWLIndividual>();
		String[] processorInformation = processorString.split(";");
		for (int i = 0; i < processorInformation.length; i++) {
			OWLIndividual processorIndividual = factory
					.getOWLNamedIndividual(IRI.create(ontologyIRI + processorInformation[i]));
			processorIndividuals.add(processorIndividual);
			AddAxiom add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processor, processorIndividual));
			manager.applyChange(add);
		}

		OWLIndividual approvedCodeOfConductControllerIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("controllerAppliedApprovedCodeOfConduct").toString()));
		OWLIndividual controllerIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameOfController").toString()));
		OWLIndividual assessmentOfNecessityOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("assessmentOfNecessity").toString()));
		OWLIndividual assessmentOfProportionalityOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("assessmentOfProportionality").toString()));
		OWLIndividual assessmentOfRisksToRightsAndFreedomsIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("assessmentOfRisks").toString()));
		OWLIndividual automatedProcessingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("automatedProcessing").toString()));
		OWLIndividual biometricDataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("biometricData").toString()));
		OWLIndividual riskToCommercialInterestIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("riskOfPersonsViewToCommercialInterest").toString()));
		OWLIndividual consistencymechanismIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "consistencyMechanism"));
		OWLIndividual contextOfProcessingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("contentOfProcessing").toString()));
		OWLIndividual creationDateIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("dpiaCreationDate").toString()));
		OWLIndividual criminalConvictionIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("criminalConviction").toString()));
		OWLIndividual criminalOffenseIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("criminalOffense").toString()));
		OWLIndividual dataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "data"));
		OWLIndividual dataProtectionImpactAssessmentIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("dpiaName").toString()));
		OWLIndividual dataProtectionOfficerIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameDataProtectionOfficer").toString()));
		OWLIndividual dataSubjectIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "dataSubject"));
		OWLIndividual ethnicOriginIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("ethnicOrigin").toString()));
		OWLIndividual evaluationIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("evaluation").toString()));
		OWLIndividual firstProcessingDateIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("firstProcessingDate").toString()));
		OWLIndividual freeMovementOfDataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("freeMovementOfData").toString()));
		OWLIndividual gdprIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "gdprIndividual"));
		OWLIndividual geneticDataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("geneticData").toString()));
		OWLIndividual healthIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("health").toString()));
		OWLIndividual legalEffectIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("legalEffect").toString()));
		OWLIndividual legitimateInterestOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("legitimateInterestOfProcessing").toString()));
		OWLIndividual listWithProcessesThatDoNotNeedDpiaIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameOfListwithAllProcessesThatDoNotNeedDpia").toString()));
		OWLIndividual listWithProcessesThatNeedDpiaIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameOfListWithAllProcessesThatNeedDpia").toString()));
		OWLIndividual measureToAddressRiskIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("measureToAddressRisksDpia").toString()));
		OWLIndividual mechanismsToEnsureProtectionOfDataIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("mechanismsToEnsureProtectionOfData").toString()));
		OWLIndividual memberStateLawIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("memberstatelaw").toString()));
		OWLIndividual monitoringOfDataInMemberstateIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("monitoringBehaviorInMemberstate").toString()));
		OWLIndividual offeringOfGoodsIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("offeringOfGoods").toString()));
		OWLIndividual offeringOfServicesIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("offeringOfServices").toString()));
		OWLIndividual personalDataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "personalData"));
		OWLIndividual philosophicalBeliefIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("philosophicalBelief").toString()));
		OWLIndividual politicalOpinionIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("politicalOpinion").toString()));
		OWLIndividual processIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("process").toString()));
		OWLIndividual profilingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("profiling").toString()));
		OWLIndividual publicAreaIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameOfPublicAreaWhereDataWasMonitored").toString()));
		OWLIndividual riskToPublicInterestIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("riskOfPersonsViewToPublicInterest").toString()));
		OWLIndividual purposeOfProcessingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("purposeOfProcessing").toString()));
		OWLIndividual racialOriginIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("racialOrigin").toString()));
		OWLIndividual religiousBeliefIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("religiousBelief").toString()));
		OWLIndividual reviewIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("review").toString()));
		OWLIndividual rightsIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "rightsIndividual"));
		OWLIndividual riskOfContextIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("riskRelatedToContent").toString()));
		OWLIndividual riskOfPurposeIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("riskRelatedToPurpose").toString()));
		OWLIndividual riskOfTechnologyIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("riskRelatedToTechnology").toString()));
		OWLIndividual riskOfScopeIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("riskRelatedToScope").toString()));
		OWLIndividual safeguardIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("safeguard").toString()));
		OWLIndividual scopeIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("scopeOfProcessing").toString()));
		OWLIndividual securityMeasureIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("securityMeasure").toString()));
		OWLIndividual riskToSecurityOfProcessingOperationIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("riskOfPersonsViewToSecurityOfProcessing").toString()));
		OWLIndividual sexLifeIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("sexLife").toString()));
		OWLIndividual sexualOrientationIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("sexualOrientation").toString()));
		OWLIndividual supervisoryAuthorityCriminalConvictionIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameOfSupervisoryAuthorityThatControlsProcessCriminalConviction").toString()));
		OWLIndividual supervisoryAuthorityCriminalOffensiveIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameOfSupervisoryAuthorityThatControlsProcessCriminalOffense").toString()));
		OWLIndividual supervisoryAuthorityListNeedDPIAIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameSupervisoryAuthotityThatCreatedListDpia").toString()));
		OWLIndividual supervisoryAuthorityListNoDPIAIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameSupervisoryAuthorityThatCreatedListNoDpia").toString()));
		OWLIndividual supervisoryAuthorityThatAppliedConsistencyMechanismIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI +
						json.get("nameSupervisoryAuthorityThatAppliedConsistencyMechanism").toString()));
		OWLIndividual supervisoryAuthorityThatControlsProcessIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameSupervisoryAuthorityThatControlsProcess").toString()));
		OWLIndividual systematicDescriptionOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("systematicDescriptionOfProcessing").toString()));
		OWLIndividual technologyIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("technologyOfProcessing").toString()));
		OWLIndividual tradeUnionMembershipIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("tradeUnionMembership").toString()));
		OWLIndividual viewDataSubjectIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("viewOfPerson").toString()));
		OWLIndividual europeanDataProtectionBoardIndividual = factory.getOWLNamedIndividual(ClassName.european_data_protection_board.getPath());
		OWLIndividual unionLawIndividual = factory.getOWLNamedIndividual(ClassName.union_law.getPath());
		OWLIndividual processingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "processing"));
		// OWLIndividual monitoringIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		// OWLIndividual activityIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));

		/**
		 * assert Factor Individuals to OWL Class
		 */
		AddAxiom add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(approvedCodeOfConduct,
				approvedCodeOfConductControllerIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(assessmentOfNecessityOfProcessing,
				assessmentOfNecessityOfProcessingIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory
				.getOWLClassAssertionAxiom(assessmentOfProportionalityOfProcessing, assessmentOfProportionalityOfProcessingIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(assessmentOfRisksToRightsAndFreedoms,
				assessmentOfRisksToRightsAndFreedomsIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(automatedProcessing, automatedProcessingIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(biometricData, biometricDataIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(commercialInterest, riskToCommercialInterestIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(consistencymechanism, consistencymechanismIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(contextOfProcessing, contextOfProcessingIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(controller, controllerIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(creationDate, creationDateIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(criminalConviction, criminalConvictionIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(criminalOffense, criminalOffenseIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(data, dataIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(dataProtectionImpactAssessment,
				dataProtectionImpactAssessmentIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(dataProtectionOfficer, dataProtectionOfficerIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(dataSubject, dataSubjectIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(ethnicOrigin, ethnicOriginIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(evaluation, evaluationIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(firstProcessingDate, firstProcessingDateIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(freeMovementOfData, freeMovementOfDataIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(gdpr, gdprIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(geneticData, geneticDataIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(health, healthIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(legalEffect, legalEffectIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(legitimateInterestOfProcessing,
				legitimateInterestOfProcessingIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(listWithProcessesThatDoNotNeedDpia,
				listWithProcessesThatDoNotNeedDpiaIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(listWithProcessesThatNeedDpia,
				listWithProcessesThatNeedDpiaIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(measureToAddressRisk, measureToAddressRiskIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(mechanismsToEnsureProtectionOfData,
				mechanismsToEnsureProtectionOfDataIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(memberStateLaw, memberStateLawIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(monitoringOfDataInMemberstate,
				monitoringOfDataInMemberstateIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(offeringOfGoods, offeringOfGoodsIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(offeringOfServices, offeringOfServicesIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(personalData, personalDataIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(philosophicalBelief, philosophicalBeliefIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(politicalOpinion, politicalOpinionIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(process, processIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(profiling, profilingIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(publicArea, publicAreaIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(publicInterest, riskToPublicInterestIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(purposeOfProcessing, purposeOfProcessingIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(racialOrigin, racialOriginIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(religiousBelief, religiousBeliefIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(review, reviewIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(rights, rightsIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(risk, riskOfContextIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(risk, riskOfPurposeIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(risk, riskOfScopeIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(risk, riskOfTechnologyIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(safeguard, safeguardIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(scopeOfProcessing, scopeIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(securityMeasure, securityMeasureIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(securityOfProcessingOperation, riskToSecurityOfProcessingOperationIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(sexLife, sexLifeIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(sexualOrientation, sexualOrientationIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(supervisoryAuthority,
				supervisoryAuthorityListNoDPIAIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(supervisoryAuthority,
				supervisoryAuthorityCriminalConvictionIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(supervisoryAuthority,
				supervisoryAuthorityCriminalOffensiveIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(supervisoryAuthority,
				supervisoryAuthorityListNeedDPIAIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(supervisoryAuthority,
				supervisoryAuthorityThatAppliedConsistencyMechanismIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(supervisoryAuthority,
				supervisoryAuthorityThatControlsProcessIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(systematicDescriptionOfProcessing, systematicDescriptionOfProcessingIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(technology, technologyIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(tradeUnionMembership, tradeUnionMembershipIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(view, viewDataSubjectIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(europeanDataProtectionBoard, europeanDataProtectionBoardIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(unionLaw, unionLawIndividual));
		manager.applyChange(add);
		add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processing, processingIndividual));
		manager.applyChange(add);

		/**
		 * Create Individuals of Verbconcepts
		 */
		OWLIndividual ConsistencyMechanism_IsAppliedTo_ProcessingIndividual = factory.getOWLNamedIndividual(
				IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ConsistencyMechanism_IsAppliedTo_Processing -" + processName));
		OWLIndividual ContextOfProcessing_Affects_FreeMovementOfDataIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_Affects_FreeMovementOfData -" + processName));
		OWLIndividual ContextOfProcessing_Has_ActivityIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_Has_Activity -" + processName));
		OWLIndividual ContextOfProcessing_Has_RiskIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_Has_Risk -" + processName));
		OWLIndividual ContextOfProcessing_Involves_MonitoringOfDataInMemberstateIndividual = factory
				.getOWLNamedIndividual(IRI.create(
						this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_Involves_MonitoringOfDataInMemberstate -" + processName));
		OWLIndividual ContextOfProcessing_Involves_OfferingOfGoodIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_Involves_OfferingOfGood -" + processName));
		OWLIndividual ContextOfProcessing_Involves_OfferingOfServicesIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_Involves_OfferingOfServices -" + processName));
		OWLIndividual ContextOfProcessing_IsLikelyToResultIn_RiskIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ContextOfProcessing_IsLikelyToResultIn_Risk -" + processName));
		OWLIndividual Controller_Assesses_PurposeOfProcessingIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_Assesses_PurposeOfProcessing -" + processName));
		OWLIndividual Controller_CarriesOut_ReviewIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_CarriesOut_Review -" + processName));
		OWLIndividual Controller_Creates_DataProtectionImpactAssessmentIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_Creates_DataProtectionImpactAssessment -" + processName));
		OWLIndividual Controller_IsCompliantWith_ApprovedCodeOfConductIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_IsCompliantWith_ApprovedCodeOfConduct -" + processName));

		OWLIndividual Controller_SeeksAdviceOf_DataProtectionOfficerIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_SeeksAdviceOf_DataProtectionOfficer -" + processName));

		OWLIndividual Controller_SeeksViewOf_DataSubjectIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_SeeksViewOf_DataSubject -" + processName));
		OWLIndividual Controller_SeeksViewOf_RepresentativeOfDataSubjectIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Controller_SeeksViewOf_RepresentativeOfDataSubject -" + processName));
		OWLIndividual CreationDate_OccursBefore_FirstProcessingDateIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "CreationDate_OccursBefore_FirstProcessingDate -" + processName));
		OWLIndividual Data_Contains_BiometricDataIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_Contains_BiometricData -" + processName));
		OWLIndividual Data_Contains_GeneticDataIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_Contains_GeneticData -" + processName));
		OWLIndividual Data_Has_MonitoringIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_Has_Monitoring -" + processName));
		OWLIndividual Data_IsMonitoredIn_PublicAreaIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_IsMonitoredIn_PublicArea -" + processName));
		OWLIndividual Data_IsPartOf_EvaluationIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_IsPartOf_Evaluation -" + processName));
		OWLIndividual Data_RelatesTo_CriminalConvictionIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RelatesTo_CriminalConviction -" + processName));
		OWLIndividual Data_RelatesTo_CriminalOffenseIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RelatesTo_CriminalOffense -" + processName));
		OWLIndividual Data_RelatesTo_DataSubjectIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RelatesTo_DataSubject -" + processName));
		OWLIndividual Data_RelatesTo_SecurityMeasureIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RelatesTo_SecurityMeasure -" + processName));
		OWLIndividual Data_RevealsInformationAbout_EthnicOriginIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_EthnicOrigin -" + processName));
		OWLIndividual Data_RevealsInformationAbout_HealthIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_Health -" + processName));
		OWLIndividual Data_RevealsInformationAbout_PhilosophicalBeliefIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_PhilosophicalBelief -" + processName));
		OWLIndividual Data_RevealsInformationAbout_PoliticalOpinionIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_PoliticalOpinion -" + processName));
		OWLIndividual Data_RevealsInformationAbout_RacialOriginIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_RacialOrigin -" + processName));
		OWLIndividual Data_RevealsInformationAbout_ReligiousBeliefIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_ReligiousBelief -" + processName));
		OWLIndividual Data_RevealsInformationAbout_SexLifeIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_SexLife -" + processName));
		OWLIndividual Data_RevealsInformationAbout_SexualOrientationIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_SexualOrientation -" + processName));
		OWLIndividual Data_RevealsInformationAbout_TradeUnionMembershipIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Data_RevealsInformationAbout_TradeUnionMembership -" + processName));
		OWLIndividual DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get()
						+ "DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing -" + processName));
		OWLIndividual DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get()
						+ "DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing -" + processName));
		OWLIndividual DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedomsIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get()
						+ "DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms -" + processName));
		OWLIndividual DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get()
						+ "DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing -" + processName));
		OWLIndividual DataProtectionImpactAssessment_Contains_MeasureToAddressRisksIndividual = factory
				.getOWLNamedIndividual(IRI.create(
						this.onto.getOntologyID().getOntologyIRI().get() + "DataProtectionImpactAssessment_Contains_MeasureToAddressRisks -" + processName));
		OWLIndividual DataProtectionImpactAssessment_Contains_PurposeOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(
						this.onto.getOntologyID().getOntologyIRI().get() + "DataProtectionImpactAssessment_Contains_PurposeOfProcessing -" + processName));
		OWLIndividual DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get()
						+ "DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing -" + processName));

		OWLIndividual DataProtectionOfficer_IsDesignatedIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "DataProtectionOfficer_IsDesignated -" +
						processName));
		OWLIndividual DataSubject_Has_ViewIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "DataSubject_Has_View -" + processName));
		OWLIndividual EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get()
						+ "EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessment -" + processName));
		OWLIndividual EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessmentIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get()
						+ "EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessment -" + processName));
		OWLIndividual Evaluation_BasesOn_AutomatedProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Evaluation_BasesOn_AutomatedProcessing -" + processName));
		OWLIndividual Evaluation_BasesOn_ProfilingIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Evaluation_BasesOn_Profiling -" + processName));
		OWLIndividual Evaluation_Produces_LegalEffectIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Evaluation_Produces_LegalEffect -" + processName));
		OWLIndividual LegalEffect_Concerns_DataSubjectIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "LegalEffect_Concerns_DataSubject -" + processName));
		OWLIndividual MeasureToAddressRisk_CompliesTo_GDPRIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "MeasureToAddressRisk_CompliesTo_GDPR -" + processName));
		OWLIndividual MeasureToAddressRisk_TakesIntoAccount_RightsIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "MeasureToAddressRisk_TakesIntoAccount_Rights -" + processName));
		OWLIndividual MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfDataIndividual = factory
				.getOWLNamedIndividual(IRI.create(
						this.onto.getOntologyID().getOntologyIRI().get() + "MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfData -" + processName));
		OWLIndividual MeasureToAddressRisks_Contains_SafeguardIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "MeasureToAddressRisks_Contains_Safeguard -" + processName));
		OWLIndividual MeasureToAddressRisks_Contains_SecurityMeasureIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "MeasureToAddressRisks_Contains_SecurityMeasure -" + processName));
		OWLIndividual PersonalData_IsPartOf_EvaluationIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "PersonalData_IsPartOf_Evaluation -" + processName));
		OWLIndividual Process_Has_DataIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Process_Has_Data -" + processName));
		OWLIndividual Process_Has_DataProtectionImpactAssessmentIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Process_Has_DataProtectionImpactAssessment -" + processName));
		OWLIndividual Process_Has_ProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Process_Has_Processing -" + processName));
		OWLIndividual Process_IsPerformedAccordingTo_DataProtectionImpactAssessmentIndividual = factory
				.getOWLNamedIndividual(IRI.create(
						this.onto.getOntologyID().getOntologyIRI().get() + "Process_IsPerformedAccordingTo_DataProtectionImpactAssessment -" + processName));
		OWLIndividual Processing_Has_ContextOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processing_Has_ContextOfProcessing -" + processName));
		OWLIndividual Processing_Has_PurposeOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processing_Has_PurposeOfProcessing -" + processName));
		OWLIndividual Processing_Has_ScopeIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processing_Has_Scope -" + processName));
		OWLIndividual Processing_Has_TechnologyIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processing_Has_Technology -" + processName));
		OWLIndividual Processor_Assesses_PurposeOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_Assesses_PurposeOfProcessing -" + processName));
		OWLIndividual Processor_Controls_ProcessIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_Controls_Process -" + processName));
		OWLIndividual Processor_IsAuthorizedBy_MemberStatelawIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_IsAuthorizedBy_MemberStatelaw -" + processName));
		OWLIndividual Processor_IsAuthorizedBy_UnionlawIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_IsAuthorizedBy_Unionlaw -" + processName));
		OWLIndividual Processor_IsCompliantWith_ApprovedCodeOfConductIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_IsCompliantWith_ApprovedCodeOfConduct -" + processName));
		OWLIndividual Processor_SeeksViewOf_DataSubjectIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_SeeksViewOf_DataSubject -" + processName));
		OWLIndividual Processor_SeeksViewOf_RepresentativeOfDataSubjectIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Processor_SeeksViewOf_RepresentativeOfDataSubject -" + processName));
		OWLIndividual PurposeOfProcessing_Has_RiskIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "PurposeOfProcessing_Has_Risk -" + processName));
		OWLIndividual PurposeOfProcessing_IsLikelyToResultIn_RiskIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "PurposeOfProcessing_IsLikelyToResultIn_Risk -" + processName));
		OWLIndividual Review_Checks_ProcessIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Review_Checks_Process -" + processName));
		OWLIndividual Risk_ChangesIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Risk_Changes -" + processName));
		OWLIndividual Scope_Has_RiskIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Scope_Has_Risk -" + processName));
		OWLIndividual ScopeOfProcessing_IsLikelyToResultIn_RiskIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "ScopeOfProcessing_IsLikelyToResultIn_Risk -" + processName));
		OWLIndividual SupervisoryAuthority_Applies_ConsistencyMechanismIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "SupervisoryAuthority_Applies_ConsistencyMechanism -" + processName));
		OWLIndividual SupervisoryAuthority_Controls_ProcessIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "SupervisoryAuthority_Controls_Process -" + processName));
		OWLIndividual SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessmentIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get()
						+ "SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment -" + processName));
		OWLIndividual SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessmentIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get()
						+ "SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment -" + processName));
		OWLIndividual SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessmentIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get()
						+ "SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessment -" + processName));
		OWLIndividual SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessmentIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get()
						+ "SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessment -" + processName));
		OWLIndividual Technology_Has_RiskIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "Technology_Has_Risk -" + processName));
		OWLIndividual TechnologyOfProcessing_IsLikelyToResultIn_RiskIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "TechnologyOfProcessing_IsLikelyToResultIn_Risk -" + processName));
		OWLIndividual View_Respects_CommercialInterestIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "View_Respects_CommercialInterest -" + processName));
		OWLIndividual View_Respects_PublicInterestIndividual = factory
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "View_Respects_PublicInterest -" + processName));
		OWLIndividual View_Respects_SecurityOfProcessingOperationIndividual = factory
				.getOWLNamedIndividual(
						IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "View_Respects_SecurityOfProcessingOperation -" + processName));

		/**
		 * Add Verbconcept Individuals to the Verbconcept Class
		 * factory.getOWLClassAssertionAxiom(activity, activityIndividual);
		 */

		AddAxiom addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(consistencyMechanism_IsAppliedTo_Processing, ConsistencyMechanism_IsAppliedTo_ProcessingIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(contextOfProcessing_Affects_FreeMovementOfData, ContextOfProcessing_Affects_FreeMovementOfDataIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(contextOfProcessing_Has_Activity, ContextOfProcessing_Has_ActivityIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(contextOfProcessing_Has_Risk, ContextOfProcessing_Has_RiskIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(contextOfProcessing_Involves_MonitoringOfDataInMemberstate,
						ContextOfProcessing_Involves_MonitoringOfDataInMemberstateIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(contextOfProcessing_Involves_OfferingOfGood, ContextOfProcessing_Involves_OfferingOfGoodIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(contextOfProcessing_Involves_OfferingOfServices, ContextOfProcessing_Involves_OfferingOfServicesIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(contextOfProcessing_IsLikelyToResultIn_Risk, ContextOfProcessing_IsLikelyToResultIn_RiskIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(controller_Assesses_PurposeOfProcessing, Controller_Assesses_PurposeOfProcessingIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(controller_CarriesOut_Review, Controller_CarriesOut_ReviewIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(controller_Creates_DataProtectionImpactAssessment,
						Controller_Creates_DataProtectionImpactAssessmentIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(controller_IsCompliantWith_ApprovedCodeOfConduct,
						Controller_IsCompliantWith_ApprovedCodeOfConductIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(controller_SeeksAdviceOf_DataProtectionOfficer,
						Controller_SeeksAdviceOf_DataProtectionOfficerIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(rule3_deontic, Controller_SeeksAdviceOf_DataProtectionOfficerIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(controller_SeeksViewOf_DataSubject, Controller_SeeksViewOf_DataSubjectIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(controller_SeeksViewOf_RepresentativeOfDataSubject,
						Controller_SeeksViewOf_RepresentativeOfDataSubjectIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(creationDate_OccursBefore_FirstProcessingDate, CreationDate_OccursBefore_FirstProcessingDateIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(data_Contains_BiometricData, Data_Contains_BiometricDataIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(data_Contains_GeneticData, Data_Contains_GeneticDataIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(data_Has_Monitoring, Data_Has_MonitoringIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(data_IsMonitoredIn_PublicArea, Data_IsMonitoredIn_PublicAreaIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(data_IsPartOf_Evaluation, Data_IsPartOf_EvaluationIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(data_RelatesTo_CriminalConviction, Data_RelatesTo_CriminalConvictionIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(data_RelatesTo_CriminalOffense, Data_RelatesTo_CriminalOffenseIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(personalData_RelatesTo_DataSubject, Data_RelatesTo_DataSubjectIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(data_RelatesTo_SecurityMeasure, Data_RelatesTo_SecurityMeasureIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_EthnicOrigin,
				Data_RevealsInformationAbout_EthnicOriginIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_Health,
				Data_RevealsInformationAbout_HealthIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_PhilosophicalBelief,
				Data_RevealsInformationAbout_PhilosophicalBeliefIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_PoliticalOpinion,
				Data_RevealsInformationAbout_PoliticalOpinionIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_RacialOrigin,
				Data_RevealsInformationAbout_RacialOriginIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_ReligiousBelief,
				Data_RevealsInformationAbout_ReligiousBeliefIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_SexLife,
				Data_RevealsInformationAbout_SexLifeIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_SexualOrientation,
				Data_RevealsInformationAbout_SexualOrientationIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_TradeUnionMembership,
				Data_RevealsInformationAbout_TradeUnionMembershipIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(
				dataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms,
				DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedomsIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(
				dataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing,
				DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessingIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(
				dataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing,
				DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessingIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(
				dataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing,
				DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessingIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(dataProtectionImpactAssessment_Contains_MeasureToAddressRisks,
				DataProtectionImpactAssessment_Contains_MeasureToAddressRisksIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(dataProtectionImpactAssessment_Contains_PurposeOfProcessing,
				DataProtectionImpactAssessment_Contains_PurposeOfProcessingIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(
				dataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing,
				DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessingIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(dataProtectionOfficer_IsDesignated,
				DataProtectionOfficer_IsDesignatedIndividual));
		manager.applyChange(addVerbConcept);

		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(dataSubject_Has_View, DataSubject_Has_ViewIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(
				EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessment,
				EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(
				EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessment,
				EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessmentIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(evaluation_BasesOn_AutomatedProcessing,
				Evaluation_BasesOn_AutomatedProcessingIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(evaluation_BasesOn_Profiling,
				Evaluation_BasesOn_ProfilingIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(legalEffect_Concerns_DataSubject,
				LegalEffect_Concerns_DataSubjectIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(measureToAddressRisk_CompliesTo_GDPR,
				MeasureToAddressRisk_CompliesTo_GDPRIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(measureToAddressRisk_TakesIntoAccount_Rights,
				MeasureToAddressRisk_TakesIntoAccount_RightsIndividual));
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(measureToAddressRisks_Contains_MechanismToEnsureProtectionOfData,
				MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfDataIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(measureToAddressRisks_Contains_Safeguard,
				MeasureToAddressRisks_Contains_SafeguardIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(measureToAddressRisks_Contains_SecurityMeasure,
				MeasureToAddressRisks_Contains_SecurityMeasureIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(personalData_IsPartOf_Evaluation,
				PersonalData_IsPartOf_EvaluationIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(process_Has_Data, Process_Has_DataIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(process_Has_DataProtectionImpactAssessment,
				Process_Has_DataProtectionImpactAssessmentIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(process_Has_Processing, Process_Has_ProcessingIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(process_IsPerformedAccordingTo_DataProtectionImpactAssessment,
				Process_IsPerformedAccordingTo_DataProtectionImpactAssessmentIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processing_Has_ContextOfProcessing,
				Processing_Has_ContextOfProcessingIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processing_Has_PurposeOfProcessing,
				Processing_Has_PurposeOfProcessingIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processing_Has_Scope, Processing_Has_ScopeIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processing_Has_Technology, Processing_Has_TechnologyIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processor_Assesses_PurposeOfProcessing,
				Processor_Assesses_PurposeOfProcessingIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processor_Controls_Process, Processor_Controls_ProcessIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processor_IsAuthorizedBy_MemberStatelaw,
				Processor_IsAuthorizedBy_MemberStatelawIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processor_IsAuthorizedBy_Unionlaw,
				Processor_IsAuthorizedBy_UnionlawIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processor_IsCompliantWith_ApprovedCodeOfConduct,
				Processor_IsCompliantWith_ApprovedCodeOfConductIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processor_SeeksViewOf_DataSubject,
				Processor_SeeksViewOf_DataSubjectIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(processor_SeeksViewOf_RepresentativeOfDataSubject,
				Processor_SeeksViewOf_RepresentativeOfDataSubjectIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(purposeOfProcessing_Has_Risk,
				PurposeOfProcessing_Has_RiskIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(purposeOfProcessing_IsLikelyToResultIn_Risk,
				PurposeOfProcessing_IsLikelyToResultIn_RiskIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(review_Checks_Process, Review_Checks_ProcessIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(risk_Changes, Risk_ChangesIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(scope_Has_Risk, Scope_Has_RiskIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(scopeOfProcessing_IsLikelyToResultIn_Risk,
				ScopeOfProcessing_IsLikelyToResultIn_RiskIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(supervisoryAuthority_Applies_ConsistencyMechanism,
				SupervisoryAuthority_Applies_ConsistencyMechanismIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(supervisoryAuthority_Controls_Process,
				SupervisoryAuthority_Controls_ProcessIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(
				supervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment,
				SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessmentIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(supervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment,
				SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessmentIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(
				supervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessment,
				SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessmentIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(supervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessment,
				SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessmentIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(technology_Has_Risk, Technology_Has_RiskIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(technologyOfProcessing_IsLikelyToResultIn_Risk,
				TechnologyOfProcessing_IsLikelyToResultIn_RiskIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(view_Respects_CommercialInterest,
				View_Respects_CommercialInterestIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(view_Respects_PublicInterest,
				View_Respects_PublicInterestIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(view_Respects_SecurityOfProcessingOperation,
				View_Respects_SecurityOfProcessingOperationIndividual));
		manager.applyChange(addVerbConcept);

		/**
		 * get Reference of Verb Individuals from our ontology
		 */

		OWLIndividual affects = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/R8eQKJJJZMxsZi9rQkgqq2a");
		OWLIndividual involves = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/R7RGx7PWPnG0sR6wGg3AXcH");
		OWLIndividual isLikelyToResultIn = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RBqX2wThottIIaw32D2aa3d");
		OWLIndividual assesses = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RqNBSia6wh0aAzt0Arji9P");
		OWLIndividual carriesOut = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RDSdGrHXYl9Eu0s8r5IS5Oj");
		OWLIndividual creates = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RDUw9NjJehTigZ1ubbFTyb7");
		OWLIndividual isCompliantTo = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RDgobhFnBfMJ0Si0IWDXkFV");
		OWLIndividual seeksAdviceOf = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RRtBczGxkl8IyzzoK7bmKd");
		OWLIndividual seeksViewOf = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RBTt5tSKFKMnmTF7KJT6H6A");
		OWLIndividual occursBefore = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/R86mMcJndHzoTUpE4c4Y2vJ");
		OWLIndividual contains = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RBZ8tfMQZ9DFl31P8ahuruf");
		OWLIndividual isMonitoredIn = factory.getOWLNamedIndividual("http://purl.org/net/team_project_semantic_web/is_monitored_in");
		OWLIndividual relatesTo = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/R8DRZGUkQJfvrF8Jrmx7sS");
		OWLIndividual revealsInformationAbout = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/R9eNRBPdXpdJL7m4aG4ItLK");
		OWLIndividual isDesignated = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RV7kczTIRtjPdaLFeqbJio");
		OWLIndividual receives = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/R87t7dgn6sgWrizmrIVVss6");
		OWLIndividual produces = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RBjc6dioKfLQXvdY6AOWJrg");
		OWLIndividual concerns = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RC1BTLj1hUpMHhqJcTjKqzm");
		OWLIndividual compliesTo = factory.getOWLNamedIndividual("http://purl.org/net/team_project_semantic_web/complies_to");
		OWLIndividual takesIntoAccount = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RBG7sVWc5jZZhT4N0sEdYTs");
		OWLIndividual basesOn = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RicP6oSkrmhtRFrztSkOt");
		OWLIndividual isPartOf = factory.getOWLNamedIndividual("http://purl.org/net/team_project_semantic_web/is_part_of");
		OWLIndividual isPerformedAccordingTo = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/R9sgi5889wsvWlxuMvptCZ");
		OWLIndividual controls = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RCqaHkvYZRIAUX1AvBgtdlL");
		OWLIndividual isAuthorizedBy = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/R7xC20eAzvGgT0bncekMlN2");
		OWLIndividual checks = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RyaKJMMydAydlR8BS6Gi7I");
		OWLIndividual changes = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/R8byyFZU9KweuTjs6z6rZLF");
		OWLIndividual applies = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RCf1IsHQ3nlxgPdbFez7gY1");
		OWLIndividual publishes = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RCdSDoXDS1NWnqJuIxLCAp4");
		OWLIndividual respects = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RCKEQ0Zh74CtDnUT3oC7PIU");

		OWLIndividual isCompliantWith = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/RDgobhFnBfMJ0Si0IWDXkFV");

		OWLIndividual has = factory.getOWLNamedIndividual("http://webprotege.stanford.edu/R8h4rVC26XxU97HIqrnyBpK");
		OWLIndividual isAppliedTo = factory.getOWLNamedIndividual("http://purl.org/net/team_project_semantic_web/is_applied_to");

		OWLObjectProperty hasSubject = factory.getOWLObjectProperty(RuleName.hasSubject.getPath());
		OWLObjectProperty hasObject = factory.getOWLObjectProperty(RuleName.hasObject.getPath());
		OWLObjectProperty hasVerb = factory.getOWLObjectProperty(RuleName.hasVerb.getPath());

		/**
		 * Define Relationship hasSubject, hasObject and hasVerb for all Verbconcepts and the corresponding Individuals
		 */

		AddAxiom addRelation;

		if (!json.get("nameOfController").toString().isEmpty()) {
			if (!json.get("purposeOfProcessing").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_Assesses_PurposeOfProcessingIndividual,
						controllerIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_Assesses_PurposeOfProcessingIndividual,
						purposeOfProcessingIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_Assesses_PurposeOfProcessingIndividual, assesses));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(controller_Assesses_PurposeOfProcessing, rule22_Condition1));
				manager.applyChange(addRelation);
			}

			if (!json.get("versionNumber").toString().equals("1")) {
				if (json.get("review").toString().equals("yes")) {
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_CarriesOut_ReviewIndividual, controllerIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_CarriesOut_ReviewIndividual, reviewIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_CarriesOut_ReviewIndividual, carriesOut));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(controller_CarriesOut_Review, rule26_deontic));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Review_Checks_ProcessIndividual, reviewIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Review_Checks_ProcessIndividual, processIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Review_Checks_ProcessIndividual, checks));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(review_Checks_Process, rule26_Condition1));
					manager.applyChange(addRelation);
				}

				if (!json.get("contentRiskUpdated").toString().isEmpty()) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Risk_ChangesIndividual, riskOfContextIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Risk_ChangesIndividual, changes));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(risk_Changes, rule26_Condition5));
					manager.applyChange(addRelation);
				}
				if (!json.get("purposeRiskUpdated").toString().isEmpty()) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Risk_ChangesIndividual, riskOfPurposeIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Risk_ChangesIndividual, changes));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(risk_Changes, rule26_Condition5));
					manager.applyChange(addRelation);
				}
				if (!json.get("scopeRiskUpdated").toString().isEmpty()) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Risk_ChangesIndividual, riskOfScopeIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Risk_ChangesIndividual, changes));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(risk_Changes, rule26_Condition5));
					manager.applyChange(addRelation);
				}
				if (!json.get("technologyRiskUpdated").toString().isEmpty()) {
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Risk_ChangesIndividual, riskOfTechnologyIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Risk_ChangesIndividual, changes));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(risk_Changes, rule26_Condition5));
					manager.applyChange(addRelation);
				}
			}

			if (!json.get("dpiaName").toString().isEmpty()) {
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_Creates_DataProtectionImpactAssessmentIndividual,
								controllerIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_Creates_DataProtectionImpactAssessmentIndividual,
								dataProtectionImpactAssessmentIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_Creates_DataProtectionImpactAssessmentIndividual,
								creates));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(controller_Creates_DataProtectionImpactAssessment, rule1_deontic));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(controller_Creates_DataProtectionImpactAssessment, rule4_deontic));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(controller_Creates_DataProtectionImpactAssessment, rule5_deontic));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(controller_Creates_DataProtectionImpactAssessment, rule9_deontic));
				manager.applyChange(addRelation);
			}

			if (json.get("controllerAppliedApprovedCodeOfConduct").toString().equals("yes")) {
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_IsCompliantWith_ApprovedCodeOfConductIndividual,
								controllerIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_IsCompliantWith_ApprovedCodeOfConductIndividual,
								approvedCodeOfConductControllerIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_IsCompliantWith_ApprovedCodeOfConductIndividual,
						isCompliantWith));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(controller_IsCompliantWith_ApprovedCodeOfConduct, rule22_deontic));
				manager.applyChange(addRelation);
			}
			if (json.get("dpoIsDesignated").toString().equals("yes")) {
				if (!json.get("nameDataProtectionOfficer").toString().isEmpty()) {
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_SeeksAdviceOf_DataProtectionOfficerIndividual,
									controllerIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_SeeksAdviceOf_DataProtectionOfficerIndividual,
									dataProtectionOfficerIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_SeeksAdviceOf_DataProtectionOfficerIndividual,
									seeksAdviceOf));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(rule3_deontic, controller_SeeksAdviceOf_DataProtectionOfficer));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, DataProtectionOfficer_IsDesignatedIndividual,
									dataIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasVerb, DataProtectionOfficer_IsDesignatedIndividual, isDesignated));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(rule3_condition1, dataProtectionOfficer_IsDesignated));
					manager.applyChange(addRelation);
				}
			}

			if (!json.get("viewOfPerson").toString().isEmpty()) {
				if (json.get("viewOfPerson").toString().contains("NaturalPerson")) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_SeeksViewOf_DataSubjectIndividual,
							controllerIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_SeeksViewOf_DataSubjectIndividual,
							dataSubjectIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_SeeksViewOf_DataSubjectIndividual, seeksViewOf));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(controller_SeeksViewOf_DataSubject, rule24_deontic));
					manager.applyChange(addRelation);
				} else {
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_SeeksViewOf_RepresentativeOfDataSubjectIndividual,
									controllerIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_SeeksViewOf_RepresentativeOfDataSubjectIndividual,
									dataSubjectIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_SeeksViewOf_RepresentativeOfDataSubjectIndividual, seeksViewOf));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(controller_SeeksViewOf_RepresentativeOfDataSubject, rule241_deontic));
					manager.applyChange(addRelation);
				}
			}
		}

		if (!json.get("biometricData").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_Contains_BiometricDataIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_Contains_BiometricDataIndividual,
					biometricDataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_Contains_BiometricDataIndividual, contains));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_Contains_BiometricData, rule5_condition2));
			manager.applyChange(addRelation);
		}

		if (!json.get("geneticData").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_Contains_GeneticDataIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_Contains_GeneticDataIndividual, geneticDataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_Contains_GeneticDataIndividual, contains));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_Contains_GeneticData, rule5_condition2));
			manager.applyChange(addRelation);
		}

		if (!json.get("nameOfPublicAreaWhereDataWasMonitored").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_IsMonitoredIn_PublicAreaIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_IsMonitoredIn_PublicAreaIndividual, publicAreaIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_IsMonitoredIn_PublicAreaIndividual, isMonitoredIn));
			manager.applyChange(addRelation);
			// addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_IsMonitoredIn_PublicArea, rule9_condition));//
			// TODO
			// check
			// that
			// ->
			// which
			// condition
			// manager.applyChange(addRelation);

			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_Has_MonitoringIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_Has_MonitoringIndividual, publicAreaIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_Has_MonitoringIndividual, has));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_Has_Monitoring, rule9_condition3));
			manager.applyChange(addRelation);
		}

		if (!json.get("evaluation").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_IsPartOf_EvaluationIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_IsPartOf_EvaluationIndividual, evaluationIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_IsPartOf_EvaluationIndividual, isPartOf));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_IsPartOf_Evaluation, rule4_condition3));
			manager.applyChange(addRelation);
		}

		if (!json.get("criminalConviction").toString().isEmpty()) {
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RelatesTo_CriminalConvictionIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RelatesTo_CriminalConvictionIndividual, criminalConvictionIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RelatesTo_CriminalConvictionIndividual, relatesTo));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RelatesTo_CriminalConviction, rule5_condition2));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RelatesTo_CriminalConviction, rule7_condition1));
			manager.applyChange(addRelation);
		}

		if (!json.get("criminalOffense").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RelatesTo_CriminalOffenseIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RelatesTo_CriminalOffenseIndividual, criminalOffenseIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RelatesTo_CriminalOffenseIndividual, relatesTo));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RelatesTo_CriminalOffense, rule5_condition2));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RelatesTo_CriminalOffense, rule7_condition1));
			manager.applyChange(addRelation);
		}

		if (json.get("dataRelatesToNaturalPerson").toString().equals("yes")) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RelatesTo_DataSubjectIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RelatesTo_DataSubjectIndividual, dataSubjectIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RelatesTo_DataSubjectIndividual, relatesTo));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(personalData_RelatesTo_DataSubject, rule4_condition5));
			manager.applyChange(addRelation);
		}

		if (!json.get("securityMeasure").toString().isEmpty()) {

			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RelatesTo_SecurityMeasureIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RelatesTo_SecurityMeasureIndividual, securityMeasureIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RelatesTo_SecurityMeasureIndividual, relatesTo));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RelatesTo_SecurityMeasure, rule5_condition2));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RelatesTo_SecurityMeasure, rule7_condition1));
			manager.applyChange(addRelation);
		}

		if (!json.get("ethnicOrigin").toString().isEmpty()) {
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_EthnicOriginIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_EthnicOriginIndividual, ethnicOriginIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_EthnicOriginIndividual, revealsInformationAbout));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RevealsInformationAbout_EthnicOrigin, rule5_condition2));
			manager.applyChange(addRelation);
		}

		if (!json.get("health").toString().isEmpty()) {
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_HealthIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_HealthIndividual, healthIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_HealthIndividual, revealsInformationAbout));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RevealsInformationAbout_Health, rule5_condition2));
			manager.applyChange(addRelation);
		}

		if (!json.get("philosophicalBelief").toString().isEmpty()) {
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_PhilosophicalBeliefIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_PhilosophicalBeliefIndividual,
					philosophicalBeliefIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_PhilosophicalBeliefIndividual, revealsInformationAbout));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RevealsInformationAbout_PhilosophicalBelief, rule5_condition2));
			manager.applyChange(addRelation);
		}

		if (!json.get("politicalOpinion").toString().isEmpty()) {
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_PoliticalOpinionIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_PoliticalOpinionIndividual, politicalOpinionIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_PoliticalOpinionIndividual, revealsInformationAbout));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RevealsInformationAbout_PoliticalOpinion, rule5_condition2));
			manager.applyChange(addRelation);
		}

		if (!json.get("racialOrigin").toString().isEmpty()) {
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_RacialOriginIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_RacialOriginIndividual, racialOriginIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_RacialOriginIndividual, revealsInformationAbout));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RevealsInformationAbout_RacialOrigin, rule5_condition2));
			manager.applyChange(addRelation);
		}

		if (!json.get("religiousBelief").toString().isEmpty()) {
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_ReligiousBeliefIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_ReligiousBeliefIndividual, religiousBeliefIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_ReligiousBeliefIndividual, revealsInformationAbout));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RevealsInformationAbout_ReligiousBelief, rule5_condition2));
			manager.applyChange(addRelation);
		}

		if (!json.get("sexLife").toString().isEmpty()) {
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_SexLifeIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_SexLifeIndividual, sexLifeIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_SexLifeIndividual, revealsInformationAbout));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RevealsInformationAbout_SexLife, rule5_condition2));
			manager.applyChange(addRelation);
		}

		if (!json.get("sexualOrientation").toString().isEmpty()) {
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_SexualOrientationIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_SexualOrientationIndividual,
					sexualOrientationIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_SexualOrientationIndividual, revealsInformationAbout));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RevealsInformationAbout_SexualOrientation, rule5_condition2));
			manager.applyChange(addRelation);
		}

		if (!json.get("tradeUnionMembership").toString().isEmpty()) {
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_TradeUnionMembershipIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_TradeUnionMembershipIndividual,
					tradeUnionMembershipIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_TradeUnionMembershipIndividual, revealsInformationAbout));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(data_RevealsInformationAbout_TradeUnionMembership, rule5_condition2));
			manager.applyChange(addRelation);
		}

		if (!json.get("dpiaName").toString().isEmpty()) {
			if (this.compareDates(json.get("dpiaCreationDate").toString(), json.get("firstProcessingDate").toString())) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, CreationDate_OccursBefore_FirstProcessingDateIndividual,
						creationDateIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, CreationDate_OccursBefore_FirstProcessingDateIndividual,
						firstProcessingDateIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, CreationDate_OccursBefore_FirstProcessingDateIndividual,
						occursBefore));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(creationDate_OccursBefore_FirstProcessingDate,
						rule2_deontic));
				manager.applyChange(addRelation);
			}
			if (!json.get("assessmentOfNecessity").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
						DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessingIndividual, dataProtectionImpactAssessmentIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
						DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessingIndividual, assessmentOfNecessityOfProcessingIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
						DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessingIndividual, contains));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(dataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing, rule18_condition2));
				manager.applyChange(addRelation);
			}

			if (!json.get("assessmentOfProportionality").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
						DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessingIndividual, dataProtectionImpactAssessmentIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasObject,
								DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessingIndividual,
								assessmentOfProportionalityOfProcessingIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
						DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessingIndividual, contains));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory
						.getOWLEquivalentClassesAxiom(dataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing, rule18_condition3));
				manager.applyChange(addRelation);
			}

			if (!json.get("assessmentOfRisks").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
						DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedomsIndividual, dataProtectionImpactAssessmentIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasObject,
								DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedomsIndividual,
								assessmentOfRisksToRightsAndFreedomsIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
						DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedomsIndividual, contains));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(dataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms, rule18_condition4));
				manager.applyChange(addRelation);
			}

			if (!json.get("legitimateInterestOfProcessing").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
						DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessingIndividual,
						dataProtectionImpactAssessmentIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
						DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessingIndividual,
						legitimateInterestOfProcessingIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
						DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessingIndividual,
						contains));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(dataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing, rule18_condition5));
				manager.applyChange(addRelation);
			}

			if (!json.get("measureToAddressRisksDpia").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
						DataProtectionImpactAssessment_Contains_MeasureToAddressRisksIndividual,
						dataProtectionImpactAssessmentIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
						DataProtectionImpactAssessment_Contains_MeasureToAddressRisksIndividual,
						measureToAddressRiskIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasVerb, DataProtectionImpactAssessment_Contains_MeasureToAddressRisksIndividual,
								contains));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(dataProtectionImpactAssessment_Contains_MeasureToAddressRisks, rule18_condition6));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(dataProtectionImpactAssessment_Contains_MeasureToAddressRisks, rule20_condition1));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(dataProtectionImpactAssessment_Contains_MeasureToAddressRisks, rule21_deontic));
				manager.applyChange(addRelation);
			}

			if (json.get("measureCompliantTogdpr").toString().equals("yes")) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
						MeasureToAddressRisk_CompliesTo_GDPRIndividual,
						measureToAddressRiskIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
						MeasureToAddressRisk_CompliesTo_GDPRIndividual,
						gdprIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasVerb, MeasureToAddressRisk_CompliesTo_GDPRIndividual, compliesTo));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(measureToAddressRisk_CompliesTo_GDPR, rule20_deontic));
				manager.applyChange(addRelation);
			}

			if (json.get("measureTakeIntoAccountRights").toString().equals("yes")) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
						MeasureToAddressRisk_TakesIntoAccount_RightsIndividual,
						measureToAddressRiskIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
						MeasureToAddressRisk_TakesIntoAccount_RightsIndividual,
						rightsIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
						MeasureToAddressRisk_TakesIntoAccount_RightsIndividual,
						takesIntoAccount));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(measureToAddressRisk_TakesIntoAccount_Rights, rule21_condition1));
				manager.applyChange(addRelation);
			}

			if (!json.get("mechanismsToEnsureProtectionOfData").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
						MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfDataIndividual,
						measureToAddressRiskIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
						MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfDataIndividual,
						mechanismsToEnsureProtectionOfDataIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasVerb, MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfDataIndividual,
								contains));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(measureToAddressRisks_Contains_MechanismToEnsureProtectionOfData, rule18_condition10));
				manager.applyChange(addRelation);
			}

			if (!json.get("safeguard").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, MeasureToAddressRisks_Contains_SafeguardIndividual,
						measureToAddressRiskIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, MeasureToAddressRisks_Contains_SafeguardIndividual,
						safeguardIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasVerb, MeasureToAddressRisks_Contains_SafeguardIndividual, contains));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(measureToAddressRisks_Contains_Safeguard, rule18_condition8));
				manager.applyChange(addRelation);
			}

			if (!json.get("securityMeasure").toString().isEmpty()) {
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasSubject, MeasureToAddressRisks_Contains_SecurityMeasureIndividual,
								measureToAddressRiskIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, MeasureToAddressRisks_Contains_SecurityMeasureIndividual,
						securityMeasureIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, MeasureToAddressRisks_Contains_SecurityMeasureIndividual,
						contains));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(measureToAddressRisks_Contains_SecurityMeasure, rule18_condition9));
				manager.applyChange(addRelation);
			}
		}

		if (!json.get("purposeOfProcessing").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
					DataProtectionImpactAssessment_Contains_PurposeOfProcessingIndividual,
					dataProtectionImpactAssessmentIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
					DataProtectionImpactAssessment_Contains_PurposeOfProcessingIndividual,
					purposeOfProcessingIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasVerb, DataProtectionImpactAssessment_Contains_PurposeOfProcessingIndividual,
							contains));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(dataProtectionImpactAssessment_Contains_PurposeOfProcessing, rule18_condition7));
			manager.applyChange(addRelation);
		}

		if (!json.get("systematicDescriptionOfProcessing").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
					DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessingIndividual,
					dataProtectionImpactAssessmentIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
					DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessingIndividual,
					systematicDescriptionOfProcessingIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
					DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessingIndividual,
					contains));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(dataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing, rule18_condition1));
			manager.applyChange(addRelation);
		}

		if (!json.get("viewOfPerson").toString().isEmpty()) {
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, DataSubject_Has_ViewIndividual, viewDataSubjectIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, DataSubject_Has_ViewIndividual, has));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(dataSubject_Has_View, rule241_condition1));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(dataSubject_Has_View, rule24_condition1));
			manager.applyChange(addRelation);
		}

		if (!json.get("nameOfListWithAllProcessesThatNeedDpia").toString().isEmpty()) {

			if (!json.get("nameSupervisoryAuthotityThatCreatedListDpia").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
						SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessmentIndividual,
						supervisoryAuthorityListNeedDPIAIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
						SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessmentIndividual,
						listWithProcessesThatNeedDpiaIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasVerb, SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessmentIndividual,
								creates));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(supervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment, rule10_condition1));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(supervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment, rule12_condition1));
				manager.applyChange(addRelation);

				if (json.get("listDpiaPublishedToPublic").toString().equals("yes")) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
							SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessmentIndividual,
							supervisoryAuthorityListNeedDPIAIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
							SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessmentIndividual,
							listWithProcessesThatDoNotNeedDpiaIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
							SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessmentIndividual,
							publishes));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(supervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessment, rule10_deontic));
					manager.applyChange(addRelation);
				}
				System.out.println(json.get("listDpiaPublishedToEDPB").toString());
				if (json.get("listDpiaPublishedToEDPB").toString().equals("yes")) {
					System.out.println("dhfhfhfhfh");
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
							EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual,
							europeanDataProtectionBoardIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
							EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual,
							listWithProcessesThatDoNotNeedDpiaIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
									EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual,
									receives));
					manager.applyChange(addRelation);
					System.out.println("dhfhfhfhfh");
					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessment, rule12_deontic));
					manager.applyChange(addRelation);
				}
			}

		}

		if (!json.get("nameOfListwithAllProcessesThatDoNotNeedDpia").toString().isEmpty()) {
			if (!json.get("nameSupervisoryAuthorityThatCreatedListNoDpia").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
						SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessmentIndividual,
						supervisoryAuthorityListNoDPIAIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
						SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessmentIndividual,
						listWithProcessesThatDoNotNeedDpiaIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
						SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessmentIndividual,
						creates));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(supervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment, rule13_condition1));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(supervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment, rule15_condition1));
				manager.applyChange(addRelation);

				if (json.get("listNoDpiaPublishedToPublic").toString().equals("yes")) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
							SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessmentIndividual,
							supervisoryAuthorityListNoDPIAIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
							SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessmentIndividual,
							listWithProcessesThatDoNotNeedDpiaIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
							SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessmentIndividual,
							publishes));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(supervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessment, rule13_deontic));
					manager.applyChange(addRelation);
				}
			}

			if (json.get("listNoDpiaPublishedToPublic").toString().equals("yes")) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
						EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual,
						europeanDataProtectionBoardIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
						EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual,
						listWithProcessesThatDoNotNeedDpiaIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
								EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual,
								receives));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessment, rule15_deontic));
				manager.applyChange(addRelation);
			}
		}

		if (!json.get("automatedProcessing").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Evaluation_BasesOn_AutomatedProcessingIndividual,
					evaluationIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Evaluation_BasesOn_AutomatedProcessingIndividual,
					automatedProcessingIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Evaluation_BasesOn_AutomatedProcessingIndividual, basesOn));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(evaluation_BasesOn_AutomatedProcessing, rule4_condition4));
			manager.applyChange(addRelation);
		}

		if (!json.get("profiling").toString().isEmpty()) {
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Evaluation_BasesOn_ProfilingIndividual, evaluationIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLObjectPropertyAssertionAxiom(hasObject, Evaluation_BasesOn_ProfilingIndividual, profilingIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Evaluation_BasesOn_ProfilingIndividual, basesOn));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(evaluation_BasesOn_Profiling, rule4_condition4));
			manager.applyChange(addRelation);
		}

		if (!json.get("legalEffect").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Evaluation_Produces_LegalEffectIndividual,
					evaluationIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Evaluation_Produces_LegalEffectIndividual,
					legalEffectIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Evaluation_Produces_LegalEffectIndividual, produces));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(evaluation_Produces_LegalEffect, rule4_condition4));
			manager.applyChange(addRelation);
		}

		if (!json.get("legalEffect").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, LegalEffect_Concerns_DataSubjectIndividual,
					legalEffectIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, LegalEffect_Concerns_DataSubjectIndividual,
					dataSubjectIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, LegalEffect_Concerns_DataSubjectIndividual, concerns));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(legalEffect_Concerns_DataSubject, rule4_condition6));
			manager.applyChange(addRelation);
		}

		if (!json.get("evaluation").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, PersonalData_IsPartOf_EvaluationIndividual,
					personalDataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, PersonalData_IsPartOf_EvaluationIndividual,
					evaluationIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, PersonalData_IsPartOf_EvaluationIndividual, isPartOf));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(personalData_IsPartOf_Evaluation, rule4_condition3));
			manager.applyChange(addRelation);
		}

		if (!json.get("process").toString().isEmpty()) { // TODO data or any subclass of data!!!
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Process_Has_DataIndividual, processIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Process_Has_DataIndividual, dataIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Process_Has_DataIndividual, has));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(process_Has_Data, rule4_condition2));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(process_Has_Data, rule5_condition2));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(process_Has_Data, rule7_condition1));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(process_Has_Data, rule9_condition2));
			manager.applyChange(addRelation);
		}

		if (!json.get("process").toString().isEmpty() && !json.get("dpiaName").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Process_Has_DataProtectionImpactAssessmentIndividual,
					processIndividual));
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Process_Has_DataProtectionImpactAssessmentIndividual,
					dataProtectionImpactAssessmentIndividual));
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Process_Has_DataProtectionImpactAssessmentIndividual, has));
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(process_Has_DataProtectionImpactAssessment, rule1_condition1));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(process_Has_DataProtectionImpactAssessment, rule4_condition1));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(process_Has_DataProtectionImpactAssessment, rule5_condition1));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(process_Has_DataProtectionImpactAssessment, rule9_condition1));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(process_Has_DataProtectionImpactAssessment, rule18_deontic));
			manager.applyChange(addRelation);

			/*
			 * if (!json.get("").toString().isEmpty()) {// TODO this needs to be an extra boolean value in the scenario!!!
			 * addRelation = new AddAxiom(onto,
			 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
			 * Process_IsPerformedAccordingTo_DataProtectionImpactAssessmentIndividual,
			 * processIndividual));
			 * manager.applyChange(addRelation);
			 * addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject,
			 * Process_IsPerformedAccordingTo_DataProtectionImpactAssessmentIndividual,
			 * dataProtectionImpactAssessmentIndividual));
			 * manager.applyChange(addRelation);
			 * addRelation = new AddAxiom(onto,
			 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Process_IsPerformedAccordingTo_DataProtectionImpactAssessmentIndividual,
			 * isPerformedAccordingTo));
			 * manager.applyChange(addRelation);
			 * }
			 */
		}

		if (!json.get("process").toString().isEmpty() && !json.get("processing").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Process_Has_ProcessingIndividual, processIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Process_Has_ProcessingIndividual, processingIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Process_Has_ProcessingIndividual, has));
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(process_Has_Processing, rule1_condition2));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(process_Has_Processing, rule26_Condition2));
			manager.applyChange(addRelation);

		}

		if (!json.get("processing").toString().isEmpty()) {
			if (!json.get("contentOfProcessing").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processing_Has_ContextOfProcessingIndividual,
						processingIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processing_Has_ContextOfProcessingIndividual,
						contextOfProcessingIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processing_Has_ContextOfProcessingIndividual, has));
				manager.applyChange(addRelation);

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(processing_Has_ContextOfProcessing, rule1_condition3));
				manager.applyChange(addRelation);

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(processing_Has_ContextOfProcessing, rule26_Condition10));
				manager.applyChange(addRelation);

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(processing_Has_ContextOfProcessing, rule16_condition2));
				manager.applyChange(addRelation);

				if (!json.get("freeMovementOfData").toString().isEmpty()) {
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Affects_FreeMovementOfDataIndividual,
									contextOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Affects_FreeMovementOfDataIndividual,
									freeMovementOfDataIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Affects_FreeMovementOfDataIndividual,
									affects));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Has_ActivityIndividual,
							contextOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Has_ActivityIndividual,
							freeMovementOfDataIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Has_ActivityIndividual, affects));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(contextOfProcessing_Has_Activity, rule16_condition3));
					manager.applyChange(addRelation);
				}

				if (!json.get("riskRelatedToContent").toString().isEmpty()) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Has_RiskIndividual,
							contextOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Has_RiskIndividual,
							riskOfContextIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Has_RiskIndividual, has));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(contextOfProcessing_Has_Risk, rule1_condition4));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(contextOfProcessing_Has_Risk, rule26_Condition11));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_IsLikelyToResultIn_RiskIndividual,
									contextOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_IsLikelyToResultIn_RiskIndividual,
									riskOfContextIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_IsLikelyToResultIn_RiskIndividual,
							isLikelyToResultIn));
					manager.applyChange(addRelation);

				}

				if (!json.get("monitoringBehaviorInMemberstate").toString().isEmpty()) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, // TODO which condition really
																											// shall be used here??????
							ContextOfProcessing_Involves_MonitoringOfDataInMemberstateIndividual,
							contextOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Has_RiskIndividual,
							monitoringOfDataInMemberstateIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Has_RiskIndividual, has));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(contextOfProcessing_Has_Risk, rule1_condition4));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(contextOfProcessing_Has_Risk, rule26_Condition11));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Has_ActivityIndividual,
							contextOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Has_ActivityIndividual,
							monitoringOfDataInMemberstateIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Has_ActivityIndividual, has));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(contextOfProcessing_Has_Activity, rule16_condition3));
					manager.applyChange(addRelation);
				}

				if (!json.get("offeringOfGoods").toString().isEmpty()) {
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Involves_OfferingOfGoodIndividual,
									contextOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Involves_OfferingOfGoodIndividual,
									offeringOfGoodsIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Involves_OfferingOfGoodIndividual, involves));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Has_ActivityIndividual,
							contextOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Has_ActivityIndividual,
							offeringOfGoodsIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Has_ActivityIndividual, has));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(contextOfProcessing_Has_Activity, rule16_condition3));
					manager.applyChange(addRelation);
				}

				if (!json.get("offeringOfServices").toString().isEmpty()) {
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Involves_OfferingOfServicesIndividual,
									contextOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Involves_OfferingOfServicesIndividual,
									offeringOfServicesIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Involves_OfferingOfServicesIndividual,
									involves));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Has_ActivityIndividual,
							contextOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Has_ActivityIndividual,
							offeringOfServicesIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Has_ActivityIndividual, has));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(contextOfProcessing_Has_Activity, rule16_condition3));
					manager.applyChange(addRelation);
				}
			}

			if (!json.get("purposeOfProcessing").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processing_Has_PurposeOfProcessingIndividual,
						processingIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processing_Has_PurposeOfProcessingIndividual,
						purposeOfProcessingIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processing_Has_PurposeOfProcessingIndividual, has));
				manager.applyChange(addRelation);

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(processing_Has_PurposeOfProcessing, rule1_condition3));
				manager.applyChange(addRelation);

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(processing_Has_PurposeOfProcessing, rule26_Condition8));
				manager.applyChange(addRelation);

				if (!json.get("riskRelatedToPurpose").toString().isEmpty()) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, PurposeOfProcessing_Has_RiskIndividual,
							purposeOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, PurposeOfProcessing_Has_RiskIndividual,
							riskOfPurposeIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, PurposeOfProcessing_Has_RiskIndividual, has));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(purposeOfProcessing_Has_Risk, rule1_condition4));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(contextOfProcessing_Has_Activity, rule26_Condition9));
					manager.applyChange(addRelation);
				}

				if (!json.get("riskRelatedToPurpose").toString().isEmpty()) {
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, PurposeOfProcessing_IsLikelyToResultIn_RiskIndividual,
									purposeOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasObject, PurposeOfProcessing_IsLikelyToResultIn_RiskIndividual,
									riskOfPurposeIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, PurposeOfProcessing_IsLikelyToResultIn_RiskIndividual,
							isLikelyToResultIn));
					manager.applyChange(addRelation);
				}
			}

			if (!json.get("scopeOfProcessing").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processing_Has_ScopeIndividual, processingIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processing_Has_ScopeIndividual, scopeIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processing_Has_ScopeIndividual, has));

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(processing_Has_Scope, rule1_condition3));
				manager.applyChange(addRelation);

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(processing_Has_Scope, rule26_Condition3));
				manager.applyChange(addRelation);

				if (!json.get("riskRelatedToScope").toString().isEmpty()) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Scope_Has_RiskIndividual, scopeIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Scope_Has_RiskIndividual, riskOfScopeIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Scope_Has_RiskIndividual, has));

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(scope_Has_Risk, rule1_condition4));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(scope_Has_Risk, rule26_Condition4));
					manager.applyChange(addRelation);
				}

				if (!json.get("riskRelatedToScope").toString().isEmpty()) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ScopeOfProcessing_IsLikelyToResultIn_RiskIndividual,
							scopeIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, ScopeOfProcessing_IsLikelyToResultIn_RiskIndividual,
							riskOfScopeIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ScopeOfProcessing_IsLikelyToResultIn_RiskIndividual,
							isLikelyToResultIn));
				}
			}

			if (!json.get("technologyOfProcessing").toString().isEmpty()) {

				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processing_Has_TechnologyIndividual, processingIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processing_Has_TechnologyIndividual, technologyIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processing_Has_TechnologyIndividual, has));

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(processing_Has_Technology, rule1_condition3));
				manager.applyChange(addRelation);

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(processing_Has_Technology, rule26_Condition6));
				manager.applyChange(addRelation);

				if (!json.get("riskRelatedToTechnology").toString().isEmpty()) {
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Technology_Has_RiskIndividual, technologyIndividual));
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasObject, Technology_Has_RiskIndividual, riskOfTechnologyIndividual));
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Technology_Has_RiskIndividual, has));

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(technology_Has_Risk, rule1_condition4));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(technology_Has_Risk, rule26_Condition7));
					manager.applyChange(addRelation);
				}

				if (!json.get("riskRelatedToTechnology").toString().isEmpty()) {
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, TechnologyOfProcessing_IsLikelyToResultIn_RiskIndividual,
									technologyIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasObject, TechnologyOfProcessing_IsLikelyToResultIn_RiskIndividual,
									riskOfTechnologyIndividual));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasVerb, TechnologyOfProcessing_IsLikelyToResultIn_RiskIndividual,
									isLikelyToResultIn));
					manager.applyChange(addRelation);
				}
			}
		}

		if (!json.get("nameOfProcessor").toString().isEmpty()) {
			for (int i = 0; i < processorIndividuals.size(); i++) {
				OWLIndividual processorIndividual = processorIndividuals.get(i);
				OWLIndividual approvedCodeOfConductProcessorIndividual = approvedCodeOfConductProcessorIndividuals.get(i);
				if (!json.get("purposeOfProcessing").toString().isEmpty()) { // TODO this has to be the purpose which is part of the dpia
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_Assesses_PurposeOfProcessingIndividual,
							processorIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_Assesses_PurposeOfProcessingIndividual,
							purposeOfProcessingIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_Assesses_PurposeOfProcessingIndividual, assesses));

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(processor_Assesses_PurposeOfProcessing, rule23_condition1));
					manager.applyChange(addRelation);
				}

				if (!json.get("process").toString().isEmpty()) {
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_Controls_ProcessIndividual, processorIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_Controls_ProcessIndividual, processIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_Controls_ProcessIndividual, controls));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(processor_Controls_Process, rule8_deontic));
					manager.applyChange(addRelation);
				}

				if (!json.get("memberstatelaw").toString().isEmpty()) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_IsAuthorizedBy_MemberStatelawIndividual,
							processorIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_IsAuthorizedBy_MemberStatelawIndividual,
							memberStateLawIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_IsAuthorizedBy_MemberStatelawIndividual,
							isAuthorizedBy));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(processor_IsAuthorizedBy_MemberStatelaw, rule8_condition1));
					manager.applyChange(addRelation);
				}

				if (json.get("unionlawAuthorization").toString().equals("yes")) {
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_IsAuthorizedBy_UnionlawIndividual,
							processorIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_IsAuthorizedBy_UnionlawIndividual,
							unionLawIndividual));
					manager.applyChange(addRelation);
					addRelation = new AddAxiom(onto,
							factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_IsAuthorizedBy_UnionlawIndividual, isAuthorizedBy));
					manager.applyChange(addRelation);

					addRelation = new AddAxiom(onto,
							factory.getOWLEquivalentClassesAxiom(processor_IsAuthorizedBy_Unionlaw, rule8_condition1));
					manager.applyChange(addRelation);
				}
				if (!json.get("processorAppliedApprovedCodeOfConduct").toString().isEmpty()) {
					// TODO make another check here -> only if value says yes
					if (approvedCodeOfCoductInformationProcessor[i].equals("yes")) {
						addRelation = new AddAxiom(onto,
								factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_IsCompliantWith_ApprovedCodeOfConductIndividual,
										processorIndividual));
						manager.applyChange(addRelation);
						addRelation = new AddAxiom(onto,
								factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_IsCompliantWith_ApprovedCodeOfConductIndividual,
										approvedCodeOfConductProcessorIndividual));
						manager.applyChange(addRelation);
						addRelation = new AddAxiom(onto,
								factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_IsCompliantWith_ApprovedCodeOfConductIndividual,
										isCompliantWith));
						manager.applyChange(addRelation);
						addRelation = new AddAxiom(onto, factory.getOWLEquivalentClassesAxiom(processor_IsCompliantWith_ApprovedCodeOfConduct, rule23_deontic));
						manager.applyChange(addRelation);
					}
				}

				if (!json.get("viewOfPerson").toString().isEmpty()) {
					if (json.get("viewOfPerson").toString().contains("NaturalPerson")) {
						addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_SeeksViewOf_DataSubjectIndividual,
								processorIndividual));
						manager.applyChange(addRelation);
						addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_SeeksViewOf_DataSubjectIndividual,
								dataSubjectIndividual));
						manager.applyChange(addRelation);
						addRelation = new AddAxiom(onto,
								factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_SeeksViewOf_DataSubjectIndividual, seeksViewOf));
						manager.applyChange(addRelation);

						addRelation = new AddAxiom(onto,
								factory.getOWLEquivalentClassesAxiom(processor_SeeksViewOf_DataSubject, rule25_deontic));
						manager.applyChange(addRelation);

					} else {
						addRelation = new AddAxiom(onto,
								factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_SeeksViewOf_RepresentativeOfDataSubjectIndividual,
										processorIndividual));
						manager.applyChange(addRelation);
						addRelation = new AddAxiom(onto,
								factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_SeeksViewOf_RepresentativeOfDataSubjectIndividual,
										dataSubjectIndividual));
						manager.applyChange(addRelation);
						addRelation = new AddAxiom(onto,
								factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_SeeksViewOf_RepresentativeOfDataSubjectIndividual,
										seeksViewOf));
						manager.applyChange(addRelation);

						addRelation = new AddAxiom(onto,
								factory.getOWLEquivalentClassesAxiom(processor_SeeksViewOf_DataSubject, rule251_deontic));
						manager.applyChange(addRelation);
					}
				}
			}
		}

		if (json.get("consistencyMechanism").toString().equals("yes")) {
			if (!json.get("nameSupervisoryAuthorityThatAppliedConsistencyMechanism").toString().isEmpty()) {
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasSubject, SupervisoryAuthority_Applies_ConsistencyMechanismIndividual,
								supervisoryAuthorityThatAppliedConsistencyMechanismIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasObject, SupervisoryAuthority_Applies_ConsistencyMechanismIndividual,
								consistencymechanismIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasVerb, SupervisoryAuthority_Applies_ConsistencyMechanismIndividual,
								applies));
				manager.applyChange(addRelation);

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(supervisoryAuthority_Applies_ConsistencyMechanism, rule16_deontic));
				manager.applyChange(addRelation);
			}
			if (!json.get("processing").toString().isEmpty()) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ConsistencyMechanism_IsAppliedTo_ProcessingIndividual,
						consistencymechanismIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, ConsistencyMechanism_IsAppliedTo_ProcessingIndividual,
						processingIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ConsistencyMechanism_IsAppliedTo_ProcessingIndividual,
						isAppliedTo));
				manager.applyChange(addRelation);

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(consistencyMechanism_IsAppliedTo_Processing, rule16_condition1));
				manager.applyChange(addRelation);
			}
		}

		if (!json.get("nameOfSupervisoryAuthorityThatControlsProcessCriminalConviction").toString().isEmpty()
				|| !json.get("nameOfSupervisoryAuthorityThatControlsProcessCriminalOffense").toString().isEmpty()) {
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, SupervisoryAuthority_Controls_ProcessIndividual,
					supervisoryAuthorityThatControlsProcessIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, SupervisoryAuthority_Controls_ProcessIndividual,
					processIndividual));
			manager.applyChange(addRelation);
			addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, SupervisoryAuthority_Controls_ProcessIndividual, controls));
			manager.applyChange(addRelation);

			addRelation = new AddAxiom(onto,
					factory.getOWLEquivalentClassesAxiom(supervisoryAuthority_Controls_Process, rule7_deontic));
			manager.applyChange(addRelation);
		}

		if (!json.get("viewOfPerson").toString().isEmpty()) {

			if (json.get("riskOfPersonsViewToCommercialInterest").toString().equals("yes")) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, View_Respects_CommercialInterestIndividual,
						viewDataSubjectIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasObject, View_Respects_CommercialInterestIndividual,
								riskToCommercialInterestIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, View_Respects_CommercialInterestIndividual, respects));
				manager.applyChange(addRelation);

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(view_Respects_CommercialInterest, rule24_condition3));
				manager.applyChange(addRelation);
			}

			if (json.get("riskOfPersonsViewToPublicInterest").toString().equals("yes")) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, View_Respects_PublicInterestIndividual,
						viewDataSubjectIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, View_Respects_PublicInterestIndividual,
						riskToPublicInterestIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasVerb, View_Respects_PublicInterestIndividual, respects));
				manager.applyChange(addRelation);

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(view_Respects_PublicInterest, rule24_condition2));
				manager.applyChange(addRelation);
			}

			if (json.get("riskOfPersonsViewToSecurityOfProcessing").toString().equals("yes")) {
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasSubject, View_Respects_SecurityOfProcessingOperationIndividual,
						viewDataSubjectIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto, factory.getOWLObjectPropertyAssertionAxiom(hasObject, View_Respects_SecurityOfProcessingOperationIndividual,
						riskToSecurityOfProcessingOperationIndividual));
				manager.applyChange(addRelation);
				addRelation = new AddAxiom(onto,
						factory.getOWLObjectPropertyAssertionAxiom(hasVerb, View_Respects_SecurityOfProcessingOperationIndividual, respects));
				manager.applyChange(addRelation);

				addRelation = new AddAxiom(onto,
						factory.getOWLEquivalentClassesAxiom(view_Respects_SecurityOfProcessingOperation, rule24_condition4));
				manager.applyChange(addRelation);
			}
		}
		// save changes to Ontology
		OurOntology.saveOntology(onto, processId);
	}

	public boolean compareDates(String creationDate, String processingDate) {
		boolean creationBeforeProcessing = false;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date dCreationDate = sdf.parse(creationDate);
			Date dProcessingDate = sdf.parse(processingDate);
			creationBeforeProcessing = dCreationDate.before(dProcessingDate);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return creationBeforeProcessing;
	}
}
