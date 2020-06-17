/*

Find all the quadruples [a,b,c,d] where a3+ b3 = c3 + d3
where a3 refers to a cube
till value of n which in this case is 1000
*/

package individualproblems;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Pooja
 */

class Pair {
    int a;
    int b;

    Pair(int x, int y) {
        a = x;
        b = y;
    }
}


public class FindCubePair {
    public static void main(String[] args) {
        HashMap<Long, ArrayList<Pair>> hashMap = new HashMap<>();
        int n = 500; // change to desired value here

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                long sum = (long) (pow(i, 3) + pow(j, 3));

                if(hashMap.containsKey(sum)) {
                    List<Pair> list = hashMap.get(sum);
                    for(Pair p : list) {
                        System.out.println(i + " " + j + " " + p.a + " " + p.b);
                    }
                } else {
                    ArrayList<Pair> list = new ArrayList<>();
                    hashMap.put(sum, list);
                }
                hashMap.get(sum).add(new Pair(i, j));
            }
        }
    }
}

/*
Runtime: o(n2)
read N2 as n ^2

*/
/*
    Explanation:
    
    a3 + b3 = c3 + d3
    That means a naive approach will  calculate all the values of a , b , c ,d ie 4 for loops

    To make it 3 loops , we can use d = cube root of(a3+b3-c3)

    to make it optimal, we realise that we can find the values of one hand side and store it in hash table and iterate over n to find if
    result or sum already exist or not. If it exist, we can use current values of i and j and also print values which were previously 
    added ie other half of equality sign.

    Here in this code, we need to update hashmap regardless if sum already existed before or not, as we are just 
    printing inside if and not really adding it
  
*/
