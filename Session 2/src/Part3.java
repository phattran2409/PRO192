import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        System.out.println("nhap so luong  ten muon them vao");
        row = sc.nextInt();
        // khoi tao mang
        String[] list = new String[row];
        /*---------------- nhap mang -----------------------*/
        for ( int i =0; i < list.length; i++ ) {
            sc = new Scanner(System.in);
            System.out.println("Name Student"+"["+i+"]");
            list[i] = sc.nextLine();
        }
        /*---------------xuat mang ------------------------*/
        for(int i = 0; i < list.length; i++){
            System.out.println("name Student : "+list[i]);
        }

    }

}
