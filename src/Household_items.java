/**
 * Created by Mohammed Albarodi on 13/12/2020.
 */
public class Household_items extends product{
    private String qantty_plot;
    public Household_items(String ID_producer, String name_producer, double price,String qantty_plot) {
        super(ID_producer, name_producer, price);
        this.qantty_plot=qantty_plot;
    }

    public String getQantty_plot() {
        return qantty_plot;
    }

    public void setQantty_plot(String qantty_plot) {
        this.qantty_plot = qantty_plot;
    }
}
