import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the first number:");
        num1=scan.nextInt();
        System.out.println("Enter the second number:");
        num2=scan.nextInt();
        num3=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+num3);
    }
}