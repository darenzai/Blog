public class TestJDBC {

    public static void main(String[] args) {

        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("初始化成功");

        }catch(ClassNotFoundException E){
            E.printStackTrace();
        }




    }


}
