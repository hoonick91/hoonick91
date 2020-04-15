package algorithm.kakao.비밀지도;

//        https://programmers.co.kr/learn/courses/30/lessons/17681
public class Main {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = new int[]{46, 33, 33, 22, 31, 50};
        int[] arr2 = new int[]{27, 56, 19, 14, 14, 10};


        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String map = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(arr1[i] | arr2[i]).toString()));
            answer[i] = map.replace("1", "#").replace("0", " ");
        }


    }


    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String map = Integer.toBinaryString(arr1[i] | arr2[i]);

            answer[i] = map.replace("1", "#").replace("0", " ");
            System.out.println(answer[i]);
        }
        return answer;
    }
}
