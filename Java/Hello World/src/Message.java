/**
 * Created by Luis on 21/02/2017.
 */
public class Message {
    public Message() {
        System.out.println("Hello World from another class, this is called a  constructor");
    }

    public void method(){
        System.out.println("This is called a method, returns void");
    }

    public int methodArguments(int variable){
        System.out.println("Input times 2");
        return 2 * variable;
    }

    public int severalArguments(int input, int times){
        return input * times;
    }
}
