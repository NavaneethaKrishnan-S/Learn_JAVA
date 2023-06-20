
package FileManagement;

// Import the FileWriter class
import java.io.FileWriter;

// Import the IOException class for handling errors
import java.io.IOException;
import java.util.Scanner;
public class WriteFileExample {
    public static void main(String[] args)
    {
	try {
            Scanner write = new Scanner(System.in);
            System.out.println("Write something here..");
            String data = write.nextLine();
            
            FileWriter Writer = new FileWriter("E:\\GTEC_COMPUTER_EDUCATION\\JAVA\\PROGRAM\\JavaBatchMarchThirteen\\src\\Aashiq.txt");
            Writer.write(data);
            Writer.close();
            System.out.println("Successfully written.");
	}
	catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
	}
    }
}    




