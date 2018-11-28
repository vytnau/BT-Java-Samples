package lt.bt.java.demo.interfaces.demo2;

public abstract class Figure implements Area, Color, Border {

    private String color;

    private boolean border;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean hasBorder() {
        return border;
    }

    public void setBorder(boolean border) {
        this.border = border;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
