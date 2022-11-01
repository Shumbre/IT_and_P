import java.awt.*;

public class Lab1 {

    public static void main(String[] args) {

        // задаем точки для 1 треугольника
        Point3d point1 = new Point3d(0, 0, 0);
        Point3d point2 = new Point3d(6, 8, 6);
        Point3d point3 = new Point3d(1, 6, 4);

        // test 1
        System.out.println("Площадь треугольника: " + computeArea(point1, point2, point3));

        // задаем точки для 1 треугольника
        Point3d point4 = new Point3d(0, 0, 0);
        Point3d point5 = new Point3d(0, 0, 0);
        Point3d point6 = new Point3d(1, 6, 4);

        // test 2
        System.out.println("Площадь треугольника: " + computeArea(point4, point5, point6));

    }

    public static double computeArea(Point3d first, Point3d second, Point3d third) {

        if (first.isCompare(second) || first.isCompare(third) || third.isCompare(first)) {
            System.out.println("Есть равные точки");
            return 0.0;
        } else {
            // вычисление сторон треугольника
            double a = first.distanceTo(second);
            double b = first.distanceTo(third);
            double c = second.distanceTo(third);

            // вычисление площади по формуле Герона
            double p = (a + b + c) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            //округление до 2-х знаков после запятой
            double scale = Math.pow(10, 2);
            double result = Math.ceil(s * scale) / scale;

            return result;

        }
    }


}