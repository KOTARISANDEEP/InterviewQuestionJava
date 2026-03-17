import java.util.*;

public class duplicateelements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        Map<Integer,Integer>Map = new TreeMap<>();
       for(String num : numbers){
        int val = Integer.parseInt(num);
        Map.put(val,Map.getOrDefault(val,0)+1);

       }
       for(Map.Entry<Integer,Integer>entry : Map.entrySet()){
        if(entry.getValue() >=2){
            System.out.println(entry.getKey()+" ");
        }

       }
       sc.close();
    }
}
