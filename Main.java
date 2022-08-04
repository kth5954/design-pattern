public class Main{

    public static void main(String[] args){
        Animal choco = new Animal("말티즈", 12);
        Info.test();
        Info.printInfo(choco.getName(), choco.getAge());

        Person hunss = new Person("김태훈", 27, "고졸");
        Info.printInfo(hunss.name, hunss.age, hunss.scholarShip);
        Info.printInfo(hunss.name, hunss.age);
        System.out.println(Info.infoDescription);
    }

}

class Animal {
    private String name;
    private int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Person {
    public String name;
    public int age;
    public String scholarShip;

    Person(String name, int age, String scholarShip){
        this.name  = name;
        this.age = age;
        this.scholarShip = scholarShip;
    }

}

class Info {
    public static String infoDescription = "이것저것 프린트하기 위한 클래스입니다.";

    public static void test(){
        System.out.println("테스트 시작 \n---------------------------------------------");
    }

    public static void printInfo(String name, int age){
        System.out.printf("이름: %s, 나이: %d \n", name, age);
    }

    public static void printInfo(String name, int age, String scholarShip){
        System.out.printf("이름: %s, 나이: %d 학력: %s \n", name, age, scholarShip);
    }
}