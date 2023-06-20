
package FormattingNumbers;

import java.text.NumberFormat;

public class NumberFormatExample {
    public static void main(String[] args) {
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.25);
        System.out.println(result);
        
    }
}
