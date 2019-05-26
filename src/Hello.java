public class Hello {
    public static void main(String [] args) {

        System.out.println("Hello, World!");
        int myFirstNumber = (15 + 10) + 15/3;
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int challenge = 1000 - myTotal;

        System.out.println(challenge);
    }
}