package Software_Engineering_2020_2021;

import java.math.BigDecimal;

public class Receipt {
    private ProductDB prodDB;
    private ReceiptPrinter printer;
    public Receipt() { . . . }
    public void setReceiptPrinter(ReceiptPrinter p) {printer = p;}
    public void setProductDB(ProductDB pDB) {prodDB = pDB;}
    public void addLine(String productID, int numUnits) throws IsClosedException, DoesNotExistException { ... }
    public void addTaxes(BigDecimal percent) throws IsClosedException {...}
    public BigDecimal getTotal() { ... }
    BigDecimal getTaxes() { ... }
    void printReceipt() throws DoesNotExistException, IsNotClosedException { ... }
}
