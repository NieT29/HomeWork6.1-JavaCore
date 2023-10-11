public class Geometry {
    public void calPerimeterRec(Rectangle rectangle) {
        double perimeterRec = ((rectangle.lenght)+(rectangle.widht)) * 2;
        System.out.println("Chu vi là hình chữ nhật là: "+perimeterRec);
    }

    public void calAcreageRec(Rectangle rectangle) {
        double acreageRec = (rectangle.lenght*rectangle.widht);
        System.out.println("Diện tích hình chữ nhật là: "+acreageRec);
    }

    public void calPerimeterSqu(Square square) {
        double perimeterSqu = square.side*4;
        System.out.println("Chu vi hình vuông là "+perimeterSqu);
    }

    public void calAcreageSqu(Square square) {
        double perimeterSqu = square.side*square.side;
        System.out.println("Diện tích hình vuông là: "+perimeterSqu);
    }

    public double getAq(Square square) {
        return square.side*square.side;
    }
}
