package ma.education.tp5.collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        return o2.name.compareToIgnoreCase(o1.name);
    }
}
