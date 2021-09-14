public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return -1;
        double mile = 1.609;
        return Math.round(kilometersPerHour / mile);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else{
        long miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }

    public static void main (String [] args){
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-4));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
    printConversion(1.5);
    printConversion(10.25);
    printConversion(-5);
    printConversion(25.42);
    printConversion(75.114);
    }

}