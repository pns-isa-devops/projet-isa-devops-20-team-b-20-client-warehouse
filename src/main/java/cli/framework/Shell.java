package cli.framework;

import cli.commands.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shell
{
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.flush();
            if(!scanner.hasNext()) { System.out.println("Reaching end of file"); break; }

            String keyword = scanner.next().trim();

            List<String> args = new ArrayList<>();

            if(scanner.hasNextLine()) {
                args = Arrays.stream(scanner.nextLine().split(" ")).filter(s -> !s.isEmpty()).collect(Collectors.toList());
            }

            executeCommand(keyword, args);
        }
    }

    private void executeCommand(String keyword, List<String> args)
    {
        try
        {
            Class<? extends Command> command = (Class<? extends Command>) Class.forName("cli.commands." + keyword);
            Command c = command.newInstance();
            c.execute(args);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            System.err.println("Command " + keyword + " cannot be instanciate");
        }
    }
}
