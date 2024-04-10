package bt9;

import java.util.Arrays;
import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr); // Sắp xếp mảng

        System.out.print("Nhập giá trị cần tìm kiếm: ");
        int target = scanner.nextInt();

        int index = binarySearch(arr, 0, n - 1, target);
        if (index == -1) {
            System.out.println("Giá trị không có trong mảng");
        } else {
            System.out.println("Giá trị " + target + " được tìm thấy tại chỉ số " + index);
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1; // Giá trị không có trong mảng
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // Tìm thấy giá trị
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target); // Tìm kiếm bên phải
        } else {
            return binarySearch(arr, left, mid - 1, target); // Tìm kiếm bên trái
        }
    }
}
