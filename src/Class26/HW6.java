package Class26;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HW6 {
    /*Create a Set collection that will hold Objects of Student Type.
     In this set we do not care about the insertion order.
     Each student object should have name and studentID. Display name of each student.
     */
    private String name;
    private int studentID;
    HW6(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }
    public String getName() {
        return name;
    }
    public int getStudentID() {
        return studentID;
    }
    public static void main(String[] args) {
        Set<HW6> student = new HashSet<>();

        student.add(new HW6("Puskar", 14));
        student.add(new HW6("Janel", 11));
        student.add(new HW6("Zorah", 5));
        student.add(new HW6("Serhii", 12));

        Iterator<HW6> it = student.iterator();

        while (it.hasNext()) {
            String x = it.next().getName();
            System.out.println(x);
        }
    }}
