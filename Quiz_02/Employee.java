package Quiz_02;

public class Employee  {
     String firstName = "Abdul ";
    String lastName = "Rahat ";
     float salary = 5000;
     long phone = 734091102;
     int age = 25;

     public void printInfo(){
         System.out.println("Name of the Employee: "+firstName+lastName);
         System.out.println("Contact Info:"+phone);
         System.out.println("Age:"+age);
         System.out.println("Salary:"+salary);
     }
     public void calculateBonus(){
         double bonus = salary*.05;
         System.out.println("Bonus:"+bonus);
         System.out.println("Total Salary:"+(salary+bonus));

     }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.printInfo();
        e.calculateBonus();
    }
}
