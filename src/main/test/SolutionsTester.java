package main.test;

import main.components.ListNode;
import main.problems.*;
import main.problems.addTwoNumbers.AddTwoNumbers;
import main.problems.mergeTwoSortedLists.*;


import java.util.ArrayList;
import java.util.Scanner;

public class SolutionsTester {


    // The two sum testing function
    public void twoSumSolution(){
        int[] arrayTest = {2,7,11,15};
        int target = 9;
        TwoSum test1 = new TwoSum();
        int[] result = test1.twoSum(arrayTest, target);
        for (int i : result){
            System.out.println(i);
        }
    }

    // The palindrome testing function
    public void palindromeSolution(){
        int numbers = 1212;
        PalindromeNumber palindromeNumObj = new PalindromeNumber();
        boolean isPalindrome = palindromeNumObj.isPalindrome(numbers);
        System.out.println("the palindrome is "+ isPalindrome);
    }

    public void romanToIntegerSolution(){
        String romanString = "MCMXCIV";
        RomanToInteger romanToIntobj = new RomanToInteger();
        int result = romanToIntobj.romanToInt(romanString);
        System.out.println("the final result is: "+result);
    }



    public void longestCommonPrefixSolution(){
        String[] arrayOfString = {"flower", "flow", "flight"};
        LongestCommonPrefix longestCommPreObj = new LongestCommonPrefix();
        String result = longestCommPreObj.longestCommPrefix(arrayOfString);
        System.out.println("the final result is: " + result);
    }

    public void validParenthesesSolution(){
        String parenthesesStr = "(){}[]" ;
        ValidParentheses validParenthesesObj = new ValidParentheses();
        boolean result = validParenthesesObj.validParen(parenthesesStr);
        System.out.println("the final result is: " + result);
    }


    public void sequenceDetectiveSolution(){

        Scanner scanner = new Scanner(System.in);
        SequenceDetective sequenceDetObj = new SequenceDetective();
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline

        int[][] grid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the " + (i + 1) + " row: ");
            String[] inputRow = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                grid[i][j] = Integer.parseInt(inputRow[j]);
            }
        }

        System.out.print("Enter the sequence that you want to search for: ");
        String[] inputSequence = scanner.nextLine().split(" ");
        int[] sequence = new int[inputSequence.length];
        for (int i = 0; i < inputSequence.length; i++) {
            sequence[i] = Integer.parseInt(inputSequence[i]);
        }

        scanner.close();

        sequenceDetObj.searchSequence(grid, sequence);

    }


    public void mergeTwoSortedListsSolution(){
        MergeTwoSortedLists mergeTwoSortedListsObj = new MergeTwoSortedLists();

        ListNode list1 = mergeTwoSortedListsObj.addList(new int[]{1, 2, 4});
        System.out.println("the first list is: ");
        mergeTwoSortedListsObj.printList(list1);
        ListNode list2 = mergeTwoSortedListsObj.addList(new int[]{1, 3, 4});
        System.out.println("the second list is: ");
        mergeTwoSortedListsObj.printList(list2);
        ListNode result = mergeTwoSortedListsObj.mergeTwoLists(list1, list2);
        System.out.println("The full merged list is: ");
        mergeTwoSortedListsObj.printList(result);

    }

    public void plusOneSolution(){
        int[] array = {1, 2, 9};
        PlusOne plusOneObj = new PlusOne();
        int[] finaleResult = plusOneObj.plusOne(array);
        for (int i : finaleResult){
            System.out.println("from the solution: "+ i);
        }

    }



    public void addBinarySolution(){
        String a = "10110";
        String b = "10101";
        AddBinary addBinaryObj = new AddBinary();
        String finaleResult = addBinaryObj.addBinary(a, b);
        System.out.println(finaleResult);
    }

    public void array2DExampleOneSolution(){
        Array2DPracticeExamples array2DPracticeExamplesObj = new Array2DPracticeExamples();
        //array2DPracticeExamplesObj.array2DManipulation();
        //array2DPracticeExamplesObj.jagged2DArrayManipulation();
        //array2DPracticeExamplesObj.pyramid2DArrayWithJagged();
        //array2DPracticeExamplesObj.array2DFromUser();
        //array2DPracticeExamplesObj.example5();
        array2DPracticeExamplesObj.example6();

    }


    public void removeDuplicatesFromSortedArray(){
        int[] array = {0, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 7};
        RemoveDuplicatesFromSortedArray removeDuplicatesObj = new RemoveDuplicatesFromSortedArray();
        int result = removeDuplicatesObj.removeDuplicates(array);
    }

    public void testLabInput(){
        Scanner scanner = new Scanner(System.in);

        // Read the total number of lines
        int totalLines = Integer.parseInt(scanner.nextLine());
        ArrayList<ArrayList<Integer>> allNumbers = new ArrayList<>();

        // Iterate over the number of lines
        for (int i = 0; i < totalLines; i++) {
            String line = scanner.nextLine(); // read the next line
            String[] numbers = line.split(" "); // split the line by spaces

            ArrayList<Integer> intNumbers = new ArrayList<>();
            // Convert the string numbers to integers and add to the list
            for (String number : numbers) {
                intNumbers.add(Integer.parseInt(number));
            }
            allNumbers.add(intNumbers);
        }

        scanner.close();

        // Now allNumbers contains all the integers
        // You can process this list as per your requirement
        for (ArrayList<Integer> line : allNumbers) {
            for (int number : line) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public void addTwoNumbersSolution(){

        //6,2,2   3,3,2
        //6,2,2   4,3,2
        //6,5,2   4,4,2
        //6,5,5   4,5,3
        //6,5,5   4,5,4
        //2,3,4   1,3
        ListNode l1 = ListNode.addList(new int[]{4,6,9});
        ListNode l2 = ListNode.addList(new int[]{3,4});
        ListNode.printList(l1);
        ListNode.printList(l2);
        AddTwoNumbers addTwoNumbersObj = new AddTwoNumbers();
        ListNode result = addTwoNumbersObj.addTwoNumbers(l1, l2);
        System.out.println("the result are: ");
        ListNode.printList(result);
    }

    public void compressAndSwapSolution(){
        CompressAndSwap  compressAndSwapObj= new CompressAndSwap();
        compressAndSwapObj.compressAndSwapProblems();
    }

    public void lengthOfLongestStringSolution(){
        LengthOfLongestString  lengthOfLongestStringObj= new LengthOfLongestString();
        lengthOfLongestStringObj.lengthOfLongestSubstring("dvdf");
        //"bbbbb"
        //abcabcbb
        //"pwwkew"
        //aab
        //dvdf
    }


}
