/** <b>Класс двумерного вектора.</b>
 * Класс реализующий математические инструменты для
 * работы с двумерными векторами и выводит результаты на экран
 *
 *
 * @author Vdovin Vladislav
 * @version 1.0
 * @since 2024-10-19
 */

public class Vector {

    private double x;
    private double y;

    /** Конструктор класса без параметров,
     * инициализирующий их автоматически
     */
    public Vector(){
        x = 0;
        y = 0;
    }

    /**
     * Конструктор класса, принимающий координты вектора
     * @param Cx первая координата веткора
     * @param Cy вторая координата вектора
     */
    public Vector(double Cx, double Cy){
        x = Cx;
        y = Cy;
    }

    /**
     * Конструктор класса, принимающий координаты
     * начала и конца вектора
     * @param x1 первая координата начальоной точки
     * @param y1 вторая координата начальоной точки
     * @param x2 первая координата конечной точки
     * @param y2 вторая координата конечной точки
     */
    public Vector(double x1, double y1, double x2, double y2){
        x = x2 - x1;
        y = y2 - y1;
    }

    /**
     * Метод для получения первой координаты вектора
     * @return double тип возвращаемой координаты
     */
    public double getX(){
        return x;
    }

    /**
     * Метод для изменения первой координаты вектора
     * @param newX новая координата вектора
     */
    public void setX(double newX){
        x = newX;
    }

    /**
     * Метод для получения второй координаты вектора
     * @return double тип возвращаемой координаты
     */
    public double getY(){
        return y;
    }

    /**
     * Метод для изменения второй координаты вектора
     * @param newY новая координата вектора
     */
    public void setY(double newY){
        y = newY;
    }

    /**
     * Метод для нахождения векторного произведения.
     * Считает псевдоскалярное произведение векторов.
     * Выводит результат на экран.
     * @param vec второй вектор, который умножается на данный экземпляр класса
     */
    public void vecProduct(Vector vec){
        System.out.println("Результат векторного произведения: " + (x * vec.getY() - y * vec.getX()));
    }

    /**
     * Метод для нахождения скалярного произведения.
     * Выводит результат на экран
     * @param vec второй вектор, который умножается на данный экземпляр класса
     */
    public void scalarProduct(Vector vec){
        System.out.println("Результат скалярного произведения: " + (x * vec.getX() + y * vec.getY()));
    }

    /**
     * Метод для вычисление длины вектора
     * Выводит результат на экран.
     */
    public void length(){
        System.out.println("Длина вектора равна: " + (Math.sqrt(x * x + y * y)));
    }

    /**
     * Умножение вектора на число
     * Возвращает вектор - результат операции
     * @param a число типа double
     * @return Vector
     */
    public Vector numberProduct(double a){
        return new Vector(x * a, y * a);
    }

    /**
     * Метод для суммирования двух векторов.
     * Возвращает вектор - результат операции
     * @param vec вектор
     * @return Vector
     */
    public Vector sum(Vector vec){
        return new Vector(x + vec.getX(), y + vec.getY());
    }

    /**
     * Метод для вычитания двух векторов
     * Возвращает вектор - результат операции
     * @param vec второй вектор в операции
     * @return Vector
     */
    public Vector difference(Vector vec){
        return new Vector(x - vec.getX(), y - vec.getY());
    }

    public static void main(String[] args){
        Vector vec1 = new Vector(5, 2);
        Vector vec2 = new Vector();

        System.out.println("Координаты первого вектора: " + vec1.getX() + " " +  vec1.getY());
        System.out.println("Координаты второго вектора: " + vec2.getX() + " " + vec2.getY());
        vec2.setX(2);
        vec2.setY(8);
        System.out.println("Координаты второго вектора: " + vec2.getX() + " " + vec2.getY());
        vec1.vecProduct(vec2);
        vec1.scalarProduct(vec2);
        vec1.length();
        Vector mult = vec2.numberProduct(2.0);
        System.out.println("Координаты вектора, являющегося результатом произведения второго вектора на 2: " + mult.getX() + " " + mult.getY());
        Vector sumVec = vec1.sum(vec2);
        System.out.println("Координаты суммы векторов: " + sumVec.getX() + " " + sumVec.getY());
        Vector diffVec = vec1.difference(vec2);
        System.out.println("Координаты разности векторов: " + diffVec.getX() + " " + diffVec.getY());
    }
}
