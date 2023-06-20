
package OOPsConcept.InheritanceConcepts.ConstructorAndInheritance;

public class TextBox extends UIControl{
    private String text;
    
    public TextBox(){
        super(true);
        System.out.println("Text box");
    }
    
    public void setText(String text){
       this.text = text;        
    }
    
    public void clear(){
        text = "";
    }
}
