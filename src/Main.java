//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ItemFactory itemFactory = ItemFactory.getInstance();

        //ItemFactory anotherItemFactory = ItemFactory.getInstance();

        Shop shop = new Shop();

        shop.addItem(itemFactory.createItem(1));
        shop.addItem(itemFactory.createItem(2));
        shop.addItem(itemFactory.createItem(3));

        System.out.println("el precio final de mi carrito es " + shop.calculatePrice());

    }
}