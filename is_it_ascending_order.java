import java.util.*;

public class is_it_ascending_order {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int x,y;
        boolean flag=true;
        y=a%10;
        a/=10;
        while(a!=0){
            x=a%10;
            if(x>=y){
                flag=false;
                break;
            }
            y=x;
            a/=10;
        }
        if(flag==true){
            System.out.println("ascending order");
        }
        else{
            System.out.println("not ascending order");
        }
    }  
}
