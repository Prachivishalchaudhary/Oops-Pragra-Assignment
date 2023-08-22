package PolymorphismExample;

public class Dog extends Animal{
    String voice;
    Dog(String voice){
        this.voice=voice;
    }

    public String sound(){
        return voice;
    }
}
