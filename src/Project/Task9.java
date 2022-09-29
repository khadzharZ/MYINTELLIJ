package Project;

public class Task9 {
    public static void main(String[] args) {
        // Maximum and minimum number in the array?
        int[] num= {-1,200,200, -8, 30,55,88,400};
        int max=num[0];//first element- index[0]
        int   min=num[0];
        for (int n:num) {  //creating for loop to go over all elements in the array
            if(n>max) {max=n;}
            if (n<min) {min=n;}
        };

        System.out.println("the max number in this array is"+max);
        System.out.println("the min number in this array is"+ min);
    }
}
