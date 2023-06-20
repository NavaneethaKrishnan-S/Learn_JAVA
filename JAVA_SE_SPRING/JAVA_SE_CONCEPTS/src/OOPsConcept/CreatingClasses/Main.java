package OOPsConcept.CreatingClasses;

public class Main {
    public static void main(String[] args) {
        TextBox textBox1 = new TextBox();
        textBox1.setText("Siva");
        
        TextBox textBox2 = new TextBox();
        textBox2.setText("Dinesh");
        
        textBox2.clear();
        
        System.out.println(textBox1.text);
        System.out.println(textBox2.text);
    }
}
