package ss14_ThuatToanSapXep.bt;

public class InsertionSort {
    public static void InsertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
        for (int n:array){
            System.out.print(n+", ");
        }
    }

    public static void main(String[] args) {
        int[] list = {3, 5, 6, 2, 34, 6, 3, 12};
        System.out.print("Mảng trước khi sắp xếp:");
        for (int i : list) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");
        InsertionSort(list);
    }
}
