import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Main
{

    public static List<String> getRandomElement(List<String> list, int totalItems)
    {
        Random rand = new Random();

        List<String> newList = new ArrayList<>();
        for (int i = 0; i < totalItems; i++) {

            int randomIndex = rand.nextInt(list.size());
            newList.add(list.get(randomIndex));
            list.remove(randomIndex);
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Simona Rosu");
        list.add("Cosmin Muntean");
        list.add("Alina Mesesan");
        list.add("Remus Dranca");
        list.add("Raul Bucata");
        list.add("Bogdan Crisan");
        list.add("Daniel Cojocaru");
        list.add("Kiss Zsolt");
        list.add("Cristina Cotetiu");

        int numberOfElements = 4;

        System.out.println(getRandomElement(list, numberOfElements));

    }

}