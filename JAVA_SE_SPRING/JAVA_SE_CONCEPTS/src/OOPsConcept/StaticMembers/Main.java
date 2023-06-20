
package OOPsConcept.StaticMembers;

public class Main {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee(50_000, 20);
        Employee employee2 = new Employee(80_000);
        
//        System.out.println(employee1.calculateWage(10));
//        System.out.println(employee2.calculateWage());
        System.out.println(Employee.number_of_employees);
        
        //System.out.println(employee1.calculateWage());
               
    }
}
