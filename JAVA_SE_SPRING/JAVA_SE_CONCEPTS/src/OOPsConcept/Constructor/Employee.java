
package OOPsConcept.Constructor;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public Employee(int baseSalary) {
        setBaseSalary(baseSalary);
        setHourlyRate(0);
    }
    
    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    
    public void setBaseSalary(int baseSalary){
        if(baseSalary < 0)
            throw new IllegalArgumentException("Salary can't be zero or less.");
        this.baseSalary = baseSalary;
    }
    
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
    
    public int calculateWage(){
        return baseSalary;
    }
}
