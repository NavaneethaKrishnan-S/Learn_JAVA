
package FileManagement;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileHandlingExample {
    public static void main(String[] args) {
    
        try {
            File myObj = new File("E:\\GTEC_COMPUTER_EDUCATION\\JAVA\\PROGRAM\\JavaBatchMarchThirteen\\src\\Aashiq.txt");
            
            Scanner myReader = new Scanner(myObj);
            
            String data = myReader.nextLine();
            System.out.println(data);
            
            myReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandlingExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
