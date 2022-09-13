package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000 && salary > 0) {
            float calculate = salary * 0.15f;
            float result = salary - calculate;
            System.out.println(result);
        } else if (salary > 10000 && salary <= 20000){
            float calculate = salary * 0.18f;
            float result = salary - calculate;
            System.out.println(result);
        } else if (salary > 20000) {
            float calculate = salary * 0.2f;
            float result = salary - calculate;
            System.out.println(result);
        } else if (salary < 0){
            System.out.println("wrong input!");
        }
    }
}
