package Bean;

public class Person {

    private  String say;

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public  void init(){

        System.out.println("Hello");

    }
    public void destory(){

        System.out.println("Bye bye");
    }



}
