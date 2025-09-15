public class Earth_volume {
    public static void main(String[] args){
        float Earth_r_km = 6378;
        double Earth_r_miles = 1.6 * 6378;
        double E_volume_KM = ((4/3) * 3.147 * Math.pow(Earth_r_km,3));
        double E_volume_miles = ((4/3) * 3.14 * Math.pow(Earth_r_miles,3));
        System.out.print(" The volume of earth in cubic kilometers is "+E_volume_KM+" and in cubic miles is "+E_volume_miles);
    }
}
