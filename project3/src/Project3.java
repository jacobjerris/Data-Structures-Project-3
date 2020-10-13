//Figure out Git/GitHub integration & version control


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner csvFileName = new Scanner(System.in);

        String line = "";

        //Asks user for CSV file name, searches then loads the entire file
        System.out.print("Please enter the CSV file name: ");
        String csvFile = csvFileName.next();

        int total = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                total++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("\nTotal records read: " + (total - 1) + "\n\n");

        Country[] countries = new Country[total - 1];

        int excellentCounter = 0;
        int veryGoodCounter = 0;
        int goodCounter = 0;
        int fairCounter = 0;
        int poorCounter = 0;


        int indx = 0;
        try (BufferedReader br2 = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br2.readLine()) != null) {
                if (indx > 0) {
                    countries[(indx - 1)] = new Country(line.split(","));
                }
                indx++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        };


        for(int i =0; i < countries.length; i++) {
            if(countries[i].getCFR() < 1) {
                excellentCounter++;
            } else if((countries[i].getCFR() > 1) && (countries[i].getCFR() < 2)) {
                veryGoodCounter++;
            } else if((countries[i].getCFR() > 2) && (countries[i].getCFR() < 5)) {
                goodCounter++;
            } else if ((countries[i].getCFR() > 5) && (countries[i].getCFR() < 10)) {
                fairCounter++;
            } else {
                poorCounter++;
            }
        }
    }
}
