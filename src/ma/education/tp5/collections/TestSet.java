package ma.education.tp5.collections;
import java.io.File;
import netscape.javascript.JSUtil;

import java.util.*;

public class TestSet {
    public static void main(String[] args)
    {
        //Q6

        Set<String> set1=new HashSet<String>();
        set1.add("ABC1");
        set1.add("ABC2");
        set1.add("ABC3");
        set1.add("ABC1");
        set1.add("ABC4");
        set1.add("ABC5");
        set1.forEach(i-> System.out.println(i));
        //affichage ABC1,ABC4,ABC5,ABC2,ABC3

       //Q9
        Set<Client> set2 =new HashSet<Client>();
        set2.add(new Client(1,"chaimae"));
        set2.add(new Client(1,"chaimae"));
        set2.add(new Client(3,"sara"));
        set2.forEach(i-> System.out.println(i));


        //Q10 Affichage
        // Client{code=1, name='chaimae'}
        //Client{code=3, name='sara'}
        // Client{code=1, name='chaimae'}

        //Q12
        Set<Integer> set3=new TreeSet<>();
        set3.add(22);
        set3.add(11);
        set3.add(15);
        set3.add(9);
        set3.forEach(i-> System.out.println(i));

        //Q14
        Set<Client> set4=new TreeSet<>();
        set4.add(new Client(1,"kawtar"));
        set4.add(new Client(3,"sara"));
        set4.add(new Client(2,"chaimae"));
        set4.forEach(i-> System.out.println(i));
        //Q17
       Comparator<Client> clt =new NameComparator();
        Set<Client> set5=new TreeSet<>(clt);
        set5.add(new Client(1,"akawtar"));
        set5.add(new Client(3,"bsara"));
        set5.add(new Client(2,"chaimae"));
        set5.forEach(i-> System.out.println(i));
        //Q18
        Comparator<Client> ct =new CodeComparator();
        Set<Client> set6=new TreeSet<>(ct);
        set6.add(new Client(1,"akawtar"));
        set6.add(new Client(3,"bsara"));
        set6.add(new Client(2,"chaimae"));
        set6.forEach(i-> System.out.println(i));
        //Q20 without the creation of codeComparator class
      Set<Client> set7 = new TreeSet<>((c1,c2) -> c1.code-c2.code);
      set7.add(new Client(1,"ccc"));
      set7.add(new Client(3,"bbb"));
      set7.add(new Client(2,"aaa"));
      set7.forEach(i-> System.out.println(i));
        //Q21
        Set<Client> set8 = new TreeSet<>((o1,o2)->(o1.name.compareToIgnoreCase(o2.name)));
        set8.add(new Client(1,"ccc1"));
        set8.add(new Client(3,"bbb"));
        set8.add(new Client(2,"aaa"));
        set8.forEach(i-> System.out.println(i));



    }




}
