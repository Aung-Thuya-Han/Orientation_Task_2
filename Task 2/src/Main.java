public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();
        eventList.addEvent(new Event(12));
        eventList.addEvent(new Event(3));
        eventList.addEvent(new Event(8));
        eventList.addEvent(new Event(5));

        Event first = eventList.removeNextEvent();
        System.out.println("First event removed: " + first);

        System.out.println("Remaining events in time order:");
        eventList.printEvents();
    }
}
