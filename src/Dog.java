import java.util.jar.Attributes.Name;
public class Dog {
    private String name;
    private Integer age;
    public void setName(String givenName){
        name = givenName;
    }
    public void setAge( Integer givenAge){
        age = givenAge;
    }
    public String getName(){
        return name;
    }
    void bark(){
        
        System.out.println(name + " barks");
    }
    void jump(int times){
        while (times > 0){
            System.out.println(name + " jumps!");
            times = times - 1;
        }
    }
}
