package ex026_OOPs_abstraction_interface;



public class Lab186_abstraction_interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea( 10, 10);

        Square s1 = new Square();
        s1.getArea(3 ,4);

    }
}

class Square implements Polygon{
    class Rectangle implements Polygon{

    }
}

interface polygon{
    void getArea(int length , int breadth);


}
class Square implements Polygon{

    @Override
    public void getArea(int length, int breadth){
        System.out.println("Area od Square -> " + 3.14*length*breadth);

    }

}
class Rectangle implements Polygon{

    @Override
    public void getArea(int length , int breadth) {
        System.out.println("the area of the rectangle is "+ (length + breadth));
    }
}