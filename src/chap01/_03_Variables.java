package chap01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;

        System.out.println(name + "님, 배송은 " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";

        System.out.println(name + "님의 평균점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("합격하셨나요? ==> " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        //int i = 1000000000000;            // too large
        long l = 1_000_000_000_000l;        // 끝에 l 붙여야 함
        System.out.println(l);
    }
}
