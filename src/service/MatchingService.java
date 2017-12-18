package service;

import java.util.Set;

public class MatchingService {
	
	public double calculateMatchPercentage(
			Set<String> user1Preferences,
			Set<String> user2Preferences) {
		
		//retain all performs set intersection
		//takes common elements between user1Preferences
		//and user2Preferences and puts it in user1Preferences
		user1Preferences.retainAll(user2Preferences);
		//now return number of common elements by total number of elements which is 
		//3 * 100
		double numberOfCommonPreferences = user1Preferences.size();
		double totNumberOfPreferences = user2Preferences.size();
		return numberOfCommonPreferences/totNumberOfPreferences * 100;
	}

}
