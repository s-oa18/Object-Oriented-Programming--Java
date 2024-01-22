public class Book {

    private String title;
    private String author;
    private String ISDN;
    private double price;
    private double discount;
    private int editionNo;

    public Book(String title, String author, String ISDN, double price, double discount, int editionNo) {
        this.title = title;
        this.author = author;
        this.ISDN = ISDN;
        this.price = price;
        this.discount = discount;
        this.editionNo = editionNo;
    }

    public void setTtitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setISDN(String ISDN) {
        this.ISDN = ISDN;
    }

    public void setEditionNo(int editionNo) {
        this.editionNo = editionNo;
    }

    public void setDiscount(double discountRate) {
        this.discount += discountRate;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public String getISDN() {
        return this.ISDN;
    }

    public double getEditionNo() {
        return this.editionNo;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void changePrice(double discountRate) {
        double discountValue = this.discount * discountRate;
        this.discount += discountValue;
    }

    public void increaseEditionNo() {
        this.editionNo++;
    }

    public void decreaseEditionNo() {
        this.editionNo--;
    }

    public String toString() {

        String st = "\n";
        st += "Book title: ";
        st += this.title;

        st += " - Author: ";
        st += this.author;
        st += "\n";

        st += "ISDN: ";
        st += this.ISDN;
        st += " - Edition Number: ";
        st += this.editionNo;
        st += "\n";

        st += "Full Price: ";
        st += this.price;

        st += " - Discount: ";
        st += this.discount + "%";

        st += " - Retail Price: ";
        double retailPrice = this.price - (this.price * discount / 100);
        st += retailPrice;
        st += "\n";

        return st;
    }



    public static void main(String [] args){

        Book myBook = new Book("Java All-in-One For Dummies",
            "Doug Lowe", "1119986648", 34.99, 21,7);
        System.out.println(myBook);

    }

    
}