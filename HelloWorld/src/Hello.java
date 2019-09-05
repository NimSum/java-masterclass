// - public: access modifier
// - class: defines a class, {...} defines class body
public class Hello {
    // - methods: collection of statements that perform an operation
    // static -
    // void - indicates the method will not return anything
    public static void main(String[] args) {
        // Statement - complete command to be executed & can include one/more expression
        System.out.println("Hello Nim");

        // Integers:
        int myFirstNumber = 500 + 500;
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = myTotal - 1000;
        System.out.println(myLastOne);
    }
}
