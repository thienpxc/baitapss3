package bt12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bt12 {
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println("Mảng đã được tạo:");
        printArray(arr);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên cần tìm kiếm: ");
        int target = scanner.nextInt();

        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Số " + target + " được tìm thấy tại vị trí " + index + " trong mảng.");
        } else {
            System.out.println("Số " + target + " không được tìm thấy trong mảng.");
        }
    }

    private static void printArray(Integer[] arr) {
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int binarySearch(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid].equals(target)) {
                return mid;
            }

            if (arr[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
