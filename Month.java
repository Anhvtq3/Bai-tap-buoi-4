import java.util.Scanner;

public class Month {
int total;

    void tinhthang() {

        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập và một tháng bất kì:");
        total = input.nextInt();
//       Cach 1: lam theo switch case
        switch (total) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + total + " có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng " + total + " có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + total + " có 30 ngày");
                break;
        }
////        cach2: if else
//        if (total == 1) {
//            System.out.println("Tháng " + total + " có 31 ngày");
//        } else if (total == 3) {
//            System.out.println("Tháng " + total + " có 31 ngày");
//        } else if (total == 5) {
//            System.out.println("Tháng " + total + " có 31 ngày");
//        } else if (total == 7) {
//            System.out.println("Tháng " + total + " có 31 ngày");
//        } else if (total == 8) {
//            System.out.println("Tháng " + total + " có 31 ngày");
//        } else if (total == 10) {
//            System.out.println("Tháng " + total + " có 31 ngày");
//        } else if (total == 12) {
//            System.out.println("Tháng " + total + " có 31 ngày");
//        } else if (total == 2) {
//            System.out.println("Tháng " + total + " có 28 hoặc 29 ngày");
//        } else if (total == 4) {
//            System.out.println("Tháng " + total + " có 31 ngày");
//        } else if (total == 6) {
//            System.out.println("Tháng " + total + " có 31 ngày");
//        }
//        else if (total == 9) {
//            System.out.println("Tháng " + total + " có 31 ngày");
//        }
//        else {
//            System.out.println("Tháng " + total + " có 31 ngày");
//        }
    }
}
