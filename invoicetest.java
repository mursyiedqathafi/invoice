public class Invoicetest {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        String partNum;
        String partDescr;
        int Quantity;
        double price;
        
        
        Invoice invoiceone = new Invoice();
        Invoice invoiceTwo = new Invoice();
        
        System.out.println("Invoice1");
        System.out.println("Masukan nomor :   ");
        partNum = scnr.nextLine();
        
        System.out.print("Masukan nomor :   ");
        partDescr = scnr.nextLine();
        
        System.out.print("Masukan nomor :   ");
        quantity = scnr.nextInt();
        
        System.out.println("Masukan nomor :   ");
        price = scnr.nextDouble();
        
        System.out.println("");
        
        
        invoiceOne.setPartNumber(partNum);
        invoiceOne.setDescription(partDescr);
        invoiceOne.setQuantity(quantity);
        invoiceOne.setPricePerItem(price);
        
        System.out.println(" Invoice ");
        System.out.println(" Invoice " + invoiceOne.getPartNumber());
        System.out.println(" description " + invoiceOne.getPartDescription());
        System.out.println(" Quaintity " + invoiceOne.getPartDescription());
        System.out.println(" Invoice " + invoiceOne.getPartDescription());
        System.out.println(" Invoice " + invoiceOne.getPartDescription());
   
    }
}
