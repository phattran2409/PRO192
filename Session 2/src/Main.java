import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    int row;
    int col;
    int Matrix[][];
        System.out.println("Enter number of rows : ");
        row = sc.nextInt();
        System.out.println("Enter number of colums: ");
        col = sc.nextInt();
        System.out.println("Enter the matrix");
        Matrix = new int[row][col];//  tạo một mảng hai chiểu
        /*------------------------*/
        for ( int i = 0; i < row; i++){
            for ( int j = 0; j < col;j++){
                System.out.println("m["+i+"]"+"["+j+"]");
                Matrix[i][j] = sc.nextInt();
                }
            } // nhâp mảng
        /*------------------------*/
        System.out.println("Matrix Inputted");
        for( int i = 0; i < row; i++){
            for ( int j = 0; j < col;j++){
                System.out.format("%3d",Matrix[i][j]);
            }
            System.out.println();
        }// xuất mảng
        /*------------------------*/
        int sum = 0;
        for ( int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                sum += Matrix[i][j];
            }
        }
        System.out.println("sum : "+ sum);

        /*------------------------*/

        double avr = (float) sum / (row * col);
        System.out.println("Average : "+avr);



    }
}