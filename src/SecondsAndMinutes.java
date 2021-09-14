public class SecondsAndMinutes {
    public static void getDurationString (int seconds, int minutes){
        if(seconds < 0 || seconds > 59 || minutes < 0){
            System.out.println("Invalid value");
        } else {
            System.out.println((minutes/60) + "h " + (minutes % 60) + "m " + seconds + "s");
        }
    }

    public static void getDurationString (int seconds){
        getDurationString(seconds % 60, seconds / 60);
    }

    public static void main(String[] args) {
        getDurationString(349594);
    }
}
