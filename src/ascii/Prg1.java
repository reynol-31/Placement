package ascii;

public class Prg1 {
    public static void main(String[] args) {
        String s="Reynol.23cs119@sode-edu.in";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65&&s.charAt(i)<=90){
                int a=(int)s.charAt(i)+32;
                char b=((char)a);
                System.out.print(b);
            }else{
                System.out.print(s.charAt(i));
            }
        }
    }
}
