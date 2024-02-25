package main.problems;

public class Zigzag {

    public String convert(String s, int numRows) {
        if(s.length()==1 || numRows==1) return s;
       StringBuilder result = new StringBuilder();
       StringBuilder[] rows = new StringBuilder[numRows];
       for(int i =0;i<rows.length;i++){
           rows[i] = new StringBuilder();
       }
       int currentRow = 0;
       boolean downOrUp = false;
       for(char c : s.toCharArray()){
           rows[currentRow].append(c);
           if(currentRow == 0 || currentRow == numRows-1){
               downOrUp = !downOrUp;
           }
           currentRow += (downOrUp) ? +1: -1;
       }
        for (StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }



}


/**
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 */