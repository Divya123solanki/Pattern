/*02345
  10345
  12045
 */
public class Pattern_11 {
    public static void main(String args[]){
        int k=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==j){
                    System.out.print(k);
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
