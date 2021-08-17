import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//@FunctionalInterface
//interface MyDemo{
//    void display();
//
//}

public class ComparatorPrg {

    public static void main(String[] args) {

        List<Employee> empList=new ArrayList();

        Employee emp1=new Employee();
        emp1.setId(1);
        emp1.setName("Emp1");
        emp1.setSalary(50000);

        Employee emp2=new Employee();
        emp2.setId(2);
        emp2.setName("Emp2");
        emp2.setSalary(40000);

        Employee emp3=new Employee();
        emp3.setId(3);
        emp3.setName("Emp3");
        emp3.setSalary(30000);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        System.out.println(empList);

        empList.sort(new Comparator<Employee>() {
            @Override  // negative, zero, positive value
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary()-o2.getSalary();
            }
        });

        System.out.println("After sorting...");
        System.out.println(empList);
    }
}
