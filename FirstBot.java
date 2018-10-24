package FirstPack;


import java.io.*;
import java.util.Scanner;

public class FirstBot {

	public static void main(String[] args) {
		FirstPack.Questions.MakeDict();
		Chat();
	}
	public static void Chat(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Hello \n"+ FirstPack.Questions.GetAnser("help"));
		while (true){
			String s = scan.nextLine().toLowerCase();
			if (s.equals("exit"))
				break;
			else
				System.out.println(FirstPack.Questions.GetAnser(s));
		}		
	}
}
