/**
 * Created by Mohammed Albarodi on 13/12/2020.
 */
public class product {
    private String ID_producer;
    private String name_producer;
    private double price;
    private String unit;

    public product(String ID_producer, String name_producer,  double price, String unit) {
        this.ID_producer = ID_producer;
        this.name_producer = name_producer;
        this.unit=unit;


        this.price = price;
    }

    public product(String ID_producer, String name_producer, double price) {
        this.ID_producer = ID_producer;
        this.name_producer = name_producer;
        this.price = price;
    }

    public String getID_producer() {
        return ID_producer;
    }

    public void setID_producer(String ID_producer) {
        this.ID_producer = ID_producer;
    }

    public String getName_producer() {
        return name_producer;
    }

    public void setName_producer(String name_producer) {
        this.name_producer = name_producer;
    }

    @Override
    public String toString() {
        return  ID_producer
                + name_producer  +
                price
                ;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   public void format(){
        System.out.print(ID_producer+"\t\t\t"+name_producer+"\t\t\t"+price+"\t\t\t"+unit+"\n");
    }

}
