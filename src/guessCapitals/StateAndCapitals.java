package guessCapitals;

import java.util.Map;
import java.util.TreeMap;

public class StateAndCapitals {
	static final Map<String, String> hashMap = new TreeMap<>();
    
	public static Map<String, String> getStates() {    
    hashMap.put("Alabama", "Montgomery");
    hashMap.put("Alaska", "Juneau");
    hashMap.put("Arizona", "Phoenix");
    hashMap.put("Arkansas", "Little Rock");
    hashMap.put("California", "Sacramento");
    hashMap.put("Colorado", "Denver");
    hashMap.put("Connecticut", "Hartford");
    hashMap.put("Delaware", "Dover");
    hashMap.put("Florida", "Tallahassee");
    hashMap.put("Georgia", "Atlanta");
    hashMap.put("Hawaii", "Honolulu");
    hashMap.put("Idaho", "Boise");
    hashMap.put("Illinois", "Springfield");
    hashMap.put("Indiana", "Indianapolis");
    hashMap.put("Iowa", "Des Moines");
    hashMap.put("Kansas", "Topeka");
    hashMap.put("Kentucky", "Frankfort");
    hashMap.put("Louisiana", "Baton Rouge");
    hashMap.put("Maine", "Augusta");
    hashMap.put("Maryland", "Annapolis");
    hashMap.put("Massachusetts", "Boston");
    hashMap.put("Michigan", "Lansing");
    hashMap.put("Minnesota", "St. Paul");
    hashMap.put("Mississippi", "Jackson");
    hashMap.put("Missouri", "Jefferson City");
    hashMap.put("Montana", "Helena");
    hashMap.put("Nebraska", "Lincoln");
    hashMap.put("Nevada", "Carson City");
    hashMap.put("New Hampshire", "Concord");
    hashMap.put("New Jersey", "Trenton");
    hashMap.put("New Mexico", "Santa Fe");
    hashMap.put("New York", "Albany");
    hashMap.put("North Carolina", "Raleigh");
    hashMap.put("North Dakota", "Bismarck");
    hashMap.put("Ohio", "Columbus");
    hashMap.put("Oklahoma", "Oklahoma City");
    hashMap.put("Oregon", "Salem");
    hashMap.put("Pennsylvania", "Harrisburg");
    hashMap.put("Rhode Island", "Providence");
    hashMap.put("South Carolina", "Columbia");
    hashMap.put("South Dakota", "Pierre");
    hashMap.put("Tennessee", "Nashville");
    hashMap.put("Texas", "Austin");
    hashMap.put("Utah", "Salt Lake City");
    hashMap.put("Vermont", "Montpelier");
    hashMap.put("Virginia", "Richmond");
    hashMap.put("Washington", "Olympia");
    hashMap.put("West Virginia", "Charleston");
    hashMap.put("Wisconsin", "Madison");
    hashMap.put("Wyoming", "Cheyenne");
    
    return hashMap;

	}
}
