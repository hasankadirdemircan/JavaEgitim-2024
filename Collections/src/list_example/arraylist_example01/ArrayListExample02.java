package list_example.arraylist_example01;

import java.util.ArrayList;

public class ArrayListExample02 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("galip");
        nameList.add("ferit");
        nameList.add("burak");
        nameList.add("eray");
        nameList.add("ali");
        nameList.add("yaren");
        System.out.println(nameList.size());
        System.out.println("List: " + nameList);

        System.out.println("contains: " + nameList.contains("era"));
        System.out.println("contains: " + nameList.contains("eray"));
        for(String name: nameList) {
            System.out.println(name);
        }

        nameList.remove("galip");
        nameList.remove(1);
        System.out.println("----after remove----");
        for(String name: nameList) {
            System.out.println(name);
        }
        System.out.println(nameList.isEmpty());
        System.out.println(nameList.size());

        Object[] nameArray = nameList.toArray();
        String name = (String) nameArray[0];
        nameList.clear();
        //nameList.removeAll(nameList);
        System.out.println("-----after removeAll----");
        System.out.println(nameList.isEmpty());
        System.out.println(nameList.size());
    }
}
