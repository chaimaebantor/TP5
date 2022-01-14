package ma.education.tp5.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestList
{
    public static void main(String[] args)
    {
        //Q1
        List<Integer> list1=new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(20);
        list1.add(10);
        //Q2
        //boucle classique:
        for (int i=0;i<list1.size();i++)
            {
                Integer e=list1.get(i);
                System.out.println("Element "+i+":" +e);
            }
        // boucle for avancée
        for (Integer e:list1)
        {
            System.out.println("Element "+ e);
        }
        //iterateur
        Iterator<Integer> iter1=list1.iterator();
        while (iter1.hasNext())
        {
            Integer e= iter1.next();
            System.out.println("Element " + e);
        }
        // foreach method
        list1.forEach(i-> System.out.println("Element "+ i));
        // Q4
        List<Integer> list2= Arrays.asList(1,5,6,9,16);
        list2.stream().map(i->i*i).filter(i->i>37).forEach(i-> System.out.println(i));
        // Q5
        List<Integer> list3=new ArrayList<>();
        list3.add(5);
        list3.add(10);
        list3.add(15);
        list3.add(20);
        list3.add(2,10);
        list3.forEach(i-> System.out.println(i));
        // Affichage : 5,10,10,15,20



    }

}
