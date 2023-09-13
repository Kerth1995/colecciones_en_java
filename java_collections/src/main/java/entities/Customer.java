package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Customer {

    public static void main(String[] args) {
        List<String> demos = new ArrayList<>();
        demos.add("mama");
        demos.add("papa");
        demos.add("aurora");
        demos.add("becerra");

        //Object data = Collections.sort(demos);
        Collections.sort(demos);
        System.out.println(demos);
    }
}
