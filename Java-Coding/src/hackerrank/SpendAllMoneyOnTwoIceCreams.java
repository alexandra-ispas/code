package hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool their money to buy ice
 * cream. On any given day, the parlor offers a line of flavors. Each flavor has a cost associated
 * with it.
 *
 * Given the value of money and the cost of each flavor for t trips to the Ice Cream Parlor,
 * help Sunny and Johnny choose two distinct flavors such that they spend their entire pool of money
 * during each visit. ID numbers are the 1- based index number associated with a cost.
 * For each trip to the parlor, print the ID numbers for the two types of ice cream that Sunny and
 * Johnny purchase as two space-separated integers on a new line. You must print the smaller ID first
 * and the larger ID second.
 */
public class SpendAllMoneyOnTwoIceCreams {

    public static void findFlavors(List<Integer> cost, int money) {

        Map<Integer, Integer> map = new HashMap<> ();
        for(int i = 0; i < cost.size (); i++) {
            int target = money - cost.get ( i );
            if(map.containsKey ( target )) {
                System.out.println (map.get ( target ) + " " + (i + 1));
                break;
            }
            map.put ( cost.get ( i ), i + 1 );
        }
    }
}
