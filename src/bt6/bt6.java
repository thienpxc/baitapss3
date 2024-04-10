package bt6;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Trình tự các bước sắp xếp:");
        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        printArray(arr, 0);
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            printArray(arr,i);
        }
    }
    public static void printArray(int[] arr,int step){
        System.out.println("buoc" + step+ ":");
        for (int num : arr
             ) {
            System.out.println(num + "");
        }
        System.out.println();
    }
}