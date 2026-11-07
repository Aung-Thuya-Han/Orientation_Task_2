public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();
        eventList.addEvent(new Event(12, EventType.EXIT));
        eventList.addEvent(new Event(3, EventType.ARRIVAL));
        eventList.addEvent(new Event(8, EventType.EXIT));
        eventList.addEvent(new Event(5, EventType.ARRIVAL));

        Event first = eventList.removeNextEvent();
        System.out.println("First event removed: " + first);

        System.out.println("Remaining events in time order:");
        eventList.printEvents();
    }
}
