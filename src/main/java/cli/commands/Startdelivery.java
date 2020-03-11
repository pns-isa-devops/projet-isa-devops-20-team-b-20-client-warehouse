package cli.commands;

import java.util.List;

public class Startdelivery extends Command
{
    @Override
    public void execute(List<String> args)
    {
        if(args.isEmpty()) {
            System.err.println("No drone selected");
            return;
        }
        System.out.println(String.format("Starting drone : %s", args.get(0)));
        //TODO lancer le drône
        System.out.println("Drone launched");
    }

    @Override
    String help()
    {
        return "Launch le drone";
    }
}
