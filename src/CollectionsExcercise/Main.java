package CollectionsExcercise;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olimpic", 8, 12);
        theatre.getSeats();
        theatre.reserveSeat("B11");
        theatre.reserveSeat("B11");
    }
}
