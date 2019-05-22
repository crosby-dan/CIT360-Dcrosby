package Main.AppController;

public class OtherCommands implements FrontController.doListCommand {

    public void runCommand(String sCommand){
        System.out.println("received other command " + sCommand);
    }

}

