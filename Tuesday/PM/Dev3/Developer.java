import java.util.ArrayList;
public class Developer{
    //------------------ attributes (private/protected) ----------------------
    private static int devCount;
    private static double totalSalary;
    private String name;
    private int age;
    private double salary;
    private ArrayList<String> languages = new ArrayList<String>();
    private ArrayList<Project> projects = new ArrayList<Project>();


    //------------------ constructors ----------------------
    public Developer(){
        Developer.devCount++;
    }

    public Developer(int age, double salary){

        this.name = "no name";
        this.age = age;
        this.salary = salary;
        Developer.totalSalary += salary;
        Developer.devCount++;
    }


    public Developer(String name, int age, double salary){
        this.name = name;
        this.age = age; 
        this.salary = salary;
        Developer.totalSalary += salary;
        Developer.devCount++;
    }
    //------------------ other class methods ----------------------

    public void displayStatus(){
        System.out.println("name: " + this.name);
        System.out.println("salary: " + this.salary);
        System.out.println("age: " + this.age);
        System.out.println("languages: " + this.languages);
        System.out.println("projects: ");
        for(Project project : this.projects){
            project.dispalyInfo();
        }
    }

    public void addProject(Project project){
        this.projects.add(project);
    }


    public void addLanguage(String language){
        this.languages.add(language);
    }


    //------------------ getters / setters  ----------------------
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){ // 400$ =>
        Developer.totalSalary += (salary - this.salary);
        this.salary = salary;
    }

    public static int getDevCount(){
        return Developer.devCount;
    }

    public static double getTotalSalary(){
        return Developer.totalSalary;
    }

}