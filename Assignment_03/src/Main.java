import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3}; // nhập dãy số A
        int n = scanner.nextInt(); // nhập số lượng số trong mỗi cặp
        int count = 0; // biến đếm số cặp số
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (n == 2) {
                    System.out.println(array[i] + "&" + array[j]); // in ra các cặp số
                    count++;
                } else if (n == 3) {
                    for (int k = j + 1; k < array.length; k++) {
                        System.out.println(array[i] + "&" + array[j] + "&" + array[k]); // in ra các cặp số
                        count++;
                    }
                }
            }
        }
        System.out.println("Tong so cap la: " + count); // in ra tổng số cặp số
    }
}
