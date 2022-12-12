public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket(100);
        vasyaBasket.add("Молоко", 1.89);
        vasyaBasket.add("Батон", 0.99);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Масло подсолнечное", 2.83);
        petyaBasket.add("Десяток яиц", 2.98, 2);

        Basket olgaBasket = new Basket();

        olgaBasket.add("Стол", 500, 2);
        olgaBasket.add("Ваза мексиканская", 829.99);

        vasyaBasket.print("Корзина Василия: ");
        petyaBasket.print("Корзина Петра: ");
        olgaBasket.print("Корзина Ольги: ");


    }
}
