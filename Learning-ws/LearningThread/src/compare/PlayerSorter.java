package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerSorter {

    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "ACE", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        //Player player4 = new Player(45, null, 24);
        //Player player5 = new Player(45, null, 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);
        //footballTeam.add(player4);
        //footballTeam.add(player5);


        System.out.println("Before Sorting : " +footballTeam.toString());
        Collections.sort(footballTeam);
        System.out.println("After Sorting : " + footballTeam);

        System.out.println("Before Sorting  : " +footballTeam.toString());
        Collections.sort(footballTeam, new PlayerAgeComparator());
        System.out.println("After Sorting on Age: " + footballTeam);

        System.out.println("Before Sorting  : " +footballTeam.toString());
        Comparator byName = Comparator.comparing(Player::getName);
        Collections.sort(footballTeam, byName);
        System.out.println("After Sorting on Rating: " + footballTeam);


        Comparator playerNameComparator = Comparator.comparing(Player::getName, (p1, p2) -> p1.compareTo(p2));
        Collections.sort(footballTeam, playerNameComparator);
        System.out.println("After Sorting on playerNameComparator: " + footballTeam);

        //comparator.reversed
        Collections.sort(footballTeam, playerNameComparator.reversed());
        System.out.println("After Sorting on playerNameComparator.reversed(): " + footballTeam);

        //NullFirst
       /* Comparator<Player> playerNameComparator1  = Comparator.comparing(Player::getName);
        Comparator<Player> playerNameComparator1_NullFirst = Comparator.nullsFirst(playerNameComparator1);
        Collections.sort(footballTeam, playerNameComparator1_NullFirst);
        System.out.println("After Sorting on playerNameComparator1_NullFirst: " + footballTeam);*/

        //Using Comparator.thenComparing
        Comparator<Player> employee_Age_Name_Comparator
                = Comparator.comparing(Player::getAge)
                .thenComparing(Player::getName);
        Collections.sort(footballTeam, employee_Age_Name_Comparator);
        System.out.println("After Sorting on employee_Age_Name_Comparator: " + footballTeam);

        //Using Natural Order
        Comparator<Player> employeeNameComparatorN
                = Comparator.<Player> naturalOrder();
        Collections.sort(footballTeam, employeeNameComparatorN);
        System.out.println("After Sorting on employeeNameComparatorN: " + footballTeam);


        //Using Reverse Natural Order
        Comparator<Player> employeeNameComparatorR
                = Comparator.<Player> reverseOrder();
        Collections.sort(footballTeam, employeeNameComparatorR);
        System.out.println("After Sorting on employeeNameComparatorR: " + footballTeam);


    }


}
