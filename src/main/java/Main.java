import cli.commands.*;
import cli.framework.Shell;

public class Main
{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException
    {
        Shell s = new Shell();
        s.register(
                Bye.class,
                Help.class,
                Startdelivery.class
        );
        s.run();
    }
}
