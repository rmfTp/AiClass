package exam01;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Ex02{
    public static void main(String[] args) throws Exception {
        Class<Ex01> cls = Ex01.class;
        MyAnno myAnno = cls.getAnnotation(MyAnno.class);
        int min = myAnno.min();
        int[] max = myAnno.max();
        System.out.println(min + " " + Arrays.toString(max));

        Constructor<Ex01> con = cls.getDeclaredConstructor(new Class[]{});
        MyAnno myAnno2 = cls.getAnnotation(MyAnno.class);
        int min2 = myAnno2.min();
        int[] max2 = myAnno2.max();
        String value = myAnno2.value();
        System.out.println(min2 + " " + Arrays.toString(max2)+""+value);
    }
}
