package paradigm;

public class Overloading {
    public static void main(String[] args){
        Person.eat("Apple","Banana");
    }

    public static class Person {
        public static void eat(String a){
            System.out.println("I eat " + a );
        }
    
        public static void eat(String i, String j){
            System.out.println("I eat " + i + " and " + j );
        }
    }
}

