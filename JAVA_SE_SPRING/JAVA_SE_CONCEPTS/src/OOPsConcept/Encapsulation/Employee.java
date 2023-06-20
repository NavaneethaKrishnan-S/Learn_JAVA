
package OOPsConcept.Encapsulation;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private int extraHours;

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getExtraHours() {
        return extraHours;
    }
    
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }
    
    public void setBaseSalary(int baseSalary){
        if(baseSalary < 0)
            throw new IllegalArgumentException("Salary can't be zero or less.");
        this.baseSalary = baseSalary;
    }
    
    public int calculateWage(){
        return baseSalary + (hourlyRate * extraHours);
    }
}
