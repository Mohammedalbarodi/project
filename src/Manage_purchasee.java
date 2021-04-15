import java.util.ArrayList;

/**
 * Created by Mohammed Albarodi on 15/12/2020.
 */
public class Manage_purchasee {
    SinglyLinkedList<purchasee> purchasee1;


    public Manage_purchasee() {
        purchasee1=new SinglyLinkedList<>();
    }

    public void add_purchasee_prodact(String s, product p, int q){
        purchasee proh1=new purchasee(s);
         proh1.addProduct(p,q);

        purchasee1. addLast(proh1);

    }
    public E removeFirst() {
        if (isEmpty()) return null;
        E deleted = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return deleted;
    }
    public String print() {
        String all = "";
        Node<purchasee> i = head;
        while (i != null) {
            all = all + i.getElement().toString() + "\n";
            i = i.next;
        }
        return all;
    }



}
