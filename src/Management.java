import java.util.ArrayList;

/**
 * Created by Mohammed Albarodi on 13/12/2020.
 */
public class Management {
    private SinglyLinkedList<Canned>canned1;
    private SinglyLinkedList<purchasee>purchasee1;
    private SinglyLinkedList<sale>sale1;
    private SinglyLinkedList<Grain>grain1;
    private SinglyLinkedList<Household_items>householld_Items1;

    private purchasee po;
    private product product11;
    //private ProductLine ss;

    public product getProduct11() {
        return product11;
    }

    public void setProduct11(product product11) {
        this.product11 = product11;
    }

 //  public void setPurchasee1(ArrayList<purchasee> purchasee1) {
//        this.purchasee1 = purchasee1;
//    }

    public Management() {

    }

    public Management(purchasee sa){

    }
    public Management(sale sa){
        sale1=new SinglyLinkedList<>();


    }

//    public void enquiry (sale s,int x){
//        for (int i=0;i<purchasee1.size();i++){
//            if (s.equals(purchasee1.get(i).getProduct1().getID_producer())) {
//                int z=purchasee1.get(i).getProdachine1().getQantty()-x;
//              purchasee1.set(i,purchasee1.get(i).getProdachine1().setQantty(z));
////
//
//            }          }}

    public ArrayList<purchasee> getPurchasee1() {
        return purchasee1;
    }

    public ArrayList<sale> getSale1() {
        return sale1;
    }

    public void add(purchasee sal) {
       // purchasee1=new ArrayList<>();
        purchasee1. addLast(sal);
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

//    public void format_sale() {
//        System.out.println(" ID\t\t\t"+ "name\t\t\t"+ "prise\t\t\t"+  "qantty\t\t\t"+ "\n");
//        for (sale i :sale1)
//            i.format();
//        System.out.println();
//
//    }
}
