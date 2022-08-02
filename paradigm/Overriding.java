package paradigm;

public class Overriding {
    public static void main(String[] args){
    }
}

class Animal{
    public void bark(){
        System.out.println("bla bla");
    }

}
class Dog extends Animal{
    @Override
    public void bark(){
        System.out.println("wal wal");
    }
}