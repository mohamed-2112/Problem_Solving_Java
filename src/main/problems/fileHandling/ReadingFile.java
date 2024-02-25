package main.problems.fileHandling;
import java.io.*;
import java.util.Scanner;

public class ReadingFile {
    Scanner scannerFile = null;

    public void readFromFile(){
        try{

            scannerFile = new Scanner(new FileInputStream("src/main/problems/fileHandling/resources/inputFile.txt"));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        finally {
            if(scannerFile==null){
                System.exit(0);
            }
        }

        while(scannerFile.hasNextLine()){
            String line = scannerFile.nextLine();
            System.out.println(line);
        }
        scannerFile.close();
    }



    public void searchingForString(){
        String s = "Java";
        try{

            scannerFile = new Scanner(new FileInputStream("src/main/problems/fileHandling/resources/inputFile.txt"));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        finally {
            if(scannerFile==null){
                System.exit(0);
            }
        }
        int i=1;
        StringBuilder numbersOfLines = new StringBuilder();
        while(scannerFile.hasNextLine()){
            String line = scannerFile.nextLine();
            if (line.contains(s)){
                numbersOfLines.append(i).append(" ");
            }
            i++;
        }
        String[] sn = numbersOfLines.toString().split(" ");
        int[] snint = new int[sn.length];
        for (int j = 0; j < sn.length; j++) {
            snint[j] = Integer.parseInt(sn[j]);
        }
        System.out.print("String found at line: ");
        for (int j = 0; j < snint.length; j++) {
            System.out.print(snint[j]);
            if(j != snint.length-1){
                System.out.print(",");
            }
        }


    }

    public void reading2DArray(){
        int[][] array;
        try{
            scannerFile = new Scanner(new FileInputStream("src/main/problems/fileHandling/resources/inputFile.txt"));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }finally {
            if (scannerFile == null) {
                System.exit(0);
            }
        }
        array = new int[scannerFile.nextInt()][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[scannerFile.nextInt()];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scannerFile.nextInt();
            }
        }


        for(int[] row: array){
            for(int value: row){
                System.out.print(value+ " ");
            }
            System.out.println();
        }


    }

    public void wordCount(){
        try{
            scannerFile = new Scanner(new FileInputStream("src/main/problems/fileHandling/resources/inputFile.txt"));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }finally {
            if (scannerFile == null) {
                System.exit(0);
            }
        }
        int wordN =0;
        while(scannerFile.hasNextLine()){
            String[] lineWords = scannerFile.nextLine().split(" ");
            wordN+= lineWords.length;
        }

        System.out.println("words count is: "+wordN);
    }




}
