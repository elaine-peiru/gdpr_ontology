package team_project_semantic_web;

import java.io.BufferedReader;
import java.io.FileReader;

import org.json.simple.JSONObject;

public class Input {

	public Input() {
	}

	public void readInputFile(String inputFileName) {
		try {
			BufferedReader input = new BufferedReader(new FileReader(inputFileName));
			String line = input.readLine();
			JSONObject json = new JSONObject();

			while (line != null) {
				String[] inputParts = line.split(":");
				switch (inputParts[0]) {
				case "0.":
					json.put("process", inputParts[2]);
					break;
				case "1.":
					json.put("dipaName", inputParts[2]);
					break;
				case "2.":
					json.put("dpiaCreationDate", inputParts[2]);
					break;
				case "3.":
					json.put("nameDataProtectionOfficer", inputParts[2]);
					break;
				// case "4.":
				// json.put("", inputParts[2]);
				// break;
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
					json.put("assessmentOfProportionaliry", inputParts[2]);
					break;
				case "4.6":
					json.put("assessmentOfRisks", inputParts[2]);
					break;
				/*
				 * case "4.7":
				 * json.put("", inputParts[2]);
				 * break;
				 */
				case "4.7.1":
					json.put("safeguard", inputParts[2]);
					break;
				case "4.7.2":
					json.put("securityMeasure", inputParts[2]);
					break;
				case "4.7.3":
					json.put("mechanismsToEnsureProtectionOfData", inputParts[2]);
					break;
				case "5.":
					json.put("contentOfProcessing", inputParts[2]);
					break;
				/*
				 * case "5.1":
				 * json.put("", inputParts[2]);
				 * break;
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
					json.put("monitoringBehaviorInMemberstate", inputParts[2]);
					break;
				case "5.1.2":
					json.put("riskRelatedToContent", inputParts[2]);
					break;
				case "5.2":
					json.put("purposeOfProcessing", inputParts[2]);
					break;
				case "5.2.1":
					json.put("riskRelatedToPurpose", inputParts[2]);
					break;
				case "5.3":
					json.put("scopeOfProcessing", inputParts[2]);
					break;
				case "5.3.1":
					json.put("riskRelatedToScope", inputParts[2]);
					break;
				case "5.4":
					json.put("technologyOfProcessing", inputParts[2]);
					break;
				case "5.4.1":
					json.put("riskRelatedToTechnology", inputParts[2]);
					break;
				case "6.":
					json.put("consistencyMechanism", inputParts[2]);
					break;
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
					json.put("dataRelatesToNatrualPerson", inputParts[2]);
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
					json.put("Health", inputParts[2]);
					break;
				case "11.10":
					json.put("sexLife", inputParts[2]);
					break;
				case "11.11":
					json.put("sexualOrientation", inputParts[2]);
					break;
				case "11.12":
					json.put("criminalConvication", inputParts[2]);
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
				case "13.":
					json.put("viewOfRepresentativeOfPerson", inputParts[2]);
					break;
				case "13.1":
					json.put("riskOfRepresentaticesViewToPublicInterest", inputParts[2]);
					break;
				case "13.2":
					json.put("riskOfRepresentativesViewToCommercialInterest", inputParts[2]);
					break;
				case "13.3":
					json.put("riskToRepresentativesViewToSecurityOfProcessing", inputParts[2]);
					break;
				case "14.":
					json.put("NameOfPublicAreaWhereDataWasMonitored", inputParts[2]);
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
				case "17.":
					json.put("nameOfProcessor", inputParts[2]);
					break;
				case "17.1":
					json.put("processorAppliedAppovedCodeOfConduct", inputParts[2]);
					break;
				default:
					break;
				}

				line = input.readLine();
			}

			Process process = new Process();
			process.createIndividualOfProcess(json);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
