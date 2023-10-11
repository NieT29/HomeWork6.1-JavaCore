public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,2);
        rectangle.calPerimeterRec(rectangle);
        rectangle.calAcreageRec(rectangle);

        Square square=new Square(5);
        square.calPerimeterSqu(square);
        square.calAcreageSqu(square);

        System.out.println("Thông tin của các hình là: ");
        System.out.println(rectangle);
        System.out.println(square);
    }
}
