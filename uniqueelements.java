import java.util.HashSet;
import java.util.Scanner;
public class uniqueelements{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       HashSet<Integer> set = new HashSet<>();
       for(int i=0;i<n;i++){
       set.add(sc.nextInt());
       }

      //  for(int num : set){ // for asking to print the array
       //     System.out.print(num + " ");
     //   }
    System.out.print(set.size());
       }
    

    }

