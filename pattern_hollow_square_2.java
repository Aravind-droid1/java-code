public class pattern_hollow_square_2 {
    public static void main(String[] args) {
        int n=5;
        for(int i = 1 ; i<=n*n; i++){
            if(i<=n || (i-1)%n==0 || (i)%n==0 || i>=(n*n)-n){
                System.out.print("* ");
                if(i%n==0){
                    System.out.println("");
                }
            }
            else {
                System.out.print("  ");
            }
        }
    }
}