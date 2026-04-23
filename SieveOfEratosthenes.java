class SieveOfEratosthenes{
    public static void main(String[] args){
        int l=10,r=20;
        
        System.out.println(prime(l,r));
    }
    public static int prime(int l,int r){
        int[] arr = new int[r+1];

        for(int i=2;i*i<=r;i++){
            if(arr[i]==0){
                for(int j = i*i;j<=r;j+=i){
                    arr[j]=1;
                }
            }
        }

        int sum=0;
        for(int i=Math.max(2,l);i<=r;i++){
            if(arr[i]==0){
                sum+=i;
            }
        }

        return sum;
    }
}