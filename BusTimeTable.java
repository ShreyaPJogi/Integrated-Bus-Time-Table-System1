import java.util.ArrayList;
import java.util.List;

public class BusTimetable {
    private List<Bus> buses = new ArrayList<>();

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public void displayTimetable() {
        System.out.println("---- Integrated Bus Time Table ----");
        for (Bus b : buses) {
            System.out.println(b);
        }
    }

    public void searchBus(String route) {
        System.out.println("\nSearching buses for route: " + route);
        boolean found = false;

        for (Bus b : buses) {
            if (b.getRoute().equalsIgnoreCase(route)) {
                System.out.println(b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No buses found for this route.");
        }
    }
}
