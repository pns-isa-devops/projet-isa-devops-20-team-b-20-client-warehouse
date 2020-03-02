package cli.commands;

import java.util.List;

public class Bye implements Command
{
    @Override
    public void execute(List<String> args)
    {
        System.out.println("Bye...");
        System.exit(0);
    }
}
