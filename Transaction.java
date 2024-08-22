
public class Transaction
{
    private String pieceName;
    private Collector seller;
    private Collector buyer;
    private double sales;
    private int year;

    public Transaction(String pieceName, Collector seller, Collector buyer, double sales, int year)
    {
        this.pieceName = pieceName;
        this.seller = seller;
        this.buyer = buyer;
        this.sales = sales;
        this.year = year;
    }
    
    @Override
    public String toString()
    {
        return "[ " + pieceName + " sold by " + seller + " to " + buyer + " for $" + sales + " in " + year + "] " ;
    }
    
    public double getSales()
    {
        return sales;
    }
    
    public int getYear()
    {
        return year;
    }
}
