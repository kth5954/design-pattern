package test;

public class Main {
    public static void main(String[] args){
        Car myCar = new Hyundai();
        System.out.println(myCar.companyInfo());
        System.out.println(myCar.licenseNumber());
        myCar.sound();
    }
}
