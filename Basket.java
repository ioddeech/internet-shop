public class Basket {
    public String items = "";
    public double totalPrice = 0;
    private int limit;

    public Basket() {
        items = "Список товаров корзины: " + "\n";
        limit = 1000011001;
    }
    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
    public void add(String name, double price) {
        add(name, price, 1);
    }

    public void add(String name, double price, int count) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + count * price >= limit) {
            return;
        }
        items = items + name + " - " +
                count + " шт. - " + price + " руб." + "\n";
        totalPrice = totalPrice + price * count;
    }

    public boolean contains (String name) {
        return items.contains(name);
    }

    private void clear() {
        items = "";
        totalPrice = 0;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина очищена.");
        } else {
            System.out.println(items);
            printTotalPrice();
        }
    }

    public void printTotalPrice() {
        System.out.println("Общая стоимость корзины равна: " + totalPrice + " руб.");
    }
}
