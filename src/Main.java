import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int tong=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextInt();
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                tong=tong*i;
            }
        }
        System.out.println("tong la: "+tong);
    }
}