package uz.junior.javamailsender.appuser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Exp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(Dar.RU.name());
        list.add(Dar.US.name());

        Set<String> singleton = Collections.singleton(list.get(1));

        System.out.println(singleton);


    }

    public enum Dar{
        US,
        RU,
        UZ
    }
}
