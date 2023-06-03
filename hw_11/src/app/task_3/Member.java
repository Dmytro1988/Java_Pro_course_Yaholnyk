package app.task_3;


abstract class Member {

    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean active;

    public Member(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public boolean isActive() {
        return active;
    }

    public void setInactive() {
        this.active = false;
    }

public abstract void run(int distance);
public abstract void jump(int height);


}
