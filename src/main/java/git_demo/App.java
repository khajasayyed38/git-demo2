package git_demo;
public class App {

    public static void add(String data){
        if(data.equals(Constant.DATA_TYPE)){
            System.out.println("welcome");
        }
    }
    public static void addedMethod(){
        System.out.println("welcome");
    }


    public static void main(String[] args) {
        System.out.println("Hello world");
        add("java techie");
        Entity entity= new Entity(12,"khaja","moinuddin",65465464);
        System.out.println(entity.getId());
        System.out.println(entity.getFirstName());
        System.out.println(entity.getLastName());
        System.out.println(entity.getSalary());
    }
}
