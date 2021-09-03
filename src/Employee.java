import java.util.UUID;

public class Employee {
    UUID uuid = UUID.randomUUID();
    String name;
    int age;
    String gender;
    String department;
    String jobTitle;

  /*  public Employee(UUID uuid, String name, int age, String gender, String department, String jobTitle) {
        this.uuid = uuid;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.jobTitle = jobTitle;
    }
*/

    public UUID generateId() {
        return uuid;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getDepartment(){
        return department;
    }
    public String getGender(){
        return gender;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public String updateName(String nameUpdated){
        name = nameUpdated;
        return name;
    }

    public int updateAge(int ageUpdated){
        age = ageUpdated;

        return age;
    }

    public String  updateDepartment(String departmentUpdated){
        department = departmentUpdated;
        return department;
    }
    public String  updateGender(String genderUpdated){
        gender = genderUpdated;
        return gender;
    }

    public String updateJobTitle(String jobTitleUpdated){
        jobTitle = jobTitleUpdated;
        return jobTitle;
    }


    public void deleteName(){
        name = null;
    }

    public void deleteAge(){
        age = Integer.parseInt(null);
    }

    public void  deleteDepartment(){
        department = null;
    }
    public void  deleteGender(){
        gender = null;
    }

    public void deletejobTitle(){
        jobTitle = null;
    }

    void addEmployee(UUID uuid, String name, int age, String department, String gender, String jobTitle){

        this.name = name;
        this.age = age;
        this.department = department;
        this.gender = gender;
        this.jobTitle = jobTitle;
    }

    void showEmployee(){
        System.out.println("UUID of employee = " + uuid);
        System.out.println("Name of employee = " + name);
        System.out.println("Age of employee = " + age);
        System.out.println("Department of employee = " + department);
        System.out.println("jobTitle of employee = " + jobTitle);

    }




}
