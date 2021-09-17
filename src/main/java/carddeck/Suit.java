package carddeck;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Set;
import java.util.TreeSet;

public class Suit implements Comparable<Suit> {

    public static final Suit HEARTS = new Suit("hearts", 1);
    public static final Suit CLUBS = new Suit("clubs", 1);
    public static final Suit DIAMONDS = new Suit("diamonds", 1);
    public static final Suit SPADES = new Suit("spades", 1);

    private final String name;
    private final int ordinal;

    public Suit(String name, int ordinal) {
            this.name = name;
            this.ordinal = ordinal;
    }

    public int ordinal() {


        @Override
        public int compareTo (Suit o){
            return 0;
        }
        {
            return ordinal;
        }
        public String toString () {
            return name;
        }
        @Override
        public int ordinal () {
            return ordinal;
        }
    }
}
    public static Set<Suit> values() {
        Set<Suit> set = new TreeSet<>();

        Field[] fields = Suit.class.getFields();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                try {
                    set.add((Suit) field.get(null));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return set;
    }

    @Override
    public int compareTo(Suit o) {
        if (this.ordinal > that.ordinal) {
            return 1;
        }
        else if (this.ordinal < that.ordinal) {
            return -1;
        }
        else {
            return 0;
        }

    }

