class 1toNREC{
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        
        printNumbers(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println("Printing 1 to " + n + ":");
        printNumbers(n);
    }
    
}