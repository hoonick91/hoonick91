//package algorithm.line03;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//        solution();
//    }
//
//    private static String[][] solution() {
//
//        String[][] snapshots =
//                {
//                        {"ACCOUNT1", "100"},
//                        {"ACCOUNT2", "150"}
//                };
//
//        String[][] transactions =
//                {
//                        {"1", "SAVE", "ACCOUNT2", "100"},
//                        {"2", "WITHDRAW", "ACCOUNT1", "50"},
//                        {"1", "SAVE", "ACCOUNT2", "100"},
//                        {"4", "SAVE", "ACCOUNT3", "500"},
//                        {"3", "WITHDRAW", "ACCOUNT2", "30"}
//                };
//
//        List<Transaction> transactionList = new ArrayList<>();
//        for (int i = 0; i < transactions.length; i++) {
//            transactionList.add(new Transaction(
//                    transactions[i][0],
//                    transactions[i][1],
//                    transactions[i][2],
//                    transactions[i][3]));
//        }
//
//
//        Map<String, List<Transaction>> test = transactionList.stream()
//                .collect(Collectors.groupingBy(Transaction::getAccount));
//
//        List<Map<String, Integer>> res = test.entrySet().stream()
//                .map(entry -> {
//                    Map<String, Integer> result = new HashMap<>();
//                    Integer money = 0;
//                    for (Transaction transaction : entry.getValue()) {
//                        if (transaction.getType().equals("SAVE")) {
//                            money += Integer.valueOf(transaction.getAmount());
//                            continue;
//                        }
//                        money -= Integer.valueOf(transaction.getAccount());
//                    }
//                    result.put(entry.getKey(), money);
//                    return result;
//                })
//                .collect(Collectors.toList());
//
//        List rr = new ArrayList();
//
//        res.stream().forEach(map -> {
//            for (int i = 0; i < snapshots.length; i++) {
//                String[] re = new String[2];
//                String value = Integer.valueOf(snapshots[i][1]) + map.get(snapshots[i][0]).toString();
//                String key = snapshots[i][0];
//                re[0] = key;
//                re[1] = value;
//                rr.add(re);
//            }
//        });
//
//        return Arrays.asList(rr);
//
//
//    }
//}
//
//class Transaction {
//    String id;
//    String type;
//    String account;
//    String amount;
//
//    public Transaction(String id, String type, String account, String amount) {
//        this.id = id;
//        this.type = type;
//        this.account = account;
//        this.amount = amount;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getAccount() {
//        return account;
//    }
//
//    public void setAccount(String account) {
//        this.account = account;
//    }
//
//    public String getAmount() {
//        return amount;
//    }
//
//    public void setAmount(String amount) {
//        this.amount = amount;
//    }
//}
//
//
