/**
 * Created by Mohammed Albarodi on 13/12/2020.
 */
public class Grain extends product{
    private String qantty_kilo;

    public Grain(String ID_producer, String name_producer, double price,String qantty_kilo) {
        super(ID_producer, name_producer, price);
        this.qantty_kilo=qantty_kilo;
    }

    public String getQantty_kilo() {
        return qantty_kilo;
    }

    public void setQantty_kilo(String qantty_kilo) {
        this.qantty_kilo = qantty_kilo;
    }
}
