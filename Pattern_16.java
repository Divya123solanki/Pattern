 class Pattern_16 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            if(i%2==1){
                for(int j=1;j<=5;j++){
                    System.out.print(j);
                }
            }
            else{
                for(int k=5;k>=1;k--){
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
