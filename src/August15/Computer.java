package August15;

public class Computer {
    public void show(){
        System.out.println("it shows on th escreen");
    }
    static class Laptop{
        public void carry(){
            System.out.println("laptop is easy to carry anywhere");
        }

    }
}
class main{
    public static void main(String[] args) {
        Computer.Laptop laptop = new Computer.Laptop();
        laptop.carry();
    }
}
