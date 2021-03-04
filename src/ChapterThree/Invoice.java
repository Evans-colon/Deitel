package ChapterThree;

public class Invoice {
    private String invoiceNumber;
    private String description;
    private int quantity;
    private double price;


    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int initialQuantity) {
        quantity = initialQuantity;
    }

    public void setInvoiceNumber(String newNumber) {
        invoiceNumber = newNumber;
    }

    public void InvoiceAmount(double invoiceAmount) {
        if (invoiceAmount > 0)
            price = quantity * price;
    }
        public double getPrice() {
            return price;
        }
        //public Invoice(String newNumber, String description, int initialQuantity, double initialPrice){
        //  invoiceNumber = newNumber;
        //quantity = initialQuantity;
        //price = initialPrice;
        //invoiceAmount = invoiceAmount;

    }
