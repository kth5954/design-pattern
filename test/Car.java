package test;

interface Car {

    void sound();

    String licenseNumber();

    String typeInfo();

    String companyInfo();

}

class Hyundai implements Car{
    public void sound(){
        System.out.println("부릉부름");
    };

    public String licenseNumber(){
        return "24모 7596";

    };

    public String typeInfo(){
        return "아반뗴";

    };

    public String companyInfo(){
        return "현대";
    };
}