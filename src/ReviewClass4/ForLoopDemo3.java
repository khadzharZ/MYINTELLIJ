package ReviewClass4;

public class ForLoopDemo3 {
    public static void main(String[] args) {
        // print 1 3 7 9
        for(int i=1; i<=9; i+=2) {
            if(i==5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("--------------");// second way
        for(int i=1; i<=9; i+=2) {
            if(i!=5) {


                System.out.println(i);
            }
        }
    }
}
