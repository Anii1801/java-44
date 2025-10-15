package Unit2;

public class MyStaticMethod {
    public static void main(String[] args) {
//        Sayable sayable = MethodReference::saysomething;
//        sayable.say();
        MethodReference obj=new MethodReference();
        Sayable sayable=obj::saysomething;
        sayable.say();
    }
}
