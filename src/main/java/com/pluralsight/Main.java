package com.pluralsight;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        String promptAgain = "";
        //ToDo fix do while logic
        do {
            try {
                String[] quotes ={"The only thing we have to fear is fear itself",
                "In the end, we will remember not the words of our enemies, but the silence of our friends.",
                "Be the change that you wish to see in the world.",
                "The unexamined life is not worth living.",
                "Success is not final, failure is not fatal: it is the courage to continue that counts.",
                "Imagination is more important than knowledge.",
                "Do what you can, with what you have, where you are",
                "It always seems impossible until it’s done.",
                "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment",
                "Not all those who wander are lost."};


                System.out.println("Select a number between 1 - 10");
                int userNumber = Integer.parseInt(scanner.nextLine());

                String quote = quotes[userNumber - 1];
                System.out.println(quote);
                
                System.out.println("would you like to see another? (Y/N");
                 promptAgain = scanner.nextLine();
                
                
            } catch (Exception e) {
                System.out.println("Invalid input");
            }

            
        }while(promptAgain.equalsIgnoreCase("Y") || promptAgain.equalsIgnoreCase("YES"));
    }

    private void promptUserForQuote(){

    }

}
