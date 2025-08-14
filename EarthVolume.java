public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;

        // Volume formula (4/3)πr³
        double volumeKm = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // Convert km³ to miles³ (1 mile = 1.6 km → 1 km = 1/1.6 miles)
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + 
                           " and cubic miles is " + volumeMiles);
    }
}

