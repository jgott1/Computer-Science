public class Inventory {
    private String itemName;
    private int quantity;
    private int price;

    public Inventory(String itemName, int quantity, int price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Item: " + itemName + ", Quantity: " + quantity + ", Price: $" + price;
    }

    public boolean equals(Inventory otherInventory) {
        if (this.itemName.equals(otherInventory.itemName)
            && this.quantity == otherInventory.quantity
            && this.price == otherInventory.price) {
                return true;
            } else {
            return false;
        }
    }

    public void raisePrice(double percentage) {
        double price = this.price / (percentage / 100);
    }


}
