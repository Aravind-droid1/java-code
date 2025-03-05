import java.util.*;
public class mark_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();
        double Total,Percentage;
        Total=sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total="+Total);
        Percentage=(Total/500)*100;
        System.out.println("Percentage="+Percentage);

    }
}
