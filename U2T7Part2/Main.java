import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        String nextString;
        int compare;
        int len1;
        int len2;
        String firstTwo;
        String lastTwo;
        String firstOne;

        System.out.print("Enter the first word: ");
        String firstString = scan.nextLine();
        while (score < 50)
        {
            System.out.print("Enter the next word: ");
            nextString = scan.nextLine();
            compare = firstString.compareTo(nextString);
            if (compare < 0)
            {
                score += 2;
                System.out.println("+2 points: Current word alphabetically after; SCORE: " + score);
            }
            else if (compare > 0)
            {
                score -= 5;
                System.out.println("-5 points: Current word alphabetically before; SCORE: " + score);
            }

            if (firstString.equals(nextString))
            {
                score -= 10;
                System.out.println("-10 points: Current word equal to previous; SCORE: " + score);
            }
            
            len1 = firstString.length();
            len2 = nextString.length();
            lastTwo = firstString.substring(len1 - 2);
            firstTwo = nextString.substring(0, 2);

            if (len1 == len2)
            {
                score += 4;
                System.out.println("+4 points: Current word length equal to previous word length; SCORE: " + score);
            }


            if (lastTwo.equals(firstTwo))
            {
                score += 5;
                System.out.println("+5 points: Last two letters of previous match first two letters of current; SCORE: " + score);
            }

            firstOne = firstString.substring(0, 1);
            if (nextString.indexOf(firstOne) != -1)
            {
                score += 3;
                System.out.println("+3 points: First letter of previous word found in current word; SCORE: " + score);
            }

            

            firstString = nextString;

            
        }

    }
}
