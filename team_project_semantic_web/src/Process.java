package src;

import java.io.File;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.*;
import org.semanticweb.kaon2.api.DefaultOntologyResolver;
import org.semanticweb.kaon2.api.KAON2Exception;
import org.semanticweb.kaon2.api.KAON2Manager;
import org.semanticweb.kaon2.api.Ontology;
import org.semanticweb.kaon2.api.OntologyChangeEvent;
import org.semanticweb.kaon2.api.OntologyManager;
import org.semanticweb.kaon2.api.formatting.OntologyFileFormat;
import org.semanticweb.kaon2.api.owl.elements.Description;
import org.semanticweb.kaon2.api.owl.elements.Individual;
import org.semanticweb.kaon2.api.owl.elements.OWLClass;
import org.semanticweb.kaon2.api.owl.elements.ObjectProperty;

public class Process {
	private String uriString;
	private OntologyManager ontologyManager;
	private DefaultOntologyResolver resolver;
	private String registeredUri;

	public Process() throws Exception {
		this.ontologyManager = KAON2Manager.newOntologyManager();
		this.resolver = new DefaultOntologyResolver();
		URI uri = new File("src/root-ontology.owl").toURI();
		this.uriString = uri.toString();
		this.resolver.registerReplacement("http://purl.org/net/team_project_semantic_web", "src/root-ontology.owl");
		this.ontologyManager.setOntologyResolver(this.resolver);
	}

