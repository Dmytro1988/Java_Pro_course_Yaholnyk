package app.task_3;

 class Track extends Obstacle {
     private final int distance;
     public Track(int distance) {
         this.distance = distance;
     }

     @Override
     public void overcome(Member member) {
         if (member.isActive()){
             member.run(distance);
         }
     }





 }
