package Constructor;

public class Student {
    private int id = 30;  //we always have to modify the name of the variables. And also we must set the type (here "privte" is modifier and "int" is type)
    private String name = "nirzhar";
    private int age = 16;

    public Student(){          // a constructor name must be the class name itself(here it's 'Student').
        System.out.println(id);
    }

    public Student(int id){
        this.id = id;
        System.out.println(this.id);  //why this is not printing in Person class?(prob!)
    }

    public Student(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
