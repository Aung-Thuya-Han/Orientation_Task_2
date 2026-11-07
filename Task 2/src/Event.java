public class Event implements Comparable<Event> {
    private final int time;

    public Event(int time) {
        this.time = time;
    }

    @Override
    public int compareTo(Event other) {
        return Integer.compare(time, other.time);
    }

    @Override
    public String toString() {
        return "Time " + time;
    }
}
