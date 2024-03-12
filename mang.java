import java.util.Scanner;
 class mang {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so so hang trong day: "); 
        int n= scanner.nextInt();
        int A[] = new int [n];
        System.out.print("Nhap day so: ")
        for (int i=0; i<n; i++) A[i]= scanner.nextInt(); 
        int t;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) { 
                if(A[i]>A[j]) {t=A[i]; A[i]=A[j]; A[j]=t; }
            }
        }
        System.out.print("Day so theo thu tu tang dan: ");
        for (int i =0; i<n; i++) System.out.print( A[i]+ "_" );
        scanner.close();
    }
}