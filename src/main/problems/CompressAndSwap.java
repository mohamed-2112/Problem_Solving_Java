package main.problems;
import java.util.Arrays;
import java.util.Scanner;
public class CompressAndSwap {
    int[][] matrix;

    public void compressAndSwapProblems(){
        userInput();
        printArray();
        for (int r=0;r< matrix.length;r++) {
            compress(matrix[r], r);
        }
        printArray();
        System.out.println("after the swap: ");
        swap();
        printArray();
    }


    public void swap(){
        int shortest =0, longest=0;
        int[]colSizes = new int[matrix.length];
        for (int i = 0; i <matrix.length ; i++) {
            colSizes[i] = matrix[i].length;
        }
        for (int i = 0; i <colSizes.length ; i++) {
            if(colSizes[shortest]>colSizes[i]){
                shortest = i;
            }
            if(colSizes[longest]<colSizes[i]){
                longest = i;
            }
        }
        int[] temp = matrix[0];
        matrix[0] = matrix[shortest];
        matrix[shortest] = temp;
        temp = matrix[matrix.length-1];
        matrix[matrix.length-1] = matrix[longest];
        matrix[longest] = temp;
    }


    public void compress(int[] row, int r){
        for(int i=0; i< row.length;i++){
            System.out.println("this is the i: "+i);
            if(checkCompression(row, i)){
                System.out.println("this is row of i in the con : "+row[i]);
                int[] newRow = new int[row.length-2];
                for (int j = 0, k=0; j < newRow.length; j++, k++) {
                    newRow[j] = row[k];
                    if(j==i){
                        k+=2;
                    }
                }
                i+=2;
                System.out.println(" the new row is "+ Arrays.toString(newRow));
                matrix[r] = newRow;

            }
        }
    }




    public boolean checkCompression(int[] row, int i){
        int compressionCount = 0;
        if (i>0&&row[i]==row[i-1]) {
           return false;
        }
        for (int j = i; j < row.length; j++) {

            if(row[i]==row[j]){
                compressionCount++;
            }
            else {
                break;
            }
        }
        return compressionCount == 3;
    }




    public void userInput(){
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        scanner.nextLine();
        matrix = new int[numberOfLines][];
        String[] inputArray = new String[numberOfLines + 1];

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextLine();
        }
        scanner.close();

        String[] columnsN = inputArray[0].split(" ");
        for (int i = 0; i < columnsN.length; i++) {
            matrix[i]= new int[Integer.parseInt(columnsN[i])];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(inputArray[i+1].split(" ")[j]);
            }
        }


    }

    public void printArray(){
        System.out.println("The array is: ");
        for (int[] row: matrix){
            for (int value: row){
                System.out.print(value+ " ");
            }
            System.out.println();
        }
    }



}


/*
3
5 4 5
1 2 2 2 1
3 3 3 3
4 5 5 5 4
 */