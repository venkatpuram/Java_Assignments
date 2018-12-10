import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int  number, temp, total = 0;
        System.out.println("enter number :");
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number = number/10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}