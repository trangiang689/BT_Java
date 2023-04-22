package BT_Java.BT_01;

public class SinhVien {
    public String name;
    public static int age;

    public void showAddress() {
        String address = "Ha Noi";
        System.out.println("address:" + address);
    }

    public void showName() {
        name = "auto test";
        System.out.println(name);
    }

    public static void showAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.showName();
        sv.showAddress();
        age = 21;
        showAge();

        System.out.println("bien static class thong tin:" + ThongTin.classRoom);
    }
}
