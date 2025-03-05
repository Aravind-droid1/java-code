
import java.util.*;

public class gst_and_sgst_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        double sgst,cgst;
        sgst = n*(11.0/100);
        cgst = n*(9.0/100);
        System.out.println("Total Price="+(n+sgst+cgst));
    }
}
    