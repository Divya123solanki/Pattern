public class p14 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int k=i;k<=5;k++){
                System.out.print(" ");
            }{
                for(int j=1;j<=i;j++){
                    if(i==5||j==1||j==i){
                        System.out.print(" 1");
                    }
                    else{
                        System.out.print(" "+j);
                    }
                }
            }
            System.out.println();
        }
    }
}
