package Software_Egineering_2018_19;

import java.util.ArrayList;
import java.util.HashMap;

public class Receipt {
    public String receiptID;
    public double total;
    public double aftertotal;
    HashMap<String, Integer> line = new HashMap<>();
    HashMap<String, Integer[]> line2 = new HashMap<>();

    public Receipt(){
    }

    public String getReceiptID(){
        return receiptID;
    }

    public void addLine(String productID, int numUnits) throws DoesNotExistProductException{
        line.put(productID,numUnits);
    }

    public void setTotal(double total){
        total += (total * 0.21);
    }

    public double getTotal(){
        return total;
    }

    public int getLine(String productID, int numUnitsToReturn) throws IncorrectReceiptLineException{
        int totalUnits = line.get(productID);
        if(totalUnits > numUnitsToReturn ){
            return totalUnits;
        }else {
            throw new IncorrectReceiptLineException("Error");
        }
    }

    public void addReturnLine(String productID, int numUnitsToReturn, int pricePerUnit){
        line2.put(productID,new Integer[]{numUnitsToReturn,pricePerUnit});
    }

    public void setReturnTotal(double ptotal){
        total = total + ptotal;
        aftertotal += (total*0.21);
    }

    public double getReturnTotal(){
        return total;
    }

    public void setTotalAfterReturn(){
        total = total - aftertotal;
    }

    public static void main(String[] args) throws DoesNotExistProductException {
        Receipt a = new Receipt();

        a.addLine("Hola",12);

        System.out.println(a);


    }
}
