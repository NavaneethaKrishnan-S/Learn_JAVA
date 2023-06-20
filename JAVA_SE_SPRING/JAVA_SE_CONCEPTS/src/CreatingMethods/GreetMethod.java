
package CreatingMethods;

public class GreetMethod {
    public static void main(String[] args) {
        System.out.println(greetUser("Mani", "Bharathi"));
        System.out.println(greetUser("Kamalesh", "V"));
    }
    public static String greetUser(String firstName, String lastName){
        return "Hi " + firstName + " " + lastName;
    }
}
