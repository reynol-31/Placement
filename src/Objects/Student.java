package Objects;

public class Student {
    int id;
    String name;
    Student(int x,String n){
        id=x;
        name=n;
    }
    @Override //this method 
    public String toString(){
        return this.id+" "+this.name;
    }
    public static void main(String[] args) {
        Student s1=new Student(10,"rey");
        Student s2=new Student(20, "ben");
        // Student[] s=new Student[2];
        Student[] s={s1,s2};
        s[0]=s1;
        s[1]=s2;
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
            System.out.println(s[i].id+" "+s[i].name);//or this method
        }
    }
}
