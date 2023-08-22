package August15;

public class House {
    public void rooms(){
        System.out.println("many rooms are available in house");
    }
    public class Kitchen{
        public void kitchenRoom(){
            System.out.println("one kitchen available in house");
        }
    }
}
class Main{
    public static void main(String[] args) {
        House house = new House();
        House.Kitchen kitchen = house.new Kitchen();
        kitchen.kitchenRoom();
    }
}
