package paradigm;

public class Liscov {
    public static void main(String[] args){
        Rectangle a = new Rectangle();
        Rectangle b = new Square();

        a.setHeight(20);
        a.setWidth(10);
        System.out.println(a.getArea());

        b.setWidth(20);
        b.setHeight(10);
        System.out.println(b.getArea());
    }
}


//직사각형 클래스
class Rectangle {
    protected int width;
    protected int height;
    
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    
    public void setHeight(int height){
        this.height = height;
    }
    public int getArea(){
        return width * height;
    }
}

// 정사각형 클래스 
class Square extends Rectangle {

    @Override
    public int getWidth(){
        return  width;
    }

    @Override
    public int getHeight(){
        return  height;
    }

    @Override
    public void setWidth(int width){
        this.width = width;
    }
    
    @Override
    public void setHeight(int height){
        this.height = this.getWidth();
    }

    @Override
    public int getArea(){
        return width * height;
    }
}