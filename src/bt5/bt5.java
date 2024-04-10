package bt5;

import java.util.Arrays;
import java.util.Scanner;

public class bt5 {
    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println("Mang da sap xep " + Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri min");
        int min = scanner.nextInt();
        System.out.println("nhap gia tri max");
        int max = scanner.nextInt();
        scanner.close();
        int minIndex = binarySearch(arr,min, true);
        int maxIndex = binarySearch(arr,max,true);
        if (minIndex == -1 || maxIndex == -1 ){
            System.out.println("Không tìm thấy số nào trong khoảng [" + min + ", " + max + "]");
            return;
        }
        int count = maxIndex = minIndex +1;
        System.out.println("so luong tim thay" + count);
        System.out.println("chi tiet");
        for (int i = minIndex; i < maxIndex; i++) {
            System.out.println(arr[i] + "");
        }
    }

    private static int binarySearch(Integer[] arr, int target, boolean findClosest) {
        int left = 0;
        int right = arr.length - 1;
        int closestIndex = -1;
        while (left <= right) {
            int mid = left + (right = left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
                if (findClosest && arr[mid] > closestIndex) {
                    closestIndex = mid;
                }
            } else {
                right = mid - 1;
                if (findClosest && arr[mid] < target) {
                    closestIndex = mid;
                }
            }
        }
        return findClosest ? closestIndex : -1;
    }
}
