public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket(100);
        vasyaBasket.add("Молоко", 1.89);
        vasyaBasket.add("Батон", 0.99);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Масло подсолнечное", 2.83);
        petyaBasket.add("Десяток яиц", 2.98);

        Basket olgaBasket = new Basket("Стол", 5000);

        vasyaBasket.print("Корзина Василия: ");
        petyaBasket.print("Корзина Петра: ");
        olgaBasket.print("Корзина Ольги: ");
    }
}
