package Game;

public class Monster extends Individual{
    private String type;
    private String dungeon;

    Monster(String name, int level, String description, String type, int power, String dungeon) {
        super(name, level, description, power);
        this.type = type;
        this.dungeon = dungeon;
    }

    @Override
    public void intro(){
        System.out.println("크카크캬킄푸파ㅣㄹㅎ하학");
        String name = this.getName();
        int level = this.getLevel();
        String description = this.getDescription();
        int power = this.getPower();

        System.out.printf("이름: %s\n레벨: %d\n한 줄 소개: %s\n전투력: %d",name, level,description, power);
    }

    //getter
    public String getDungeon(){
        return this.dungeon;
    }

    public String getType(){
        return this.type;
    }

    //setter
    public void setDungeon(String dungeon){
        this.dungeon = dungeon;
    }

    public void setType(String type){
        this.type = type;
    }

}
