class countDivisors {
    public static void main(String[] args) {
        int count=0,n=10;
        for(int i=1;i<=n;i++){
            if(n%i==0 && i%3==0)
            count++;
    }
    System.out.println(""+count);
    }
}