import java.io.IOException;
import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		
		Scanner ui = new Scanner(System.in);
		
		System.out.println("Welcome to Mad Libs!");
		System.out.println("The instructions are simple. You'll be given a part of speech, and you simply have to type any word that fits. At the end, your words will fill in the blanks of a story!");
		System.out.println("Type the number of the story below you'd like to try.");
		System.out.println("1. Romeo and Juliet: Prologue");
		System.out.println("2. Dragons");
		System.out.println("3. Weird Day");
	
		boolean done = false;
		String no;
		
		while (done != true) {
			
			no = ui.next();
		
			if (no.equals("1")) {
				done = true;
				one();
			}
			else if (no.equals("2")) {
				done = true;
				two();
			}
			else if (no.equals("3")) {
				done = true;
				three();
			}
			else {
				System.out.println("Oops! We didn't recognise that input. Make sure you type just the number of the story you want to try.");
			}
		}

	}
	
	public static void one() {
		Scanner ui = new Scanner(System.in);
		String one;
		String two;
		String three;
		String four;
		String five;
		String six;
		String seven;
		String eight;
		String nine;
		String ten;
		String eleven;
		
		System.out.println("1. Romeo and Juliet: Prologue");
		
		System.out.print("Noun (plural): ");
		one = ui.next();
		
		System.out.print("Place: ");
		two = ui.next();
		
		System.out.print("Noun: ");
		three = ui.next();
		
		System.out.print("Noun (plural): ");
		four = ui.next();
		
		System.out.print("Noun: ");
		five = ui.next();
		
		System.out.print("Adjective: ");
		six = ui.next();
		
		System.out.print("Verb: ");
		seven = ui.next();
		
		System.out.print("Number: ");
		eight = ui.next();
		
		System.out.print("Adjective: ");
		nine = ui.next();
		
		System.out.print("Body part: ");
		ten = ui.next();
		
		System.out.print("Verb: ");
		eleven = ui.next();
		
		System.out.println("All done! Type your name and hit enter to see your story.");
		System.out.println("Romeo and Juliet: Prologue by " + ui.next());
		
		System.out.print("\nTwo " + one + ", both alike in dignity,\r\n" + 
				"In fair " + two + ", where we lay our scene,\r\n" + 
				"From ancient " + three + " break to new mutiny,\r\n" + 
				"Where civil blood makes civil hands unclean.\r\n" + 
				"From forth the fatal loins of these two foes\r\n" + 
				"A pair of star-cross`d " + four + " take their life;\r\n" + 
				"Whole misadventured piteous overthrows\r\n" + 
				"Do with their " + five + " bury their parents` strife.\r\n" + 
				"The fearful passage of their " + six + " love,\r\n" + 
				"And the continuance of their parents rage,\r\n" + 
				"Which, but their children`s end, nought could " + seven + ",\r\n" + 
				"Is now the " + eight + " hours` traffic of our stage;\r\n" + 
				"The which if you with " + nine + " " + ten + " attend,\r\n" + 
				"What here shall " + eleven + ", our toil shall strive to mend.");
		
		System.out.println("\nPress enter to end the program.");
		
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void two() {
		
		Scanner ui = new Scanner(System.in);
		String one;
		String two;
		String three;
		String four;
		String five;
		String six;
		String seven;
		String eight;
		String nine;
		String ten;
		
		System.out.println("2. Dragons");
		
		System.out.print("Colour: ");
		one = ui.next();
		
		System.out.print("Superlative (ending in \"est\"): ");
		two = ui.next();
		
		System.out.print("Adjective: ");
		three = ui.next();
		
		System.out.print("Body part (plural): ");
		four = ui.next();
		
		System.out.print("Body part: ");
		five = ui.next();
		
		System.out.print("Noun: ");
		six = ui.next();
		
		System.out.print("Animal (plural): ");
		seven = ui.next();
		
		System.out.print("Adjective: ");
		eight = ui.next();
		
		System.out.print("Adjective: ");
		nine = ui.next();
		
		System.out.print("Adjective: ");
		ten = ui.next();
		
		System.out.println("All done! Type your name and hit enter to see your story.");
		System.out.print("Dragons by " + ui.next());
		
		System.out.print("\nThe " + one + " Dragon is the " + two + " Dragon of all. It has " + three + " " + four + ", and a " + five + " shaped like a " + six + ". It loves to eat " + seven + ", although it will feast on nearly anything. It is " + eight + " and " + nine + ". You must be " + ten + " around it, or you may end up as its meal!");
		
		System.out.println("\nPress enter to end the program.");
		
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void three() {
		
		Scanner ui = new Scanner(System.in);
		String one;
		String two;
		String three;
		String four;
		String five;
		String six;
		String seven;
		String eight;
		String nine;
		String ten;
		String eleven;
		String twelve;
		String thirteen;
		
		System.out.println("3. Weird Day");
		
		System.out.print("Noun: ");
		one = ui.next();
		
		System.out.print("Adjective: ");
		two = ui.next();
		
		System.out.print("Noun (plural): ");
		three = ui.next();
		
		System.out.print("Famous person: ");
		four = ui.next();
		
		System.out.print("Place: ");
		five = ui.next();
		
		System.out.print("Verb ending in \"ing\": ");
		six = ui.next();
		
		System.out.print("Adjective: ");
		seven = ui.next();
		
		System.out.print("Your favourite song: ");
		eight = ui.next();
		
		System.out.print("Verb ending in \"ed\": ");
		nine = ui.next();
		
		System.out.print("Adverb: ");
		ten = ui.next();
		
		System.out.print("Verb ending in \"ing\": ");
		eleven = ui.next();
		
		System.out.print("Name of somebody you know: ");
		twelve = ui.next();
		
		System.out.print("Adjective: ");
		thirteen = ui.next();
		
		System.out.println("All done! Type your name and hit enter to see your story.");
		System.out.print("Weird Day by " + ui.next());
		
		System.out.print("\nOnce upon a time there was a " + one + ". It had " + two + " " + three + "! One day it met " + four + " on the side of the " + five + " they were " + six + ". It was very " + seven + "; they both looked like hobos! All of the sudden they started singing " + eight + " really loudly. They " + nine + " really " + ten + "! " + four + " started " + eleven + " with " + twelve + ". They looked really " + thirteen + "!");
		
		System.out.println("\nPress enter to end the program.");
		
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}