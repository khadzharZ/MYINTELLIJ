package Class23;

public class Task1 {

    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism*/
}
class Student{
    void Learn(){
        System.out.println("Students must study hard to learn");
    }
    void Homework(){
        System.out.println("Students need to do homeworks");
    }
    void DoPractice(){
        System.out.println("Students have to practice a lot to achieve");
    }
}
class SyntaxStudent extends Student{
    @Override
    void Learn() {
        System.out.println("Syntax students have to learn programming and be happy ");
    }
    @Override
    void Homework(){
        System.out.println("Syntax students have to work on their homeworks hard to achieve");
    }

    @Override
    void DoPractice() {
        System.out.println("Syntax students have to study hard to pass the interview");
    }
}
class CollegeStudent extends Student{

    @Override
    void DoPractice() {
        System.out.println("College students have to practice alot to pass to next level");
    }
}

class SchoolStudent extends Student{

}

