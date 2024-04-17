package SEZIONE_10_List_ArrayList_LinkedList.Capitolo_140_LinkedList_Challenge;


import java.util.LinkedList;

record Place (String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {

    public static void main(String[] args) {

        LinkedList<Place> placeToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placeToVisit, adelaide);
        addPlace(placeToVisit, new Place("adelaide", 1374));
        addPlace(placeToVisit, new Place("Brisbane", 917));
        addPlace(placeToVisit, new Place("Perth", 3923));
        addPlace(placeToVisit, new Place("Alice Springs", 2771));
        addPlace(placeToVisit, new Place("Darwin", 3972));
        addPlace(placeToVisit, new Place("Melbourne", 877));

        placeToVisit.addFirst(new Place("Sydney",0));

        System.out.println(placeToVisit);
    }

    private static void addPlace(LinkedList<Place> list, Place place) {

        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p : list ) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: "+ place);
                return;
            }
         }

        int matchIndex = 0;
        for (var listPlace: list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchIndex,place);
                return;
            }
            matchIndex++;
        }

        list.add(place);
    }
}

