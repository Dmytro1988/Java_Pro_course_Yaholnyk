package app.task_2;

 class Robot extends Member {

     public Robot(String name) {
         super(name);
     }

     @Override
     public void run() {
         System.out.println(getName() + " run ");

     }

     @Override
     public void jump() {
         System.out.println(getName() + " jump ");

     }
 }
