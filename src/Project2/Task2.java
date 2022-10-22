package Project2;
public class Task2{
}
abstract class Marks{
    int grade1;
    int grade2;
    int grade3;
    int grade4;
    abstract void getPercentage();
}
class A extends Marks{
    public A(int grade1, int grade2, int grade3) {
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
    }
    void getPercentage(){
        int aveA=(grade1+grade2+grade3)/3;
        System.out.println("The average grade for student A is " + aveA);
    }}
class B extends Marks {
    public B(int grade1, int grade2, int grade3, int grade4) {
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
        this.grade4 = grade4;
    }
    void getPercentage(){
        int aveB=(grade1+grade2+grade3+grade4)/4;
        System.out.println("The average grade for student B is " + aveB);
    } }

