import java.util.*;
import java.lang.*;
import java.io.*;

class Subscriptions
{
    public static int calculateSubscriptions(int n){
        if(n%6==0){
            return n/6;
        }
        else{
            return Math.round(n/6)+1;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        while(testcases>=1){
            int n = input.nextInt();
            int x = input.nextInt();
            int y = calculateSubscriptions(n);
            System.out.println(x*y);
            testcases--;
        }
        input.close();
    }
}
