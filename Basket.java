public class Basket {
    public String items = "";
    public double totalPrice = 0;
    public int totalCount = 0;
    private int limit;

    public Basket() {
        items = "Список товаров корзины: ";
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
        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб.";
        totalPrice = totalPrice + price * count;
        totalCount = totalCount + count;
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
            System.out.println("Общая стоимость корзины равна: " +
                    getTotalPrice() + " руб.");
            System.out.println("Общее количество товаров в корзине равно: " +
                    getTotalCount() + " шт." + "\n");
        }
    }

    public int getTotalCount(){
        return totalCount;
    }
}
