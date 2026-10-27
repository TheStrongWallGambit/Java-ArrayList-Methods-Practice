import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ArrayList<String>s = new ArrayList;
        s.add("Apple");
        s.add("Banana");
        s.add(1,"Cherry");
        System.out.println(s+ "size=" + s.size());
        System.out.println(s.get(0));
        System.out.println(s.set(0), "Avocado" +"=>"+s);
        System.out.println(s.remove(2), "=>"+s);
        s.addAll(ArrayList.asList("Date", "Avocado"));
        System.out.println(s + " " + s.contains("Date") + " " + s.indexOf("Avocado")  + " " + s.lastIndexOf("Avocado"));
        s.remove("Date");
        System.out.println(s);

        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(5, 2, 9, 1));
        n.sort(null);
        System.out.println(n + " " + n.subList(0, 2)+ " " + Arrays.toString(n.toArray()))

        ArrayList<Boolean> b = new ArrayList<>();
        b.add(true);
        System.out.println(b.isEmpty());
        b.clear();
        System.out.println(b + " " + b.isEmpty());


    }
}

