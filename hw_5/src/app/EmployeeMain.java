package app;

public class EmployeeMain {

    // public static void main(String[] args) {

    //   Employee employee = new Employee();

    //  employee.setFullName(" Гончаренко Олексій\n");
    //  employee.setPosition("водій\n");
    //  employee.setEmail("goncharenko@gmail.com\n");
    //  employee.setPhone("+380988008088n\n");
    //  employee.setAge("40");


    //   System.out.println(employee);
    // }


    public static void main(String[] args) {
        Employee employee = new Employee("Гончаренко Олексій","водій","goncharenko@gmail.com",
                "+380988008088", 40 );


        System.out.printf("Повне ім'я: %s, Позиція: %s, Електронна адреса: %s, Телефон: %s, Вік: %s%n",  employee.getFullName(), employee.getPosition(),
                employee.getEmail(), employee.getPhone(), employee.getAge());


       employee.setAge(-10);

        System.out.printf("Повне ім'я: %s, Позиція: %s, Електронна адреса: %s, Телефон: %s, Вік: %s%n",  employee.getFullName(), employee.getPosition(),
                employee.getEmail(), employee.getPhone(), employee.getAge());

    }
}
