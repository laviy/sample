import java.util.Scanner;

public class BankTest {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      String withdraw = "";
      int account = 100;
      int moneyleft = 0;
      int money = 0;
      char user = 'y';
      String userinput = "";
      
      while (user != 'q') {
      System.out.println("Welcome to your Bank. You currently have £" + account + " in your account.");
      System.out.println("Would you like to withdraw or deposit?");
      withdraw = scnr.next();
      
      if (withdraw.equalsIgnoreCase("withdraw")) {
        System.out.println("Please enter how much you would like to withdraw.");
        money = scnr.nextInt();
            if (money > account) {
               System.out.println("Sorry, you cannot withdraw more than £" + account);
               System.out.println("Please try again.");
               }
            else {
               moneyleft = account - money;
               account = moneyleft;
               System.out.println("Thank you, you have withdrawn £" + money);
               System.out.println("You have £" + account + " left in your account");
               }
      }
      else {
         System.out.println("Please enter how much you would like to deposit");
         money = scnr.nextInt();
         moneyleft = account + money;
         System.out.println("Thank you, you have deposited £" + money);
         System.out.println("You have £" + moneyleft + " in your account");
         account = moneyleft;
      }
        System.out.println("Enter a character to continue or 'q' to quit");
        userinput = scnr.next();
        user = userinput.charAt(0);
      }
      System.out.println("Thank you,");
      System.out.println("Have a nice day.");
   }
}