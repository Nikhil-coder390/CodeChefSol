import java.util.*;
import java.lang.*;
import java.io.*;

class greaterAverage
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        while(testcases>=1){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            double avg = (a+b)/2.0;
            if(avg > c){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            testcases--;
        }
        input.close();
    }
}
