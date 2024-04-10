package bt11;

import java.util.ArrayList;
import java.util.List;

public class bt11 {
    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<>();
        teams.add(new FootballTeam(1, "Team A", 11, 20));
        teams.add(new FootballTeam(2, "Team B", 11, 25));
        teams.add(new FootballTeam(3, "Team C", 11, 15));
        teams.add(new FootballTeam(4, "Team D", 11, 30));
        teams.add(new FootballTeam(5, "Team E", 11, 18));

        Sorting sorting = new Sorting();

        System.out.println("Danh sách ban đầu:");
        teams.forEach(System.out::println);

        System.out.println("\nSắp xếp bằng Bubble Sort:");
        sorting.bubbleSort(teams);
        teams.forEach(System.out::println);

        System.out.println("\nSắp xếp bằng Selection Sort:");
        sorting.selectionSort(teams);
        teams.forEach(System.out::println);

        System.out.println("\nSắp xếp bằng Insertion Sort:");
        sorting.insertionSort(teams);
        teams.forEach(System.out::println);
    }
}
