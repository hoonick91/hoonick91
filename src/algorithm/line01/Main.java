//package algorithm.line01;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//        String[][] dataSource = null;
//        String[] tags = null;
//
//        Map<String, Integer> data = new HashMap<>();
//
//        for (int i = 0; i < dataSource.length; i++) {
//            int count = 0;
//            for (int k = 0; k < tags.length; k++) {
//                if (Arrays.asList(dataSource[i]).contains(tags[k])) {
//                    count++;
//                }
//            }
//            data.put(dataSource[i][0], count);
//        }
//
//        List<Map.Entry<String, Integer>> list = new LinkedList<>(data.entrySet());
//
//        Collections.sort(list, (Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) -> {
//            int comparision = (o1.getValue() - o2.getValue()) * -1;
//            return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
//        });
//
//        List<String> results = list.stream()
//                .filter(entry -> entry.getValue() != 0)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//
//
//        int length = results.size() > 10 ? 10 : results.size();
//        String[] res = new String[results.size()];
//        for (int i = 0; i < length; i++) {
//            res[i] = results.get(i);
//        }
//
//        return res;
//
//
//    }
//
//
//}
