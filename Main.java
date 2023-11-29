import java.util.Arrays;

class Employee implements Comparable<Employee>{
    String name = "";
    int salary = 0;
    public Employee(String name, int sal){
        this.name = name;
        this.salary = sal;
    }

    public int compareTo(Employee e){
        if(this.salary < e.salary) return -1;
        else if(this.salary > e.salary) return 1;
        else return 0;
    }
}

public class Main{
    public static void main(String[] args) {
        Employee[] arr = {
            new Employee("xyz", 1500),
            new Employee("abc", 1000),
            new Employee("dsiak", 2000)
        };
        Arrays.sort(arr);
        for(Employee e : arr){
            System.out.println(e.name + " " + e.salary);
        }
    }

}
