
package OOPsConcept.InheritanceConcepts.Polymorphism;

public class CheckBox extends UIControl {
    
    private String text;
    
    public void setText(String text){
       this.text = text;        
    }
    
    public void clear(){
        text = "";
    }

    @Override
    public void render() {
        System.out.println("Rendering Check box");
    }
    
    
}


