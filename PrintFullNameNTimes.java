import java.util.*;
class PrintFullNameNTimes{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String FirstName = s.next();
        String LastName = s.next();
        int a = s.nextInt();

        for(int i=a;i>0;i--){
            System.out.println(FirstName+""+LastName);
        }
    }
}