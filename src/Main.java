import java.util.ArrayList;
import java.util.Scanner;
class Customer{
    String name;
    long phnNo;
    int tea = 0;
    int coffee = 0;
    int snacks = 0;
    int idli = 0;
    int dosa = 0;
    int total = 0;
    public int generateBill(String name, long phnNo){
        this.name = name;
        this.phnNo = phnNo;
        total = this.tea * 10 + this.coffee * 15 + this.snacks * 10 + this.idli * 8 + this.dosa * 6;
        return total;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer c = new Customer();
        boolean ch;
        do {
            System.out.println("select your items \n 1 - Tea-10 \n 2 - Coffee-15 \n 3 - Snacks-10 \n 4 - idli-8 \n " +
                    " 5 - dosa-6\n 6 - Generate Bill \n 7 - view all transaction \n 8 - exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the count of tea");
                    int tea = input.nextInt();
                    c.tea = tea;
                    break;
                case 2:
                    System.out.println("Enter count of coffee");
                    int coffee = input.nextInt();
                    c.coffee = coffee;
                    break;
                case 3:
                    System.out.println("Enter count of snacks");
                    int snacks = input.nextInt();
                    c.snacks = snacks;
                    break;






            }

        }while (true);
    }
}
