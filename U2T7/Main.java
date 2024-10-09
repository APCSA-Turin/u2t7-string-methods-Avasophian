package U2T7;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string one: ");
        String str1 = scan.nextLine();
        System.out.println("Enter string two: ");
        String str2 = scan.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 > len2)
        {
            System.out.println(str1 + " is longer");
        }
        else if (len2 > len1) 
        {   
            System.out.println(str2 + " is longer");

        }
        else
        {
            System.out.println("Both have the same length");
        }
        int indexValue = len1 - 1;
        int indexValue2 = len2 - 1;

        int x = (int)((indexValue/2.0) + 0.5)/1;
        int y = (int)((indexValue2/2.0) + 0.5)/1;
        String firstHalf1 = str1.substring(0, x );
        String secondHalf1 = str1.substring(x);
        System.out.println("First half : " + firstHalf1);
        System.out.println("Second half : " + secondHalf1);
        String firstHalf2 = str2.substring(0, y );
        String secondHalf2 = str2.substring(y);
        System.out.println("First half : " + firstHalf2);
        System.out.println("Second half : " + secondHalf2);
        
        int indexFound = str1.indexOf(str2);
        if (indexFound == -1)
        {
            System.out.println(str2 + " is NOT found in " + str1);
        }
        else
        {
            System.out.println(str2 + " is found in " + str1 + " at index " + indexFound);
        }
    }
}
