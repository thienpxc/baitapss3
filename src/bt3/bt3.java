package bt3;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        // Tạo mảng số nguyên
        int[] arr = {5,2,8,1,9,3};
        // Nhập giá trị cần tìm từ bàn phím
        Scanner scanner =  new Scanner(System.in);
        System.out.println("nhap gia tri can tim");
        int target = scanner.nextInt();
        // Tìm kiếm tuyến tính
        int index = -1;// Khởi tạo giá trị index = -1 để đánh dấu không tìm thấy
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                index = i;// Gán giá trị index nếu tìm thấy
                break;
            }
        }
        // In kết quả
        if (index == -1) {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        } else {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + index + " trong mảng.");
        }
    }
}
