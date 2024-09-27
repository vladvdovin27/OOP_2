package shapes;

import colors.Color;

public class Point extends Shape{
    private double x = 0.0, y = 0.0;

    public double getX(){
        return this.x;
    }

    public void setX(double newX){
        this.x = newX;
    }

    public double getY(){
        return this.y;
    }

    public void setY(double newY){
        this.y = newY;
    }

    Point(){}

    Point (double x, double y, Color color){
        this.x = x;
        this.y = y;
        setColor(color);
    }

    @Override
    public void draw(){
        System.out.println("Фигура: Точка");
        System.out.println("Координаты точки: (" + x + ", " + y + ")");
        System.out.println("Цвет точки: " + getColor());
    }

    @Override
    public void move(double moveX, double moveY){
        this.x += moveX;
        this.y += moveY;
    }
}
