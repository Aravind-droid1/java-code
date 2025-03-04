import java.util.Scanner;
class distance_price {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int d=sc.nextInt();
        if(d>5){
            if(d<=15){
                System.out.println(((d-5)*10)+100);
            }
            else if(d<=25){
                System.out.println(((d-15)*8)+200);
            }
            else{
                System.out.println((((d-25)*5)+280));
            }
        }
        else{
            System.out.println("100");
        }
    }
}
