public class Event implements Comparable<Event> {
    private final int time;
    private final EventType type;

    public Event(int time, EventType type) {
        this.time = time;
        this.type = type;
    }

    @Override
    public int compareTo(Event other) {
        return Integer.compare(time, other.time);
    }

    @Override
    public String toString() {
        return "Time " + time + ": " + type;
    }
}
