import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String fullName;
    Long salary;
    String city;

    public Employee(String firstName, String middleName, String lastName, Long salary, String city) {
        this.fullName = firstName+" "+middleName+" "+lastName;
        this.salary = salary;
        this.city = city;
    }
}
public class ques4 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                .stream()
                .filter(e-> e % 2==0)
                .collect(Collectors.toList()));
        Employee emp1= new Employee("Harsh", "","Gupta",2000l,"Noida");
        Employee emp2= new Employee("Mayank", "Kumar","Gupta",7000l,"Greater Noida");
        Employee emp3= new Employee("Vikas", "Mani","Tripathi",8000l,"Noida");
        Employee emp4= new Employee("Dileep", "Kumar","Gupta",3000l,"Lucknow");
        List<Employee> list=new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.stream()
                .distinct()
                .filter((e->(e.salary<5000)&&(e.city.contains("Noida"))))
                .map(e-> e.fullName+" "+e.salary+" "+e.city)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}