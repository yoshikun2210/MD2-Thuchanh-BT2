import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double laiXuat = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Số tiền đầu tư :");
        money = input.nextDouble();
        System.out.println("Nhập số tháng :");
        money = input.nextInt();
        System.out.println("Lãi xuất hàng năm tính bằng %");
        laiXuat = input.nextDouble();
        double tongLai = 0;
        for (int i = 0; i < month; i++){
            tongLai += money * (laiXuat/100)/12 * month;
        }
        System.out.println("Số tiền lãi là" + tongLai);

    }
}
