// класс точки
public class Point3d extends Point2d {

    // координата Z
    private double zCoord;

    // Конструтор инициализации
    public Point3d(double x, double y, double z) {
        super(x, y); // наследует от Point2d
        this.zCoord = z;
    }

    // Конструктор по умолчанию
    public Point3d() {
        this(0, 0, 0);
    }

    // Возвращение Z координаты
    public double getZ() {
        return zCoord;
    }

    // Установка Z координаты
    public void setZ(double val) {
        this.zCoord = val;
    }

    // Возвращение сравнение с другой точкой
    public boolean isCompare(Point3d comparedPoint) {
        return this.getX() == comparedPoint.getX() & this.getY() == comparedPoint.getY() & this.getZ() == comparedPoint.getZ();
    }

    // Возвращение расстояния между другой точкой
    public double distanceTo(Point3d secondPoint) {

        // Расчитывает расстояние
        double distance = Math.sqrt(
                Math.pow((secondPoint.getX() - this.getX()), 2) + Math.pow((secondPoint.getY() - this.getY()), 2) + Math.pow((secondPoint.getZ() - this.getZ()), 2));

        // округление до 2 знаков после запятой
        double scale = Math.pow(10, 2);
        double result = Math.ceil(distance * scale) / scale;

        return result;
    }


}