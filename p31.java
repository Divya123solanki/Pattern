public class p31 {
    public static void main(String args[]){
        for(int i=1;i<=9;i++,i++){
           for(int k=9;k>=i;k--){
            System.out.print(" ");
           }
           {
            for(int j=1;j<=i;j++){
               System.out.print(" *");
            }
           }
           System.out.println();
        }
    }
}
