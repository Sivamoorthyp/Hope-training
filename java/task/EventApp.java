import java.util.*;
abstract class Event {
    private String eventName;
    private String date;
    private int capacity;

    public Event(String eventName, String date, int capacity) {
        setEventName(eventName);
        setDate(date);
        setCapacity(capacity);
    }
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        if (eventName == null || eventName.isEmpty()) {
            throw new IllegalArgumentException("Invalid event name!");
        }
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if (date == null || date.isEmpty()) {
            throw new IllegalArgumentException("Invalid date!");
        }
        this.date = date;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be > 0");
        }
        this.capacity = capacity;
    }


    abstract void display();
}

class OnlineEvent extends Event {
    private String meetingLink;

    public OnlineEvent(String name, String date, int capacity, String link) {
        super(name, date, capacity);
        this.meetingLink = link;
    }

    @Override
    void display() {
        System.out.println("Online Event:");
        System.out.println("Name: " + getEventName());
        System.out.println("Date: " + getDate());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Link: " + meetingLink);
    }
}

class OfflineEvent extends Event {
    private String venue;

    public OfflineEvent(String name, String date, int capacity, String venue) {
        super(name, date, capacity);
        this.venue = venue;
    }
    @Override
    void display() {
        System.out.println("Offline Event:");
        System.out.println("Name: " + getEventName());
        System.out.println("Date: " + getDate());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Venue: " + venue);
    }
}
class Participant {
    private String name;
    private String email;

    public Participant(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void showDetails() {
        System.out.println("Participant: " + name + ", Email: " + email);
    }
}
class BookingSystem {
    private Map<Event, List<Participant>> bookings = new HashMap<>();

    public void register(Event event, Participant p) {
        bookings.putIfAbsent(event, new ArrayList<>());

        if (bookings.get(event).size() >= event.getCapacity()) {
            System.out.println("Event Full!");
            return;
        }

        bookings.get(event).add(p);
        System.out.println("Registration Successful for " + event.getEventName());
    }

    public void showParticipants(Event event) {
        System.out.println("\nParticipants for " + event.getEventName() + ":");
        List<Participant> list = bookings.get(event);

        if (list == null || list.isEmpty()) {
            System.out.println("No participants.");
            return;
        }

        for (Participant p : list) {
            p.showDetails();
        }
    }
}
class EventManager {
    private String organization;

    public EventManager(String organization) {
        this.organization = organization;
    }

    public void showDetails() {
        System.out.println("Organization: " + organization);
    }

    public void displayEvent(Event event) {
        event.display();
    }
}

public class EventApp {
    public static void main(String[] args) {

        try {
            EventManager manager = new EventManager("Tech Club");

            Event online = new OnlineEvent("Hackathon", "10-Apr-2026", 2, "zoom.com/meet");
            Event offline = new OfflineEvent("Workshop", "12-Apr-2026", 3, "Chennai Hall");

            Participant p1 = new Participant("Arun", "arun@gmail.com");
            Participant p2 = new Participant("Bala", "bala@gmail.com");
            Participant p3 = new Participant("Cathy", "cathy@gmail.com");
            BookingSystem booking = new BookingSystem();
            manager.showDetails();
            System.out.println("\n--- Online Event ---");
            manager.displayEvent(online);
            booking.register(online, p1);
            booking.register(online, p2);
            booking.register(online, p3); 
            booking.showParticipants(online);
            System.out.println("\n--- Offline Event ---");
            manager.displayEvent(offline);
            booking.register(offline, p1);
            booking.register(offline, p2);
            booking.showParticipants(offline);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}