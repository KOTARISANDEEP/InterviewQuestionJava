import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int temp=n,sum=0;
        while(n!=0){
            int d=n%10;
            sum = sum+d*d*d;
            n = n/10;
        }
        System.out.println(temp == sum? "Armstrong number" : "not Armstrong");
    }}
