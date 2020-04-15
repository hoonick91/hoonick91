//package algorithm.line02;
//
//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(solution());
//
//    }
//
//    private static int solution() {
//        String inputString = "Hello, world!";
//        Stack st1 = new Stack();
//        Stack st2 = new Stack();
//        Stack st3 = new Stack();
//        Stack st4 = new Stack();
//
//        int count = 0;
//
//        for (int i = 0; i < inputString.length(); i++) {
//            char c = inputString.charAt(i);
//
//            if (c == '(') st1.push('(');
//            if (c == '{') st2.push('{');
//            if (c == '[') st3.push('[');
//            if (c == '<') st4.push('<');
//
//            if (c == ')') {
//                if (st1.empty()) {
//                    return -1;
//                }
//                st1.pop();
//                count++;
//            }
//            if (c == '}') {
//                if (st2.empty()) {
//                    return -1;
//                }
//                st2.pop();
//                count++;
//            }
//            if (c == ']') {
//                if (st3.empty()) {
//                    return -1;
//                }
//                st3.pop();
//                count++;
//            }
//            if (c == '>') {
//                if (st4.empty()) {
//                    return -1;
//                }
//                st4.pop();
//                count++;
//            }
//
//        }
//
//        return count;
//    }
//
//
//}
