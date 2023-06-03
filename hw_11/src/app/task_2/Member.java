package app.task_2;

abstract class Member {

    private final String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void run();
    public abstract void jump();


}
