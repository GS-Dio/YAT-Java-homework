package Lesson2_task;

public class InvoiceItem {
    public String id;
    public String desc;
    public int qty;
    public double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setQty(int gty) {
        this.qty = gty;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return unitPrice * qty;
    }
    public String toString(){
        return "InvoiceItem ["+
                "id " + id +
                "desc " + desc +
                "qty " + qty +
                "unitPrice" + unitPrice +
                "getTotal" + getTotal();
    }
}

