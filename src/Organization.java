import java.util.*;

public class Organization {

        static UUID uuid= UUID.randomUUID();
        static Employee employee1 = new Employee();
        static Employee employee2 = new Employee();
        static Employee employee3 = new Employee();
        static Employee employee4 = new Employee();
        static Employee employee5 = new Employee();
        //static Employee employee6 = new Employee();

        static List<Employee> employees = new LinkedList<>();

        public static void createEmployees(){
                employee1.addEmployee( uuid,"Cosmin", 25, "IT", "M", "QA");
                employee2.addEmployee( uuid,"George", 25, "IT", "M", "QA");
                employee3.addEmployee( uuid,"Cosmin3", 26, "IT2", "F", "QA1");
                employee4.addEmployee( uuid,"Testing", 27, "Smecher", "M", "QA2");
                employee5.addEmployee( uuid,"Cosmin4", 28, "IT4", "F", "QA3");
        }


        public static void addToTheList(){
                employees.add(employee1);
                employees.add(employee2);
                employees.add(employee3);
                employees.add(employee4);
                employees.add(employee5);
        }
        public static void showListEmployees(){

               // employees.add(employee1);
              //  employees.add(employee2);
              //  employees.add(employee3);
              //  employees.add(employee4);
             //   employees.add(employee5);

                for (Employee e : employees) {
                        System.out.println(" "
                                + "UUID: "
                                + e.generateId()
                                + " Name: "
                                + e.getName()
                                + ", gender: "
                                + e.getGender()
                                + ", age: "
                                + e.getAge()
                                + ", Department:"
                                + e.getDepartment()
                                + ", Job Title: "
                                + e.getJobTitle());
                }

        }

        public static Employee addEmpl(UUID id, String name, int age, String dep, String gen, String job){
                Employee x = new Employee();
                x.addEmployee(id, name, age, dep, gen, job);
                System.out.println("Employee list: "
                        + "UUID: "
                        + x.generateId()
                        + " Name: "
                        + x.getName()
                        + ", gender: "
                        + x.getGender()
                        + ", age: "
                        + x.getAge()
                        + ", Department:"
                        + x.getDepartment()
                        + ", Job Title: "
                        + x.getJobTitle());
                return x;
        }


        public static void searchAfterName(String name) {
                System.out.println("Here is the list after searching by name: " + name);
                for (Employee e : employees) {
                        if (e.getName().contains(name)) {
                                System.out.println("UUID: "
                                        + e.generateId()
                                        + " Name: "
                                        + e.getName()
                                        + ", gender: "
                                        + e.getGender()
                                        + ", age: "
                                        + e.getAge()
                                        + ", Department:"
                                        + e.getDepartment()
                                        + ", Job Title: "
                                        + e.getJobTitle());
                        }
                }
        }
        public static void searchAfterAge(int age) {
                System.out.println("Here is the list after searching by age: " + age);
                for (Employee e : employees) {
                        if (e.getAge() == age) {
                                System.out.println("UUID: " + e.generateId()
                                        + " Name: "
                                        + e.getName()
                                        + ", gender: "
                                        + e.getGender()
                                        + ", age: "
                                        + e.getAge()
                                        + ", Department:"
                                        + e.getDepartment()
                                        + ", Job Title: "
                                        + e.getJobTitle());
                        }
                }
        }

        public static void searchAfterGender(String gender) {
                System.out.println("Here is the list after searching by gender: " + gender);
                for (Employee e : employees) {
                        if (e.getGender().contains(gender)) {
                                System.out.println("UUID: "
                                        + e.generateId()
                                        + " Name: "
                                        + e.getName()
                                        + ", gender: "
                                        + e.getGender()
                                        + ", age: "
                                        + e.getAge()
                                        + ", Department:"
                                        + e.getDepartment()
                                        + ", Job Title: "
                                        + e.getJobTitle());
                        }
                }
        }

        public static void searchAfterJob(String job) {
                System.out.println("Here is the list after searching by jab: " + job);
                for (Employee e : employees) {
                        if (e.getJobTitle().contains(job)) {
                                System.out.println("UUID: "
                                        + e.generateId()
                                        + " Name: "
                                        + e.getName()
                                        + ", gender: "
                                        + e.getGender()
                                        + ", age: "
                                        + e.getAge()
                                        + ", Department:"
                                        + e.getDepartment()
                                        + ", Job Title: "
                                        + e.getJobTitle());
                        }
                }
        }

        public static void searchAfterDepartment(String department) {
                System.out.println("Here is the list after searching by department: " + department);
                for (Employee e : employees) {
                        if (e.department.contains(department)) {
                                System.out.println("UUID: "
                                        + e.generateId()
                                        + " Name: "
                                        + e.getName()
                                        + ", gender: "
                                        + e.getGender()
                                        + ", age: "
                                        + e.getAge()
                                        + ", Department:"
                                        + e.getDepartment()
                                        + ", Job Title: "
                                        + e.getJobTitle());
                        }
                }
        }

        public static void updateName(Employee e, String name){
       // e.updateName(name);
               String updated = e.updateName(name);

                                System.out.println("UUID: "
                                        + e.generateId()
                                        + " Name: "
                                        + updated
                                        + ", gender: "
                                        + e.getGender()
                                        + ", age: "
                                        + e.getAge()
                                        + ", Department:"
                                        + e.getDepartment()
                                        + ", Job Title: "
                                        + e.getJobTitle());


        }

        public static void updateAge(Employee e, int age){

                int updated = e.updateAge(age);

                System.out.println("UUID: "
                        + e.generateId()
                        + " Name: "
                        + e.getName()
                        + ", gender: "
                        + e.getGender()
                        + ", age: "
                        + age
                        + ", Department:"
                        + e.getDepartment()
                        + ", Job Title: "
                        + e.getJobTitle());


        }
        public static void updateJob(Employee e, String job){

                String updated = e.updateJobTitle(job);

                System.out.println("UUID: "
                        + e.generateId()
                        + " Name: "
                        + e.getName()
                        + ", gender: "
                        + e.getGender()
                        + ", age: "
                        + e.age
                        + ", Department:"
                        + e.getDepartment()
                        + ", Job Title: "
                        + job);


        }
        public static void main(String[] args) {

                //Here I create the employees
                createEmployees();
                addToTheList();
                //Here I list the employees
                System.out.println("==================");
                System.out.println("The first list with Employees: ");
                showListEmployees();
                System.out.println("==================");

                //Searches
                searchAfterName("Cosmin");
                System.out.println("==================");
                searchAfterAge(28);
                System.out.println("==================");
                searchAfterGender("M");
                System.out.println("==================");
                searchAfterDepartment("Smecher");
                System.out.println("==================");
                searchAfterJob("");
                System.out.println("==================");

                // Updates on attributes
                System.out.println("Updated name: ");
                updateName(employee1, "test");
                System.out.println("Updated age: ");
                updateAge(employee2, 12);
                //updateJob();

                //Adding new employees
                System.out.println("==================");
                System.out.println("The last added Employees: ");
                employees.add(addEmpl(uuid, "Batman", 50, "SF", "M", "Hero"));
                employees.add(addEmpl(uuid, "Superman", 50, "SF", "M", "Hero2"));
                System.out.println("========== After all the updates, the final List is: ========");
                showListEmployees();

        }
}