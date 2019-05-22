package Main.AppController;

import java.util.HashMap;

public class ListRequestHandler {
    public static HashMap<String, FrontController.doListCommand> key = new HashMap<>();

    public static void processRequest(){
        //key.put("add", new AddItem());
        //key.put("remove", new RemoveItem());
        key.put("print", new OtherCommands());
        key.put("quit", new OtherCommands());

        //ListRequestHandler request = key.get(operator);
        //return request.execute(input1);
    }
}