import java.util.Scanner;
public class ChatBotRunner {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        ChatBot debbie = new ChatBot("Samuel", 12);

        System.out.print("What is your name?");
        String yourName = scan.nextLine();

        debbie.greeting(yourName);
        System.out.println("I hear the weather is nice today.");
        debbie.weather();
        System.out.println(" ");

        System.out.print("Anyways, what's your favorite number?" );
        int favNum = scan.nextInt();
        scan.nextLine();
        debbie.favoriteNumber(favNum);
        System.out.println(" ");

        System.out.print("How many feet of yarn do you think I need to crochet a blanket?" );
        int feet = scan.nextInt();
        scan.nextLine();
        System.out.println("That amount of feet is actually equal to " + debbie.convertFeetToMeters(feet) + " meters");
        System.out.println(" ");

        System.out.println("I used 7 feet of yarn for the blanket.");
        System.out.println("After making the blanket, I had " + debbie.leftoverYarn(feet, 7) + " feet of yarn leftover from the blanket.");
        debbie.tooMuchYarn(feet,7);

        System.out.print("I need 3 colors of yarn for a sweater now! How many meters of red yarn should I buy?");
        int redYarn = scan.nextInt();
        scan.nextLine();
        System.out.print("How many meters of blue yarn?");
        int blueYarn = scan.nextInt();
        scan.nextLine();
        System.out.print("How many meters of yellow yarn?");
        int yellowYarn = scan.nextInt();
        scan.nextLine();
        System.out.println("Looks like in total, I will need " + debbie.addNumbers(blueYarn, redYarn, yellowYarn) + " meters of yarn for the sweater.");
        System.out.println(" ");

        System.out.println("Thanks for your help! " + debbie.goodbye());


    }
}
