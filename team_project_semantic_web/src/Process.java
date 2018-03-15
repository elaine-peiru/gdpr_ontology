package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.json.simple.JSONObject;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
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

		/**
		 * Reference to OWL Class deontic conditions
		 */
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
		String approvedCodeOfConductProcessorString = json.get("processorAppliedAppovedCodeOfConduct").toString();
		ArrayList<OWLIndividual> approvedCodeOfConductProcessorIndividuals = new ArrayList<OWLIndividual>();
		String[] approvedCodeOfCoductInformationProcessor = approvedCodeOfConductProcessorString.split(";");
		for (int i = 0; i < approvedCodeOfCoductInformationProcessor.length; i++) {
			OWLIndividual approvedCodeOfConductIndividual = factory
					.getOWLNamedIndividual(IRI.create(ontologyIRI + approvedCodeOfCoductInformationProcessor[i]));
			approvedCodeOfConductProcessorIndividuals.add(approvedCodeOfConductIndividual);
		}

		String processorString = json.get("nameOfProcessor").toString();
		ArrayList<OWLIndividual> processorIndividuals = new ArrayList<OWLIndividual>();
		String[] processorInformation = processorString.split(";");
		for (int i = 0; i < processorInformation.length; i++) {
			OWLIndividual processorIndividual = factory
					.getOWLNamedIndividual(IRI.create(ontologyIRI + processorInformation[i]));
			processorIndividuals.add(processorIndividual);
		}

		// OWLIndividual dataProtectionImpactAssessmentIndividual = factory
		// .getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + json.get("dpiaName").toString()));
		// OWLObjectProperty has = factory.getOWLObjectProperty("http://webprotege.stanford.edu/R8h4rVC26XxU97HIqrnyBpK");
		// OWLObjectPropertyAssertionAxiom Process_Has_DataProtectionImpactAssessment = factory.getOWLObjectPropertyAssertionAxiom(has,
		// processIndividual,
		// dataProtectionImpactAssessmentIndividual);
		// AddAxiom add = new AddAxiom(onto, Process_Has_DataProtectionImpactAssessment);
		// manager.applyChange(add);
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
		OWLIndividual consistencymechanismIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("consistencyMechanism").toString()));
		// OWLIndividual contextOfProcessingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		OWLIndividual creationDateIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("dpiaCreationDate").toString()));
		OWLIndividual criminalConvictionIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("criminalConviction").toString()));
		OWLIndividual criminalOffenseIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("criminalOffense").toString()));
		// OWLIndividual dataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		OWLIndividual dataProtectionImpactAssessmentIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("dpiaName").toString()));
		OWLIndividual dataProtectionOfficerIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("nameDataProtectionOfficer").toString()));
		// OWLIndividual dataSubjectIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		OWLIndividual ethnicOriginIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("ethnicOrigin").toString()));
		OWLIndividual evaluationIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("evaluation").toString()));
		OWLIndividual firstProcessingDateIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("firstProcessingDate").toString()));
		// OWLIndividual freeMovementOfDataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
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
		// OWLIndividual measureToAddressRiskIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		OWLIndividual mechanismsToEnsureProtectionOfDataIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("mechanismsToEnsureProtectionOfData").toString()));
		// OWLIndividual memberStateLawIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		OWLIndividual monitoringOfDataInMemberstateIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("monitoringBehaviorInMemberstate").toString()));
		OWLIndividual offeringOfGoodsIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("offeringOfGoods").toString()));
		OWLIndividual offeringOfServicesIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("offeringOfServices").toString()));
		// OWLIndividual personalDataIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		// OWLIndividual personalInterestIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
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
		// OWLIndividual representativeOfDataSubjectIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +
		// json.get("").toString()));
		// OWLIndividual reviewIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		OWLIndividual rightsIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "rightsIndividual"));
		OWLIndividual riskOfContextIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("riskRelatedToContent").toString()));
		OWLIndividual riskOfPurposeIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("riskRelatedToPurpose").toString()));
		OWLIndividual riskOfTechnologyIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("riskRelatedToTechnology").toString()));
		OWLIndividual riskOfScopeIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("riskRelatedToScope").toString()));
		OWLIndividual safeguardIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("safeguard").toString()));
		OWLIndividual scopeIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("scopeOfProcessing").toString()));
		// OWLIndividual securityMeasureIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI +
		// json.get("securityMeasure").toString()));
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
		// TODO add this individual to scenario template and to input method!!
		// OWLIndividual supervisoryAuthorityThatAppliedConsistencyMechanismIndividual = factory
		// .getOWLNamedIndividual(IRI.create(ontologyIRI +
		// json.get("namesupervisoryAuthorityThatAppliedConsistencyMechanismIndividual").toString()));
		// OWLIndividual supervisoryAuthorityThatControlsProcessIndividual = factory
		// .getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("supervisoryAuthorityThatControlsProcessIndividual").toString()));
		OWLIndividual systematicDescriptionOfProcessingIndividual = factory
				.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("systematicDescriptionOfProcessing").toString()));
		OWLIndividual technologyIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("technologyOfProcessing").toString()));
		OWLIndividual tradeUnionMembershipIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("tradeUnionMembership").toString()));
		OWLIndividual viewDataSubjectIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("viewOfPerson").toString()));
		// OWLIndividual viewRepresenativeDataSubjectIndividual = factory
		// .getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("viewOfRepresentativeOfPerson").toString()));
		OWLIndividual europeanDataProtectionBoardIndividual = factory.getOWLNamedIndividual(ClassName.european_data_protection_board.getPath());
		OWLIndividual unionLawIndividual = factory.getOWLNamedIndividual(ClassName.union_law.getPath());
		// OWLIndividual processingIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		// OWLIndividual monitoringIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));
		// OWLIndividual activityIndividual = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + json.get("").toString()));

		/**
		 * assert Factor Individuals to OWL Class
		 */
		// OWLClassAssertionAxiom classAssertionApprovedCodeOfConduct = factory.getOWLClassAssertionAxiom(approvedCodeOfConduct,
		// approvedCodeOfConductIndividual);
		Set<OWLAxiom> addFactorsToClass = new HashSet<OWLAxiom>();
		AddAxiom add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(assessmentOfNecessityOfProcessing,
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
		// add = new AddAxiom(onto, factory.getOWLClassAssertionAxiom(contextOfProcessing, contextOfProcessingIndividual));
		// manager.applyChange(add);
		// OWLClassAssertionAxiom classAssertionController = factory.getOWLClassAssertionAxiom(controller, controllerIndividual);
		/*
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(creationDate, creationDateIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(criminalConviction, criminalConvictionIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(criminalOffense, criminalOffenseIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(data, dataIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(dataProtectionImpactAssessment,
		 * dataProtectionImpactAssessmentIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(dataProtectionOfficer, dataProtectionOfficerIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(dataSubject, dataSubjectIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(ethnicOrigin, ethnicOriginIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(evaluation, evaluationIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(firstProcessingDate, firstProcessingDateIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(freeMovementOfData, freeMovementOfDataIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(gdpr, gdprIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(geneticData, geneticDataIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(health, healthIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(legalEffect, legalEffectIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(legitimateInterestOfProcessing,
		 * legitimateInterestOfProcessingIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(listWithProcessesThatDoNotNeedDpia,
		 * listWithProcessesThatDoNotNeedDpiaIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(listWithProcessesThatNeedDpia,
		 * listWithProcessesThatNeedDpiaIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(measureToAddressRisk, measureToAddressRiskIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(mechanismsToEnsureProtectionOfData,
		 * mechanismsToEnsureProtectionOfDataIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(memberStateLaw, memberStateLawIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(monitoringOfDataInMemberstate,
		 * monitoringOfDataInMemberstateIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(offeringOfGoods, offeringOfGoodsIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(offeringOfServices, offeringOfServicesIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(personalData, personalDataIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(personalInterest, personalInterestIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(philosophicalBelief, philosophicalBeliefIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(politicalOpinion, politicalOpinionIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(process, processIndividual));
		 * // OWLClassAssertionAxiom classAssertionProcessor = factory.getOWLClassAssertionAxiom(processor, processorIndividual);
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(profiling, profilingIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(publicArea, publicAreaIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(publicInterest, riskToPublicInterestIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(purposeOfProcessing, purposeOfProcessingIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(racialOrigin, racialOriginIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(religiousBelief, religiousBeliefIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(representativeOfDataSubject,
		 * representativeOfDataSubjectIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(review, reviewIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(rights, rightsIndividual));
		 * // OWLClassAssertionAxiom classAssertionRisk = factory.getOWLClassAssertionAxiom(risk, riskIndividual);
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(safeguard, safeguardIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(scopeOfProcessing, scopeIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(securityMeasure, securityMeasureIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(securityOfProcessingOperation,
		 * riskToSecurityOfProcessingOperationIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(sexLife, sexLifeIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(sexualOrientation, sexualOrientationIndividual));
		 * // OWLClassAssertionAxiom classAssertionSupervisoryAuthority = factory.getOWLClassAssertionAxiom(supervisoryAuthority,
		 * // supervisoryAuthorityIndividual);
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(systematicDescriptionOfProcessing,
		 * systematicDescriptionOfProcessingIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(technology, technologyIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(tradeUnionMembership,
		 * tradeUnionMembershipIndividual));
		 * // OWLClassAssertionAxiom classAssertionView = factory.getOWLClassAssertionAxiom(view, viewIndividual);
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(europeanDataProtectionBoard,
		 * europeanDataProtectionBoardIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(unionLaw, unionLawIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(processing, processingIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(monitoring, monitoringIndividual));
		 * addFactorsToClass.add(factory.getOWLClassAssertionAxiom(activity, activityIndividual));
		 * 
		 * manager.applyChanges(addFactorsToClass);
		 */

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
				.getOWLNamedIndividual(IRI.create(this.onto.getOntologyID().getOntologyIRI().get() + "DataProtectionOfficer_IsDesignated -" + processName));
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

		Set<OWLAxiom> addVerbconceptToClass = new HashSet<OWLAxiom>();
		AddAxiom addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(consistencyMechanism_IsAppliedTo_Processing, ConsistencyMechanism_IsAppliedTo_ProcessingIndividual));
		manager.applyChange(addVerbConcept);
		addVerbConcept = new AddAxiom(onto,
				factory.getOWLClassAssertionAxiom(contextOfProcessing_Affects_FreeMovementOfData, ContextOfProcessing_Affects_FreeMovementOfDataIndividual));
		manager.applyChange(addVerbConcept);
		/*
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(contextOfProcessing_Has_Activity,
		 * ContextOfProcessing_Has_ActivityIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(contextOfProcessing_Has_Risk,
		 * ContextOfProcessing_Has_RiskIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(contextOfProcessing_Involves_MonitoringOfDataInMemberstate,
		 * ContextOfProcessing_Involves_MonitoringOfDataInMemberstateIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(contextOfProcessing_Involves_OfferingOfGood,
		 * ContextOfProcessing_Involves_OfferingOfGoodIndividual));
		 * addVerbconceptToClass.add(
		 * factory.getOWLClassAssertionAxiom(contextOfProcessing_Involves_OfferingOfServices,
		 * ContextOfProcessing_Involves_OfferingOfServicesIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(contextOfProcessing_IsLikelyToResultIn_Risk,
		 * ContextOfProcessing_IsLikelyToResultIn_RiskIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(controller_Assesses_PurposeOfProcessing,
		 * Controller_Assesses_PurposeOfProcessingIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(controller_CarriesOut_Review,
		 * Controller_CarriesOut_ReviewIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(controller_Creates_DataProtectionImpactAssessment,
		 * Controller_Creates_DataProtectionImpactAssessmentIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(controller_IsCompliantWith_ApprovedCodeOfConduct,
		 * Controller_IsCompliantWith_ApprovedCodeOfConductIndividual));
		 * addVerbconceptToClass.add(
		 * factory.getOWLClassAssertionAxiom(controller_SeeksAdviceOf_DataProtectionOfficer,
		 * Controller_SeeksAdviceOf_DataProtectionOfficerIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(controller_SeeksViewOf_DataSubject,
		 * Controller_SeeksViewOf_DataSubjectIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(controller_SeeksViewOf_RepresentativeOfDataSubject,
		 * Controller_SeeksViewOf_RepresentativeOfDataSubjectIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(creationDate_OccursBefore_FirstProcessingDate,
		 * CreationDate_OccursBefore_FirstProcessingDateIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(data_Contains_BiometricData, Data_Contains_BiometricDataIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(data_Contains_GeneticData, Data_Contains_GeneticDataIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(data_Has_Monitoring, Data_Has_MonitoringIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(data_IsMonitoredIn_PublicArea,
		 * Data_IsMonitoredIn_PublicAreaIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(data_IsPartOf_Evaluation, Data_IsPartOf_EvaluationIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(data_RelatesTo_CriminalConviction,
		 * Data_RelatesTo_CriminalConvictionIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(data_RelatesTo_CriminalOffense,
		 * Data_RelatesTo_CriminalOffenseIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(personalData_RelatesTo_DataSubject,
		 * Data_RelatesTo_DataSubjectIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(data_RelatesTo_SecurityMeasure,
		 * Data_RelatesTo_SecurityMeasureIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_EthnicOrigin,
		 * Data_RevealsInformationAbout_EthnicOriginIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_Health,
		 * Data_RevealsInformationAbout_HealthIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_PhilosophicalBelief,
		 * Data_RevealsInformationAbout_PhilosophicalBeliefIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_PoliticalOpinion,
		 * Data_RevealsInformationAbout_PoliticalOpinionIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_RacialOrigin,
		 * Data_RevealsInformationAbout_RacialOriginIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_ReligiousBelief,
		 * Data_RevealsInformationAbout_ReligiousBeliefIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_SexLife,
		 * Data_RevealsInformationAbout_SexLifeIndividual));
		 * addVerbconceptToClass.add(
		 * factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_SexualOrientation,
		 * Data_RevealsInformationAbout_SexualOrientationIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(data_RevealsInformationAbout_TradeUnionMembership,
		 * Data_RevealsInformationAbout_TradeUnionMembershipIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(
		 * dataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedoms,
		 * DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedomsIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(
		 * dataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessing,
		 * DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessingIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(
		 * dataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessing,
		 * DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessingIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(
		 * dataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessing,
		 * DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessingIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(dataProtectionImpactAssessment_Contains_MeasureToAddressRisks,
		 * DataProtectionImpactAssessment_Contains_MeasureToAddressRisksIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(dataProtectionImpactAssessment_Contains_PurposeOfProcessing,
		 * DataProtectionImpactAssessment_Contains_PurposeOfProcessingIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(
		 * dataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessing,
		 * DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessingIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(dataProtectionOfficer_IsDesignated,
		 * DataProtectionOfficer_IsDesignatedIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(dataSubject_Has_View, DataSubject_Has_ViewIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(
		 * EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessment,
		 * EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(
		 * EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessment,
		 * EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessmentIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(evaluation_BasesOn_AutomatedProcessing,
		 * Evaluation_BasesOn_AutomatedProcessingIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(evaluation_BasesOn_Profiling,
		 * Evaluation_BasesOn_ProfilingIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(legalEffect_Concerns_DataSubject,
		 * LegalEffect_Concerns_DataSubjectIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(measureToAddressRisk_CompliesTo_GDPR,
		 * MeasureToAddressRisk_CompliesTo_GDPRIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(measureToAddressRisk_TakesIntoAccount_Rights,
		 * MeasureToAddressRisk_TakesIntoAccount_RightsIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(measureToAddressRisks_Contains_MechanismToEnsureProtectionOfData,
		 * MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfDataIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(measureToAddressRisks_Contains_Safeguard,
		 * MeasureToAddressRisks_Contains_SafeguardIndividual));
		 * addVerbconceptToClass.add(
		 * factory.getOWLClassAssertionAxiom(measureToAddressRisks_Contains_SecurityMeasure,
		 * MeasureToAddressRisks_Contains_SecurityMeasureIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(personalData_IsPartOf_Evaluation,
		 * PersonalData_IsPartOf_EvaluationIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(process_Has_Data, Process_Has_DataIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(process_Has_DataProtectionImpactAssessment,
		 * Process_Has_DataProtectionImpactAssessmentIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(process_Has_Processing, Process_Has_ProcessingIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(process_IsPerformedAccordingTo_DataProtectionImpactAssessment,
		 * Process_IsPerformedAccordingTo_DataProtectionImpactAssessmentIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(processing_Has_ContextOfProcessing,
		 * Processing_Has_ContextOfProcessingIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(processing_Has_PurposeOfProcessing,
		 * Processing_Has_PurposeOfProcessingIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(processing_Has_Scope, Processing_Has_ScopeIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(processing_Has_Technology, Processing_Has_TechnologyIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(processor_Assesses_PurposeOfProcessing,
		 * Processor_Assesses_PurposeOfProcessingIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(processor_Controls_Process, Processor_Controls_ProcessIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(processor_IsAuthorizedBy_MemberStatelaw,
		 * Processor_IsAuthorizedBy_MemberStatelawIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(processor_IsAuthorizedBy_Unionlaw,
		 * Processor_IsAuthorizedBy_UnionlawIndividual));
		 * addVerbconceptToClass.add(
		 * factory.getOWLClassAssertionAxiom(processor_IsCompliantWith_ApprovedCodeOfConduct,
		 * Processor_IsCompliantWith_ApprovedCodeOfConductIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(processor_SeeksViewOf_DataSubject,
		 * Processor_SeeksViewOf_DataSubjectIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(processor_SeeksViewOf_RepresentativeOfDataSubject,
		 * Processor_SeeksViewOf_RepresentativeOfDataSubjectIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(purposeOfProcessing_Has_Risk,
		 * PurposeOfProcessing_Has_RiskIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(purposeOfProcessing_IsLikelyToResultIn_Risk,
		 * PurposeOfProcessing_IsLikelyToResultIn_RiskIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(review_Checks_Process, Review_Checks_ProcessIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(risk_Changes, Risk_ChangesIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(scope_Has_Risk, Scope_Has_RiskIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(scopeOfProcessing_IsLikelyToResultIn_Risk,
		 * ScopeOfProcessing_IsLikelyToResultIn_RiskIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(supervisoryAuthority_Applies_ConsistencyMechanism,
		 * SupervisoryAuthority_Applies_ConsistencyMechanismIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(supervisoryAuthority_Controls_Process,
		 * SupervisoryAuthority_Controls_ProcessIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(
		 * supervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessment,
		 * SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessmentIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(supervisoryAuthority_Creates_ListOfProcessesThatRequireAssessment,
		 * SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessmentIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(
		 * supervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessment,
		 * SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessmentIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(supervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessment,
		 * SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessmentIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(technology_Has_Risk, Technology_Has_RiskIndividual));
		 * addVerbconceptToClass.add(
		 * factory.getOWLClassAssertionAxiom(technologyOfProcessing_IsLikelyToResultIn_Risk,
		 * TechnologyOfProcessing_IsLikelyToResultIn_RiskIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(view_Respects_CommercialInterest,
		 * View_Respects_CommercialInterestIndividual));
		 * addVerbconceptToClass.add(factory.getOWLClassAssertionAxiom(view_Respects_PublicInterest,
		 * View_Respects_PublicInterestIndividual));
		 * addVerbconceptToClass
		 * .add(factory.getOWLClassAssertionAxiom(view_Respects_SecurityOfProcessingOperation,
		 * View_Respects_SecurityOfProcessingOperationIndividual));
		 * 
		 * manager.applyChanges(addVerbconceptToClass);
		 */

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

		/*
		 * List<OWLAxiomChange> axioms = new ArrayList<OWLAxiomChange>();
		 * 
		 * if (json.get("nameOfController") != null) {
		 * if (json.get("purposeOfProcessing") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_Assesses_PurposeOfProcessingIndividual,
		 * controllerIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_Assesses_PurposeOfProcessingIndividual,
		 * purposeOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_Assesses_PurposeOfProcessingIndividual, assesses));
		 * }
		 * 
		 * if (json.get("review") != null) {// TODO review missing in scenario
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_CarriesOut_ReviewIndividual, controllerIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_CarriesOut_ReviewIndividual, reviewIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_CarriesOut_ReviewIndividual, carriesOut));
		 * }
		 * 
		 * if (json.get("dpiaName") != null) {
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_Creates_DataProtectionImpactAssessmentIndividual,
		 * controllerIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_Creates_DataProtectionImpactAssessmentIndividual,
		 * dataProtectionImpactAssessmentIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_Creates_DataProtectionImpactAssessmentIndividual,
		 * creates));
		 * }
		 * 
		 * if (json.get("controllerAppliedApprovedCodOfConduct").toString().equals("yes")) {
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_IsCompliantWith_ApprovedCodeOfConductIndividual,
		 * controllerIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_IsCompliantWith_ApprovedCodeOfConductIndividual,
		 * approvedCodeOfConductControllerIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_IsCompliantWith_ApprovedCodeOfConductIndividual,
		 * isCompliantWith));
		 * }
		 * 
		 * if (json.get("nameDataProtectionOfficer") != null) {
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_SeeksAdviceOf_DataProtectionOfficerIndividual,
		 * controllerIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_SeeksAdviceOf_DataProtectionOfficerIndividual,
		 * dataProtectionOfficerIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_SeeksAdviceOf_DataProtectionOfficerIndividual,
		 * seeksAdviceOf));
		 * }
		 * 
		 * if (json.get("dataSubject") != null) { // TODO not covered in scenario -> does this makes sense? so many data subjects in
		 * // general
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_SeeksViewOf_DataSubjectIndividual,
		 * controllerIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_SeeksViewOf_DataSubjectIndividual,
		 * dataSubjectIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_SeeksViewOf_DataSubjectIndividual, seeksViewOf));
		 * }
		 * 
		 * if (json.get("representativeOfDataSubject") != null) { // TODO not covered in scenario -> does this makes sense? so many data
		 * // subjects in general
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Controller_SeeksViewOf_RepresentativeOfDataSubjectIndividual,
		 * controllerIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Controller_SeeksViewOf_RepresentativeOfDataSubjectIndividual,
		 * representativeOfDataSubjectIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Controller_SeeksViewOf_RepresentativeOfDataSubjectIndividual,
		 * seeksViewOf));
		 * }
		 * }
		 * 
		 * if (this.compareDates(json.get("dpiaCreationDate").toString(), json.get("firstProcessingDate").toString())) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, CreationDate_OccursBefore_FirstProcessingDateIndividual,
		 * creationDateIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject, CreationDate_OccursBefore_FirstProcessingDateIndividual,
		 * firstProcessingDateIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, CreationDate_OccursBefore_FirstProcessingDateIndividual,
		 * occursBefore));
		 * }
		 * if (json.get("biometricData") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_Contains_BiometricDataIndividual, dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_Contains_BiometricDataIndividual,
		 * biometricDataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_Contains_BiometricDataIndividual, contains));
		 * }
		 * 
		 * if (json.get("geneticData") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_Contains_GeneticDataIndividual, dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_Contains_GeneticDataIndividual, geneticDataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_Contains_GeneticDataIndividual, contains));
		 * }
		 * 
		 * if (json.get("nameOfPublicAreaWhereDataWasMonitored") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_IsMonitoredIn_PublicAreaIndividual, dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_IsMonitoredIn_PublicAreaIndividual, publicAreaIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_IsMonitoredIn_PublicAreaIndividual, isMonitoredIn));
		 * 
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_Has_MonitoringIndividual, dataIndividual));
		 * // public area is subclass of monitoring
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_Has_MonitoringIndividual, publicAreaIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_Has_MonitoringIndividual, has));
		 * }
		 * 
		 * if (json.get("") != null && json.get("") != null) {// TODO how shall this be done?
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_IsPartOf_EvaluationIndividual, dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_IsPartOf_EvaluationIndividual, evaluationIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_IsPartOf_EvaluationIndividual, isPartOf));
		 * }
		 * 
		 * if (json.get("criminalConviction") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RelatesTo_CriminalConvictionIndividual, dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RelatesTo_CriminalConvictionIndividual,
		 * criminalConvictionIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RelatesTo_CriminalConvictionIndividual, relatesTo));
		 * }
		 * 
		 * if (json.get("criminalOffense") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RelatesTo_CriminalOffenseIndividual, dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RelatesTo_CriminalOffenseIndividual,
		 * criminalOffenseIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RelatesTo_CriminalOffenseIndividual, relatesTo));
		 * }
		 * 
		 * if (json.get("dataRelatesToNaturalPerson").toString().equals("yes")) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RelatesTo_DataSubjectIndividual, dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RelatesTo_DataSubjectIndividual, dataSubjectIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RelatesTo_DataSubjectIndividual, relatesTo));
		 * }
		 * 
		 * if (json.get("") != null && json.get("") != null) {// TODO securityMeasure is not part of the scenario!! -> at least not in the
		 * data
		 * // area
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RelatesTo_SecurityMeasureIndividual, dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RelatesTo_SecurityMeasureIndividual,
		 * securityMeasureIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RelatesTo_SecurityMeasureIndividual, relatesTo));
		 * }
		 * 
		 * if (json.get("ethnicOrigin") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_EthnicOriginIndividual,
		 * dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_EthnicOriginIndividual,
		 * ethnicOriginIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_EthnicOriginIndividual,
		 * revealsInformationAbout));
		 * }
		 * 
		 * if (json.get("health") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_HealthIndividual,
		 * dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_HealthIndividual,
		 * healthIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_HealthIndividual,
		 * revealsInformationAbout));
		 * }
		 * 
		 * if (json.get("philosophicalBelief") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_PhilosophicalBeliefIndividual,
		 * dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_PhilosophicalBeliefIndividual,
		 * philosophicalBeliefIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_PhilosophicalBeliefIndividual,
		 * revealsInformationAbout));
		 * }
		 * 
		 * if (json.get("politicalOpinion") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_PoliticalOpinionIndividual,
		 * dataIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_PoliticalOpinionIndividual,
		 * politicalOpinionIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_PoliticalOpinionIndividual,
		 * revealsInformationAbout));
		 * }
		 * 
		 * if (json.get("racialOrigin") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_RacialOriginIndividual,
		 * dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_RacialOriginIndividual,
		 * racialOriginIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_RacialOriginIndividual,
		 * revealsInformationAbout));
		 * }
		 * 
		 * if (json.get("religiousBelief") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_ReligiousBeliefIndividual,
		 * dataIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_ReligiousBeliefIndividual,
		 * religiousBeliefIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_ReligiousBeliefIndividual,
		 * revealsInformationAbout));
		 * }
		 * 
		 * if (json.get("sexLife") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_SexLifeIndividual,
		 * dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_SexLifeIndividual,
		 * sexLifeIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_SexLifeIndividual,
		 * revealsInformationAbout));
		 * }
		 * 
		 * if (json.get("sexualOrientation") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_SexualOrientationIndividual,
		 * dataIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_SexualOrientationIndividual,
		 * sexualOrientationIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_SexualOrientationIndividual,
		 * revealsInformationAbout));
		 * }
		 * 
		 * if (json.get("tradeUnionMembership") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Data_RevealsInformationAbout_TradeUnionMembershipIndividual,
		 * dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Data_RevealsInformationAbout_TradeUnionMembershipIndividual,
		 * tradeUnionMembershipIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Data_RevealsInformationAbout_TradeUnionMembershipIndividual,
		 * revealsInformationAbout));
		 * }
		 * if (json.get("dpiaName") != null) {
		 * if (json.get("assessmentOfNecessity") != null) {
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessingIndividual,
		 * dataProtectionImpactAssessmentIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessingIndividual,
		 * assessmentOfNecessityOfProcessingIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
		 * DataProtectionImpactAssessment_Contains_AssessmentOfNecessityOfProcessingIndividual,
		 * contains));
		 * }
		 * 
		 * if (json.get("assessmentOfProportionality") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessingIndividual,
		 * dataProtectionImpactAssessmentIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessingIndividual,
		 * assessmentOfProportionalityOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
		 * DataProtectionImpactAssessment_Contains_AssessmentOfProportionalityOfProcessingIndividual, contains));
		 * }
		 * 
		 * if (json.get("assessmentOfRisks") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedomsIndividual,
		 * dataProtectionImpactAssessmentIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedomsIndividual,
		 * assessmentOfRisksToRightsAndFreedomsIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
		 * DataProtectionImpactAssessment_Contains_AssessmentOfRisksToRightsAndFreedomsIndividual,
		 * contains));
		 * }
		 * 
		 * if (json.get("legitimateInterestOfProcessing") != null) {
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessingIndividual,
		 * dataProtectionImpactAssessmentIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessingIndividual,
		 * legitimateInterestOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
		 * DataProtectionImpactAssessment_Contains_LegitimateInterestOfProcessingIndividual,
		 * contains));
		 * }
		 * 
		 * if (json.get("") != null) {// TODO no value in json -> check if also no value in scenario
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * DataProtectionImpactAssessment_Contains_MeasureToAddressRisksIndividual,
		 * dataProtectionImpactAssessmentIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * DataProtectionImpactAssessment_Contains_MeasureToAddressRisksIndividual,
		 * measureToAddressRiskIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb, DataProtectionImpactAssessment_Contains_MeasureToAddressRisksIndividual,
		 * contains));
		 * 
		 * if (json.get("measureCompliesToGdpr") != null) { // TODO add this check to scenario and json!
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, MeasureToAddressRisk_CompliesTo_GDPRIndividual,
		 * measureToAddressRiskIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, MeasureToAddressRisk_CompliesTo_GDPRIndividual,
		 * gdprIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, MeasureToAddressRisk_CompliesTo_GDPRIndividual, compliesTo));
		 * }
		 * 
		 * if (json.get("MeasureLooksForRisk") != null) { // TODO add this check to scenario and json!
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, MeasureToAddressRisk_TakesIntoAccount_RightsIndividual,
		 * measureToAddressRiskIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, MeasureToAddressRisk_TakesIntoAccount_RightsIndividual,
		 * rightsIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, MeasureToAddressRisk_TakesIntoAccount_RightsIndividual,
		 * takesIntoAccount));
		 * }
		 * 
		 * if (json.get("mechanismsToEnsureProtectionOfData") != null) {
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfDataIndividual,
		 * measureToAddressRiskIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfDataIndividual,
		 * mechanismsToEnsureProtectionOfDataIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb, MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfDataIndividual,
		 * contains));
		 * }
		 * 
		 * if (json.get("safeguard") != null) {
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, MeasureToAddressRisks_Contains_SafeguardIndividual,
		 * measureToAddressRiskIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, MeasureToAddressRisks_Contains_SafeguardIndividual,
		 * safeguardIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, MeasureToAddressRisks_Contains_SafeguardIndividual, contains));
		 * }
		 * 
		 * if (json.get("securityMeasure") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, MeasureToAddressRisks_Contains_SecurityMeasureIndividual,
		 * measureToAddressRiskIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject, MeasureToAddressRisks_Contains_SecurityMeasureIndividual,
		 * securityMeasureIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, MeasureToAddressRisks_Contains_SecurityMeasureIndividual,
		 * contains));
		 * }
		 * }
		 * 
		 * if (json.get("purposeOfProcessing") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * DataProtectionImpactAssessment_Contains_PurposeOfProcessingIndividual,
		 * dataProtectionImpactAssessmentIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * DataProtectionImpactAssessment_Contains_PurposeOfProcessingIndividual,
		 * purposeOfProcessingIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb, DataProtectionImpactAssessment_Contains_PurposeOfProcessingIndividual,
		 * contains));
		 * }
		 * 
		 * if (json.get("systematicDescriptionOfProcessing") != null) {
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessingIndividual,
		 * dataProtectionImpactAssessmentIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessingIndividual,
		 * systematicDescriptionOfProcessingIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
		 * DataProtectionImpactAssessment_Contains_SystematicDescriptionOfProcessingIndividual,
		 * contains));
		 * }
		 * }
		 * 
		 * if (json.get("") != null) {// TODO need extra field to determine if dpo is existing in company or not
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, DataProtectionOfficer_IsDesignatedIndividual, dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, DataProtectionOfficer_IsDesignatedIndividual, isDesignated));
		 * }
		 * 
		 * if (json.get("") != null && json.get("") != null) {// TODO how shall we do this??? //TODO what happened to hasSUbject here?
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, DataSubject_Has_ViewIndividual, viewDataSubjectIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, DataSubject_Has_ViewIndividual, has));
		 * }
		 * 
		 * if (json.get("nameOfListWithAllProcessesThatNeedDpia") != null) {
		 * 
		 * if (json.get("nameSupervisoryAuthorityThatCreatedListDpia") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessmentIndividual,
		 * supervisoryAuthorityListNeedDPIAIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessmentIndividual,
		 * listWithProcessesThatNeedDpiaIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb, SupervisoryAuthority_Creates_ListOfProcessesThatRequireAssessmentIndividual,
		 * creates));
		 * 
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessmentIndividual,
		 * supervisoryAuthorityListNeedDPIAIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessmentIndividual,
		 * listWithProcessesThatDoNotNeedDpiaIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
		 * SupervisoryAuthority_Publishes_ListOfProcessesThatRequireAssessmentIndividual,
		 * publishes));
		 * }
		 * 
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessmentIndividual,
		 * europeanDataProtectionBoardIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessmentIndividual,
		 * listWithProcessesThatNeedDpiaIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
		 * EuropeanDataProtectionBoard_Receives_ListOfProcessesThatRequireAssessmentIndividual,
		 * receives));
		 * }
		 * 
		 * if (json.get("nameOfListWithAllProcessesThatDoNotNeedDpia") != null) {
		 * if (json.get("nameSupervisoryAuthorityThatCreatedListNoDpia") != null) {
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessmentIndividual,
		 * supervisoryAuthorityListNoDPIAIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessmentIndividual,
		 * listWithProcessesThatDoNotNeedDpiaIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
		 * SupervisoryAuthority_Creates_ListOfProcessesThatDoNotRequireAssessmentIndividual,
		 * creates));
		 * 
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessmentIndividual,
		 * supervisoryAuthorityListNoDPIAIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessmentIndividual,
		 * listWithProcessesThatDoNotNeedDpiaIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
		 * SupervisoryAuthority_Publishes_ListOfProcessesThatDoNotRequireAssessmentIndividual,
		 * publishes));
		 * }
		 * 
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual,
		 * europeanDataProtectionBoardIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual,
		 * listWithProcessesThatDoNotNeedDpiaIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
		 * EuropeanDataProtectionBoard_Receives_ListOfProcessesThatDoNotRequireAssessmentIndividual,
		 * receives));
		 * }
		 * 
		 * if (json.get("automatedProcessing") != null) { // TODO how to handle that one is the subclass of other
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Evaluation_BasesOn_AutomatedProcessingIndividual,
		 * evaluationIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Evaluation_BasesOn_AutomatedProcessingIndividual,
		 * automatedProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Evaluation_BasesOn_AutomatedProcessingIndividual, basesOn));
		 * }
		 * 
		 * if (json.get("profiling") != null) { // TODO how to handle that one is the subclass of other
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Evaluation_BasesOn_ProfilingIndividual, evaluationIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Evaluation_BasesOn_ProfilingIndividual, profilingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Evaluation_BasesOn_ProfilingIndividual, basesOn));
		 * }
		 * 
		 * if (json.get("legalEffect") != null && json.get("") != null) { // TODO second argument need to be evaluation or any subclass of
		 * // evaluation
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Evaluation_Produces_LegalEffectIndividual,
		 * evaluationIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Evaluation_Produces_LegalEffectIndividual,
		 * legalEffectIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Evaluation_Produces_LegalEffectIndividual, produces));
		 * }
		 * 
		 * if (json.get("legalEffect") != null && json.get("") != null) { // TODO how to handle datasubject here???
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, LegalEffect_Concerns_DataSubjectIndividual,
		 * legalEffectIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, LegalEffect_Concerns_DataSubjectIndividual,
		 * dataSubjectIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, LegalEffect_Concerns_DataSubjectIndividual, concerns));
		 * }
		 * 
		 * if (json.get("") != null && json.get("") != null) { // TODO how to handle this?????
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, PersonalData_IsPartOf_EvaluationIndividual,
		 * personalDataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, PersonalData_IsPartOf_EvaluationIndividual,
		 * evaluationIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, PersonalData_IsPartOf_EvaluationIndividual, isPartOf));
		 * }
		 * 
		 * if (json.get("process") != null && json.get("") != null) { // TODO data or any subclass of data!!!
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Process_Has_DataIndividual, processIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Process_Has_DataIndividual, dataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Process_Has_DataIndividual, has));
		 * }
		 * 
		 * if (json.get("process") != null && json.get("dpiaName") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Process_Has_DataProtectionImpactAssessmentIndividual,
		 * processIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Process_Has_DataProtectionImpactAssessmentIndividual,
		 * dataProtectionImpactAssessmentIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Process_Has_DataProtectionImpactAssessmentIndividual, has));
		 * 
		 * if (json.get("") != null) {// TODO this needs to be an extra boolean value in the scenario!!!
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * Process_IsPerformedAccordingTo_DataProtectionImpactAssessmentIndividual,
		 * processIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject,
		 * Process_IsPerformedAccordingTo_DataProtectionImpactAssessmentIndividual,
		 * dataProtectionImpactAssessmentIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb,
		 * Process_IsPerformedAccordingTo_DataProtectionImpactAssessmentIndividual,
		 * isPerformedAccordingTo));
		 * }
		 * }
		 * 
		 * if (json.get("process") != null && json.get("processing") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Process_Has_ProcessingIndividual, processIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Process_Has_ProcessingIndividual, processingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Process_Has_ProcessingIndividual, has));
		 * }
		 * 
		 * if (json.get("processing") != null) {
		 * if (json.get("contentOfProcessing") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processing_Has_ContextOfProcessingIndividual,
		 * processingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processing_Has_ContextOfProcessingIndividual,
		 * contextOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processing_Has_ContextOfProcessingIndividual, has));
		 * 
		 * if (json.get("freeMovementOfData") != null) {// TODO freeMovement missing in scenario
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Affects_FreeMovementOfDataIndividual,
		 * contextOfProcessingIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Affects_FreeMovementOfDataIndividual,
		 * freeMovementOfDataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Affects_FreeMovementOfDataIndividual,
		 * affects));
		 * 
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Has_ActivityIndividual,
		 * contextOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Has_ActivityIndividual,
		 * freeMovementOfDataIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Has_ActivityIndividual, affects));
		 * }
		 * 
		 * if (json.get("riskRelatedToContent") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Has_RiskIndividual,
		 * contextOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Has_RiskIndividual,
		 * riskOfContextIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Has_RiskIndividual, has));
		 * 
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_IsLikelyToResultIn_RiskIndividual,
		 * contextOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_IsLikelyToResultIn_RiskIndividual,
		 * riskOfContextIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_IsLikelyToResultIn_RiskIndividual,
		 * isLikelyToResultIn));
		 * }
		 * 
		 * if (json.get("monitoringBehaviorInMemberstate") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject,
		 * ContextOfProcessing_Involves_MonitoringOfDataInMemberstateIndividual,
		 * contextOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Has_RiskIndividual,
		 * monitoringOfDataInMemberstateIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Has_RiskIndividual, involves));
		 * 
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Has_ActivityIndividual,
		 * contextOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Has_ActivityIndividual,
		 * monitoringOfDataInMemberstateIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Has_ActivityIndividual, affects));
		 * }
		 * 
		 * if (json.get("offeringOfGoods") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Involves_OfferingOfGoodIndividual,
		 * contextOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Involves_OfferingOfGoodIndividual,
		 * offeringOfGoodsIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Involves_OfferingOfGoodIndividual, involves));
		 * 
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Has_ActivityIndividual,
		 * contextOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Has_ActivityIndividual,
		 * offeringOfGoodsIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Has_ActivityIndividual, affects));
		 * }
		 * 
		 * if (json.get("offeringOfServices") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Involves_OfferingOfServicesIndividual,
		 * contextOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Involves_OfferingOfServicesIndividual,
		 * offeringOfServicesIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Involves_OfferingOfServicesIndividual,
		 * involves));
		 * 
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ContextOfProcessing_Has_ActivityIndividual,
		 * contextOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, ContextOfProcessing_Has_ActivityIndividual,
		 * offeringOfServicesIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ContextOfProcessing_Has_ActivityIndividual, affects));
		 * }
		 * 
		 * }
		 * 
		 * if (json.get("purposeOfProcessing") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processing_Has_PurposeOfProcessingIndividual,
		 * processingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processing_Has_PurposeOfProcessingIndividual,
		 * purposeOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processing_Has_PurposeOfProcessingIndividual, has));
		 * 
		 * if (json.get("riskRelatedToPurpose") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, PurposeOfProcessing_Has_RiskIndividual,
		 * purposeOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, PurposeOfProcessing_Has_RiskIndividual,
		 * riskOfPurposeIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, PurposeOfProcessing_Has_RiskIndividual, has));
		 * }
		 * 
		 * if (json.get("riskRelatedToPurpose") != null) {
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, PurposeOfProcessing_IsLikelyToResultIn_RiskIndividual,
		 * purposeOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, PurposeOfProcessing_IsLikelyToResultIn_RiskIndividual,
		 * riskOfPurposeIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, PurposeOfProcessing_IsLikelyToResultIn_RiskIndividual,
		 * isLikelyToResultIn));
		 * }
		 * }
		 * 
		 * if (json.get("scopeOfProcessing") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processing_Has_ScopeIndividual, processingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processing_Has_ScopeIndividual, scopeIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processing_Has_ScopeIndividual, has));
		 * 
		 * if (json.get("riskRelatedToScope") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Scope_Has_RiskIndividual, scopeIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Scope_Has_RiskIndividual, riskOfScopeIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Scope_Has_RiskIndividual, has));
		 * }
		 * 
		 * if (json.get("riskRelatedToScope") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ScopeOfProcessing_IsLikelyToResultIn_RiskIndividual,
		 * scopeIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject, ScopeOfProcessing_IsLikelyToResultIn_RiskIndividual,
		 * riskOfScopeIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ScopeOfProcessing_IsLikelyToResultIn_RiskIndividual,
		 * isLikelyToResultIn));
		 * }
		 * }
		 * 
		 * if (json.get("technologyOfProcessing") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processing_Has_TechnologyIndividual, processingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processing_Has_TechnologyIndividual, technologyIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processing_Has_TechnologyIndividual, has));
		 * 
		 * if (json.get("riskRelatedToTechnology") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Technology_Has_RiskIndividual, technologyIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Technology_Has_RiskIndividual, riskOfTechnologyIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Technology_Has_RiskIndividual, has));
		 * }
		 * 
		 * if (json.get("riskRelatedToTechnology") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, TechnologyOfProcessing_IsLikelyToResultIn_RiskIndividual,
		 * technologyIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, TechnologyOfProcessing_IsLikelyToResultIn_RiskIndividual,
		 * riskOfTechnologyIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasVerb, TechnologyOfProcessing_IsLikelyToResultIn_RiskIndividual,
		 * isLikelyToResultIn));
		 * }
		 * }
		 * }
		 * 
		 * if (json.get("nameOfProcessor") != null) {
		 * for (int i = 0; i < processorIndividuals.size(); i++) {
		 * OWLIndividual processorIndividual = processorIndividuals.get(i);
		 * OWLIndividual approvedCodeOfConductProcessorIndividual = approvedCodeOfConductProcessorIndividuals.get(i);
		 * if (json.get("purposeOfProcessing") != null) { // TODO this has to be the purpose which is part of the dpia
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_Assesses_PurposeOfProcessingIndividual,
		 * processorIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_Assesses_PurposeOfProcessingIndividual,
		 * purposeOfProcessingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_Assesses_PurposeOfProcessingIndividual, assesses));
		 * }
		 * 
		 * if (json.get("process") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_Controls_ProcessIndividual, processorIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_Controls_ProcessIndividual, processIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_Controls_ProcessIndividual, controls));
		 * }
		 * 
		 * if (json.get("memberstatelaw") != null) { // TODO specify this in scenario and in json!!!
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_IsAuthorizedBy_MemberStatelawIndividual,
		 * processorIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_IsAuthorizedBy_MemberStatelawIndividual,
		 * memberStateLawIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_IsAuthorizedBy_MemberStatelawIndividual,
		 * isAuthorizedBy));
		 * }
		 * 
		 * if (json.get("") != null) { // TODO add the whole authorization concept to scenario and json!!! -> this needs to be an array
		 * // as well
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_IsAuthorizedBy_UnionlawIndividual,
		 * processorIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_IsAuthorizedBy_UnionlawIndividual,
		 * unionLawIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_IsAuthorizedBy_UnionlawIndividual, isAuthorizedBy));
		 * }
		 * 
		 * if (json.get("processorAppliedApprovedCodeOfConduct") != null) {
		 * // TODO make another check here -> only if value says yes
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_IsCompliantWith_ApprovedCodeOfConductIndividual,
		 * processorIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_IsCompliantWith_ApprovedCodeOfConductIndividual,
		 * approvedCodeOfConductProcessorIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_IsCompliantWith_ApprovedCodeOfConductIndividual,
		 * isCompliantWith));
		 * }
		 * 
		 * if (json.get("") != null) { // TODO get a check of scenario if the view is supposed to be seeked -> not yet in the scenario
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_SeeksViewOf_DataSubjectIndividual,
		 * processorIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_SeeksViewOf_DataSubjectIndividual,
		 * dataSubjectIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_SeeksViewOf_DataSubjectIndividual, seeksViewOf));
		 * }
		 * 
		 * if (json.get("") != null) { // TODO get a check of scenario if the view is supposed to be seeked -> not yet in the scenario
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Processor_SeeksViewOf_RepresentativeOfDataSubjectIndividual,
		 * processorIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Processor_SeeksViewOf_RepresentativeOfDataSubjectIndividual,
		 * representativeOfDataSubjectIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Processor_SeeksViewOf_RepresentativeOfDataSubjectIndividual,
		 * seeksViewOf));
		 * }
		 * 
		 * }
		 * }
		 * 
		 * if (json.get("review") != null && json.get("process") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Review_Checks_ProcessIndividual, reviewIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, Review_Checks_ProcessIndividual, processIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Review_Checks_ProcessIndividual, checks));
		 * }
		 */

		/*
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, Risk_ChangesIndividual, riskIndividual));
		 * // TODO define which risk has actually changed
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, Risk_ChangesIndividual, changes));
		 */

		/*
		 * if (json.get("consistencyMechnism").toString().equals("yes")) {
		 * if (json.get("supervisoryAuthorityThatAppliedConsistencyMechanism") != null) { // TODO add this value to scenario and json
		 * // //TODO create directly individual of
		 * // consistency mechnism
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, SupervisoryAuthority_Applies_ConsistencyMechanismIndividual,
		 * supervisoryAuthorityThatAppliedConsistencyMechanismIndividual));// TODO check which supervisoryAUthority applied it
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, SupervisoryAuthority_Applies_ConsistencyMechanismIndividual,
		 * consistencymechanismIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, SupervisoryAuthority_Applies_ConsistencyMechanismIndividual,
		 * applies));
		 * }
		 * if (json.get("processing") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, ConsistencyMechanism_IsAppliedTo_ProcessingIndividual,
		 * consistencymechanismIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, ConsistencyMechanism_IsAppliedTo_ProcessingIndividual,
		 * processingIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, ConsistencyMechanism_IsAppliedTo_ProcessingIndividual,
		 * isAppliedTo));
		 * }
		 * }
		 * 
		 * if (json.get("nameOfSupervisoryAuthorityThatControlsProcessCriminalConviction") != null
		 * || json.get("nameOfSupervisoryAuthorityThatControlsProcessCriminalOffense") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, SupervisoryAuthority_Controls_ProcessIndividual,
		 * supervisoryAuthorityThatControlsProcessIndividual));
		 * // TODO supervisory authority of criminal conviction or offense ?!
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, SupervisoryAuthority_Controls_ProcessIndividual,
		 * processIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, SupervisoryAuthority_Controls_ProcessIndividual, controls));
		 * }
		 * 
		 * if (json.get("viewOfPerson") != null || json.get("viewOfRepresentativeOfPerson") != null) {
		 * if (json.get("viewOfPerson") == null) {
		 * viewDataSubjectIndividual = viewRepresenativeDataSubjectIndividual;
		 * }
		 * if (json.get("riskOfPersonsViewToCommercialInterest") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, View_Respects_CommercialInterestIndividual,
		 * viewDataSubjectIndividual));
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasObject, View_Respects_CommercialInterestIndividual,
		 * riskToCommercialInterestIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, View_Respects_CommercialInterestIndividual, respects));
		 * }
		 * 
		 * if (json.get("riskOfPersonsViewToPublicInterest") != null) {
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSubject, View_Respects_PublicInterestIndividual,
		 * viewDataSubjectIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, View_Respects_PublicInterestIndividual,
		 * riskToPublicInterestIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, View_Respects_PublicInterestIndividual, respects));
		 * }
		 * 
		 * if (json.get("riskOfPersonsViewToSecurityOfProcessing") != null) {
		 * axioms.add(
		 * factory.getOWLObjectPropertyAssertionAxiom(hasSubject, View_Respects_SecurityOfProcessingOperationIndividual,
		 * viewDataSubjectIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasObject, View_Respects_SecurityOfProcessingOperationIndividual,
		 * riskToSecurityOfProcessingOperationIndividual));
		 * axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasVerb, View_Respects_SecurityOfProcessingOperationIndividual, respects));
		 * }
		 * }
		 * 
		 * manager.applyChanges(axioms);
		 */

		// save changes to Ontology
		OurOntology.saveOntology(onto, processId);
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
