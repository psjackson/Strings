package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variables to hold the 5 questions and the corresponding correct answers
        String question1 = "Mary had a little _____.";
        String correctAnswer1 = "lamb";
        String question2 = "Hickory Dickory Dock, the _____ ran up the clock.";
        String correctAnswer2 = "mouse";
        String question3 = "Humpty Dumpty sat on a wall, Humpty Dumpty had a great _____.";
        String correctAnswer3 = "fall";
        String question4 = "I'm a little _____, short and stout.";
        String correctAnswer4 = "teapot";
        String question5 = "Twinkle, twinkle little _____, how I wonder what you are.";
        String correctAnswer5 = "star";

        //variable to hold the users score
        int counter = 0;

        //use the scanner to get the users answers
	    Scanner entry = new Scanner(System.in);

	    //display to the user what the application does
        System.out.println("\nBelow will be displayed 5 lines from well know nursery rhymes, fill in the blanks.\n");

	    //display question one to the user and get the answer and trim it
	    System.out.println("\n" + question1);
	    String answer1 = entry.next();
	    String trimmed1 = answer1.trim();

	    //using ignore case sensitivity compare the users answer to the correct answer
        //if correct, show they are correct and add 1 to their score
	    if (correctAnswer1.equalsIgnoreCase(trimmed1)){
            System.out.println("Yes, the correct answer is " + correctAnswer1 + ".");
            counter ++;
        }
        //else show they are incorrect and show the correct answer
        else {
            System.out.println("That's incorrect. The correct answer is " + correctAnswer1 + ".");
	    }

        //display question two to the user and get the answer and trim it
        System.out.println("\n" + question2);
	    String answer2 = entry.next();
	    String trimmed2 = answer2.trim();

        //using ignore case sensitivity compare the users answer to the correct answer
        //if correct, show they are correct and add 1 to their score
	    if (correctAnswer2.equalsIgnoreCase(trimmed2)){
	        System.out.println("Yes, the correct answer is " + correctAnswer2 + ".");
	        counter ++;
	    }
        //else show they are incorrect and show the correct answer
	    else{
	        System.out.println("That's incorrect. The correct answer is " + correctAnswer2 + ".");
	    }

        //display question three to the user and get the answer and trim it
	    System.out.println("\n" + question3);
	    String answer3 = entry.next();
	    String trimmed3 = answer3.trim();

        //using ignore case sensitivity compare the users answer to the correct answer
        //if correct, show they are correct and add 1 to their score
	    if (correctAnswer3.equalsIgnoreCase(trimmed3)){
            System.out.println("Yes, the correct answer is " + correctAnswer3 + ".");
            counter ++;
        }
        //else show they are incorrect and show the correct answer
        else {
            System.out.println("That's incorrect. The correct answer is " + correctAnswer3 + ".");
        }

        //display question four to the user and get the answer and trim it
        System.out.println("\n" + question4);
        String answer4 = entry.next();
        String trimmed4 = answer4.trim();

        //using ignore case sensitivity compare the users answer to the correct answer
        //if correct, show they are correct and add 1 to their score
        if (correctAnswer4.equalsIgnoreCase(trimmed4)){
            System.out.println("Yes, the correct answer is " + correctAnswer4 + ".");
            counter ++;
        }
        //else show they are incorrect and show the correct answer
        else {
            System.out.println("That's incorrect. The correct answer is " + correctAnswer4 + ".");
        }

        //display question five to the user and get the answer and trim it
        System.out.println("\n" + question5);
        String answer5 = entry.next();
        String trimmed5 = answer5.trim();

        //using ignore case sensitivity compare the users answer to the correct answer
        //if correct, show they are correct and add 1 to their score
        if (correctAnswer5.equalsIgnoreCase(trimmed5)){
            System.out.println("Yes, the correct answer is " + correctAnswer5 + ".");
            counter ++;
        }
        //else show they are incorrect and show the correct answer
        else {
            System.out.println("That's incorrect. The correct answer is " + correctAnswer5 + ".");
        }

        //display the user their score, use if/else based on the score to either congratulate or wish them better luck next tim
        if (counter == 5){
            System.out.println("\nCongratulations! You scored full marks! " + counter + " out of 5!!");
        }
        else if (counter > 1){
            System.out.println("\nWell done! You got " + counter + " out of 5!!");
        }
        else{
            System.out.println("\nYou got " + counter + " out of 5. Better luck next time!");
        }
    }
}
