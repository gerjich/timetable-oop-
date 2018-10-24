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
		System.out.print("Hello\n");
		while (true){
			String s = scan.nextLine();
			System.out.println(FirstPack.Questions.GetAnser(s));
		}		
	}
}
