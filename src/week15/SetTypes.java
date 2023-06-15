package week15;

import java.util.*;

public class SetTypes {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("Zepra");
        set1.add("java");
        set1.add("8");
        set1.add("!Hello");
        set1.add(null);
        set1.add("java");
        set1.add("! hi");
        System.out.println(set1);



        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Zepra");
        set2.add("java");
        set2.add("8");
        set2.add("!Hello");
        set2.add(null);
        set2.add("java");
        set2.add("! hi");
        System.out.println(set2);




        Set<String> set3 = new TreeSet<>();
        set3.add("Zepra");
        set3.add("java");
        set3.add("8");
        set3.add("!Hello");
        //set3.add(null); // null not allowed in set tree
        set3.add("java");
        set3.add("! hi");
        System.out.println(set3);

        String str = "AAABBBBBCCCCDDDDEEFFFFFF";

        System.out.println(new LinkedHashSet<>(Arrays.asList(str.split("").toString().replace(", ","").replace("[","").replace("]",""))));

        Set<String> tabs = new HashSet<>();

        tabs.add("INU01");
        tabs.add("UBNUWBI");
        tabs.add("NIEJ3");

        for(String each : tabs){

        }

    }
}
