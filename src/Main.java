//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arrayTest = {2,7,11,15};
        int target = 9;
        TwoSum test1 = new TwoSum();
        int[] result = test1.twoSum(arrayTest, target);
        for (int i : result){
            System.out.println(i);
        }

    }
}