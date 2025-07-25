package cursoJavaCompleto.ProgOrientadaObjetos2.entities;

import cursoJavaCompleto.ProgOrientadaObjetos2.enums.Color;

public abstract class Shape {
    private Color color;
    
    public Shape() {
    }
    
    public Shape(Color color) {
        this.color = color;
    }
    
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    
    public abstract double area();
}
