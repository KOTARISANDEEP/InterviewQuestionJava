import java.util.Scanner;
public class bike {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int v= sc.nextInt();
        int w=sc.nextInt();
        if(w%2!=0 || w<v*2 || w>w*4){
            System.out.println("Invalid number");
            return;
        }
        int fw = (w-2*v)/2;
        int tw= v-fw;
        if(tw<0 || fw<0){
            System.out.println("Invalid number");
        }else{
            System.out.println(tw);
            System.out.println(fw);

            
        }

    }
    
}
