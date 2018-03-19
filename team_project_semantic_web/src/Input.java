package src;

import java.io.BufferedReader;
import java.io.FileReader;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Input {

	public Input() {
	}

	public void readInputFile(String inputFileName) {
		try {
			BufferedReader input = new BufferedReader(new FileReader(inputFileName));
			String line = input.readLine();
			System.out.println(line);
			JSONObject json = new JSONObject();

			while (line != null) {
				String[] inputParts = line.split(":", -1);
				switch (inputParts[0]) {
				case "ID":
					json.put("processId", inputParts[2]);
					System.out.println(inputParts[2]);
					break;
				case "VersionNumber":
					json.put("versionNumber", inputParts[2]);
					System.out.println(inputParts[2]);
					break;
				case "0.":
					json.put("process", inputParts[2]);
					break;
				case "1.":
					json.put("dpiaName", inputParts[2]);
					break;
				case "2.":
					json.put("dpiaCreationDate", inputParts[2]);
					break;
				case "3.1":
					json.put("dpoIsDesignated", inputParts[2]);
					break;
				case "3.2":
					json.put("nameDataProtectionOfficer", inputParts[2]);
					break;
				case "4.1":
					json.put("systematicDescriptionOfProcessing", inputParts[2]);
					break;
				case "4.2":
					json.put("purposeOfProcessing", inputParts[2]);
					break;
				case "4.3":
					json.put("legitimateInterestOfProcessing", inputParts[2]);
					break;
				case "4.4":
					json.put("assessmentOfNecessity", inputParts[2]);
					break;
				case "4.5":
					json.put("assessmentOfProportionality", inputParts[2]);
					break;
				case "4.6":
					json.put("assessmentOfRisks", inputParts[2]);
					break;
				case "4.7":
					json.put("measureToAddressRisksDpia", inputParts[2]);
					break;
				case "4.7.1":
					json.put("safeguard", inputParts[2]);
					break;
				case "4.7.2":
					json.put("securityMeasure", inputParts[2]);
					break;
				case "4.7.3":
					json.put("mechanismsToEnsureProtectionOfData", inputParts[2]);
					break;
				case "4.7.4":
					json.put("measureCompliantTogdpr", inputParts[2]);
					break;
				case "4.7.5":
					json.put("measureTakeIntoAccountRights", inputParts[2]);
					break;
				case "5.":
					json.put("processing", inputParts[2]);
					break;
				case "5.1":
					json.put("contentOfProcessing", inputParts[2]);
					break;
				/*
				 * case "5.1.1":
				 * json.put("", inputParts[2]);
				 * break;
				 */
				case "5.1.1.1":
					json.put("offeringOfGoods", inputParts[2]);
					break;
				case "5.1.1.2":
					json.put("offeringOfServices", inputParts[2]);
					break;
				case "5.1.1.3":
					json.put("freeMovementOfData", inputParts[2]);
					break;
				case "5.1.1.4":
					json.put("monitoringBehaviorInMemberstate", inputParts[2]);
					break;
				case "5.1.2":
					json.put("riskRelatedToContent", inputParts[2]);
					break;
				case "5.1.2.1":
					json.put("contentRiskUpdated", inputParts[2]);
				case "5.2":
					json.put("purposeOfProcessing", inputParts[2]);
					break;
				case "5.2.1":
					json.put("riskRelatedToPurpose", inputParts[2]);
					break;
				case "5.2.1.1":
					json.put("purposeRiskUpdated", inputParts[2]);
				case "5.3":
					json.put("scopeOfProcessing", inputParts[2]);
					break;
				case "5.3.1":
					json.put("riskRelatedToScope", inputParts[2]);
					break;
				case "5.3.1.1":
					json.put("scopeRiskUpdated", inputParts[2]);
				case "5.4":
					json.put("technologyOfProcessing", inputParts[2]);
					break;
				case "5.4.1":
					json.put("riskRelatedToTechnology", inputParts[2]);
					break;
				case "5.4.1.1":
					json.put("technologyRiskUpdated", inputParts[2]);
				case "6.1":
					json.put("consistencyMechanism", inputParts[2]);
					break;
				case "6.2":
					json.put("nameSupervisoryAuthorityThatAppliedConsistencyMechanism", inputParts[2]);
				case "7.":
					json.put("evaluation", inputParts[2]);
					break;
				case "7.1":
					json.put("automatedProcessing", inputParts[2]);
					break;
				case "7.2":
					json.put("profiling", inputParts[2]);
					break;
				case "7.3":
					json.put("legalEffect", inputParts[2]);
					break;
				case "8.":
					json.put("nameOfListWithAllProcessesThatNeedDpia", inputParts[2]);
					break;
				case "8.1":
					json.put("listDpiaPublishedToPublic", inputParts[2]);
					break;
				case "8.2":
					json.put("listDpiaPublishedToEDPB", inputParts[2]);
					break;
				case "8.3":
					json.put("nameSupervisoryAuthotityThatCreatedListDpia", inputParts[2]);
					break;
				case "9.":
					json.put("nameOfListwithAllProcessesThatDoNotNeedDpia", inputParts[2]);
					break;
				case "9.1":
					json.put("listNoDpiaPublishedToPublic", inputParts[2]);
					break;
				case "9.2":
					json.put("listNoDpiaPublishedToEDPB", inputParts[2]);
					break;
				case "9.3":
					json.put("nameSupervisoryAuthorityThatCreatedListNoDpia", inputParts[2]);
					break;
				case "10.":
					json.put("dataRelatesToNaturalPerson", inputParts[2]);
					break;
				case "11.":
					json.put("dataUsedForProcessing", inputParts[2]);
					break;
				case "11.1":
					json.put("racialOrigin", inputParts[2]);
					break;
				case "11.2":
					json.put("ethnicOrigin", inputParts[2]);
					break;
				case "11.3":
					json.put("politicalOpinion", inputParts[2]);
					break;
				case "11.4":
					json.put("religiousBelief", inputParts[2]);
					break;
				case "11.5":
					json.put("philosophicalBelief", inputParts[2]);
					break;
				case "11.6":
					json.put("tradeUnionMembership", inputParts[2]);
					break;
				case "11.7":
					json.put("geneticData", inputParts[2]);
					break;
				case "11.8":
					json.put("biometricData", inputParts[2]);
					break;
				case "11.9":
					json.put("health", inputParts[2]);
					break;
				case "11.10":
					json.put("sexLife", inputParts[2]);
					break;
				case "11.11":
					json.put("sexualOrientation", inputParts[2]);
					break;
				case "11.12":
					json.put("criminalConviction", inputParts[2]);
					break;
				case "11.12.1":
					json.put("nameOfSupervisoryAuthorityThatControlsProcessCriminalConviction", inputParts[2]);
					break;
				case "11.13":
					json.put("criminalOffense", inputParts[2]);
					break;
				case "11.13.1":
					json.put("nameOfSupervisoryAuthorityThatControlsProcessCriminalOffense", inputParts[2]);
					break;
				case "12.":
					json.put("viewOfPerson", inputParts[2]);
					break;
				case "12.1":
					json.put("riskOfPersonsViewToPublicInterest", inputParts[2]);
					break;
				case "12.2":
					json.put("riskOfPersonsViewToCommercialInterest", inputParts[2]);
					break;
				case "12.3":
					json.put("riskOfPersonsViewToSecurityOfProcessing", inputParts[2]);
					break;
				case "14.":
					json.put("nameOfPublicAreaWhereDataWasMonitored", inputParts[2]);
					break;
				case "15.":
					json.put("firstProcessingDate", inputParts[2]);
					break;
				case "16.":
					json.put("nameOfController", inputParts[2]);
					break;
				case "16.1":
					json.put("controllerAppliedApprovedCodeOfConduct", inputParts[2]);
					break;
				case "16.2":
					json.put("nameSupervisoryAuthorityThatControlsProcess", inputParts[2]);
				case "17.":
					json.put("nameOfProcessor", inputParts[2]);
					break;
				case "17.1":
					json.put("processorAppliedApprovedCodeOfConduct", inputParts[2]);
					break;
				case "17.2.1":
					json.put("memberstatelaw", inputParts[2]);
					break;
				case "17.2.2":
					json.put("unionlawAuthorization", inputParts[2]);
					break;
				case "18.":
					json.put("review", inputParts[2]);
					break;
				default:
					break;
				}

				line = input.readLine();
			}
			// this.printJSON(json);

			Process process = new Process();
			process.createIndividualOfProcess(json);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void printJSON(JSONObject json) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(json.toString());
		String prettyJsonString = gson.toJson(je);
		System.out.println(prettyJsonString);
	}
}
