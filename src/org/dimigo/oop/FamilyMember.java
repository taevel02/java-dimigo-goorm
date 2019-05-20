package org.dimigo.oop;

public class FamilyMember {

    private static int memberCnt = 0;
    private String memberName;

    public FamilyMember(String memberName) {
        this.memberName = memberName;
        memberCnt++;
    }

    public String getMemberName() {
        return memberName;
    }

    public static void printMemberCnt() {
        System.out.printf("가족 총 인원 수 : %d명\n", memberCnt);
    }
}
