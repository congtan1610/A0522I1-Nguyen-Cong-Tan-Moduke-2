package ThuatToanTimKiem.bt;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] array;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your size:");
        int n = Integer.parseInt(input.nextLine());
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr[" + i + "]:");
            int num = Integer.parseInt(input.nextLine());
            array[i] = num;
        }
        int tmp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        for (int a : array) {
            System.out.println(a);
        }
        System.out.print("Enter your number you want search:");
        int numS = Integer.parseInt(input.nextLine());
        if (binarySearch(array, 0, n, numS) == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println(array[binarySearch(array, 0, n - 1, numS)]);
        }
    }

    static int binarySearch(int[] arr, int left, int right, int value) {
        if (left > right) {
            return -1;
        } else {
            int middle = (left + right) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                return binarySearch(arr, middle + 1, right, value);
            } else if (value < arr[middle]) {
                return binarySearch(arr, left, middle - 1, value);
            }
        }
        return -1;
    }
}
