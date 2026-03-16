class Reverse{
    public static void main(String[] args) {
        int n = 121;
        int temp =n,sum=0;
        while(n!=0){
            int a = n%10;
            sum = sum * 10 + a;
            n/=10;
        }
        System.out.println(""+(sum));
    }
}