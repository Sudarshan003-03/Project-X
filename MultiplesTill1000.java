import java.util.*;
class MultiplesTill1000{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for(int i=1;i<=1000;i++){
            if(x*i<=1000)
                System.out.println(x*i);
        }
    }
}