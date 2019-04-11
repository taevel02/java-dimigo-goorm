package kr.taevel.java;

import java.util.Random;
import java.util.Scanner;

public class MyFavorite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0, index = 0;

        String[] questions = { "가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?" };
        String[] answers = { "박효신", "공유", "수학" };

        do {

            System.out.println("------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("------------------");
            System.out.print("메뉴 선택 => ");

            menu = scanner.nextInt();

            switch (menu) {

                case 1:
                    index = new Random().nextInt(3);
                    String question = questions[index];
                    String answer = answers[index];
                    System.out.printf(question + " ");
                    String myAnswer = scanner.next();
                    if (myAnswer.equals(answer)) {
                        System.out.println("정답입니다!");
                    } else {
                        System.out.println("틀렸습니다!");
                    }
                    break;

                case 2:
                    StringBuilder sb = new StringBuilder();
                    System.out.println("<< 정답 출력 >>");
                    for (int i = 0; i < questions.length; i++) {
                        sb.append(questions[i] + " ").append(answers[i]).append("입니다.\n");
                    }
                    System.out.println(sb);
                    break;

                case 9:
                    System.out.println("Bye~");
                    scanner.close();
                    break;

                default:
                    System.out.println("없는 메뉴입니다.");

            }

        } while (menu != 9);
    }

}
