//Vladislava Sicicorez
//This program will present a simple wedding planner
//Customer(s)(bride or groom, or both)will be able to choose the location of the wedding from the list,
//choose menu based on the offered option
//based on the preferred start time, customer will receive a suggested timeline
//all the information will be stored in a text file and presented to the customer at the end
//customer's guest list in text format will be sorted and added to the final text file

package Main;

import View.view;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

	    view newSession = new view();// creating new object of class view to run methods
        newSession.intro();
        newSession.ChooseDate();
        newSession.numGuests();
        newSession.MenuChoice();
        newSession.weddingSchedule();
        System.out.println("Would you like to try again? Y/N: ");// getting customer input on re-starting the program (new program outputs will be stored in the same file as previous without overriding the previously stored information)
        Scanner scanner = new Scanner(System.in);
        String restartDecision = scanner.nextLine();
        if (restartDecision.equals("y") || restartDecision.equals("Y")){
            main(args);// recursive call to main to restart the program
        }
        else{
            System.out.println("Good Bye!");
        }

    }
}
