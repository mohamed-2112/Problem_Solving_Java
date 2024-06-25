package main.problems;

public class StringToInteger {
    public int myAtoi(String s) {
        s = s.stripLeading();
        s = parseString(s);
        int number ;

        try {
            number = Integer.parseInt(s);
            System.out.println("the result is: "+number);
        }
        catch (IllegalArgumentException e){
            if (s.charAt(0)=='-'){
                return Integer.MIN_VALUE;
            }
            else {
                return Integer.MAX_VALUE;
            }
        }

        return number;
    }

    private String parseString(String s){
        if (s.isEmpty()||s.charAt(0) != '-'&& s.charAt(0) != '+' && !Character.isDigit(s.charAt(0)) ){
            return "0";
        }
        int index = 1;
        for (int i = 1; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))){
                break;
            }
            index++;
        }
        s = s.substring(0, index);
        if(s.length()==1&&(s.equals("_")||s.equals("+"))){
            return "0";
        }
        return s;
    }

}
