public class p27 {
    public static void main(String args[]){
        char ch=65;
        for(int i=5;i>=1;i--){
            for(int k=5;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+ch++);
            }
            System.out.println();
        }
    }
}
