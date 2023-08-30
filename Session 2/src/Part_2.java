import java.util.Scanner;
/* use  switch */
public class Part_2 {
    public static void main(String[] args){
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
        switch (op){
            case "+":
                System.out.printf("%.2f + %.2f = %.2f ", num_1,num_2,(num_1+num_2));
                break;
            case  "-":
                System.out.printf("%.2f - %.2f = %.2f ", num_1,num_2,(num_1-num_2));
                break;
            case "*":
                System.out.printf("%.2f * %.2f = %.2f ", num_1,num_2,(num_1*num_2));
                break;
            case  "/":
                if ( num_2 != 0){
                    System.out.printf("%.2f / %.2f = %.2f\n", num_1,num_2,(num_1/num_2));
                }else{
                    System.out.println(" cannot divide for 0");
                }
                break;
            default:
                System.out.print("not correct operator plz input again !");
        }
    }
}
