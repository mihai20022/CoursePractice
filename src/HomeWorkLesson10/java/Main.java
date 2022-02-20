package HomeWorkLesson10.java;

public class Main {
    public static void main(String[] args) {
        Pojo.Outer myOuter =new Pojo.Outer();
        Pojo.Outer.Inner myInner = new Pojo.Outer.Inner();
        System.out.println(myOuter.x + myInner.y );
    }
}
