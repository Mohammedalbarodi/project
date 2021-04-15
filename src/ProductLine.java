/**
 * Created by Mohammed Albarodi on 13/12/2020.
 */
public class ProductLine {
    private product product1;
    private int qantty;
    private double deskaont;
//    private String date_frest;
//    private String date_last;

    public ProductLine(String date_frest, String date_last, int qantty) {
        //this.deskaont = deskaont;
        this.qantty = qantty;

    }

    @Override
    public String toString() {
        return "ProductLine{" +
                "product1=" + product1 +
                ", qantty=" + qantty +
                ", deskaont=" + deskaont +

                '}';
    }

    public ProductLine(product product1, int qantty) {
        this.product1 = product1;
        this.qantty = qantty;
    }
    public double get_total(){
        return qantty*product1.getPrice();
    }

//    public String getDate_frest() {
//        return date_frest;
//    }
//
//    public void setDate_frest(String date_frest) {
//        this.date_frest = date_frest;
//    }
//
//    public String getDate_last() {
//        return date_last;
//    }
//
//    public void setDate_last(String date_last) {
//        this.date_last = date_last;
//    }

    public double getDeskaont() {
        return deskaont;
    }

    public void setDeskaont(double deskaont) {
        this.deskaont = deskaont;
    }

    public int getQantty() {
        return qantty;
    }

    public void setQantty(int qantty) {
        this.qantty = qantty;
    }
}
