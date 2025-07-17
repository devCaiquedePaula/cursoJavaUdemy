package cursoJavaCompleto.ProgOrientadaObjetos2.entities;

import cursoJavaCompleto.ProgOrientadaObjetos2.enums.Color;

public class Circle extends Shape{
    private Double radius;
    
    public Circle() {
        super();
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
