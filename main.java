import java.util.*;
public class main{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        for (int i = 0; i < 25; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println("List: " + list);

        Set<Integer> set = new HashSet<Integer>(list);
        System.out.println("Set: " + set);
        System.out.println("Number of unique numbers: " + set.size());

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : set){
            map.put(i, list.indexOf(i));
        }
        System.out.println("Map: " + map);
    }
}
