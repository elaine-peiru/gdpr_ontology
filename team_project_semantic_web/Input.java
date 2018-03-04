package team_project_semantic_web;

import java.io.BufferedReader;
import java.io.FileReader;

import org.json.simple.JSONObject;

public class Input {
	private String dpiaName;

	public Input() {
	}

	public void readInputFile(String inputFileName) {
		try {
			BufferedReader input = new BufferedReader(new FileReader(inputFileName));
			String line = input.readLine();
			JSONObject json = new JSONObject();

			while (line != null) {
				// TODO switch case where all different classes will be filled
				String[] inputParts = line.split(":");
				switch (inputParts[0]) {
				case "1.":
					json.put("dipaName", inputParts[2]);
					break;
				case "2.":
					json.put("dpiaCreationDate", inputParts[2]);
					break;
				case "3.":
					json.put("NameDataProtectionOfficer", inputParts[2]);
					break;
				// case "4.":
				// json.put("", inputParts[2]);
				// break;
				case "4.1":
					json.put("systematicDescriptionOfProcessing", inputParts[2]);
					break;
				case "4.2":
					json.put("PurposeOfProcessing", inputParts[2]);
					break;
				case "4.3":
					json.put("LegitimateInterestOfProcessing", inputParts[2]);
					break;
				case "4.4":
					json.put("AssessmentOfNecessity", inputParts[2]);
					break;
				case "4.5":
					json.put("AssessmentOfProportionaliry", inputParts[2]);
					break;
				case "4.6":
					json.put("AssessmentOfRisks", inputParts[2]);
					break;
				/*
				 * case "4.7":
				 * json.put("", inputParts[2]);
				 * break;
				 */
				case "4.7.1":
					json.put("Safeguard", inputParts[2]);
					break;
				case "4.7.2":
					json.put("", inputParts[2]);
					break;
				case "4.7.3":
					json.put("", inputParts[2]);
					break;
				case "5.":
					json.put("", inputParts[2]);
					break;
				case "5.1":
					json.put("", inputParts[2]);
					break;
				case "5.1.1":
					json.put("", inputParts[2]);
					break;
				case "5.1.1.1":
					json.put("", inputParts[2]);
					break;
				case "5.1.1.2":
					json.put("", inputParts[2]);
					break;
				case "5.1.1.3":
					json.put("", inputParts[2]);
					break;
				case "5.1.2":
					json.put("", inputParts[2]);
					break;
				case "5.2":
					json.put("", inputParts[2]);
					break;
				case "5.2.1":
					json.put("", inputParts[2]);
					break;
				case "5.3":
					json.put("", inputParts[2]);
					break;
				case "5.3.1":
					json.put("", inputParts[2]);
					break;
				case "5.4":
					json.put("", inputParts[2]);
					break;
				case "5.4.1":
					json.put("", inputParts[2]);
					break;
				case "6.":
					json.put("", inputParts[2]);
					break;
				case "7.":
					json.put("", inputParts[2]);
					break;
				case "7.1":
					json.put("", inputParts[2]);
					break;
				case "7.2":
					json.put("", inputParts[2]);
					break;
				case "7.3":
					json.put("", inputParts[2]);
					break;
				case "8.":
					json.put("", inputParts[2]);
					break;
				case "8.1":
					json.put("", inputParts[2]);
					break;
				case "8.2":
					json.put("", inputParts[2]);
					break;
				case "8.3":
					json.put("", inputParts[2]);
					break;
				case "9.":
					json.put("", inputParts[2]);
					break;
				case "9.1":
					json.put("", inputParts[2]);
					break;
				case "9.2":
					json.put("", inputParts[2]);
					break;
				case "9.3":
					json.put("", inputParts[2]);
					break;
				case "10.":
					json.put("", inputParts[2]);
					break;
				case "11.":
					json.put("", inputParts[2]);
					break;
				case "11.1":
					json.put("", inputParts[2]);
					break;
				case "11.2":
					json.put("", inputParts[2]);
					break;
				case "11.3":
					json.put("", inputParts[2]);
					break;
				case "11.4":
					json.put("", inputParts[2]);
					break;
				case "11.5":
					json.put("", inputParts[2]);
					break;
				case "11.6":
					json.put("", inputParts[2]);
					break;
				case "11.7":
					json.put("", inputParts[2]);
					break;
				case "11.8":
					json.put("", inputParts[2]);
					break;
				case "11.9":
					json.put("", inputParts[2]);
					break;
				case "11.10":
					json.put("", inputParts[2]);
					break;
				case "11.11":
					json.put("", inputParts[2]);
					break;
				case "11.12":
					json.put("", inputParts[2]);
					break;
				case "11.12.1":
					json.put("", inputParts[2]);
					break;
				case "11.13":
					json.put("", inputParts[2]);
					break;
				case "11.13.1":
					json.put("", inputParts[2]);
					break;
				case "12.":
					json.put("", inputParts[2]);
					break;
				case "12.1":
					json.put("", inputParts[2]);
					break;
				case "12.2":
					json.put("", inputParts[2]);
					break;
				case "12.3":
					json.put("", inputParts[2]);
					break;
				case "13.":
					json.put("", inputParts[2]);
					break;
				case "13.1":
					json.put("", inputParts[2]);
					break;
				case "13.2":
					json.put("", inputParts[2]);
					break;
				case "13.3":
					json.put("", inputParts[2]);
					break;
				case "14.":
					json.put("", inputParts[2]);
					break;
				case "15.":
					json.put("", inputParts[2]);
					break;
				case "16.":
					json.put("", inputParts[2]);
					break;
				case "16.1":
					json.put("", inputParts[2]);
					break;
				case "17.":
					json.put("", inputParts[2]);
					break;
				case "17.1":
					json.put("", inputParts[2]);
					break;
				default:
					break;

				}

				line = input.readLine();
			}

			Process process = new Process();
			process.createIndividualOfProcess(); // TODO add all the arguments here
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
