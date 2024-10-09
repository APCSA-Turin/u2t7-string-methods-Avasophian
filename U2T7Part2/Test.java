import java.util.Scanner;


public class Test

 {
    public static void main(String[] args)
    {

        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter one word: ");
        String str1 = scan.nextLine();
        System.out.print("Enter another word: ");
        String str2 = scan.nextLine();

        if (str1.equals(str2))
        {
            System.out.println("The strings are equal!");
        }
        else
        {
            System.out.println("The strings are not equal.");
        }

        int cameBefore = str1.compareTo(str2);
        if (cameBefore < 0)
        {
            System.out.println(str1 + " comes before " + str2 + " alphabetically");
        }
        else if (cameBefore > 0)
        {
            System.out.println(str2 + " comes before " + str1 + " alphabetically");
        }
  
    }
}
