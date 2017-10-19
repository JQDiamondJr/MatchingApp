package FrontEnd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserMatchingApp {

	public static void main(String[] args) {

		List<String> preferenceOptions = new ArrayList<String>();
		preferenceOptions.add("Hiking");
		preferenceOptions.add("Biking");
		preferenceOptions.add("Sports");
		preferenceOptions.add("Reading");
		preferenceOptions.add("Cooking");

		System.out.println("User1 Please Enter 3 preferences from the following options: ");
		System.out.println(preferenceOptions);

		Set<String> user1Preferences = collectUserPreferences();
		System.out.println("User 1 Preferences are " + user1Preferences);

		System.out.println("User2 Please Enter 3 preferences from the following options: ");
		System.out.println(preferenceOptions);

		Set<String> user2Preferences = collectUserPreferences();
		System.out.println("User 2 Preferences are " + user2Preferences);

	}

	public static Set<String> collectUserPreferences() {

		Scanner scan = new Scanner(System.in);
		Set<String> userPreferences = new HashSet();
		for (int i = 0; i < 3; i++) {
			userPreferences.add(scan.nextLine());
		}

		return userPreferences;

	}

}
