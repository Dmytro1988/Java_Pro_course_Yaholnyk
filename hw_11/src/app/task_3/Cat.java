package app.task_3;

 class Cat extends Member {


     public Cat(String name, int maxRunDistance, int maxJumpHeight) {
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
     public void jump(int height){
             if (height <= getMaxJumpHeight()) {
                 System.out.println(" Member " + getName() + " passed height:  " + height + " m. ");
             } else {
                 System.out.println(" Member " + getName() + " did not pass the obstacle  at the height  " + height + " m. " +
                         " Passed " + getMaxJumpHeight() + " m. ");
                 setInactive();
             }
         }


 }
