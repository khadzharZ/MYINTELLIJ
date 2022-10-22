package Project2;

public class Task1Test {

    public static void main(String[] args) {
        Shape []shape={new Circle(),new Square()};
        for(Shape sh:shape){
            sh.calculateArea();
            sh.calculatePerimeter();
        }
    }
}