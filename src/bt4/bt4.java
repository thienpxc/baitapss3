package bt4;

import java.util.Arrays;
import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,9};
        Arrays.sort(arr);
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap gia tri can tim");
        int target = scanner.nextInt();
        int index = binarySearch(arr,target);
        if (index == -1) {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        } else {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + index + " trong mảng.");
        }
    }
    public static int binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length -1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
        return -1;
    }
}
