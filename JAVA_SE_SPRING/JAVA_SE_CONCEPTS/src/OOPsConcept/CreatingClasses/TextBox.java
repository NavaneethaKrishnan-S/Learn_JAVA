package OOPsConcept.CreatingClasses;

public class TextBox {
    public String text;
    public int limit;
    public boolean isFocused;
    
    public void setText(String text){
        this.text = text;
    }
    
    public void clear(){
        text = "";
    }
}
