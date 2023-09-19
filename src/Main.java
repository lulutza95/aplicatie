import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Banckacount bank1= new Banckacount(" marian "," copu");
        bank1.showMenu();



    }
}
class Banckacount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    Banckacount(String cname,String cid){
        customerName= cname;
        customerId=cid;

    }

    void deposit(int amount){
        if(amount!=0){
            balance= balance+ amount;
            }
        }

    void withdraw(int amount){
        if(amount!=0){
            balance= balance-amount;
            previousTransaction= amount;
        }

    }
    void getPreviosTransaction(){
        if(previousTransaction>0){
            System.out.println("Depozit"+ previousTransaction);
        }
        else if(previousTransaction<0){
            System.out.println("Withdraw" + Math.abs(previousTransaction));

        }
        else{
            System.out.println("no transaction occured");
        }
    }
    void showMenu(){
        char option='0';
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welokome" + customerName);
        System.out.println("Your Id is " + customerId);
        System.out.println("\n");
        System.out.println("A.Check Balance");
        System.out.println("B.Deposit");
        System.out.println("C.Withdraw");
        System.out.println("D.Previous Transaction");
        System.out.println("E.Exit");

        do {
            System.out.println(" *******************");
            System.out.println("Enter an option");
            System.out.println(" ********************");
            option = scanner.next().charAt(0);
            Character.toLowerCase(option);

            switch (option) {
                case 'A':
                    System.out.println(" **************");
                    System.out.println("Balance " + balance);
                    System.out.println("**************** ");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println(" ****************");
                    System.out.println("Enter an amount to deposit");
                    System.out.println("***************** ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;

                case 'C':
                    System.out.println(" ******************");
                    System.out.println("Enter an amount to withdraw");
                    System.out.println(" ********************");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;

                case 'D':
                    System.out.println("*********************** ");
                    getPreviosTransaction();
                    System.out.println(" **************************");
                    System.out.println();
                    break;

                case'E':
                    System.out.println(" *********************");
                    break;
                default:
                    System.out.println("Invalid Option!Please try again");
                    break;
            }
        }
            while(option!='E');
            System.out.println("ThankYou for using our service");
        }
    }

