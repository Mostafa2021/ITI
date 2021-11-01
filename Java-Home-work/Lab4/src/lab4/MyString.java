package lab4;

import java.util.function.BiPredicate;

    public class MyString {
        public static String betterString(String x,String y ,BiPredicate<String,String> p) {
            return p.test(x,y)?x:y;
        }
    
}
