package ascii;

public class Prg2 {
    public static void main(String[] args) {
        String x="Reynol.23cs119@sode-edu.in";
        int C=0,c=0,n=0,s=0,spec=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)>=65&&x.charAt(i)<=90){
                C++;
            }else
            if(x.charAt(i)>=97&&x.charAt(i)<=122){
                
                c++;
            }else
            if(x.charAt(i)>=48&&x.charAt(i)<=57){
                
                n++;
            }else
            if(x.charAt(i)==32){
                s++;
            }else{
                spec++;
            }
        }
        System.out.println("CAP:"+C);
        System.out.println("small:"+c);
        System.out.println("num:"+n);
        System.out.println("space:"+s);
        System.out.println("special:"+spec);
    }
}
