package Constructor;

public class Student {
    private int id = 30;
    private String name = "nirzhar";
    private int age = 16;

    public Student(){
        System.out.println(name);
    }

    public Student(int id){
        this.id = id;
    }

    public Student(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
