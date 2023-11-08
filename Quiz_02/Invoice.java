package Quiz_02;

public class Invoice {
    String partNumber = "G272Qpf-27";
    String description = "MSI 2K IPS Monitor";
    int quantity = 2;

    double price = 244.99;

    public double getInvoiceAmount(){
        double sum;
        sum = quantity*price;
        return sum;
    }
    public void printDetails(){
        System.out.println("Part Number:"+partNumber );
        System.out.println("Product Description:"+description);
        System.out.println("Product Quantity:"+quantity);
        System.out.println("Unit Price:"+price);
        System.out.println("Total Price:"+getInvoiceAmount());
    }


    public static void main(String[] args) {
        Invoice i = new Invoice();
        i.printDetails();

    }

}
