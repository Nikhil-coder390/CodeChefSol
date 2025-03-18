import java.util.*;
import java.lang.*;
import java.io.*;

class MinimumCars
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner read = new Scanner(System.in);
        int testCases = read.nextInt();
        while(testCases>0){
            int numOfFriends = read.nextInt();
            System.out.println((int)Math.ceil((double)numOfFriends/4));
            testCases--;
        }
        read.close();
    }
}
