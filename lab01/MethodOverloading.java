public class MethodOverloading{
    public static void main(String[] args) {
        double kilometers = 20;
        double miles = 12;

        double kmToMiles = convert(kilometers);
        System.out.println(kilometers + " kilometers equals " + kmToMiles + " miles.");

        double milesToKm = convert(miles);
        System.out.println(miles + " miles equals " + milesToKm + " kilometers.");
    }

    public static double convert(double km) {
        return km / 1.60934;
    }

    public static double convert(int miles) {
        return convert((double) miles);
    }
}

