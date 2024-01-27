package main.problems;

public class LongestCommonPrefix {

    public String longestCommPrefix(String[] strArray){
        for (String s: strArray){
            System.out.println(s);
        }
        String prefix = strArray[0];
        for(int i=1;i<strArray.length;i++){

            while(strArray[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
