import java.util.*;
import java.lang.*;
import java.io.*;

class waterFilling
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner read = new Scanner(System.in);
        int testCases = read.nextInt();
        for(int i=0;i<testCases;i++){
            int b1 = read.nextInt();
            int b2 = read.nextInt();
            int b3 = read.nextInt();
            System.out.println((b1+b2+b3)<=1?"Water filling time":"Not now");
        }
        read.close();
    }
}
