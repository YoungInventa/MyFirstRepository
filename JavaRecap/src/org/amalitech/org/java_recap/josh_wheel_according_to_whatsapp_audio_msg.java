package org.amalitech.org.java_recap;

import java.util.Scanner;

public class josh_wheel_according_to_whatsapp_audio_msg {
	
	public static void main  (String[] args) {
		
		//Initializations
		boolean programRunningBool = false;
		
		String codeTriggerStarter = "start";//this causes the program to run

		reRunKeyboardInput(codeTriggerStarter);
		

		}

		static String codeTriggerStopper = "end"; //this causes the program to end

		private static void reRunKeyboardInput(String codeTriggerStarter) {
		boolean programRunningBool;
		
		Scanner input = new Scanner (System.in);//scanner set up
		String whatTheUserEnters = input.nextLine();
		
		System.out.println("You entered: "+ whatTheUserEnters);

		if (whatTheUserEnters.equalsIgnoreCase(codeTriggerStarter)) {

			programRunningBool = true;
		
		System.out.println("Program started......");
		
		for(int i=0; i<=5; i++ ) {
		
		System.out.println("Enter a message to display: ");

		String message = input.nextLine();//This variable takes what the user enters and throws it back to the user

		System.out.println("You entered: " + message);
		
		if(message.equalsIgnoreCase("end")) {
			System.out.println("You are out of the program....bye!!!");
			System.exit(0);
		}
		
		}//end of for loop
		}
		else if (whatTheUserEnters.equalsIgnoreCase(codeTriggerStarter)) {
			
		System.out.println("You are out of the program....bye!!!");
		
		System.exit(0);
		}
		
		// If the user enters wrong input
		else {
		System.out.println(
		"Please restart and enter start to run the program");
		reRunKeyboardInput(codeTriggerStarter);

		}

		}

}
