package ss11_stack_queue.bt;


import java.util.*;

public class DemSoLanXuatHienSDMap {
    public static void main(String[] args) {
        Map<Character, Integer> tree = new TreeMap();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi:");
        String str = input.nextLine();
        String str1 = str.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            if (tree.containsKey(str1.charAt(i))) {
                tree.replace(str1.charAt(i), tree.get(str1.charAt(i)) + 1);
            } else
                tree.put(str1.charAt(i), 1);
        }
        Set<Character> keys = tree.keySet();
        for (Character x : keys) {
            System.out.println("key: " + x + " - value: " + tree.get(x));
        }
    }
}
