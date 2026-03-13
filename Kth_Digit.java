class Kth_Digit{
    public static void main(String[] args) {
        int a=3,b=3,k=1;

        int c = (int)Math.pow(a, b);

        for(int i=0;i<k;i++){
            a = c%10;
            c/=10;
        }
        System.out.println(""+a);

    }
}