import java.util.ArrayList;
public class Test{
    public static void main(String[] args){
        Developer dev1 = new Developer("Megan Patel",26,100);
        Developer dev2 = new Developer(26,100);
        Developer dev3 = new Developer("Megan testing",26,100);
        Developer dev4 = new Developer("Megan test",26,100);


        dev1.setSalary(dev1.getSalary()+ 50);

        dev2.displayStatus();
        dev1.addLanguage("Python");
        dev1.addLanguage("Java");


        Project project1 = new Project();
        project1.title = "Lookify";
        project1.language = "Python";

        Project project2 = new Project();
        project2.title = "Netflix clone";
        project2.language = "Java";

        dev1.addProject(project1);
        dev1.addProject(project2);
        // dev1.displayStatus();
        
        System.out.println(Developer.getDevCount());
        System.out.println(Developer.getTotalSalary());


    }
}