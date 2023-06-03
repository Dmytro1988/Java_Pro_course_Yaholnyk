package app.task_2;

 class Track extends Obstacle {

     private final int length;

     public Track(int length) {
         this.length = length;
     }

     @Override
     public void overcome(Member member) {
         member.run();
         System.out.println(" Member run :" + length + " meters ");


     }


 }
