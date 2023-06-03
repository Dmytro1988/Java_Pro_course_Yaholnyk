package app.task_3;

 class  Robot extends Member {

     public Robot(String name, int maxRunDistance, int maxJumpHeight) {
         super(name, maxRunDistance, maxJumpHeight);
     }

     @Override
     public void run(int distance) {
         if (distance <= getMaxRunDistance()) {
             System.out.println(" Member " + getName() + " passed distance " + distance + " m. ");
         } else {
             System.out.println(" Member " + getName() + " did not pass the obstacle at the distance " + distance + " m. " +
                     " Passed " + getMaxRunDistance() + " m. " );
             setInactive();
         }
     }


     @Override
     public void jump(int height) {
             if (height <= getMaxJumpHeight()) {
                 System.out.println(" Member " + getName() + " passed out " + height + " m.");
             } else {
                 System.out.println(" Member " + getName() + " did not pass the obstacle height: " + height + " m." +
                         " Passed " + getMaxJumpHeight() + " m. ");
                 setInactive();
             }

         }
     }


