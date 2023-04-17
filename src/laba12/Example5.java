package laba12;

/*Напишите функцию, которая принимает на вход список строк и возвращает новый список,
содержащий только те строки, которые содержат заданную подстроку.*/

import java.util.*;

public class Example5{

        public static void main(String[] args)
        {
            Map<String, Integer> unique = new LinkedHashMap<String, Integer>();
            for (String string : "House, House, House, Dog, Dog, Dog, Dog".split(", ")) {
                if(unique.get(string) == null)
                    unique.put(string, 1);
                else
                    unique.put(string, unique.get(string) + 1);
            }
            String uniqueString = join(unique.keySet(), ", ");
            List<Integer> value = new ArrayList<Integer>(unique.values());

            System.out.println("Output = " + uniqueString);
            System.out.println("Values = " + value);
        }

        public static String join(Collection<String> s, String delimiter) {
            StringBuffer buffer = new StringBuffer();
            Iterator<String> iter = s.iterator();
            while (iter.hasNext()) {
                buffer.append(iter.next());
                if (iter.hasNext()) {
                    buffer.append(delimiter);
                }
            }
            return buffer.toString();
        }
}
