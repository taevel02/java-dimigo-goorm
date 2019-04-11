package kr.taevel.java;

public class DimiBucks {

    public static void main(String[] args) {
        int average = 1700000;
        int num = 3;
        int market = 1500;

        System.out.printf("<< 디미벅스 연간 인건비 >>\n");
        System.out.printf("월 평균 급여 : %,d원\n", average);
        System.out.printf("점포 내 직원 수 : %,d명\n", num);
        System.out.printf("점포 수 : %,d개\n\n", market);

        System.out.printf("연간 인건비 : %,d원\n", (long)average * 12 * num * market);
    }

}
