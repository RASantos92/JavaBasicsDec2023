import java.util.ArrayList;
public class Test{
    public static void main(String[] args){
        Developer dev1 = new Developer();
        System.out.println(dev1);
        dev1.age = 26;
        dev1.salary = 120000;
        dev1.name = "Megan Patel";
        dev1.languages = new ArrayList<String>();
        dev1.languages.add("Python");
        dev1.languages.add("Java");


        Project project1 = new Project();
        project1.title = "Lookify";
        project1.language = "Python";

        Project project2 = new Project();
        project2.title = "Netflix clone";
        project2.language = "Java";

        dev1.addProject(project1);
        dev1.addProject(project2);
        dev1.displayStatus();


    }
}