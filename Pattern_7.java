/*1
  01
  101
 */
public class Pattern_7 {
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int j=i;j<=5;j++){
                System.out.print(j%2);
            }
        
            System.out.println();
        }
    }
}
