import java.util.*;

public class NumberOfOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int odd = 0, even = 0;
        int l = (num + "").length();  

        while (num != 0) {
            int digit = num % 10; 
            if (digit % 2 != 0)  
                odd++;
            else
                even++;

            num /= 10;  
        }

        System.out.println("Odd count: " + odd);
        System.out.println("Even count: " + even);
    }
}
