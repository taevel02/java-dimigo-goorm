package kr.taevel.java;

import java.util.Random;
import java.util.Scanner;

public class SimpleGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0, cha = 0;
        int[] atk = { 100, 100, 100, 100 };
        String[] character = { "마법사", "영주", "기사", "농민" };


        do {

            System.out.println("--------------------");
            System.out.println("<< 게임 메뉴 >>");
            System.out.println("1. 캐릭터 설정");
            System.out.println("2. 공격력 증가");
            System.out.println("3. 공격력 감소");
            System.out.println("9. 종료");
            System.out.println("--------------------");
            System.out.print("메뉴 입력 => ");

            menu = scanner.nextInt();

            switch (menu) {

                case 1:
                    cha = new Random().nextInt(4) + 1;
                    System.out.println(character[cha - 1] + "(으)로 설정되었습니다.");
                    break;

                case 2:
                    if (cha != 0) {

                        atk[cha] += 10;
                        System.out.println(character[cha - 1] + " 공격력이 증가되었습니다. 현재 공격력 : " + atk[cha]);

                    } else {

                        System.out.println("먼저 캐릭터를 설정하세요!");

                    }
                    break;

                case 3:
                    if (cha != 0) {

                        atk[cha] -= 10;
                        System.out.println(character[cha - 1] + " 공격력이 감소되었습니다. 현재 공격력 : " + atk[cha]);

                    } else {

                        System.out.println("먼저 캐릭터를 설정하세요!");

                    }
                    break;

                case 9:
                    System.out.println("이제 공부하세요!");
                    scanner.close();
                    break;

                default:
                    System.out.println("없는 메뉴입니다!!");

            }

        } while (menu != 9);
    }

}
