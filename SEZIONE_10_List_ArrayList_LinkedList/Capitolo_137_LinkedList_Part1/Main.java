package SEZIONE_10_List_ArrayList_LinkedList.Capitolo_137_LinkedList_Part1;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

 //       LinkedList<String> placeToVisit = new LinkedList<>();

        var placeToVisit = new LinkedList<String>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0,"Canberra");
        System.out.println(placeToVisit);

        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);

        removeElements(placeToVisit);
        System.out.println(placeToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack
        list.push("Alice Springs");

    }

    private static void removeElements (LinkedList<String> list) {

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // remove first
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // remove first
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); //remove last
        System.out.println(s3 + " was removed");

        String p1 = list.poll();
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // remove first
        System.out.println(p4 + " was removed");

    }
}
