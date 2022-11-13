package Class28;

import java.util.HashMap;
import java.util.Map;

public class HW5 {
    /*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
John Smith=$100000*/
    public static void main(String[] args) {
        HashMap<String, Integer> employeeInfo = new HashMap<>();
        employeeInfo.put("Serhii", 70000);
        employeeInfo.put("JAnel", 90000);
        employeeInfo.put("Puskar", 95000);
        employeeInfo.put("Zorah", 120000);
        employeeInfo.put("Rimma", 100000);
        employeeInfo.put("Ben", 90000);

        String empName = "";
        Integer highSalary = 0;
        for (Map.Entry<String, Integer> entry : employeeInfo.entrySet()
        ) {
            if (entry.getValue() > highSalary) {
                highSalary = entry.getValue();
                empName = entry.getKey();
            }
        }

        System.out.println(empName + " has the highest " + highSalary);

    }
}

