package kr.taevel.oop;

public class IdolGroup {

    public static void main(String[] args) {
        String[] groupName = {"방탄", "2NE1", "걸스데이"};
        String[][] groupMember = {
                {"정국", "지민", "뷔", "슈가", "진"},
                {"CL", "산다라박", "박봄", "민지"},
                {"유라", "혜리", "소진", "민아"}
        };

        for (int i = 0; i < groupName.length; i++) {
            System.out.printf("<< %s >>\n", groupName[i]);
            for (int j = 0; j < groupMember[i].length; j++) {
                System.out.println(groupMember[i][j]);
            }
            System.out.println();
        }
    }

}
