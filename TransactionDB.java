import java.util.ArrayList;

public class TransactionDB
{
    private ArrayList<Transaction> list = new ArrayList<>();
    private int end;
    private double total;
    
    public TransactionDB()
    {
        end = 0;
    }
    
    public void add(Transaction newTr)
    {
        list.add(newTr);
        end += 1;
    }
    
    @Override
    public String toString()
    {
        StringBuilder goku = new StringBuilder();
        
        for(int n = 0; n < (end); n += 1)
        {
            goku.append(list.get(n)).append("\n");
        }
        
        return goku.toString();
    }
    
    public double totalCost()
    {
        total = 0;
        for(Transaction shmoovement : list)
        {
            total += shmoovement.getSales();
        }
        return total;
    }
    
    public void printTrInDuration(int startYear, int endYear)
    {
        for(Transaction shmoovement : list)
        {
            if(shmoovement.getYear() >= startYear && shmoovement.getYear() <= endYear)
            {
                System.out.println(shmoovement);
            }
        }
    }
}
