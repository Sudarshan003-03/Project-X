class GCD{
    public static void main(String[] args) {
        int temp =0,a=20,b=28;
        while(b!=0){
            temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println(""+a);
    }
}