package kr.taevel.java;

import kr.taevel.oop.Snack;

public class SnackTest {

    public static void main(String[] args) {
        Snack[] snacks = {
            new Snack("새우깡", "농심", 1100, 2),
            new Snack("콘칩", "크라운", 1200, 1),
            new Snack("허니버터칩", "해태", 1500, 4)
        };

        for (int i = 0; i < 3; i++) {
            System.out.println(snacks[i].toString());
            System.out.println("");
        }

        System.out.printf("총 구매 금액 : %,d원", snacks[0].calcPrice() + snacks[1].calcPrice() + snacks[2].calcPrice());

    }

}
