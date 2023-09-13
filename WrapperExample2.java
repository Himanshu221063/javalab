public class WrapperExample2{
    public static void main(String args[])
    {
        char c='a';
        Character C=Character.valueOf(c);
        Character j='a';
        System.out.println(c+" "+C+" "+j);
        int a=20;
        Integer i=Integer.valueOf(a);
        Integer k=a;
        System.out.println(a+" "+i+" "+k);
        long l=2345;
        Long L=Long.valueOf(l);
        Long m=l;
        System.out.println(l+" "+L+" "+m);
        double d=234.45;
        Double D=Double.valueOf(d);
        Double v=d;
        System.out.println(d+" "+L+" "+v);
        boolean b=true;
        Boolean B=Boolean.valueOf(b);
        Boolean q=b;
        System.out.println(b+" "+B+" "+q);
        
        
        
    }
}