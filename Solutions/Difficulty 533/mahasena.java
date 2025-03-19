import java.util.*;
import java.lang.*;
import java.io.*;

class mahasena
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = read.nextInt();
        }
        int luckyCount = 0, unluckyCount = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                luckyCount++;
            }
            else{
                unluckyCount++;
            }
        }
        System.out.println((luckyCount>unluckyCount)?"READY FOR BATTLE":"NOT READY");
        read.close();
    }
}
