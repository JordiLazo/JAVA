package Problem_3;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Receipt {
    private boolean CLOSED_FLAG;
    BigDecimal subtotal = new BigDecimal(0);
    BigDecimal taxes = new BigDecimal(0);

    public void addLine(BigDecimal pricePerUnit, int numUnits) throws IsClosedException {
        if (this.CLOSED_FLAG){
            throw new IsClosedException("Error, the ");
        }
        BigDecimal total = pricePerUnit.multiply(new BigDecimal(numUnits));
        this.subtotal = this.subtotal.add(total);
    }
    public void addTaxes(BigDecimal percent) throws IsClosedException {
        if (this.CLOSED_FLAG){
            throw new IsClosedException("Error");
        }
        this.taxes = (this.subtotal.multiply(percent)).divide(new BigDecimal(100),2, RoundingMode.DOWN);
    }
    public BigDecimal getTotal(){
        this.CLOSED_FLAG = true;
        return this.subtotal.add(this.taxes);
    }

    public static void main(String[] args) throws IsClosedException {
        Receipt ticket = new Receipt();
        ticket.addLine(new BigDecimal(50),1);
        ticket.addLine(new BigDecimal(50),1);
        ticket.addTaxes(new BigDecimal(21));
        System.out.println("subtotal: "+ticket.subtotal);
        System.out.println("taxes: "+ticket.taxes);
        System.out.println("total: "+ticket.getTotal());
        ticket.addLine(new BigDecimal(50),1);
    }
}
