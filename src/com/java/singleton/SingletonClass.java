package com.java.singleton;

//In Java, Singleton class is a class that controls the object creation.
// It means the singleton class allows us to create a single object of the class, at a time.
// It is usually used to control access to resources, such as database connections or sockets.
// It ensures that only one connection is made and a thread can access the connection at a time.
class SingletonClassExample{
//    static variable s of type Singleton
    private static SingletonClassExample s = null;
//    variable of type String
    public String str;
//    private constructor of the Singleton class that restrict to the class itself.
    private SingletonClassExample(){
        str="this is singleton class";
    }
//    static method to create an instance of the Singleton class
//    we can also create a method with the same name as the class name
    public static SingletonClassExample getInstance(){
//        lazy initialization
        if(s==null){
            s=new SingletonClassExample();
        }
        return s;
    }

}
public class SingletonClass {
    public static void main(String[] args) {
        SingletonClassExample a = SingletonClassExample.getInstance();
        System.out.println(a);
        SingletonClassExample b = SingletonClassExample.getInstance();
        System.out.println(b);
    }
}
