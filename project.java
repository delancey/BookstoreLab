import java.util.*;
public class project {
    public static void main(String[] args) {
        Bookstore myStore = new Bookstore ("The Shack", "100 Edge Road\nCharlotte, NC 28213", 500,false, true, false, true,"10AM - 7PM" );
    
        //Bookstore myStore1 = new Bookstore("ShackII", "100 Readers Way\nReadlandia, PA", 2000, true);

        Bookstore myStore2 = new Bookstore("Shack III", "100 Read Road", 20000, true, true, true, true, "10-2");
        
        System.out.println(myStore.getTotalBooks());
        // System.out.println((myStore.storeAddress));
        myStore.details();
        //myStore1.details();
        myStore2.details();
        
    }
}