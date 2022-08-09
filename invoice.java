public class Invoice {
    private String partNumber;
    private String partDesciption;
    private int quantity;
    private double pricePerItem;
    private final String partDescription;
    
    
 // Constructor
    public Invoice() {
        partNumber = "None";
        partDescription = "None";
        quantity = 0;
        pricePerItem = 0.0;
        
    }
    
    
    public String getPartNumber() {
        return partNumber;
    }
    
    public String getPartDescription() {
        return partDescription;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getPricePerItem() {
        return pricePerItem;
    }
    
    
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    
    
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
    
    
}
