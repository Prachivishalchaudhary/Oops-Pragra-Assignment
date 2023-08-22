package UpgradCampus;

public class Name2 {
    private String name;


    public void setName(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println(name);
    }
}
class Main2{
    public static void main(String[] args) {
        Name2 name2 = new Name2();

        name2.setName("Prachi");
        name2.print();


    }
}
