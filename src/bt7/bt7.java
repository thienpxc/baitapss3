package bt7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bt7 {
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }
    private static int binarySearch(Integer[] arr, int target, boolean findHighest) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                if (findHighest) {
                    result = mid;
                }
                left = mid + 1;
            } else {
                if (!findHighest) {
                    result = mid;
                }
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println("Mảng ngẫu nhiên: " + Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị min: ");
        int min = scanner.nextInt();
        System.out.print("Nhập giá trị max: ");
        int max = scanner.nextInt();
        scanner.close();

        int minIndex = binarySearch(arr, min, false);
        int maxIndex = binarySearch(arr, max, true);

        if (minIndex == -1 && maxIndex == -1) {
            System.out.println("Không tìm thấy số nào trong khoảng [" + min + ", " + max + "]");
        } else {
            int count = 0;
            if (minIndex != -1) {
                count += maxIndex - minIndex + 1;
            }
            if (maxIndex != -1 && minIndex == -1) {
                count += maxIndex + 1;
            }
            System.out.println("Số lượng số tìm thấy: " + count);

            if (minIndex != -1) {
                System.out.print("Các số lớn hơn hoặc bằng " + min + ": ");
                for (int i = minIndex; i <= maxIndex; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

            if (maxIndex != -1 && minIndex == -1) {
                System.out.print("Các số nhỏ hơn hoặc bằng " + max + ": ");
                for (int i = 0; i <= maxIndex; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

}
