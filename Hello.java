class Singleton {
	private static class singleInstanceHolder {
    	private static final Singleton INSTANCE = new Singleton();
    }
    
    public static synchronized Singleton getInstance() {
    	return singleInstanceHolder.INSTANCE;
    }
}

public class Hello {
    public static void main(String[] args){
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a.hashCode());
        System.out.println(a);
        System.out.println(b.hashCode());
        System.out.println(b);
        if (a == b) {
            System.out.println(true);
        }

    }
}
/*
112810359
112810359
true
 */