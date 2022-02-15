package academy.mindswap;

import java.util.*;

public class DupeFinder<E> {

    private Collection<E> collection;

    public DupeFinder(Collection<E> listReceived) {
        this.collection = listReceived;
    }

    public int checkDupes(){
        Set<E> noDuplicates = new HashSet<>(collection);
        return collection.size() - noDuplicates.size();
    }


    public List<E> getDupes() {
        Set<E> noDuplicates = new HashSet<>(collection);
        List<E> copy = new ArrayList<>(collection);
        for (E singleObject: noDuplicates) {
            copy.remove(singleObject);
        }

        return copy;
    }

}
