/*
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class ArraylistMethods {

    @Test
    public void CollectionRemoveAllMethod()
    {
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "A", "D", "A"));

        System.out.println(alphabets);

        */
/* this method removes all the occurances of letter A  *//*

        alphabets.removeAll(Collections.singleton("A"));

        */
/* this method removes the element at the given index  *//*

        alphabets.remove(2);
        System.out.println(alphabets);
    }

    @Test// this method takes a prediacte as an argument
    public void methodremoveIf(){

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Predicate<Integer> integerPredicate = p -> p%2==0;
        numbers.removeIf(integerPredicate);
        System.out.println(numbers);

    }

    @Test
    public void methodRetailAll(){
        ArrayList<String> listStrings = new ArrayList<>(Arrays.asList("Fat", "Buddy", "Sticky", "hello", "how", "Are", "Buddy","alex","dough","gary","alex","harry","brian","charles"));

        ArrayList<String> commonElements = new ArrayList<>(Arrays.asList("Fat","Buddy","Sticky","hello","alex"));
        listStrings.retainAll(commonElements);
        System.out.println(listStrings);
    }



}


*/
