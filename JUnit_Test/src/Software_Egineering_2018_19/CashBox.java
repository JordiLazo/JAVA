package Software_Egineering_2018_19;

public interface CashBox {
    void extractCash(double quant) throws NotEnoughMoneyException;
    double getCash();
}
