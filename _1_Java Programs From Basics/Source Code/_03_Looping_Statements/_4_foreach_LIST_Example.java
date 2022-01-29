package _03_Looping_Statements;

import java.util.ArrayList;
import java.util.List;

public class _4_foreach_LIST_Example
{
    public static void main(String[] args)
    {
        List<String> games = new ArrayList<String>();
        games.add("Cricket");
        games.add("Throwball");
        games.add("football");
        games.add("Kabaddi");
        games.forEach(gamesILike -> System.out.println(gamesILike));
    }
}
