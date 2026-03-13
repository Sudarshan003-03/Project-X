class FirstAndLastDigit{
    public static void main(String[] args) {
        // code here
        int n = 12345,l=0,f=n;
        n = Math.abs(n);
        if(n<10)
        System.out.println(n);
            
        while(f>=10){
            f/=10; 
        }
        l = n%10;
     System.out.println(" "+l+" "+f);
    }
}