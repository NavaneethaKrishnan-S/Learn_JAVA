
package ExceptionHandling;

public class Account {
    public void deposit(float value){
        if(value <= 0)
            throw new IllegalArgumentException("Minimum amount should be more than 0");
    }
}
