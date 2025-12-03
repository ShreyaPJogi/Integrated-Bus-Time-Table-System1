public class Main {
    public static void main(String[] args) {
        BusTimetable timetable = new BusTimetable();

        // Adding sample bus details
        timetable.addBus(new Bus("101", "City Center", "09:00 AM"));
        timetable.addBus(new Bus("102", "Airport", "10:30 AM"));
        timetable.addBus(new Bus("103", "City Center", "11:00 AM"));

        // Display timetable
        timetable.displayTimetable();

        // Search for a bus route
        timetable.searchBus("City Center");
    }
}
