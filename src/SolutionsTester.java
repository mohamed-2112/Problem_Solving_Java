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

}
