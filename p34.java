public class p34 {
    public static void main(String args[]){
          char ch=65;
          for(int i=1;i<=5;i++){
            for(int k=5;k<=5;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==5||j==1||j==i||i==5){
                    System.out.print(" "+ch);
                }
                else{
                    System.out.print(" ");
                }
            }
            ch++;
            System.out.println();
          }
    }
}
