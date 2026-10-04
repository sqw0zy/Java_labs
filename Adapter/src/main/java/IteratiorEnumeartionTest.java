import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class IteratiorEnumeartionTest {
    public static void main(String[] args) {
        //Vector<String> collection = new Vector<String>();
        ArrayList<Integer> col = new ArrayList<Integer>();

        col.add(1);
        col.add(2);
        col.add(3);

        Iterator<Integer> iter = col.iterator();
        IteratorEnumeration itEnumeration = new IteratorEnumeration(iter);

        while (itEnumeration.hasMoreElements()) {
            IO.println(itEnumeration.nextElement());
        }

        IO.println();

        Vector<String> names = new Vector<String>();
        names.add("Justin");
        names.add("Kirill");
        names.add("Albert");

        EnumerationIterator enIterator = new EnumerationIterator(names.elements());

        while (enIterator.hasNext()) {
            IO.println(enIterator.next());
        }
    }
}
