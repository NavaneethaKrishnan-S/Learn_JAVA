
package OOPsConcept.Encapsulation;

public class Main {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        
        employee1.setBaseSalary(50_000);
        
        
        System.out.println(employee1.getBaseSalary());
        System.out.println(employee1);      
    }
}
