public class Rectangle {
    double length;
    double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    Rectangle(Rectangle r){
        this.length = r.length;
        this.breadth = r.breadth;
    }
    double area(){
        return length * breadth;
    }
    double perimeter(){
        return 2*(length + breadth);
    }
    void display(){
        System.out.println("Length = " + length);
    System.out.println("Breadth = " + breadth);
    System.out.println("Area = " + area());
    System.out.println("Perimeter = " + perimeter());
    System.out.println();
    }
}
 class  RectangleDemo{
    public static void main(String[]args){
        Rectangle r1 = new Rectangle(10,5);
        Rectangle r2 = new Rectangle(r1);
        r2.length = 20;
        r2.breadth = 30;
        System.out.println("Original rectangle : ");
        r1.display();
        System.out.println("Copied and modified rectangle: ");
        r2.display();

    }

}
