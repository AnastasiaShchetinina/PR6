package Planet;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Week day = Week.СУББОТА;
        Week num = day;

        System.out.println(day.ordinal());
        System.out.println(num.name());
        */
        Planet planet = Planet.EARTH;
        System.out.println("Каков ваш вес?");
        Scanner sc = new Scanner(System.in);
        int ves = sc.nextInt();
        double mas = ves / planet.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Your weight on %s is %f%n",
                    p, p.surfaceWeight(mas));
        DecimalFormat fmt = new DecimalFormat("#.##");
        for (Planet p : Planet.values())
            System.out.println("Ваш вес на планете: " + p + " " + fmt.format(p.surfaceWeight(mas)));

    }
}