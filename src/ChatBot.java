public class ChatBot {

    // instance variables
    private String name;
    private int number;

    // constructor
    public ChatBot(String chatBotName, int faveNum) {
        name = chatBotName;
        number = faveNum;
    }

    // method that prints a greeting
    public void greeting(String yourName) {
        System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
        System.out.println("and I am a chat bot! How are you today?");
    }

    // method that prints the weather
    public void weather() {
        System.out.println("I actually don't know much about the weather! Ha ha!");
        System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
    }

    // method that converts feet to meters and returns the meters
    public double convertFeetToMeters(int numFeet) {
        final double METERS_PER_FOOT = 0.3048;
        return METERS_PER_FOOT * numFeet;
    }

    // method that prints information about favorite numbers
    public void favoriteNumber(int yourNumber) {
        int distance = yourNumber - number;  // number is an instance variable
        System.out.println("My favorite number is " + number);
        System.out.println("That is " + distance + " away from your number!");
    }

    // method that adds and returns the sum of three numbers
    public int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // method that RETURNS a goodbye message as a String -- note there is no printing here!
    public String goodbye() {
        return "It was nice talking with you! Have a great day! Sincerely, " + name;
    }

    public int leftoverYarn(int yarnBought, int yarnUsed) { //subtracts amount of yarn used from yarn bough to return an integer value of how much yarn was left over
       return yarnBought-yarnUsed;
    }

    public void tooMuchYarn(int yarnBought, int yarnUsed) { //assesses if too much yarn was bought and either says if we bought too much or could have bought more
        if (yarnBought > yarnUsed) {
            System.out.println("We bought too much yarn! How wasteful.");
        }else{
            System.out.println("We could've bought more yarn.");
        }
    }

}

