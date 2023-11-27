import java.util.ArrayList;
public class Test{
    public static void main(String[] args){
        VoiceMessageUtil util = new VoiceMessageUtil();
        // System.out.println(util.greeting());
        // System.out.println(util.greeting("Mayank"));
        // System.out.println(util.greeting("test", 1));
        // util.getCurrentDate();

        // var newArr = [1,2,3,4,5];
        int[] messagesPerDay = new int[5]; // [0,0,0,0,0]
        messagesPerDay[0] = 5;
        messagesPerDay[1] = 5;
        messagesPerDay[2] = 5;

        int[] messagesPerDay2 = {5,5,5};

        String[] messages = {"String1", "String2", "String3"};

        System.out.println(util.totalMessages(messagesPerDay2));
        util.printMessages(messages);



        // Dynamic ArrayList

        ArrayList<String> messageArrayList = new ArrayList<String>();
        messageArrayList.add("finish Alfred Bot");
        messageArrayList.add("Finish Cafe bussiness logic");
        messageArrayList.add("Read ahead for oop");

        util.printMessages(messageArrayList);


        int days = 7;
        double budget = 3.59;
                                          //1  => 1.00
        double totalCost = days * budget; //int => double
        System.out.println(totalCost);
        

        int roundedTotalCost = days * (int) budget; // 2.12 => 2
        System.out.println(roundedTotalCost);
        



    }
}