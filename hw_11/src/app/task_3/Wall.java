package app.task_3;

 class Wall extends Obstacle {
     private final int height;

     public Wall(int height) {
         this.height = height;
     }

     @Override
     public void overcome(Member member) {
             if (member.isActive()) {
                 member.jump(height);
             }


     }
 }
