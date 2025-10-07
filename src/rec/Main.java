package rec;

public class Main {
    public static void main(String[] args) {
        call(0);
    }
    public static  void call(int n){
        if(n==10)
            return;
        else {
            System.out.println("rey");
            call(n+1);
        }
    }
}
