import java.util.ArrayList;

/**
 * Created by Mohammed Albarodi on 15/12/2020.
 */
public class ManageProduct {
    private SinglyLinkedList<product>products;


    public ManageProduct() {
        products= new SinglyLinkedList<>();
    }
 public void addProduct(int type,String ID_producer, String name_producer,  double price,String unit)
 {
if(type==1)
    products.addLast(new Canned(ID_producer,name_producer,price,unit));

     else if(type==2)
         products.addLast(new Grain(ID_producer,name_producer,price,unit));

     else if(type==3)
         products.addLast(new Household_items(ID_producer,name_producer,price,unit));

 }
    public String print() {
        String all = "";
        Node<product> i = head;
        while (i != null) {
            all = all + i.getElement().toString() + "\n";
            i = i.next;
        }
        return all;
    }

}
