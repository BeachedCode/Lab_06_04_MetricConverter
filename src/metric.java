import java.util.Scanner;
public class metric
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double metricMeters = 0;
        String trash = "";
        System.out.println("Enter measurement in meters: ");
        if(in.hasNextInt())
        {
            metricMeters = in.nextDouble();
            double metricMiles = metricMeters / 1609;
            System.out.println("Miles: " + metricMiles);
            double metricFoot = metricMeters * 3.281;
            System.out.println("Feet: " + metricFoot);
            double metricInch = metricMeters * 39.37;
            System.out.println("Inches: " + metricInch);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a number.");
        }
    }
}
