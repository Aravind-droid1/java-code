public class A_pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n*n;i++){
            if(i==1 || i==n){
                System.out.print(" ");  
            }
            else if(i<n || (i-1)%n==0 || i%n==0 ){
                System.out.println("*");
                if(i%n==0){
                    System.out.println();
                }
            }
            else if(i%2==0){
                if(i>(((n*n)/2)+1) || i<=((((n*n)/2)+n)-1)){
                    System.out.print("*");
                }
            }
            else if(i%2 !=0){
                if(i>((((n*n)/2)-(n/2))+1) || i<((((n*n)/2)+(n/2)))-1){
                    System.out.print("*");
                }
            }
            else{
                System.out.print(" ");
            }
        }
    }
}