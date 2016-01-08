import java.util.ArrayList;
import java.util.List;

/**
 * Day 1 SDP
 * Jan 5, 2015
 */

public interface Sortable <A extends Comparable<A>> extends Iterable<A>{
    default List<A> sort(){
        List<A> list = new ArrayList();
        for( A elements : this)
            list.add(elements);
        list.sort((first,second) -> first.compareTo(second));
        return list;
    }
}
