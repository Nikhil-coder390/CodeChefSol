import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner read = new Scanner(System.in);
        int testCase = read.nextInt();
        while(testCase>0){
            int x = read.nextInt();
            int y = read.nextInt();
            System.out.println(x*4+y);
            testCase--;
        }
        read.close();
    }
}
