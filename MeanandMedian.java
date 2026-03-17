import java.util.*;

public class MeanandMedian {

    public static void meanmedian(int[] arr) {
        int n = arr.length;

        double sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double mean = sum / n;
        System.out.println("Mean: " + mean);

        Arrays.sort(arr);

        double median;
        if (n % 2 == 0) {
            median = (arr[n/2 - 1] + arr[n/2]) / 2.0;
        } else {
            median = arr[n/2];
        }

        System.out.println("Median: " + median);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // ❗ FIX: remove infinite input issue
        String input = sc.nextLine();   // take full line input
        String[] parts = input.split(" ");

        for (String p : parts) {
            list.add(Integer.parseInt(p));
        }

        int[] arr = list.stream().mapToInt(i -> i).toArray();

        meanmedian(arr);

        sc.close();
    }
}