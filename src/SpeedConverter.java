public class SpeedConverter {
public static long toMilesPerHour(double KilometersPerHour){
    if(KilometersPerHour < 0)
        return -1;

        return Math.round(KilometersPerHour/1.609);

}
public static void printConversion(double KilometersPerHour){
    if(KilometersPerHour < 0) {
        System.out.println("Invalid Value");
    }
    System.out.println(KilometersPerHour + " km/h = " + Math.round(KilometersPerHour/1.609) + " mi/h");
}
public static void main(String[] args){
    System.out.println(toMilesPerHour(522));
    printConversion(522);
}
}
