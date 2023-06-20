
package OOPsConcept.InheritanceConcepts.AbstractClass;

public class TextBox extends UIControl{
    private String text;
    
    public void setText(String text){
       this.text = text;        
    }
    
    public void clear(){
        text = "";
    }

    @Override
    public void render() {
        System.out.println("Rendering textbox");
    }
    
    
}
