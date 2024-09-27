package shapes;

import colors.Color;

public class Circle extends Shape{
    private Point centre = new Point();
    private double radius = 1;

    public void setCentre(Point centre) {
        this.centre = centre;
    }
    public Point getCentre(){
        return this.centre;
    }

    private void validate(double radius) throws Exception {
        if (radius <= 0) throw new java.lang.Exception("Радиус должен быть больше 0");
    }

    public void setRadius(double radius) throws Exception {
        this.validate(radius);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    Circle(){}

    Circle(Point centre, double radius, Color color) throws Exception {
        this.validate(radius);
        this.centre = centre;
        this.radius = radius;
        setColor(color);
    }

    @Override
    public void move(double moveX, double moveY){
        this.centre.setX(this.centre.getX() + moveX);
        this.centre.setY(this.centre.getY() + moveY);
    }

    @Override
    public double getSquare(){
        return 3.14 * this.radius * this.radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * 3.14 * this.radius;
    }

    @Override
    public void draw(){
        System.out.println("Фигура: Круг");
        System.out.println("Центр круга: (" + this.centre.getX() + ", " + this.centre.getY() + ")");
        System.out.println("Радиус круга: " + this.radius);
        System.out.println("Площадь круга: " + this.getSquare());
        System.out.println("Периметр круга: " + this.getPerimeter());
        System.out.println("Цвет точки: " + getColor());
    }
}
