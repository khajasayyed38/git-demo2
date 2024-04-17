package git_demo;

public class AddTwoMethod extends App{


    public static void addedMethod(){
        System.out.println("addedMethod");
    }

    public static void main(String[] args) {
        App addTwoMethod= new AddTwoMethod();
//        addTwoMethod.addedMethod();
        App.addedMethod();


    }
}
