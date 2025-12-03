public class Bus {
    private String busNumber;
    private String route;
    private String time;

    public Bus(String busNumber, String route, String time) {
        this.busNumber = busNumber;
        this.route = route;
        this.time = time;
    }

    public String getBusNumber() { return busNumber; }
    public String getRoute() { return route; }
    public String getTime() { return time; }

    @Override
    public String toString() {
        return "Bus Number: " + busNumber + ", Route: " + route + ", Time: " + time;
    }
}
