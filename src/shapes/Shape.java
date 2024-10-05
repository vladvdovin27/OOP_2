package src.shapes;

import src.colors.Color;

public abstract class Shape {
    private Color color = Color.TRANSPARENT;

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color newColor){
        this.color = newColor;
    }

    public double getSquare(){
        return 0.0;
    }

    public double getPerimeter(){
        return 0.0;
    }

    public void move(double moveX, double moveY){}

    public void draw(){}
}
