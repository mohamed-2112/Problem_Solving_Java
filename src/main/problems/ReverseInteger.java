package main.problems;
import java.lang.Math;
public class ReverseInteger {
    public int reverse(int x) {
        if(x<10&&x>-1) return x;
        int reminder ;
        int reverse = 0;
        while(x!=0){
            System.out.println("the x now: "+x);
            reminder = x%10;
            System.out.println("the reminder: "+reminder);
            x=x/10;
            System.out.println("the x after the dev.: "+x);
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && reminder > 7)) return 0;
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && reminder < -8)) return 0;
            System.out.println(Integer.MAX_VALUE);
            reverse = reverse * 10 + reminder;
            System.out.println("the reverse: "+ reverse);
        }
        return reverse;
    }
}


//  123
//[-2 31, 2 31 - 1]