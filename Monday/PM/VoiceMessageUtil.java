import java.util.Date;
import java.util.ArrayList;
public class VoiceMessageUtil{

    public String greeting(){
        return "hello you";
    }

    public String greeting(String name){
        return "hello " + name;
    }

    public String greeting(String age, int count){
        return "your age is " + age;
    }

    public void getCurrentDate(){
        Date today = new Date();
        System.out.println("hello, the current date is: "+ today);
    }

    public void getCurrentDate(String test){
        Date today = new Date();
        System.out.println("goodbye, the current date is: "+ today);
    }

    public int totalMessages(int[] intArr){
        int sum = 0;
        for(int i = 0; i< intArr.length; i++){
            sum += intArr[i];
        }
        return sum;
    }

    public void printMessages(String[] msgArr){
        // for(int i = 0; i< msgArr.length; i++){
        //     System.out.println(msgArr[i]);
        // }

        for(String message : msgArr){
            System.out.println(message);
        }
    }

    public void printMessages(ArrayList<String> msgArr){
        // for(String message : msgArr){
        //     System.out.println(message);
        // }

        for(int i = 0; i < msgArr.size(); i++){
            System.out.println(msgArr.get(i));
        }
    }
}