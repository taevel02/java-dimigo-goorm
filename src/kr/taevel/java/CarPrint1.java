package kr.taevel.java;

import kr.taevel.oop.Car;

public class CarPrint1 {

    public static void main(String[] args) {

        Car carH = new Car();
        Car carK = new Car();
        Car carS = new Car();

        carH.setCompany("현대자동차");
        carH.setModel("제네시스");
        carH.setColor("검정색");
        carH.setMaxSpeed(225);
        carH.setPrice(50000000);

        carK.setCompany("기아자동차");
        carK.setModel("K7");
        carK.setColor("흰색");
        carK.setMaxSpeed(246);
        carK.setPrice(40000000);

        carS.setCompany("삼성자동차");
        carS.setModel("SM7");
        carS.setColor("회색");
        carS.setMaxSpeed(200);
        carS.setPrice(38000000);

        System.out.println("<< 자동차 목록 >>");
        System.out.println("제도사명 : " + carH.getCompany());
        System.out.println("모델명 : " + carH.getModel());
        System.out.println("색상 : " + carH.getColor());
        System.out.println("최대속도 : " + carH.getMaxSpeed() + "km");
        System.out.printf("가격 : %,d원\n\n", carH.getPrice());

        System.out.println("<< 자동차 목록 >>");
        System.out.println("제도사명 : " + carK.getCompany());
        System.out.println("모델명 : " + carK.getModel());
        System.out.println("색상 : " + carK.getColor());
        System.out.println("최대속도 : " + carK.getMaxSpeed() + "km");
        System.out.printf("가격 : %,d원\n\n", carK.getPrice());

        System.out.println("<< 자동차 목록 >>");
        System.out.println("제도사명 : " + carS.getCompany());
        System.out.println("모델명 : " + carS.getModel());
        System.out.println("색상 : " + carS.getColor());
        System.out.println("최대속도 : " + carS.getMaxSpeed() + "km");
        System.out.printf("가격 : %,d원\n\n", carS.getPrice());

    }

}
