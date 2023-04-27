package BT_Java.BT_04;

public class Loop {
    public static void main(String[] args) {
        //create array
        int[] array = new int[26];
        int x = 0;

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                array[x] = i;
                x++;
                System.out.println(i);
            }
        }

        System.out.println("cac phan tu trong mang");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
