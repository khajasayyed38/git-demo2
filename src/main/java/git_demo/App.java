package git_demo;
public class App {

    public static void add(String data){
        if(data.equals(Constant.DATA_TYPE)){
            System.out.println("welcome");
        }
    }
    public void addedMethod(){
        System.out.println("welcome");
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        add("java techie");
    }
}
