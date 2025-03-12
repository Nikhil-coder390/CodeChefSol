import java.util.*;
import java.lang.*;
import java.io.*;

class exams
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        while(testcases>0){
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            float totalStudents = x*y;
            float passPercentage = ((z/totalStudents)*100);
            System.out.println((passPercentage>50)?"Yes":"No");
            testcases--;
        }
        input.close();
    }
}
