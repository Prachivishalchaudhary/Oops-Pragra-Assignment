package PolymorphismExample;

public class Cat extends Animal {
    String voice;
    Cat(String voice){
        this.voice=voice;
    }



    public String sound(){
        return voice;
    }
}
