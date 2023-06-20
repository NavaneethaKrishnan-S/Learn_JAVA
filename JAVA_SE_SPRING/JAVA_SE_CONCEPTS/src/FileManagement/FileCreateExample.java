
package FileManagement;
// Import the File class
import java.io.File;

// Import the IOException class to handle errors
import java.io.IOException;
public class FileCreateExample {
    public static void main(String[] args)
	{

            try {
		File Obj = new File("E:\\GTEC_COMPUTER_EDUCATION\\JAVA\\PROGRAM\\JavaBatchMarchThirteen\\src\\Aashiq.txt");
		
                if (Obj.createNewFile()) {
                    System.out.println("File created: "+ Obj.getName());
		}
		else {
                    System.out.println("File already exists.");
		}
            }
            catch (IOException e) {
		System.out.println("An error has occurred.");
		e.printStackTrace();
            }
	}
}





	