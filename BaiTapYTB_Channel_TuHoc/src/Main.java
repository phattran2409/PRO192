import java.util.Scanner;
/* bài Tập Java
* nhập vào 1 tháng bất kỳ 1 - 12 >> cho biết tháng đó có bao nhiêu ngày  ?
* gơi ý :
* --- tháng 1 3 5 7 8 10 12  có 31 ngày
* --- tháng 4 6 9 11 có 30 ngày
* nếu là tháng 2 kiểm tra xem năm đó có phải năm nhuận hay không ?
*
*
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month : ");
        int m = sc.nextInt();
        do {
            if( m > 12 ){
                System.out.println("plz enter month again ");
                m = sc.nextInt();
            }
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                System.out.println(" this month have 31 days");
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                System.out.println("this  month have 32 days");
            } else if (m == 2) {
                System.out.println("plz Enter Year");
                int year = sc.nextInt();
                if (CheckLeapYear(year) == 1) {
                    System.out.println("this month have 29 days");
                } else {
                    System.out.println("this month have 28 days");
                }
            }
        } while ( m > 12);



        }

   public  static int  CheckLeapYear(int year){
        if ((year % 4  == 0 && year % 100 != 0) || (year % 400 == 0)){
            return  1;
        }else {
            return  0;
        }

   }
}