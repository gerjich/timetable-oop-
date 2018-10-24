package FirstPack;

import java.lang.reflect.Array;
import java.util.*;

public class Questions {
	static Map<String, String> dict = new HashMap<String, String>();
	
	public static void MakeDict() {
		dict.put("Do you like pizza?", "Yes");
		dict.put("Do you like ice cream?", "No");
		dict.put("Do you like sleep?", "I don't know, never tried");
		dict.put("Did you see?", "Of course");
		dict.put("Do you like anime?", "Yes! Did you watch Boku no hero academy?");
		dict.put("Yes", "Nice!");
		dict.put("No", "Hm... You make me sad(");
		dict.put("Скажи мне расписание", "введи день недели");// это вообще нужно???
		dict.put("What books do you like?", "R.G. Burton - They stole my dinosaurs is my favorite book!");
		dict.put("ты знаешь ответ на главный вопрос жизни, вселенной и всего остального?", "42");
		dict.put("ты знаеш главный вопрос жизни, вселенной и всего остального?", "о, это уже не ко мне");
		dict.put("Are you stupid?", "No, I'm computer, I'm very clever");
		dict.put("Did yo saw whe Doctor?", "Doctor Who?");
		dict.put("Do you know the Friday?", "TS told me not to write to her again(");
		dict.put("Why it didn't compile?", "mde");
		dict.put("What shod i do?", "Work");
		dict.put("Tell me the verse","Whose woods these are I think I know \n" +
				                     "His house is in the village, though\n" +
				                     "He will not see me stopping here\n" +
				                     "To watch his woods fill up with snow");
		dict.put("You are cute", "^3^");
	}


	String[] filling_time = {"I'm boring", "someone, please, talk with me", "Hey, is anyone here?", "Have you ever thought about the space-time continuum?"};
//элементы маассива filling_time выводятся в рандомном порядке если пользователь долго не задет вопросы

	public static String GetAnser(String str) {
		String x = dict.get(str);
		//System.out.println(x);
		return x;
	}
	public static String Ask(String str) {
		
		return "yes";
	}
}
