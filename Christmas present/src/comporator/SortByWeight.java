package comporator;

import java.util.Comparator;

/**
 *  Sorting by weight
 */
public class SortByWeight implements Comparator<entity.Sweets> {

    public int compare(entity.Sweets o1, entity.Sweets o2) {
        double f1 = o1.getWeight();
        double f2 = o2.getWeight();

        if (f1 > f2){
            return 1;
        }
        else if (f1 < f2){
            return -1;
        }
        else return 0;
    }
}
