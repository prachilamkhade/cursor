import java.util.*;
public class ListIteratorDemo{
    public static void main(String [] args){

        List <String> list=new ArrayList<>(Arrays.asList("A","A","A"));
        
        ListIterator <String> lit=list.listIterator();

        while(lit.hasNext()){
            System.out.println(lit.next());

        }
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }
    }
}