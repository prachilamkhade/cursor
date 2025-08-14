
import java.util.*;
public class EnumeratorDemo{
    public static void main(String [] args){
        Vector<Integer> v=new Vector<>();
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println(v);

        Enumeration<Integer> ev=v.elements();
        
        while(ev.hasMoreElements()){
            System.out.println(ev.nextElement());
                
        
        }

    }
}