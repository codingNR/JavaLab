package Module_1;
public class MainAccess{
    int IntAdd(int a,int b){   //its the default type.....its in Access1.java file
        int result = a+b;
        return result;
    }

    public int IntSub(int a,int b){   //its the public type.....its in Access2.java file
        int result = a-b;
        return result;
    }


    private int IntMul(int a,int b){   //its the private type.....its in Access3.java file.....and it will not work there cuz its private.
        int result = a*b;
        return result;
    }

    protected int IntDiv(int a,int b){   //its the protected type.....its in Access4.java file.....and it will work there cuz its in the same package....but it will not work outside this package.
        int result = a/b;                 //but if a file that is in another package,makes itself a subclass of MainAccess....then it will work there.....And we did that in the other package - "Module_2"...in there....Access5 is the file that imports it..
        return result;
    }
} 


