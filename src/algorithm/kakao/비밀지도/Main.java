package algorithm.kakao.비밀지도;

public class Main {
    public static void main(String[] args) {

        String res = Integer.toBinaryString(9 | 30);
        res = res.replace("1", "#").replace("0", " ");
        System.out.println(res);
    }
}
