/* to print the pattertn
    *
   * *
  *   *
 *     *
*********
*/

class Demo 
{
	public static void main(String[] args) 
	{
		
		int count=1;
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			if(count+1 == n*2){
				for(int r=1;r<= (n*2)-1;r++){
					System.out.print("*");
				}
			}
			else{
				for(int s=1;s<= count; s++){
					if(s==1 || s==count){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
			count=count+2;
			System.out.println();
			}
		}
	}
}
