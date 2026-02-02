import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(8);
        numbers.add(3);
        numbers.add(9);
        numbers.add(20);
        numbers.add(12);

        int K = 9;
        //int index = linearSearch(numbers, K);
        int index = sentinelSearch(numbers, K);
        if (index != -1) {
            System.out.println("Index of " + K + ": " + index);
        } else {
            System.out.println("Array not include " + K);
        }
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(12);
        numbers.add(14);
        numbers.add(20);
        numbers.add(25);
        int K = 111;
        int index = binarySearch(numbers, K);
        if (index != -1) {
            System.out.println("Index of " + K + ": " + index);
        } else {
            System.out.println("Array not include " + K);
        }
    }

    public static int binarySearch(ArrayList<Integer> numbers, int K) {
        int left = 0;
        int right = numbers.size() - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (K == numbers.get(mid)) {
                return mid;
            } else if (K > numbers.get(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        return -1;
    }

    public static int linearSearch(ArrayList<Integer> numbers, int K) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == K) {
                return i;
            }
        }
        return -1;
    }

    // Đặt lính canh
    public static int sentinelSearch(ArrayList<Integer> numbers, int K) {
        numbers.add(K);
        int i = 0;
        while (numbers.get(i) != K) {
            i++;
        }

        if (i == numbers.size() - 1) {
            return -1;
        } else {
            return i;
        }
    }
}
