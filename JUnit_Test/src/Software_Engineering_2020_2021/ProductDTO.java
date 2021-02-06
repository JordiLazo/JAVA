package Software_Engineering_2020_2021;

import java.math.BigDecimal;

public class ProductDTO {
    private String productID;
    private String description;
    private BigDecimal price;
    String getDescription() {return description;}
    BigDecimal getPrice() {return price;}

    public ProductDTO(String productID, String description, BigDecimal price){

    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    // setters
}
