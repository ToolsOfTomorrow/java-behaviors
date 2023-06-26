public class Dog {
    String name = "";
    Integer age = 0;
    void bark(){
        System.out.println(name + " barks");
    }
    void jump(int times){
        while (times > 0){
            System.out.println(name + "jumps!");
            times = times - 1;
        }
    }
}
