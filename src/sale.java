/**
 * Created by Mohammed Albarodi on 13/12/2020.
 */
public class sale {
    private String id;
    private int qn;
    private product pro_sel;


    public sale(String id) {
        this.id = id;
        this.qn=qn;

    }
    public void format() {
        pro_sel.format();

    }
    public static void main(String[] args) {
        sale c=new sale("656");
Management f=new Management(c);
      //  f.enquiry(c,5);

        f.format_purchasee();

    }

}
