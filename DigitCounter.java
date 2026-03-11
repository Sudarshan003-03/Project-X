class DigitCounter{
    public static void main(String[] args) {
        int n = 325345,c=0;
        while(n!=0){
            int a = n %10;
            c++;
            n/=10;
        }
        System.out.println(""+c);
    }
}