package app.task_2;

 class Cat extends Member {
     public Cat(String name) {
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
