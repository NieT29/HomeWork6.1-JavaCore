public class Rectangle extends Geometry {
    protected double lenght;
    protected double widht;

    public Rectangle() {
    }

    public Rectangle(double lenght, double widht) {
        this.lenght = lenght;
        this.widht = widht;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", widht=" + widht +
                '}';
    }
}


