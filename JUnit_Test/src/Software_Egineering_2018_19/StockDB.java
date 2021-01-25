package Software_Egineering_2018_19;

public interface StockDB {
    int getProductStock(String productID) throws DoesNotExistProductException;
    void updateProductStock(String productID, int quant) throws DoesNotExistProductException;
}
