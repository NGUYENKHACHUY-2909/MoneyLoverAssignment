import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isValidInput = false;
        while (!isValidInput){
            try {
                System.out.print("Nhap vao vi tri cua so can tim trong day Fibonacci: ");
                n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("Vi tri phai la so khong am. Vui long nhap lai.");
                    continue;
                }
                isValidInput = true;
                System.out.println("So can tim la: " + fibonacci(n));
            }catch (InputMismatchException e){
                System.out.println("Ban can nhap so nguyen");
                scanner.nextLine();
            }
        }
    }

    // Hàm đệ quy tính giá trị của số có vị trí n
    // Trả về kiểu dữ liệu long để tính toán các số Fibonacci lớn hơn
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
