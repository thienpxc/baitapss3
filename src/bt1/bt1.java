package bt1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bt1 {
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    public static void main(String[] args) {
        //b1 tao mang getArr()
        int[] test = getArr();
        //b2 in ra
        System.out.println("mang so nguyen");
        for (int num : test
        ) {
            System.out.println(num + "");
        }
        //B3: cài đặt thuật toán tuyến tính để tìm ra số lớn nhất
        int max = findMax(test);
        // B4: In số lớn nhất ra
        System.out.println("So lon nhat trong mang la :" + max);
    }

    private static int findMax(int[] test) {
        int max = test[0];
        for (int num : test
        ) {
            if (num > max) {
                max = num;
            }

        }
        return max;
    }
}
