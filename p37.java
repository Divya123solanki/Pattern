public class p37 {
    public static void main(String args[]){
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1||i==j&&i<=4||i+j==8&&i>=4||i==3&&j==2||i==4&&j==2||i==4&&j==3||i==5&&j==2){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
