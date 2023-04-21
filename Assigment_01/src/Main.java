import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(5);
        System.out.println("Day so sau khi sap xep va loai bo cac so khong phai so nguyen to: ");
        System.out.println(sortAndFilter(arrayList));
    }

    // kiem tra co phai so nguyen to khong?
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    // Sap xep day so va loai bo cac so khong phai la so nguyen to
    public static ArrayList<Integer> sortAndFilter(ArrayList<Integer> array){
        Collections.sort(array);
        for (int i = array.size()-1; i >= 0; i--){
            if(!isPrime(array.get(i))){
                array.remove(i);
            }
        }
        return array;
    }
}