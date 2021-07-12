package Module_1;
public class Access3 {
    public static void main(String[] args){
        MainAccess m = new MainAccess();
        System.out.println(m.IntMul(6, 7));  //its the private system of getting access...which we never can get..thats why we have an error here.
    }
}


//m.IntMul() is the private type...which is created in MainAccess.java file.....and it will not work here cuz its private.