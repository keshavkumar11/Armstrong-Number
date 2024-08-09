import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:- ");
        int no=sc.nextInt();
        int check=no;
        double sum=0;
        int rem,mod;
        double power=1.0;
        double count=0;
        while(no>0)
        {
            no=no/10;
            count++;
        }
        no=check;

        while(no>0)
        {
            rem=no/10;
            mod=no%10;
            no=rem;
            power=Math.pow(mod,count);
            sum=sum+power;
        }
        System.out.println("the sum is"+sum);
        if (check==sum)
        {
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
