package OopChallenges;

import java.util.*;

public class ValetParking {


    private int smallBays;
    private int mediumBays;
    private int largeBays;

    private Queue<Integer> ticketQueue = new LinkedList<>(); // Queue to simulate ticket issuance
    private Map<Integer, String> ticketMap = new HashMap<>(); // Maps ticket to bay type

    private int nextTicketId = 1;

    public ValetParking(int smallBays, int mediumBays, int largeBays) {
        this.smallBays = smallBays;
        this.mediumBays = mediumBays;
        this.largeBays = largeBays;
    }

    // Handle car arrival
    public String arrival(String carSize) {
        if (carSize.equals("small") && smallBays > 0) {
            smallBays--;
            ticketQueue.add(nextTicketId);
            ticketMap.put(nextTicketId, "small");
            return String.valueOf(nextTicketId++);
        } else if (carSize.equals("medium") && mediumBays > 0) {
            mediumBays--;
            ticketQueue.add(nextTicketId);
            ticketMap.put(nextTicketId, "medium");
            return String.valueOf(nextTicketId++);
        } else if (carSize.equals("large") && largeBays > 0) {
            largeBays--;
            ticketQueue.add(nextTicketId);
            ticketMap.put(nextTicketId, "large");
            return String.valueOf(nextTicketId++);
        } else {
            return "reject";
        }
    }

    // Handle car departure
    public void depart(int ticketId) {
        String bayType = ticketMap.remove(ticketId);
        ticketQueue.remove(ticketId);

        if (bayType.equals("small")) {
            smallBays++;
        } else if (bayType.equals("medium")) {
            mediumBays++;
        } else if (bayType.equals("large")) {
            largeBays++;
        }
    }

    public List<Integer> getCurrentTickets() {
        return new ArrayList<>(ticketQueue);
    }

    public static void main(String[] args) {
        // Initializing valet parking with 1 small, 1 medium, and 2 large bays
        ValetParking valetParking = new ValetParking(1, 1, 2);

        // First set of actions
        System.out.println("First Set of Actions:");
        System.out.println(valetParking.arrival("small"));   // Should accept, ticket 1
        System.out.println(valetParking.arrival("large"));   // Should accept, ticket 2
        System.out.println(valetParking.arrival("medium"));  // Should accept, ticket 3
        System.out.println(valetParking.arrival("large"));   // Should accept, ticket 4
        System.out.println(valetParking.arrival("medium"));  // Should reject
        System.out.println("Current tickets: " + valetParking.getCurrentTickets());

        // Second set of actions
        System.out.println("\nSecond Set of Actions:");
        valetParking.depart(3);                             // Ticket 3 departs, free medium bay
        System.out.println(valetParking.arrival("small"));  // Should reject (small bay full)
        System.out.println(valetParking.arrival("large"));  // Should reject (large bay full)
        System.out.println(valetParking.arrival("medium")); // Should accept, ticket 5
        System.out.println("Current tickets: " + valetParking.getCurrentTickets());
    
}
}