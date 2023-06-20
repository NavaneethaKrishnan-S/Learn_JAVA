
package OOPsConcept.InheritanceConcepts.Polymorphism;

public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox(), new UIControl()};
        for(var control : controls)
            control.render();        
    }
}
/*
        for(var control : controls){
            if control is TextBox
                renderTextBox
            else if control is checkBox
                renderCheckBox
        }
        */