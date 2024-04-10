package bt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bt2 {
    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can tim");
        int target = scanner.nextInt();
        boolean found = findNumber(getArr(),target);
    }

    //b1 Tạo một hàm tìm kiếm có kiểu dữ liệu trả về là boolean
    public static boolean findNumber(int[][] arr, int target) {
        //B2: trong hàm tạo 1 mảng 2 chiều và gọi hàm getArr() để gán.
        int[][] matrix = getArr();
        //b3 : Tạo hai List để lưu trữ vị trí số đó xuất hiện
        List<Integer> rowList = new ArrayList<>();
        List<Integer> colList = new ArrayList<>();
        //B4: tạo biến check dkl boolean, mặc định =  false
        boolean found = false;
        //B5: sử dụng vòng lặp lồng nhau duyệt qua tất cả phần tử của mảng 2 chiều, nếu có phần tử trùng ta sẽ add vị trí vào 2 list ở trên và đổi biết check = true.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    rowList.add(i);
                    colList.add(j);
                    found = true;
                }
            }

        }
        // Bước 6: In ra các vị trí và trả về biến found
        if (found){
            System.out.println("so" + target + "xuat hien tai cac vi tri");
            for (int i = 0; i < rowList.size(); i++) {
                System.out.println("hang" + rowList.get(i) + ", cot" + colList.get(i));
            }
        }else {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }
        return found;
    }

}
