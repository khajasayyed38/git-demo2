package git_demo;

public class AddTwoMethod extends App{


    public static void addedMethod(){
        System.out.println("addedMethod");
    }

    public int addNumber(int a,int b){
        return a+b;
    }

    public String name(){
        return "khaja";
    }

    public static void main(String[] args) {
        AddTwoMethod addTwoMethod= new AddTwoMethod();
//        addTwoMethod.addedMethod();
        App.addedMethod();
        System.out.println(addTwoMethod.addNumber(12,45));
        System.out.println(addTwoMethod.name());

    }
}
