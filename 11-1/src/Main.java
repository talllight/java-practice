import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요 : ");
            int num = scanner.nextInt();

            if (num >= 1 && num <= 100) {
                System.out.println("입력이 완료되었습니다. 프로그램을 종료합니다");
                break;
            } else {
                System.out.println("1 이상 100 이하의 숫자만 입력하시오");
            }
        }
    }
}