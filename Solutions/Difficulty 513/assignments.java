import java.util.*;
import java.lang.*;
import java.io.*;

class assignments
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while(testcase>=1){
            int x = input.nextInt();
            if((x+3)<=10){
                System.out.println("YES");
            }
            else System.out.println("NO");
            testcase--;
        }
        input.close();
    }
}
