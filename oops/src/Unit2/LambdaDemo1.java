package Unit2;

public class LambdaDemo1 {
    public static void main(String[] args) {
        NumericTest isEven=(n)->n%2==0;
        System.out.println(isEven.test(12));
        if(isEven.test(13)){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
