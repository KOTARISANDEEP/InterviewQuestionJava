import java.util.Scanner;
public class equalibriam {
    public static int equalibriam(int[] arr){
        int totalsum = 0;
        for(int num :arr){
        totalsum += num;
        }
        int leftsum = 0;
        for(int i=0;i<arr.length;i++){
            int rightsum= totalsum-leftsum-arr[i];
            if(leftsum==rightsum){
                return i;
               
            }leftsum += arr[i];
        }return-1;

        }
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i]= sc.nextInt();
               
                
            }
            System.out.println(equalibriam(arr));

        }


    
    }
    

