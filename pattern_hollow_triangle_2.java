public class pattern_hollow_triangle_2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
                }
            for(int s=1;s<=(2*i)-1;s++){
                if (i==5 || s==1 || s==(2*i)-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}