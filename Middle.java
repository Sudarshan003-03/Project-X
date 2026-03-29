class Middle{
    public static void main(String[] args){
        int a = 918,b=518,c=300;
        int d = ((a>b)&&(a<c)||(a<b)&&(a>c))?a:((b>a)&&(b<c)||(b<a)&&(b>c))?b:c;
    }
}