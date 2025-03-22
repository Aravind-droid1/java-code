public class to_find_missing_number {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,7,8};
        int b=0;
        for(int i=1;i<=((a.length)+1);i++){
            b=i;
            if (i != a[i-1]){
                break;
            }
        }
        System.out.println(b);
    }
}