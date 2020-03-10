package cli.commands;

import java.util.List;

public class Help extends Command
{

    @Override
    public void execute(List<String> args)
    {
        System.out.println("Liste de commande :");
        this.shell.getCommands().forEach(command -> System.out.println("\t" + command.getClass().getSimpleName().toLowerCase() + " : " + command.help()));
    }

    @Override
    String help()
    {
        return "Affiche l'aide";
    }
}
