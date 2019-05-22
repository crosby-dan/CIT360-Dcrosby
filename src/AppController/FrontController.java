package Main.AppController;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrontController {

    public interface doListCommand {
        void runCommand(String sCommand);
    }

    public static void AppControllerDemo() {
        //This block of code will capture the number of the collection test to run.
        Pattern pattern = Pattern.compile("(print|clear|print|quit)|((add|remove|quit) (bananas|paper towels|milk|eggs|spam))");
        Matcher matcher;
        boolean matchResult;
        do {
            System.out.format("\nWelcome to your shopping list.   Enter a command and an item name.");
            System.out.format("\nCommands:  add, remove, clear, print.");
            System.out.format("\nItems:  Bananas, Paper Towels, Milk, Eggs, Spam.");

            @SuppressWarnings("resource")
            Scanner in = new Scanner (System.in);
            String input=in.nextLine();
            matcher = pattern.matcher(input);
            matchResult=matcher.find();
            if (!matchResult) {
                System.out.println("Invalid commands provided.");
                System.out.format("\nWelcome to your shopping list.   Enter a command and an item name.");
                System.out.format("\nCommands:  add, remove, clear, print.");
                System.out.format("\nItems:  Bananas, Paper Towels, Milk, Eggs, Spam.");
            }
            else
                //processRequest(matcher.group(1).toString(),input);
                switch (matcher.group(1)) {
                   /* case 1: t.startThreads(); break;
                    case 2: t.startThreadsES(); break;
                    case 3: t2.startThreadsRandom(); break;*/
                    case "quit": System.out.println ("Program terminated."); return;
                }
        }
        while (!matchResult || Integer.parseInt(matcher.group(1))<7);
    }



}
