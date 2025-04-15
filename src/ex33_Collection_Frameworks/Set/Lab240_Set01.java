package ex33_Collection_Frameworks.Set;

import java.util.LinkedHashSet;
import java.util.*;
import java.util.TreeSet;

public class Lab240_Set01 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("SAI");
        hs.add("SAI");
        hs.add("kumar");
        System.out.println(hs);
    }
}
