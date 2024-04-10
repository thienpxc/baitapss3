package bt10;


import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập chuỗi 2: ");
        String str2 = scanner.nextLine();
        scanner.close();

        String commonChars = findCommonChars(str1, str2);
        System.out.println("Các ký tự chung: " + commonChars);
    }

    public static String findCommonChars(String str1, String str2) {
        Set<Character> set1 = str1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        Set<Character> set2 = str2.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

        Set<Character> commonSet = new HashSet<>(set1);
        commonSet.retainAll(set2);

        return commonSet.stream()
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}

