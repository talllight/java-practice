import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = 0, subjectCount = 0;

        System.out.printf("학생 수를 입력하세요: ");
        studentCount = scanner.nextInt();

        System.out.printf("과목 수를 입력하세요: ");
        subjectCount = scanner.nextInt();

        int[][] scores = new int[studentCount][subjectCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("\n[" + (i + 1) + "번 학생의 성적 입력]");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        System.out.println("--- 성적표 --- ");
        for (int i = 0; i < studentCount; i++) {
            System.out.print(i + 1 + "번 학생: ");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
    }
}