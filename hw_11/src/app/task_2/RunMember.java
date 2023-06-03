package app.task_2;

public class RunMember {
    public static void main(String[] args) {

        Member[] members = new Member[3];
        members[0] = new Human("Fred");
        members[1] = new Cat("Dinny");
        members[2] = new Robot("Dynamic");


        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Track(10);
        obstacles[1] = new Wall(2);


        for ( Member member : members){
            for (Obstacle obstacle : obstacles){
                obstacle.overcome(member);
            }
        }

    }
}
