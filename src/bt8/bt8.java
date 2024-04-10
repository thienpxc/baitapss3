package bt8;

public class bt8 {

    public static String increase(String input) {
        int n = input.length();
        int start = 0, maxLength = 1;
        String longestSubstring = input.substring(0, 1); // Khởi tạo chuỗi tăng dần lớn nhất là ký tự đầu tiên

        for (int i = 1; i < n; i++) {
            // Nếu ký tự hiện tại lớn hơn ký tự trước đó, cập nhật độ dài chuỗi tăng dần
            if (input.charAt(i) > input.charAt(i - 1)) {
                maxLength++;
            } else {
                // Ngược lại, cập nhật vị trí bắt đầu của chuỗi tăng dần mới
                start = i;
                maxLength = 1;
            }

            // Cập nhật chuỗi tăng dần lớn nhất
            String currentSubstring = input.substring(start, start + maxLength);
            if (currentSubstring.length() > longestSubstring.length()) {
                longestSubstring = currentSubstring;
            }
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        String input = "Welcome";
        System.out.println("Chuỗi tăng dần lớn nhất: " + increase(input));
    }


}
