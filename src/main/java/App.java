import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Guest on 7/31/17.
 */
public class App {
    public static void main(String[] args) {

        Record CD1 = new Record ("Justin Bieber", "Depacito", 2017, 15);
        Record CD2 = new Record ("Beyonce Knowles", "Single Ladies", 2014, 16);
        Record CD3 = new Record ("Rolling Stones", "Rollin", 2000, 10);

        ArrayList<Record> allRecords = new ArrayList<Record>();

        allRecords.add(CD1);
        allRecords.add(CD2);
        allRecords.add(CD3);

        while(true) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to our Record shop. What would you like to do? Enter one of the following options: All Records, Search Price, Search Year, Search Artist");


            try {

                String navigationChoice = bufferedReader.readLine();

                if (navigationChoice.equals("All Records")) {
                    for (Record individualRecord : allRecords) {
                        System.out.println("---------------------");
                        System.out.println(individualRecord.artist);
                        System.out.println(individualRecord.album);
                        System.out.println(individualRecord.year);
                        System.out.println(individualRecord.price);
                    }
                } else if (navigationChoice.equals("Search Price")) {
                    System.out.println("What is your budget for record?");
                    String inputBudget = bufferedReader.readLine();
                    int userBudget = Integer.parseInt(inputBudget);
                    System.out.println("Alright, here's what we have in your price range:");
                    for (Record individualRecord : allRecords) {
                        if (individualRecord.worthBuying(userBudget)) {
                            System.out.println("---------------------");
                            System.out.println(individualRecord.artist);
                            System.out.println(individualRecord.album);
                            System.out.println(individualRecord.year);
                            System.out.println(individualRecord.price);
                        }
                    }
                } else if (navigationChoice.equals("Search Year")) {
                    System.out.println("What is your preferred year range?");
                    String inputYear = bufferedReader.readLine();
                    int userYear = Integer.parseInt(inputYear);
                    System.out.println("Alright, heres what we have in your chosen year range.");
                    for (Record individualRecord : allRecords) {
                        if (individualRecord.year ==userYear) {
                            System.out.println("---------------------");
                            System.out.println(individualRecord.artist);
                            System.out.println(individualRecord.album);
                            System.out.println(individualRecord.year);
                            System.out.println(individualRecord.price);
                        }
                    }
                } else if (navigationChoice.equals("Search Artist")) {
                    System.out.println("What is your preferred artist?");
                    String inputArtist = bufferedReader.readLine();
                    System.out.println("Alright, heres what we have in your chosen artist");
                    for (Record individualRecord : allRecords) {
                        if (individualRecord.artist.equals(inputArtist)) {
                            System.out.println("---------------------");
                            System.out.println(individualRecord.artist);
                            System.out.println(individualRecord.album);
                            System.out.println(individualRecord.year);
                            System.out.println(individualRecord.price);
                        } else {
                            System.out.println("No match");
                        }
                    }
                }else {
                    System.out.println("I'm sorry, we don't recognize your input");
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
