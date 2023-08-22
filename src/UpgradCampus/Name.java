package UpgradCampus;

public class Name {
    String name ;
    Name(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
class Main1 {
    public static void main(String[] args) {
        Name name = new Name("Ankit");
        System.out.println(name.getName());
    }

}