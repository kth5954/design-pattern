package Game;

abstract class Individual {
    private String name;
    private int level;
    private String description;
    private int power;

    Individual(String name, int level, String description, int power){
        this.name = name;
        this.level = level;
        this.description = description;
        this.power = power;
    }

    abstract public void intro();

    // getters
    public String getName(){
        return this.name;
    }

    public int getLevel(){
        return this.level;
    }

    public String getDescription(){
        return this.description;
    }
    
    public int getPower(){
        return this.power;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPower(int power){
        this.power = power;
    }
}

