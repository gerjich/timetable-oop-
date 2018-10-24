package FirstPack;

import java.util.*;

public class Questions {
	static Map<String, String> dict = new HashMap<String, String>();
	
	public static void MakeDict() {
		dict.put("monday", "10:40 - 12:10 oop (class 632)\n"
				+ "12:50 - 14:20 Discrete Math lecture (class 509)\n"
				+ "14:30 - 16:00 Economics (class 632)\n"
				+ "16:10 - 17:40 Discrete Math practice (class 601)\n");
		dict.put("tuesday", "12:50 - 14:20 Math practice (class 509)\n"
				+ "14:30 - 16:00 Math lecture (class 621)\n"
				+ "16:10 - 17:40 Architecture (class 632)\n"
				+ "17:50 - 19:20 English \n");
		dict.put("wednesday", "9:00 - 10:30 oop practice (class 511) \n"
				+ "14:15 - 15:45 Phisical calture ");
		dict.put("thursday", "def");
		dict.put("friday", "efg");
		dict.put("saturday", "f");
		dict.put("sunday", "Have a rest");
		dict.put("help", "My name ChatBot \n"
				+ "Iam here to remind you about your timetable \n"
				+ "Enter the day of the week and get your classes \n"
				+ "help - to repeat this text \n"
				+ "exit - to close the program \n");
	}


	String[] filling_time = {"I'm boring", "someone, please, talk with me", "Hey, is anyone here?", "Have you ever thought about the space-time continuum?"};

	public static String GetAnser(String str) {
		String x = dict.get(str);
		return x;
	}
	
	
}
