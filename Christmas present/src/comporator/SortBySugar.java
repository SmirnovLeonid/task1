package comporator;

import java.util.Comparator;

/**
 * Sort by sugar
 */
public class SortBySugar implements Comparator<entity.Sweets> {

    public int compare(entity.Sweets o1, entity.Sweets o2) {

        double f1 = o1.getSugar();
        double f2 = o2.getSugar();

        if (f1 > f2){
            return 1;
        }
        else if (f1 < f2){
            return -1;
        }
        else return 0;
    }
}
