package Game;

public class Main {
    public static void main(String[] args){

        String userName = "kth5954";
        int userLevel = 10;
        String userDescription = "김태훈의 계정";
        String userJob = "궁수";
        int userPower = 1500;

        Individual user1 = new User(userName, userLevel, userDescription, userJob,userPower);
        Individual dragon = new Monster("G-Dragon", 999, "내 심장의 색깔은 Black~", "빅뱅", 999999,"소환사의 협곡");
        System.out.println("------유저 등장------");
        user1.intro();
        System.out.println("\n\n\n");
        System.out.println("------몬스터 등장------");
        dragon.intro();
        System.out.println("\n\n\n");

        System.out.println("------전투 시작------");
        System.out.printf("%s(%d) vs %s(%d)", user1.getName(), user1.getPower(), dragon.getName(), dragon.getPower());
        System.out.println("\n\n\n");
        if (user1.getPower() > dragon.getPower()){
            System.out.println("유저 승리!!");
        } else if (user1.getPower() == dragon.getPower()){
            System.out.println("비김");
        } else {
            System.out.println("몬스터 승리!~!");
        }
        System.out.println("\n\n\n 게임 종료 \n");
    }
}


