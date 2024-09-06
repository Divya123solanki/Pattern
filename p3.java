 class p3 {
    public static void main(String args[]){
        for(int i=1;i<=11;i++){
            for(int j=1;j<=11;j++){
                if(i==6||j==6||i==1||j==1||i==11||j==11||i+j==7||i+j==17||j-i==5||i-j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
