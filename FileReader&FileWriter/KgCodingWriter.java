package File;

import java.io.FileWriter;
import java.io.IOException;

public class KgCodingWriter {
    public static void main(String[] args) {
        String filename = "java-course.txt";
       
        try (FileWriter writer = new FileWriter(filename)){
            writer.write("this is the best java course\n");

            for(int i = 0; i< 10000;i++){
                writer.write("*");
            }
            writer.flush();
            System.out.println("File written successfully");
        }catch(IOException exception){
            System.out.printf("Exception occured %s\n",exception.getMessage());
        }
    }
}
