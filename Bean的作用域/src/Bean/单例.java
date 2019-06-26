package Bean;

public class 单例 {

    private 单例(){}

    private  static  单例 instance=null;

    public static 单例 getInstance(){
        if(instance==null){
            instance =new 单例();
        }

        return instance;
    }

}
