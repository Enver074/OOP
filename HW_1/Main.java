public class Main {
    private static void ShowProducts(Product[] all){
        for (Product product : all) {
            System.out.println(product);
            System.out.println("----");
        }
    }
    public static void main(String[] args) {
        Product milk = new Milk("Простоквашино", 60, 6, "Литр", "2", "6 месяцев" );
        Product limonade = new Drink("Sprite", 56, 12, "Литр", 2);
        Product bread = new Bread("Бородинский", 45, 1, "шт", "1 сорт", "3 дня");
        Product eggs = new Eggs("Тридевятое", 82, 10, "шт", "3 нед", 10);
        Product masks = new Masks("Чистая линия", 455, 12, "шт", 12);
        Product pappare = new ToiletPaper("Zeva", 275, 12, "шт", 12, 2);
        Product diapers = new Diapers("Gool", 1112, 56, "шт.", 2, "да", 12, 5, 7, "Дышаший");
        Product nipple = new Nipple("Соска", 134, 1, "шт.", 1, "да");

        Product[] all = new Product[] {milk, limonade, bread, eggs, masks, pappare, diapers, nipple};

        ShowProducts(all);
    }

}