package Software_Egineering_2018_19;

public interface ReceiptDB {
    Receipt getReceipt(String receiptID) throws NotRegisteredException;
    void putReceipt(Receipt receipt);
}
