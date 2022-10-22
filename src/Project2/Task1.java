package Project2;

       /*Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimeter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.*/
interface Shape {
    void calculateArea();
    void calculatePerimeter();
       }
class Circle implements Shape{
    public void calculateArea() {
        System.out.println("Area of a circle is="+3.14*64);
    }
    public void calculatePerimeter() {
        System.out.println("The perimeter of a circle is="+2*3.14*8);
    }}
class Square implements Shape{
    public void calculateArea() {
        System.out.println("The area of a square is = "+(6*6));
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of a square is = "+(2*6));
    }
}