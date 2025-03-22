import java.util.*;
import java.lang.*;
import java.io.*;

class saleSeason
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner read = new Scanner(System.in);
        int testCases = read.nextInt();
        for(int i=0;i<testCases;i++){
            int x = read.nextInt();
            if(x>5000){
                x-=500;
            }
            else if(x<=5000 && x>1000){
                x-=100;
            }
            else if(x<=1000 && x>100){
                x-=25;
            }
            else if(x<=100){
                x = x;
            }
            System.out.println(x);
        }
        read.close();
    }
}
