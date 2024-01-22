import java.util.HashMap;
public class RomanToInteger {

    public int romanToInt(String s){
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }
        HashMap<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        if (romanMap.containsKey(s.charAt(s.length()-1))) {
            result = romanMap.get(s.charAt(s.length()-1));
        }

        for(int i=s.length()-1; i>0; i--){
            if (!romanMap.containsKey(s.charAt(i))) {
                throw new IllegalArgumentException("Invalid character in Roman numeral: " + s.charAt(i));
            }
            System.out.println("this is char: " + s.charAt(i) + " at index: " + i);
                if (romanMap.get(s.charAt(i)) > romanMap.get(s.charAt(i-1))){
                    result = result  - romanMap.get(s.charAt(i-1));
            } else{
                result = result  + romanMap.get(s.charAt(i-1));
            }
            System.out.println("the current result: " + result);
        }
        return result;
    }

}
