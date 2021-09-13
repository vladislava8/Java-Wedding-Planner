package Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import static java.util.Calendar.PM;

public class Wedding {
    public int gNumber;

    public void write(String a) throws IOException { //method to write into customer file "Customer Database" customer ID, first and last name and money to business
        FileWriter fw = new FileWriter("Wedding.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw);
        out.append(a);
        out.append(System.lineSeparator());
        out.close();
    }
    public void numberGuests(String a) throws IOException {
        write("Number of guests: " + a);
    }
    public String timeWork(String time, int add) {// method
        String[] timeSplit1 = time.split(":");
        int hours = Integer.parseInt(timeSplit1[0]);
        String[] timeSplit2 = timeSplit1[1].split(" ");
        int minutes = Integer.parseInt(timeSplit2[0]);
        String AmPm = timeSplit2[1];
        int beginHour = hours;
        int beginMinutes = minutes + add;
        String timeOftheDay = AmPm;
        if (beginHour > 11){
            timeOftheDay = "PM";
        }
        if (beginMinutes > 59) {
            int minutesToHours = beginMinutes/60;
            beginHour = beginHour + minutesToHours;
            beginMinutes = beginMinutes - 60*minutesToHours;
        }
        if (beginMinutes != 0 && beginHour <9) {
            return ("0" + beginHour + ":" + beginMinutes + " " + timeOftheDay);
        }
        else if(beginHour>9 && beginMinutes != 0) {
            return (beginHour + ":" + beginMinutes + " " + timeOftheDay);

        }else if(beginHour>9){
            return (beginHour + ":" + "0" + beginMinutes + " " + timeOftheDay);
        }
          else {
            return ("0" + beginHour + ":" + "0" + beginMinutes + " " + timeOftheDay);
        }
    }
    public void setSchedule(String time) throws IOException {

        String thisTime = timeWork(time,0);
        System.out.println("Your wedding will start at: " + thisTime);
        write ("Your wedding will start at: " + thisTime);
        String ceremonyHour = timeWork (thisTime, 30);
        String ceremonyEndTime = timeWork(ceremonyHour, 30);
        System.out.println("Ceremony time: " + ceremonyHour + " - " + ceremonyEndTime);
        write("Ceremony time: " + ceremonyHour + " - " + ceremonyEndTime);
        String pictureTime = ceremonyEndTime;
        String pictureEnd = timeWork(pictureTime,60);
        String cocktailHour = pictureTime;
        String dinnerTime = timeWork(cocktailHour,60);
        String dinnerEndTime = timeWork(dinnerTime, 120);
        String grandEntry = pictureEnd;
        System.out.println("Time to take pictures: " + pictureTime + " - " + grandEntry);
        write("Time to take pictures: " + pictureTime + " - " + grandEntry);
        System.out.println("Cocktail hour time: " + pictureTime + " - " + grandEntry);
        System.out.println("Grand Entry time: " + grandEntry);
        System.out.println("Dinner time: " + dinnerTime + " - " + dinnerEndTime);
        write("Cocktail hour time: " + pictureTime + " - " + grandEntry);
        write("Grand Entry time: " + grandEntry);
        write("Dinner time: " + dinnerTime + " - " + dinnerEndTime);
        String cakeCuttingTime = dinnerEndTime;
        String weddingProgram = timeWork(cakeCuttingTime, 10);
        String grandExit = timeWork(dinnerEndTime, 120);
        System.out.println("Cake cutting time: " + cakeCuttingTime);
        System.out.println("Wedding program: " + weddingProgram +" - "+ grandExit);
        System.out.println("Grand Exit: " + grandExit);

        write("Cake cutting time: " + cakeCuttingTime);
        write("Wedding program: " + weddingProgram);
        write("Grand Exit: " + grandExit);

    }
}
