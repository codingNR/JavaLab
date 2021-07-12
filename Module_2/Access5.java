package Module_2;

import Module_1.MainAccess;

public  class Access5 extends MainAccess {   //making Access5,a subclass of MainAccess class...
    public static void main(String[] args){
        Access5 m = new Access5();    //here w cannot write "MainAccess m = new MainAccess" because that won't work..so we have to change it with Access5....because after making it a subclass of the MainAccess class...it has all of the methods and functionalities of that class in it now.
        System.out.println(m.IntDiv(6, 3));   //now this method will work.
    }
}
  
