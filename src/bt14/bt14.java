package bt14;

public class bt14 {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Alice", 85.5),
                new Student(2, "Bob", 76.0),
                new Student(3, "Charlie", 92.3),
                new Student(4, "David", 68.9),
                new Student(5, "Eva", 79.7)
        };

        SortingStudent sortingStudent = new SortingStudent();

        System.out.println("Sắp xếp bằng insertion sort:");
        printStudents(sortingStudent.insertionSort(students.clone()));

        System.out.println("\nSắp xếp bằng selection sort:");
        printStudents(sortingStudent.selectionSort(students.clone()));

        System.out.println("\nSắp xếp bằng bubble sort:");
        printStudents(sortingStudent.bubbleSort(students.clone()));
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }
    }
}
