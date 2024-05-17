package interviews;


import java.util.*;
import java.util.stream.Collectors;

public class StreamExampleClass {
    static List<String> list = List.of("one", "two", "three", "four", "five", "five");
    static int[] ints = new int[]{1, 4, 3, 2, 6, 8, 4, 5, 3, 2, 54, 2, 4, 15, 90, 22, 1};
    static List<List<PojoExample>> listOfPojosList = List.of(
            List.of(
                    new PojoExample("Ivan", 35, "developer"),
                    new PojoExample("Bob", 25, "QA")),
            List.of(
                    new PojoExample("Peter", 20, "DevOpsEngineer"),
                    new PojoExample("Sergey", 20, "TechLead"),
                    new PojoExample("Ivan", 35, "developer"),
                    new PojoExample("Bob", 25, "QA")));

    static String string = "";
    static List<PojoExample> pojos = List.of(
            new PojoExample("Ivan", 35, "developer"),
            new PojoExample("Bob", 25, "QA"),
            new PojoExample("Oleg", 50, "ProductManager"),
            new PojoExample("Peter", 20, "DevOpsEngineer"),
            new PojoExample("Sergey", 20, "TechLead"),
            new PojoExample());


    public static void main(String[] args) {
        Worker worker = pojos.stream().filter(p->p.getName().equals("Bob")).findFirst().map(p->new Worker(p.getName(), p.getPosition())).get();
        Map<String,PojoExample> mapOfPojos = pojos.stream().collect(Collectors.toMap(PojoExample::getName, p->p));
        StringJoiner stringJoiner = new StringJoiner(",","start","end");
        stringJoiner.add(mapOfPojos.values().toString());
        System.out.println(stringJoiner);
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("firstString");
        linkedList.add("secondString");
        linkedList.add("thirdString");

    }
}

