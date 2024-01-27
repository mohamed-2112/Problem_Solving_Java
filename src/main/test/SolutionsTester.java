package main.test;

import main.problems.*;
import main.problems.mergeTwoSortedLists.*;
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


}
