package org.example.stream;




import javax.xml.crypto.dsig.TransformService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.example.stream.TransactionType.*;

/**
 * Stream that lets you process data in a declarative way
 * Furthermore, streams can leverage multi-core architectures without
 * you having to write a single line of multithread code.
 **/
public class Stream101 {
    public static void main(String[] args) {
        //conventional way
        usingConventionalForLoop();

    }
    /**The core task is to find all the transaction of type grocery
     * and return the ids in the descending order with the amount of the
     * transaction made
     */

    /*using stream api doing the same number and type of operations
    but in a declarative form.*/

    private static void usingStreamApi(){
        List<Transaction> transactions = returnFilledList();
        //transactions.
    }




    /**{@link #usingConventionalForLoop()} is the process of sorting the transaction id of the
    grocery transaction according to the amount higher to lower
     using the conventional for loop method**/
    private static void usingConventionalForLoop(){
        List<org.example.stream.Transaction> transactions = returnFilledList();
        List<org.example.stream.Transaction> groceryTransactions = new ArrayList<>();
        for (org.example.stream.Transaction t: transactions){
            if (t.getType()==GROCERY){
                groceryTransactions.add(t);
            }
        }
        Collections.sort(groceryTransactions, new Comparator<org.example.stream.Transaction>() {
            @Override
            public int compare(org.example.stream.Transaction o1, org.example.stream.Transaction o2) {
                return o2.getAmount().compareTo(o1.getAmount());
            }
        });
        for (org.example.stream.Transaction t:groceryTransactions){
            System.out.print(t.toString());
            System.out.println();
        }
        List<String> transactionIds = new ArrayList<>();
        for (Transaction t : groceryTransactions){
            transactionIds.add(t.getTransactionId());
        }
        System.out.println("Printing the transaction id");
        for (String t:transactionIds){
            System.out.print(t +" ; ");
        }
        System.out.println();
    }



    //list to process
    private static List<org.example.stream.Transaction> returnFilledList() {
        List<org.example.stream.Transaction> transactions = new ArrayList<>();
        transactions.add(new org.example.stream.Transaction("T001", "Grocery shopping at SuperMart", 150.75, "2024-09-01", GROCERY));
        transactions.add(new org.example.stream.Transaction("T002", "Electric bill payment", 75.50, "2024-09-05", UTILITIES));
        transactions.add(new org.example.stream.Transaction("T003", "Movie tickets", 30.00, "2024-09-10", ENTERTAINMENT));
        transactions.add(new org.example.stream.Transaction("T004", "Gas refill", 40.25, "2024-09-15", TRANSPORTATION));
        transactions.add(new org.example.stream.Transaction("T005", "Dinner at The Food Place", 65.00, "2024-09-20", ENTERTAINMENT));
        transactions.add(new org.example.stream.Transaction("T006", "Grocery shopping at FreshMart", 80.00, "2024-09-02", GROCERY));
        transactions.add(new org.example.stream.Transaction("T007", "Internet bill payment", 60.00, "2024-09-06", UTILITIES));
        transactions.add(new org.example.stream.Transaction("T008", "Concert tickets", 120.00, "2024-09-12", ENTERTAINMENT));
        transactions.add(new org.example.stream.Transaction("T009", "Public transport monthly pass", 50.00, "2024-09-18", TRANSPORTATION));
        transactions.add(new org.example.stream.Transaction("T010", "Takeout from Happy Eats", 45.00, "2024-09-22", ENTERTAINMENT));
        transactions.add(new org.example.stream.Transaction("T011", "Grocery shopping at MegaStore", 95.30, "2024-09-03", GROCERY));
        transactions.add(new org.example.stream.Transaction("T012", "Water bill payment", 30.00, "2024-09-07", UTILITIES));
        transactions.add(new org.example.stream.Transaction("T013", "Gym membership fee", 50.00, "2024-09-13", OTHER));
        transactions.add(new org.example.stream.Transaction("T014", "Books purchase", 40.00, "2024-09-19", OTHER));
        transactions.add(new org.example.stream.Transaction("T015", "Fast food at QuickBite", 20.50, "2024-09-21", ENTERTAINMENT));
        transactions.add(new org.example.stream.Transaction("T016", "Grocery shopping at Local Mart", 70.25, "2024-09-04", GROCERY));
        transactions.add(new org.example.stream.Transaction("T017", "Gas station refill", 55.00, "2024-09-08", TRANSPORTATION));
        transactions.add(new org.example.stream.Transaction("T018", "Streaming service subscription", 15.00, "2024-09-14", OTHER));
        transactions.add(new org.example.stream.Transaction("T019", "Dinner at Italian Bistro", 85.00, "2024-09-23", ENTERTAINMENT));
        transactions.add(new org.example.stream.Transaction("T020", "Grocery shopping at Organic Market", 120.00, "2024-09-09", GROCERY));
        transactions.add(new org.example.stream.Transaction("T021", "Mobile bill payment", 40.00, "2024-09-11", UTILITIES));
        transactions.add(new org.example.stream.Transaction("T022", "Charity donation", 100.00, "2024-09-16", OTHER));
        transactions.add(new org.example.stream.Transaction("T023", "Brunch at Café Delight", 35.00, "2024-09-17", ENTERTAINMENT));
        transactions.add(new org.example.stream.Transaction("T024", "Grocery shopping at Market Square", 65.00, "2024-09-24", GROCERY));
        transactions.add(new org.example.stream.Transaction("T025", "Rent payment", 1200.00, "2024-09-25", OTHER));
        transactions.add(new org.example.stream.Transaction("T026", "Pet supplies purchase", 80.00, "2024-09-26", OTHER));
        transactions.add(new org.example.stream.Transaction("T027", "Car insurance payment", 300.00, "2024-09-27", OTHER));
        transactions.add(new org.example.stream.Transaction("T028", "Taxi fare", 25.00, "2024-09-28", TRANSPORTATION));
        transactions.add(new org.example.stream.Transaction("T029", "Online course fee", 200.00, "2024-09-29", OTHER));
        transactions.add(new org.example.stream.Transaction("T030", "Craft supplies purchase", 45.00, "2024-09-30", OTHER));

        return transactions;
    }

}
