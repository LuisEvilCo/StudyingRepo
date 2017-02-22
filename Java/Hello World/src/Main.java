public class Main {

    public static void main(String[] args) {
        // printing a message to the console
        System.out.println("Hello World!");

        // creating an object, aka instancing a class
        Message object = new Message();

        // calling a method inside the object (see class for reference)
        object.method();

        // saving the return value of a method inside the class
        int number = object.methodArguments(5);

        // printing that returned value
        System.out.println("Hello , this is a variable : " + number);

        // using a method inside a method, printing the return value of that calculation
        System.out.println("Method called inside a method : " + object.severalArguments(10, 3) );

    }
}
