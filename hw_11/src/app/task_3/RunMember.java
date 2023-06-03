package app.task_3;

public class RunMember {

    public static void main(String[] args) {

        Member[] members = new Member[3];
        members[0] = new Human("Fred", 550, 2);
        members[1] = new Cat("Kitty",800,4);
        members[2] = new Robot("Dynamic", 2000,20);


        Obstacle[] obstacles = new Obstacle[3];
        obstacles[0] = new Track(750);
        obstacles[1] = new Wall(3);
        obstacles[2] = new Track(1500);

        for (Member member : members){
            for (Obstacle obstacle : obstacles){
                obstacle.overcome(member);
                if (!member.isActive()){
                    break;
                }
            }
            System.out.println();
        }

    }



}
