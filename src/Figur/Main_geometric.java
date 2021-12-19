package Figur;
import java.util.Scanner;

public class Main_geometric {
    public static void main(String[] args) {
        Geometric_figure rec = new Geometric_figure();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        double num1 = in.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double num2 = in.nextDouble();

        rec.perimeterCalculator(num1,num2);
        rec.areaCalculator(num1,num2);

        rec.viewResult();
    }
}
