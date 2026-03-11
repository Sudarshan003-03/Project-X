import java.util.*;
class PrintXTimes{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        for(int i=y;i>=0;i--)
            System.out.println(x);
    }
}