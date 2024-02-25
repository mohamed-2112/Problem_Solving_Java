package main.problems.fileHandling;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WritingFile {

    Scanner scannerFile = null;
    PrintWriter writer = null;



    public void writeToFile(){
        try{
            writer = new PrintWriter(new FileOutputStream("src/main/problems/fileHandling/resources/outputFile.txt"));
        }catch (FileNotFoundException e){
            System.out.println(e);
            System.out.println("line 14 ");
        }finally {
            if(writer==null){
                System.exit(0);
            }
        }

        writer.println("Java is fun to learn.");
        writer.close();
    }

    public void appending(){
        try {
            writer = new PrintWriter(new FileOutputStream("src/main/problems/fileHandling/resources/outputFile.txt", true));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }finally {
            if (writer == null) {
                System.exit(0);
            }
        }
        writer.print("Java makes file handling easy.");

        writer.close();
    }

    public void copy(){
        try{
            scannerFile = new Scanner(new FileInputStream("src/main/problems/fileHandling/resources/outputFile.txt"));
            writer = new PrintWriter(new FileOutputStream("src/main/problems/fileHandling/resources/outputFile2.txt"));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }finally {
            if (scannerFile == null||writer==null) {
                System.exit(0);
            }
        }
        while(scannerFile.hasNextLine()){
            String line = scannerFile.nextLine();
            writer.println(line);
        }
        scannerFile.close();
        writer.close();
    }

}
