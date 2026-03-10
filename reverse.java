import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        int r,a,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        a=num;
        while(num>0){
            r=num%10;
            rev= rev*10+r;
            num=num/10;
        }
        System.out.println("Reverse number is:"+rev);


    }
}