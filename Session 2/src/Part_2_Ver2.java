import java.util.Scanner;

public class Part_2_Ver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num_1, num_2;
        String op;
        System.out.println("Input the number 1 :");
        num_1 = sc.nextFloat();
        System.out.println("Input the number 2 :");
        num_2 = sc.nextFloat();
        System.out.println("Input the operator: ");
        sc = new Scanner(System.in);
        op = sc.nextLine();
        if (op.equals("+")) {
            System.out.printf("%.2f + %.2f = %.2f",num_1,num_2,(num_1+num_2));
        }else if (op.equals("-")) {
            if( num_1 < num_2){
                float temp;
                temp = num_1;
                num_1 = num_2;
                num_2 = temp;
            }
            System.out.printf("%.2f - %.2f = %.2f",num_1,num_2,(num_1-num_2));
        } else if (op.equals("*")) {
            System.out.printf("%.2f * %.2f = %.2f",num_1,num_2,(num_1*num_2));
        } else if (op.equals("/")) {
            if(num_2 != 0){
                System.out.printf("%.2f + %.2f = %.2f",num_1,num_2,(num_1/num_2));
            }else{
                System.out.println("cannot divided by 0");
            }
        }else {
            System.out.println("OP inputted not correct ");
        }
    }
}
