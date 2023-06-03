package app.task_2;

 class Wall extends Obstacle {
     private final int height;
     public Wall(int height) {
         this.height = height;
     }

     @Override
     public void overcome(Member member) {
         member.jump();
         System.out.println( " Member jumps: " + height + " meters ");

     }
 }
