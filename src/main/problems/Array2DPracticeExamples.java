package main.problems;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Array2DPracticeExamples {


    /**
     * Write a program that manipulates a 2D array as follows:
     *  The number of rows is 5
     *  The number of columns is 4
     *  Initialize each element as i + j (i: row number, j: column number)
     *  Display all elements
     */
    public void array2DManipulation(){
        int[][] array = new int[5][4];
        for (int i=0; i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                array[i][j] = i+j;
            }
        }
        for (int[] i : array) {
            for (int k : i) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }



    /**
     *• Write a program that manipulates a 2D array as follows:
     *  • The array is initialized by an initialization list
     *  • Display the array
     * • Can initialization lists be of different sizes?
     *  • Try examples
     */
    public void jagged2DArrayManipulation(){
        int[][] normal2DArray = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Displaying the normal array: ");
        for(int[] row: normal2DArray){
            for(int value: row){
                System.out.print(value+" ");

            }
            System.out.println();
        }
        int[][] jagged2DArray = {{1,2,3}, {4,5}, {9}};
        System.out.println("Displaying the jagged array: ");
        for(int[] row: jagged2DArray){
            for(int value: row){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }



    /**
     * • Write a program that manipulates a 2D array as follows:
     *      • The first row has n values
     *      • Each following row has an extra value to the one before it
     * • Initialize the array
     * • Display the array
     * • 1 2
     * • 3 4 5
     * • 6 7 8 9
     */
    public void pyramid2DArrayWithJagged(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial value of the size of the array (first row): ");
        int size = scanner.nextInt();
        int[][] pyramid = new int[4][];
        scanner.nextLine();
        for(int i=0; i<pyramid.length; i++){
            pyramid[i] = new int[size];
            System.out.println("Enter the value of row: [" + i +"]: ");
            String tempStr = scanner.nextLine();
            String[] rowValues = tempStr.split(" ");
            for(int j=0;j<size;j++){
                pyramid[i][j] = Integer.parseInt(rowValues[j]);
            }
            size++;
        }
        System.out.println("The Matrix: ");
        for (int[] row: pyramid){
            for(int value: row){
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }


    /**
     * Write a program that manipulates a 2D array as follows:
     *      • Read from the user how many rows
     *      • Read from the user how many columns for each row
     * Initialize the array
     * Display the array
     */
    public void array2DFromUser(){
        int row ;
        int columns;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        row = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        columns = scanner.nextInt();
        int[][] array2D = new int[row][columns];
        scanner.nextLine();
        for(int i=0;i<row;i++){
            System.out.println("enter the value of row "+ i + " : ");
            String inputStr = scanner.nextLine();
            String[] splitStr = inputStr.split(" ");
            for(int j=0;j<array2D[i].length;j++){
                array2D[i][j] = Integer.parseInt(splitStr[j]);
            }
        }
        for(int[] rows: array2D){
            for(int value: rows){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }


    /**
     *  If the user inputs: 3 2 5 7
     *      • Create an array of 3 rows, row 1 of size 2, row 2 of size 5, and row 3 of size 7
     */
    public void example5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sequence of numbers: ");
        String userInput = scanner.nextLine();
        String[] userSplitInput = userInput.split(" ");
        int[] userSplitInputInt = new int[userSplitInput.length];
        for(int i=0;i<userSplitInput.length;i++){
            userSplitInputInt[i] = Integer.parseInt(userSplitInput[i]);
        }

        int[][] array = new int[userSplitInputInt[0]][];

        for(int i=0; i<array.length;i++){
           array[i] = new int[userSplitInputInt[i+1]];
           for(int j=0;j<array[i].length;j++){
               array[i][j] = j;
           }
        }

        for(int[] rows:array){
            for(int value:rows){
                System.out.print(value+" ");
            }
            System.out.println();
        }


    }


    /**
     * • If the user inputs: 3 2 3 2 1 2 3 4 5 6 7
     *   another input example: 4 2 4 1 3 1 2 3 4 5 6 7 8 9 1
     *      • Create an array of 3 rows, row 1 of size 2, row 2 of size 3, and row 3 of size 2
     *      • Row 1 values: 1, 2
     *      • Row 2 values: 3, 4, 5
     *      • Row 3 values: 6, 7
     */

    public void example6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sequence of numbers: ");
        String userInputStr = scanner.nextLine();
        String[] userInputStrSplit = userInputStr.split(" ");
        System.out.print(Arrays.toString(userInputStrSplit));
        System.out.println();
        int[] userInputInt = new int[userInputStrSplit.length];
        for(int i=0;i<userInputStrSplit.length;i++){
            userInputInt[i] = Integer.parseInt(userInputStrSplit[i]);
        }

        int[][] array2D = new int[userInputInt[0]][];
        int[] inputIntSplit = Arrays.copyOfRange(userInputInt, userInputInt[0] + 1, userInputInt.length);
        System.out.println("The Split array is : " + Arrays.toString(inputIntSplit));

        int inputCount = 0;
        for(int i=0;i<array2D.length;i++){
            array2D[i] = new int[userInputInt[i+1]];
            for(int j=0;j<array2D[i].length;j++){
                array2D[i][j] = inputIntSplit[inputCount++];
            }
        }

        System.out.println("The finale result of the array my print: ");
        for(int[] rows: array2D){
            for(int value: rows){
                System.out.print(value+" ");
            }
            System.out.println();
        }

    }



}
