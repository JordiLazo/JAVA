package Software_Engineering_2020_2021;

public interface ProductDB {
    public ProductDTO getProduct(String productID) throws DoesNotExistException;
}
