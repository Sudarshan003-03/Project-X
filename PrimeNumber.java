import java.util.*;
class PrimeNumber{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n==0 || n==1)
            System.out.println("0");
        else{
            for(int i=2;i<=n;i++){
                int flag =0;
                for(int j=2;j<i;j++){
                    if(i%j==0)
                        flag = 1;
                }

                if(flag == 0)
                    System.out.println(""+i);
            }
        }
    }
}