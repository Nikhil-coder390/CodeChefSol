import java.util.*;
import java.lang.*;
import java.io.*;

class marioBullet
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner read = new Scanner(System.in);
        int testCases = read.nextInt();
        while(testCases>0){
            int x = read.nextInt();
            int y = read.nextInt();
            int z = read.nextInt();
            int timeTaken = y/x;
            System.out.println((z<timeTaken) ? 0 : z-timeTaken);
            testCases--;
        }
        read.close();
    }
}
