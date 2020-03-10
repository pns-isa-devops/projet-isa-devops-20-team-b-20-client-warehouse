package cli.commands;

import java.util.List;

public class Startdelivery extends Command
{
    @Override
    public void execute(List<String> args)
    {
        if(args.size() == 0) {
            System.err.println("Aucun drône selectionné");
            return;
        }
        System.out.println(String.format("Lancement du drone : %s", args.get(0)));
        //TODO lancer le drône
        System.out.println("Drône lancé");
    }

    @Override
    String help()
    {
        return "Lance le drône";
    }
}
