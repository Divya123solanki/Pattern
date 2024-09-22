public class p33 {
    public static void main(String[] args) {
        
    
    for(int i=1;i<=9;i++){
        for(int k=9;k>=i;k--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            if(j==1||i==3&&j>2||i==9||i==5&&j>4||i==7&&j>6){
                 System.out.print(" 1");
            }
            else{
                System.out.print(" *");
            }
        }
    
    System.out.println();
}
}
}

