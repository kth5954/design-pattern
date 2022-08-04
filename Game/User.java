package Game;

public class User extends Individual{
    private String job;

    User(String name, int level, String description, String job, int power) {
        super(name, level, description, power);
        this.job = job;
    }

    @Override
    public void intro(){
        System.out.println("흩날리는 기억에 모든 순간마다 너르흘으윽!!! 매일 이렇게 불러뽄똬흥하~~~~₩우워~!어~~~~어어어~~");
        String name = this.getName();
        int level = this.getLevel();
        String description = this.getDescription();
        int power = this.getPower();

        System.out.printf("이름: %s\n레벨: %d\n한 줄 소개: %s\n전투력: %d",name, level,description, power);
    }

        //getter
        public String getJob(){
            return this.job;
        }
    
        //setter
        public void setJob(String job){
            this.job = job;
        }
}