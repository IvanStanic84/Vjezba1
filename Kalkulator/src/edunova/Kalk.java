package edunova;

public class Kalk {

	
	

	
	
	public String countChars(String ime1, String ime2) {
		String combinedString = ime1 + ime2;

		String strAllChars = "";
		String strCount = "";
		for (char c1 : combinedString.toCharArray()) {
			if (strAllChars.indexOf(c1) < 0) {
				int count = 0;
				for (char c2 : combinedString.toCharArray()) {
					if (c1 == c2) {
						count = count + 1;
					}
				}
				
				strAllChars = strAllChars + c1;
				strCount = strCount + String.valueOf(count);
			}
		}
		return strCount;
	}

	public String shortenNumber(String str) {
		String shortenString = "";
		if (str.length() >= 2) {
			int int1 = Integer.parseInt(String.valueOf(str.toCharArray()[0]));
			int int2 = Integer.parseInt(String.valueOf(str.toCharArray()[str.length() - 1]));
			shortenString = String.valueOf(int1 + int2) + shortenNumber(str.substring(1, str.length() - 1));
		} else {
			return str;

		}
		return shortenString;
	}

	public String rekurzija(String ime1, String ime2) {
		String shortString = countChars(ime1, ime2);
		String output = shortString;
		do {
			output = output + "\n";
			shortString = shortenNumber(shortString);
			if (shortString.length() == 2) {
				output = output + "\n";
			}
			output = output + shortString;
		} while (shortString.length() > 2);
		output = output + "%";
		return output;

	}

}
