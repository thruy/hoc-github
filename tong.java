import java.util.Scanner;

class tong {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so nguyen: ");
    int a = scanner.nextInt();
    
    if (a<=1) System.out.print("Khong la so nguyen to."); else {
        int x=0; int i;
        for (i=2; i<= Math.sqrt(a); i++) {if (a%i==0) x++;}
        if (x==0) System.out.print("La so nguyen to."); else System.out.print("Khong la so nguyen to.");
    }
    scanner.close();
    }
}