	public void test() {
		try {

			// System.out.println(uri);

			// System.out.println(this.uriString);

			String replacement = this.resolver.getReplacement("http://purl.org/net/team_project_semantic_web");
			System.out.println(replacement);
			HashMap<String, Object> parameters = new HashMap<String, Object>();
			// parameters.put(OntologyManager.USE_FORMAT_NAME, OntologyFileFormat.OWL_XML);
			Ontology onto = this.ontologyManager.openOntology("http://purl.org/net/team_project_semantic_web", parameters);
			// Ontology onto = this.ontologyManager.createOntology(this.uriString, parameters);

			OWLClass data = KAON2Manager.factory().owlClass("http://purl.org/net/team_project_semantic_web" + "#data");

			// We can now ask the document object to return all subclasses. In fact, we get a set of
			// Description objects. Remember that in OWL, apart from classes, you can build complex description classes.
			Set<Description> subDescriptions = data.getSubDescriptions(onto);
			int i = subDescriptions.size();
			System.out.println("Length:" + i);

			// We can now iterate over this set. We filter out atomic classes by checking for
			// each description if it is an instance of OWLClass.
			// Note that this will include subclasses defined in 'example01', as well as in 'example01-inc' ontology.
			// System.out.println("The subclasses of '" + data.getthis.uriString() + "' are:");
			for (Description subDescription : subDescriptions)
				if (subDescription instanceof OWLClass) {
					OWLClass subClass = (OWLClass) subDescription;
					System.out.println("    " + subClass.getURI());
				}
		} catch (KAON2Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createIndividualOfProcess(JSONObject json) {// TODO add arguments that continue all necessary information that is needed for
															// creating an
		// individual of the process
		try {
			Ontology onto = ontologyManager.openOntology(this.uriString, new HashMap<String, Object>());
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
			OWLClass process = KAON2Manager.factory().owlClass(this.uriString + "#process");
			OWLClass processing = KAON2Manager.factory().owlClass(this.uriString + "#processing");
			OWLClass firstProcessingDate = KAON2Manager.factory().owlClass(this.uriString + "#firstProcessingDate");
			Individual processIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("process"));
			Individual processingIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("processing"));
			Individual firstProcessingDateIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("firstProcessingData"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(process, processIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(processing, processingIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(firstProcessingDate, firstProcessingDateIndividual),
					OntologyChangeEvent.ChangeType.ADD));

			OWLClass nameOfPublicAreaWhereDataWasMonitored = KAON2Manager.factory().owlClass(this.uriString + "#nameOfPublicAreaWhereDataWasMonitored");
			Individual nameOfPublicAreaWhereDataWasMonitoredIndividual = KAON2Manager.factory()
					.individual(this.uriString + "#" + json.getString("nameOfPublicAreaWhereDataWasMonitored"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(MonitoredInPublicArea, nameOfPublicAreaWhereDataWasMonitoredIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			OWLClass data = KAON2Manager.factory().owlClass(this.uriString + "#data");
			Individual dataIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("data"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(data, dataIndividual), OntologyChangeEvent.ChangeType.ADD));

			OWLClass right = KAON2Manager.factory().owlClass(this.uriString + "#right");
			Individual rightIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("right"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(right, rightIndividual), OntologyChangeEvent.ChangeType.ADD));
			OWLClass naturalPerson = KAON2Manager.factory().owlClass(this.uriString + "#naturalPerson");
			Individual naturalPersonIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("naturalPerson"));
			changes.add(
					new OntologyChangeEvent(KAON2Manager.factory().classMember(naturalPerson, naturalPersonIndividual), OntologyChangeEvent.ChangeType.ADD));

			OWLClass freedoms = KAON2Manager.factory().owlClass(this.uriString + "#freedoms");
			Individual freedomsIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("freedoms"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(freedoms, freedomsIndividual), OntologyChangeEvent.ChangeType.ADD));

			OWLClass representativeOfNaturalPerson = KAON2Manager.factory().owlClass(this.uriString + "#representativeOfNaturalPerson");
			Individual representativeOfNaturalPersonIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("representativeOfNaturalPerson"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(representativeOfNaturalPerson, representativeOfNaturalPersonIndividual),
					OntologyChangeEvent.ChangeType.ADD));

			// TODO for data -> create individuals directly of the subclass
			Individual dataIndividual = KAON2Manager.factory().individual(this.uriString + "#" + this.sData);
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
				ethnicOrigin = KAON2Manager.factory().owlClass(this.uriString + "#ethnicData");
				Individual ethnicOriginIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("ethnicOrigin"));
				changes.add(
						new OntologyChangeEvent(KAON2Manager.factory().classMember(ethnicOrigin, ethnicOriginIndividual), OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(ethnicOrigin, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("racialOrigin")) {
				racialOrigin = KAON2Manager.factory().owlClass(this.uriString + "#racialOrigin");
				Individual racialOriginIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("racialOrigin"));
				changes.add(
						new OntologyChangeEvent(KAON2Manager.factory().classMember(racialOrigin, racialOriginIndividual), OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(racialOrigin, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("politicalOpinion")) {
				politicalOpinion = KAON2Manager.factory().owlClass(this.uriString + "#politicalOpinion");
				Individual politicalOpinionIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("politicalOpinion"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(politicalOpinion, politicalOpinionIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(politicalOpinion, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("religiousBelief")) {
				religiousBelief = KAON2Manager.factory().owlClass(this.uriString + "#religiousBelief");
				Individual religiousBeliefIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("religiousBelief"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(religiousBelief, religiousBeliefIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(religiousBelief, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("philosophicalBelief")) {
				philosophicalBelief = KAON2Manager.factory().owlClass(this.uriString + "#philosophicalBelief");
				Individual philosophicalBeliefIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("philosophicalBelief"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(philosophicalBelief, philosophicalBeliefIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(philosophicalBelief, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("tradeUnionMembership")) {
				tradeUnionMembership = KAON2Manager.factory().owlClass(this.uriString + "#tradeUnionMembership");
				Individual tradeUnionMembershipIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("tradeUnionMembership"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(tradeUnionMembership, tradeUnionMembershipIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(tradeUnionMembership, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("geneticData")) {
				geneticData = KAON2Manager.factory().owlClass(this.uriString + "#geneticData");
				Individual geneticDataIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("geneticData"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(geneticData, geneticDataIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(geneticData, data), OntologyChangeEvent.ChangeType.ADD));
			}

			// add individual of Evaluation

			OWLClass evaluation = KAON2Manager.factory().owlClass(this.uriString + "#evaluation");
			OWLClass automatedProcessing = KAON2Manager.factory().owlClass(this.uriString + "#automatedProcessing");
			OWLClass profiling = KAON2Manager.factory().owlClass(this.uriString + "#profiling");
			OWLClass legalEffect = KAON2Manager.factory().owlClass(this.uriString + "#legalEffect");
			Individual evaluationIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("evaluation"));
			Individual automatedProcessingIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("automatedProcessing"));
			Individual profilingIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("profiling"));
			Individual legalEffectIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("legalEffect"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(evaluation, evaluationIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(automatedProcessing, automatedProcessingIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(profiling, profilingIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(legalEffect, legalEffectIndividual), OntologyChangeEvent.ChangeType.ADD));

			// add individual of view, natural person, representative
			OWLClass view = KAON2Manager.factory().owlClass(this.uriString + "#view");
			OWLClass publicInterest = KAON2Manager.factory().owlClass(this.uriString + "#publicInterest");
			OWLClass commercialInterest = KAON2Manager.factory().owlClass(this.uriString + "#commercialInterest");
			OWLClass secthis.uriStringtyOfProcessing = KAON2Manager.factory().owlClass(this.uriString + "#secthis.uriStringtyOfProcessing");
			OWLClass representative = KAON2Manager.factory().owlClass(this.uriString + "#representative");
			OWLClass naturalPerson = KAON2Manager.factory().owlClass(this.uriString + "#naturalPerson");
			Individual viewIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("view"));
			Individual publicInterestIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("publicInterest"));
			Individual commercialInterestIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("commercialInterest"));
			Individual secthis.uriStringtyOfProcessingIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("secthis.uriStringtyOfProcessing"));
			Individual representativeIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("representative"));
			Individual naturalPersonIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("naturalPerson"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(view, viewIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(
					new OntologyChangeEvent(KAON2Manager.factory().classMember(publicInterest, publicInterestIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(commercialInterest, commercialInterestIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(secthis.uriStringtyOfProcessing, secthis.uriStringtyOfProcessingIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(representative, representativeIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(naturalPerson, naturalPersonIndividual),
					OntologyChangeEvent.ChangeType.ADD));

			// add measures to address risks, safeguard, secthis.uriStringty measure, mechanisms to ensure protection of data
			OWLClass measuresToAddressRisks = KAON2Manager.factory().owlClass(this.uriString + "#measuresToAddressRisks");
			OWLClass safeguard = KAON2Manager.factory().owlClass(this.uriString + "#safeguard");
			OWLClass secthis.uriStringtyMeasures = KAON2Manager.factory().owlClass(this.uriString + "#secthis.uriStringtyMeasures");
			OWLClass mechanismsToEnsureProtectionOfData = KAON2Manager.factory().owlClass(this.uriString + "#mechanismsToEnsureProtectionOfdata");
			Individual measuresToAddressRisksIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("measuresToAddressRisks"));
			Individual safeguardIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("safeguard"));
			Individual secthis.uriStringtyMeasuresIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("secthis.uriStringtyMeasures"));
			Individual mechanismsToEnsureProtectionOfDataIndividual = KAON2Manager.factory()
					.individual(this.uriString + "#" + json.getString("mechanismsToEnsureProtectionOfData"));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(measuresToAddressRisks, measuresToAddressRisksIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(safeguard, safeguardIndividual), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(secthis.uriStringtyMeasures, secthis.uriStringtyMeasuresIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(
					KAON2Manager.factory().classMember(mechanismsToEnsureProtectionOfData, mechanismsToEnsureProtectionOfDataIndividual),
					OntologyChangeEvent.ChangeType.ADD));

			// add individuals of DPIA
			OWLClass systematicDescriptionOfProcessing = KAON2Manager.factory().owlClass(this.uriString + "#systematicDescriptionOfProcessing");
			OWLClass purposeOfProcessing = KAON2Manager.factory().owlClass(this.uriString + "#purposeOfProcessing");
			OWLClass legitimateInterestOfProcessing = KAON2Manager.factory().owlClass(this.uriString + "#legitimateInterestOfProcessing");
			OWLClass assessmentOfNecessityOfProcessing = KAON2Manager.factory().owlClass(this.uriString + "#assessmentOfNecessityOfProcessing");
			OWLClass assessmentOfProportionalityOfProcessing = KAON2Manager.factory().owlClass(this.uriString + "#assessmentOfProportionalityOfProcessing");
			OWLClass assessmentOfRisksAndRightsToFreedom = KAON2Manager.factory().owlClass(this.uriString + "#assessmentOfRisksAndRightsToFreedom");
			Individual systematicDescriptionOfProcessingIndividual = KAON2Manager.factory()
					.individual(this.uriString + "#" + json.getString("systematicDescriptionOfProcessing"));
			Individual purposeOfProcessingIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("purposeOfProcessing"));
			Individual legitimateInterestOfProcessingIndividual = KAON2Manager.factory()
					.individual(this.uriString + "#" + json.getString("legitimateInterestOfProcessing"));
			Individual assessmentOfNecessityOfProcessingIndividual = KAON2Manager.factory()
					.individual(this.uriString + "#" + json.getString("assessmentOfNecessityOfProcessing"));
			Individual assessmentOfProportionalityOfProcessingIndividual = KAON2Manager.factory()
					.individual(this.uriString + "#" + json.getString("assessmentOfProportionalityOfProcessing"));
			Individual assessmentOfRisksAndRightsToFreedomIndividual = KAON2Manager.factory()
					.individual(this.uriString + "#" + json.getString("assessmentOfRisksAndRightsToFreedom"));
			changes.add(
					new OntologyChangeEvent(KAON2Manager.factory().classMember(systematicDescriptionOfProcessing, systematicDescriptionOfProcessingIndividual),
							OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(purposeOfProcessing, purposeOfProcessingIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(legitimateInterestOfProcessing, legitimateInterestOfProcessingIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(
					new OntologyChangeEvent(KAON2Manager.factory().classMember(assessmentOfNecessityOfProcessing, assessmentOfNecessityOfProcessingIndividual),
							OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(
					KAON2Manager.factory().classMember(assessmentOfProportionalityOfProcessing, assessmentOfProportionalityOfProcessingIndividual),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(
					KAON2Manager.factory().classMember(assessmentOfRisksAndRightsToFreedom, assessmentOfRisksAndRightsToFreedomIndividual),
					OntologyChangeEvent.ChangeType.ADD));

			if (json.getString("biometricData")) {
				biometricData = KAON2Manager.factory().owlClass(this.uriString + "#biometricData");
				Individual biometricDataIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("biometricData"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(biometricData, biometricDataIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(biometricData, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("health")) {
				health = KAON2Manager.factory().owlClass(this.uriString + "#health");
				Individual healthIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("health"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(health, healthIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(health, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("biometricData")) {
				biometricData = KAON2Manager.factory().owlClass(this.uriString + "#biometricData");
				Individual biometricDataIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("biometricData"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(biometricData, biometricDataIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(biometricData, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("health")) {
				health = KAON2Manager.factory().owlClass(this.uriString + "#health");
				Individual healthIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("health"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(health, healthIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(health, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("sexLife")) {
				sexLife = KAON2Manager.factory().owlClass(this.uriString + "#sexLife");
				Individual sexLifeIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("sexLife"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(sexLife, sexLifeIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(sexLife, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("sexualOrientation")) {
				sexualOrientation = KAON2Manager.factory().owlClass(this.uriString + "#sexualOrientation");
				Individual sexualOrientationIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("sexualOrientation"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(sexualOrientation, sexualOrientationIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(sexualOrientation, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("criminalOffense")) {
				criminalOffense = KAON2Manager.factory().owlClass(this.uriString + "#criminalOffense");
				Individual criminalOffenseIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("criminalOffense"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(criminalOffense, criminalOffenseIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(criminalOffense, data), OntologyChangeEvent.ChangeType.ADD));
			}
			if (json.getString("criminalConviction")) {
				criminalConviction = KAON2Manager.factory().owlClass(this.uriString + "#criminalConviction");
				Individual criminalConvictionIndividual = KAON2Manager.factory().individual(this.uriString + "#" + json.getString("criminalConviction"));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().classMember(criminalConviction, criminalConvictionIndividual),
						OntologyChangeEvent.ChangeType.ADD));
				changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(criminalConviction, data), OntologyChangeEvent.ChangeType.ADD));
			}

			// TODO add relationships between individuals
			ObjectProperty has = KAON2Manager.factory().objectProperty(this.uriString + "#has");
			ObjectProperty evaluationHasProcessing = KAON2Manager.factory().objectProperty(this.uriString + "#evaluationHasProcessing");
			ObjectProperty evaluationHasLegalEffect = KAON2Manager.factory().objectProperty(this.uriString + "#evaluationHasLegalEffect");

			ObjectProperty naturalPersonHasView = KAON2Manager.factory().objectProperty(this.uriString + "#naturalPersonHasView");
			ObjectProperty representativeHasNaturalPerson = KAON2Manager.factory().objectProperty(this.uriString + "#representativeHasNaturalPerson");
			ObjectProperty viewRisksPublicInterest = KAON2Manager.factory().objectProperty(this.uriString + "#viewRisksPublicInterest");
			ObjectProperty viewRisksCommercialInterest = KAON2Manager.factory().objectProperty(this.uriString + "#viewRisksCommercialInterest");
			ObjectProperty viewRisksSecthis.uriStringtyOfProcessing = KAON2Manager.factory().objectProperty(this.uriString + "#viewRisksSecthis.uriStringtyOfProcessing");

			ObjectProperty naturalPersonRelatesToData = KAON2Manager.factory().objectProperty(this.uriString + "#naturalPersonRelatesToData");

			ObjectProperty measuresToAddressRisksHasSafeguard = KAON2Manager.factory().objectProperty(this.uriString + "#measuresToAddressRisksHasSafeguard");
			ObjectProperty measuresToAddressRisksHasSecthis.uriStringtyMeasures = KAON2Manager.factory()
					.objectProperty(this.uriString + "#measuresToAddressRisksHasSecthis.uriStringtyMeasures");
			ObjectProperty measuresToAddressRisksHasMechanismsToEnsureProtectionOfData = KAON2Manager.factory()
					.objectProperty(this.uriString + "#measuresToAddressRisksHasMechanismsToEnsureProtectionOfData");

			ObjectProperty DPIAHasMeasuresToAddressRisks = KAON2Manager.factory().objectProperty(this.uriString + "#DPIAHasMeasuresToAddressRisks");
			ObjectProperty DPIAHasSystematicDescriptionOfProcessing = KAON2Manager.factory().objectProperty(this.uriString + "#DPIAHasSystematicDescriptionOfProcessing");
			ObjectProperty DPIAHasPurposeOfProcessing = KAON2Manager.factory().objectProperty(this.uriString + "#DPIAHasPurposeOfProcessing");
			ObjectProperty DPIAHasLegitimateInterestOfProcessing = KAON2Manager.factory().objectProperty(this.uriString + "#DPIAHasLegitimateInterestOfProcessing");
			ObjectProperty DPIAHasAssessmentOfNecessityOfProcessing = KAON2Manager.factory().objectProperty(this.uriString + "DPIAHasAssessmentOfNecessityOfProcessing");
			ObjectProperty DPIAHasAssessmentOfProportionalityOfProcessing = KAON2Manager.factory()
					.objectProperty(this.uriString + "DPIAHasAssessmentOfProportionalityOfProcessing");
			ObjectProperty DPIAHasAssessmentOfRisksAndRightsToFreedom = KAON2Manager.factory()
					.objectProperty(this.uriString + "DPIAHasAssessmentOfRisksAndRightsToFreedom");

			// process has processing, process has data and process has first processing date
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, process), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, processing), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, process), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, firstProcessingDate), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, process), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, data), OntologyChangeEvent.ChangeType.ADD));

			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(monitoring, nameOfPublicAreaWhereDataWasMonitored),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(monitoring, data), OntologyChangeEvent.ChangeType.ADD));

			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, naturalPerson), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, right), OntologyChangeEvent.ChangeType.ADD));

			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, naturalPerson), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, freedoms), OntologyChangeEvent.ChangeType.ADD));

			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(has, naturalPerson), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(has, representativeOfNaturalPerson),
					OntologyChangeEvent.ChangeType.ADD));
			// TODO for processing add individuals for the things that are related to processing (...)

			// subclass of evaluation
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(automatedProcessing, evaluation), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().subClassOf(profiling, evaluation), OntologyChangeEvent.ChangeType.ADD));

			// evaluation has processing, evaluation has legal effect
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(evaluationHasProcessing, evaluation),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(evaluationHasProcessing, processing),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(evaluationHasLegalEffect, evaluation),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(evaluationHasLegalEffect, legalEffect),
					OntologyChangeEvent.ChangeType.ADD));

			// natural person has view, representative has natural person, natural person relates to data, view risks public interest,
			// commercial interest, secthis.uriStringty of processing
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(naturalPersonHasView, naturalPerson),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(naturalPersonHasView, view), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(representativeHasNaturalPerson, representative),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(representativeHasNaturalPerson, naturalPerson),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(
					new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(viewRisksPublicInterest, view), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(viewRisksPublicInterest, publicInterest),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(viewRisksCommercialInterest, view),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(viewRisksCommercialInterest, commercialInterest),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(viewRisksSecthis.uriStringtyOfProcessing, view),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(viewRisksSecthis.uriStringtyOfProcessing, secthis.uriStringtyOfProcessing),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(naturalPersonRelatesToData, naturalPerson),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(
					new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(naturalPersonRelatesToData, data), OntologyChangeEvent.ChangeType.ADD));

			// mechanisms
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(measuresToAddressRisksHasSafeguard, measuresToAddressRisks),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(measuresToAddressRisksHasSafeguard, safeguard),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(measuresToAddressRisksHasSecthis.uriStringtyMeasures, measuresToAddressRisks),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(measuresToAddressRisksHasSecthis.uriStringtyMeasures, secthis.uriStringtyMeasures),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(
					KAON2Manager.factory().objectPropertyDomain(measuresToAddressRisksHasMechanismsToEnsureProtectionOfData, measuresToAddressRisks),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(
					KAON2Manager.factory().objectPropertyRange(measuresToAddressRisksHasMechanismsToEnsureProtectionOfData, mechanismsToEnsureProtectionOfData),
					OntologyChangeEvent.ChangeType.ADD));

			// some DPIA
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasMeasuresToAddressRisks, DPIA),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(DPIAHasMeasuresToAddressRisks, measuresToAddressRisks),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasSystematicDescriptionOfProcessing, DPIA),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(
					KAON2Manager.factory().objectPropertyRange(DPIAHasSystematicDescriptionOfProcessing, systematicDescriptionOfProcessing),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(
					new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasPurposeOfProcessing, DPIA), OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(DPIAHasPurposeOfProcessing, purposesOfProcessing),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasLegitimateInterestOfProcessing, DPIA),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(
					new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(DPIAHasLegitimateInterestOfProcessing, legitimateInterestOfProcessing),
							OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasAssessmentOfNecessityOfProcessing, DPIA),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(
					KAON2Manager.factory().objectPropertyRange(DPIAHasAssessmentOfNecessityOfProcessing, assessmentOfNecessityOfProcessing),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasAssessmentOfProportionalityOfProcessing, DPIA),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(
					KAON2Manager.factory().objectPropertyRange(DPIAHasAssessmentOfProportionalityOfProcessing, assessmentOfProportionalityOfProcessing),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(DPIAHasAssessmentOfRisksAndRightsToFreedom, DPIA),
					OntologyChangeEvent.ChangeType.ADD));
			changes.add(new OntologyChangeEvent(
					KAON2Manager.factory().objectPropertyRange(DPIAHasAssessmentOfRisksAndRightsToFreedom, assessmentOfRisksAndRightsToFreedom),
					OntologyChangeEvent.ChangeType.ADD));

			onto.applyChanges(changes);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return onto;
	}

	public void createIndividualOfVerbConcept(JSONObject json) {// TODO add arguments that continue all necessary information that is needed for
		// creating an
		// individual of the verb concept
		try {
	        //Define the domain of verb concept
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, AssessmentOfRisksToRightsAndFreedoms_TakesIntoAccount_Freedom),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, assessmentOfRisksAndRightsToFreedomIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, AssessmentOfRisksToRightsAndFreedoms_TakesIntoAccount_Freedom),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, freedomIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, GeneticData_UniquelyIdentifies_NaturalPerson),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, geneticDataIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, GeneticData_UniquelyIdentifies_NaturalPerson),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, naturalPersonIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, LegalEffect_Concerns_NaturalPerson),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, legalEffectIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, LegalEffect_Concerns_NaturalPerson),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, naturalPersonIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, ListProcessesThatDoNotRequireAssessment_Involves_Process),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, listProcessesThatDoNotRequireAssessmentIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, ListProcessesThatDoNotRequireAssessment_Involves_Process),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, processIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, ListProcessesThatRequireAssessment_Involves_Process),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, listProcessesThatRequireAssessmentIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, ListProcessesThatRequireAssessment_Involves_Process),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, processIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfData),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, measureToAddressRisksIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, MeasureToAddressRisks_Contains_MechanismToEnsureProtectionOfData),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, mechanismToEnsureProtectionOfDataIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, MeasureToAddressRisks_Contains_Safeguard),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, measureToAddressRisksIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, MeasureToAddressRisks_Contains_Safeguard),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, safeguardIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, MeasureToAddressRisks_Contains_SecurityMeasure),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, measureToAddressRisksIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, MeasureToAddressRisks_Contains_SecurityMeasure),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, securityMeasureIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, MeasureToAddressRisks_IsComplaintWith_Gdpr),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, measureToAddressRisksIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, MeasureToAddressRisks_IsComplaintWith_Gdpr),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, gdprIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, NatrualPerson_Has_View),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, natrualPersonIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, NatrualPerson_Has_View),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, viewIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, NaturalPerson_Has_Freedom),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, naturalPersonIndividual),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, NaturalPerson_Has_Freedom),OntologyChangeEvent.ChangeType.ADD));
	        changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, freedomIndividual),OntologyChangeEvent.ChangeType.ADD));}
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, NaturalPerson_Has_Right),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, naturalPersonIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, NaturalPerson_Has_Right),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, rightIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, PersonalAspect_BasesOn_AutomatedProcessing),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, personalAspectIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, PersonalAspect_BasesOn_AutomatedProcessing),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, automatedProcessingIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, PersonalAspect_BasesOn_Profiling),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, personalAspectIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, PersonalAspect_BasesOn_Profiling),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, profilingIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, PersonalAspect_RelatesTo_NaturalPerson),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, personalAspectIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, PersonalAspect_RelatesTo_NaturalPerson),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, naturalPersonIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, Process_Affects_FreeMovementOfData),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, processIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, Process_Affects_FreeMovementOfData),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, freeMovementOfDataIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, Process_Has_DataProtectionImpactAssessment),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, processIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, Process_Has_DataProtectionImpactAssessment),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, dataProtectionImpactAssessmentIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, Process_IsPerformedAccordingTo_DataProtectionImpactAssessment),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, processIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, Process_IsPerformedAccordingTo_DataProtectionImpactAssessment),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, dataProtectionImpactAssessmentIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, Process_RelatesTo_MonitorBehaviorIn),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, processIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, Process_RelatesTo_MonitorBehaviorIn),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, monitorBehaviorInIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, Process_RelatesTo_OfferingOfGood),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, processIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, Process_RelatesTo_OfferingOfGood),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, offeringOfGoodIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, Process_RelatesTo_OfferingOfService),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, processIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, Process_RelatesTo_OfferingOfService),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, offeringOfServiceIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, Processor_IsAuthorizedBy_MemberStatelaw),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, processorIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, Processor_IsAuthorizedBy_MemberStatelaw),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, memberStatelawIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, Processor_IsAuthorizedBy_Unionlaw),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, processorIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, Processor_IsAuthorizedBy_Unionlaw),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, UnionlawIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasSubject, Processor_Assesses_Impact),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasSubject, processorIndividual),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyDomain(hasObject, Processor_Assesses_Impact),OntologyChangeEvent.ChangeType.ADD));
        	changes.add(new OntologyChangeEvent(KAON2Manager.factory().objectPropertyRange(hasObject, impactIndividual),OntologyChangeEvent.ChangeType.ADD));
        	
        	
        }

	public boolean checkProcessAlreadyExists(String processName) {
		boolean processAlreadyExists = false;
		// TODO write check
		return processAlreadyExists;
	}

	public boolean checkPersonAlreadyExists(String personsName, String className) {
		boolean personAlreadyExists = false;
		// TODO write check
		return personAlreadyExists;
	}
}
