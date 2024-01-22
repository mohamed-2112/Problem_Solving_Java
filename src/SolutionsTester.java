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
    public void PalindromeSolution(){
        int numbers = 1212;
        PalindromeNumber palindromeNumObj = new PalindromeNumber();
        boolean isPalindrome = palindromeNumObj.isPalindrome(numbers);
        System.out.println("the palindrome is "+ isPalindrome);
    }

}
