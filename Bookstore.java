import java.util.ArrayList;
import java.io.IOException;

public class Bookstore {
    public String storeName; 
    public String storeAddress;
    public Integer sqFootage;
    public Boolean usedBooks;
    public Boolean isOpen;
    public Boolean openWeekends;
    public Boolean openSunday;
    public String storeHours;
    private ArrayList<String> titles;
    
    public Bookstore() {
        titles = new ArrayList<String>();
        loadTitles();
    }

    public int getTotalBooks(){
        return titles.size();
    }

       
    public Bookstore(String name, String address) {
        this.storeName = name;
        this.storeAddress = address;
        titles = new ArrayList<String>();
        loadTitles();

    }

    public Bookstore(String name, String address, int sqFt,Boolean books) {
        this.storeName = name;
        this.storeAddress = address;
        this.sqFootage = sqFt;
        this.usedBooks = books;
        titles = new ArrayList<String>();
        loadTitles();

    }

    public Bookstore(String name, String address, int sqFt,Boolean books, Boolean open, Boolean weekends, Boolean sunday, String time) {
        this.storeName = name;
        this.storeAddress = address;
        this.sqFootage = sqFt;
        this.usedBooks = books;
        this.isOpen = open;
        this.openWeekends = weekends;
        this.openSunday = sunday;
        this.storeHours = time;
        titles = new ArrayList<String>();
        loadTitles();
    }

   
    public void details(){
        System.out.println(storeName);
        System.out.println(storeAddress);
        System.out.println("The store location is " + sqFootage + " square feet");


        if(usedBooks == true){
            System.out.println("We carry both new and used books for your convenience");
        } else {
            System.out.println("At this time we only carry new books.");
        }
        if(isOpen == true) {
            System.out.println("The store is currently open during business hours");
        } else {
            System.out.println("We are outside of business hours and the store is closed.");
        }

        if (openWeekends == true){
            System.out.println("We are open on weekends.");
        } else {
            System.out.println("We are not open on the weekends.");
        }

        if (openWeekends == false && openSunday == true){
            System.out.println("We are open all Sundays, unless it's the fifth Sunday of a month");
        } else {
            System.out.println("We are closed every Sunday except it is the fifth Sunday of the month.");
        }

        System.out.println("On days we are open are store hours are " +storeHours + ".");
    }

    private void loadTitles(){
        try{
            Utils.loadStringsToArray(this.titles);
        }catch(IOException e) {
            System.out.println("Could not initialize titles");
            this.titles = new ArrayList<String>();
        }

    }
}