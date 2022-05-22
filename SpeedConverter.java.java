public class SpeedConverter {
    public static void main(String[] args) {
        long value1 = MilesPerHour(4.5764);
        System.out.println("the value of mile per hour" + value1);
    }

    public static long MilesPerHour(double KilometersPerHour) {
        if (KilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(KilometersPerHour / 1.609);

        }

    }
}