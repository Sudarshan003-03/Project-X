class PerfectSquare{
    public static void main(String[] args) {
        int count=0,n=10;
        for(int i=1;i<Math.sqrt(n);i++){
            if(i*i < n)
            count++;
        }
        System.out.println(""+count);
    }
}