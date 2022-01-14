package ma.education.tp5.collections;

import java.util.Comparator;

public class CodeComparator implements Comparator<Client> {
    @Override
    public int compare(Client o3, Client o4) {
        return o3.code- o4.code;
    }
}
