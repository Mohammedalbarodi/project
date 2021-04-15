import java.util.ArrayList;

/**
 * Created by Mohammed Albarodi on 13/12/2020.
 */
public class purchasee {
    private SinglyLinkedList<ProductLine>prodachine1;

    private String saplair;

    public purchasee(String saplair) {
        this.saplair = saplair;
        prodachine1 = new SinglyLinkedList<>();
    }
    public void addProduct(product p,int quantity)
    {
        ProductLine pl=new ProductLine(p,quantity);
        prodachine1.add(pl);
    }

    @Override
    public String toString() {
        return "purchasee{" +

                ", prodachine1=" + prodachine1 +
                ", saplair='" + saplair + '\'' +

                '}';
    }
    public double getAmontdeow(){
        double sum=0;
        for (ProductLine x:prodachine1
             ) {sum+=x.get_total();

        }
        return sum;
    }
//    public purchasee(String ID_producer, String name_producer, double price, String date_frest, String date_last, int qantty) {
//
//     product1=new product(ID_producer,name_producer,price);
//
//        prodachine1=new ProductLine( date_frest,date_last,qantty);
//    }


//    public ProductLine getProdachine1() {
//        return prodachine1;
//    }
//
//    public void setProdachine1(ProductLine prodachine1) {
//        this.prodachine1 = prodachine1;
//    }










//    public static void main(String[] args) {
//        purchasee x=new purchasee("656","milk",150,"11/11/2018","4/5/2021",50);
//        Management q=new Management(x);
//        q.add(x);
//     q.format_purchasee();
//    }



}




