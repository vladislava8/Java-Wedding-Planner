package View;

import Controller.Controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class view extends Controller {

    Controller run = new Controller(); //creating new object of class Controller to run methods

    public void intro() throws IOException { //this method will greet the customer, present available locations and get location choice

        System.out.println("Congratulations on your engagement! Let's start the wedding planning process");
        System.out.println("");

        System.out.println("Please choose your location: ");
        run.locationOptions();
    }

    public void ChooseDate() throws IOException { //this method will get the wedding date in a dd/mm/yyyy or dd/mm/yy format(wrong format will cause an exception)
        System.out.println("Please enter wedding date in format dd/mm/yyyy");
        Scanner scanner = new Scanner(System.in);
        String chosenDate = scanner.nextLine();
        try {
            run.date(chosenDate);
        } catch (ParseException | IOException e) {
            System.out.println("Wrong date format");
            ChooseDate();
        }
    }

    public void numGuests() throws IOException { //getting number of guests
        System.out.println("Enter number of guests:");
        Scanner scanner1 = new Scanner(System.in);
        numberGuests(scanner1.nextLine());
        run.graphicLine();

    }

    public void MenuChoice() throws IOException {// getting menu choice
        System.out.println("Select your menu: ");
        run.selectMenu();
    }

    public void weddingSchedule() throws IOException {// getting time for wedding schedule and suggesting a schedule
        Scanner scanner = new Scanner(System.in);
        System.out.println("What time would you like to begin wedding activities?(hh:mm aa): ");
        String time = scanner.nextLine();
        try{
            String.format(time, "hh:mm aa");
            run.WedSchedule(time);
        }catch(Exception e){
        System.out.println("Wrong time format. Please try again");
        weddingSchedule();
    }
        addSortedGuestList();// sorting pre-typed in text file guest list
        System.out.println("Congratulations and Thank You for using our planner!");

}
}