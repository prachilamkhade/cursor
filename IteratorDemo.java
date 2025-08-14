import java.util.*;
public class IteratorDemo{
    public static void main(String [] args){
       Vector <String> v=new Vector<>();
       v.addElement("a");
       v.addElement("b");
       v.addElement("c");
       v.addElement("d");

    Iterator <String> itr=v.iterator ();
       while(itr.hasNext()){
        System.out.println(itr.next());
        if(itr.next()=="c"){
            itr.remove();
            //System.out.println(itr);
        }
       }

    }
}