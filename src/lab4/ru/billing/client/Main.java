package lab4.ru.billing.client;

import lab4.ru.billing.stocklist.GenericItem;
import lab4.ru.billing.stocklist.ItemCatalog;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ItemCatalog itemCatalog = new ItemCatalog();
        itemCatalog.addItem(new GenericItem("Apple"));
        itemCatalog.addItem(new GenericItem("Computer"));
        itemCatalog.addItem(new GenericItem("Pen"));
        itemCatalog.addItem(new GenericItem("Boots"));
        itemCatalog.addItem(new GenericItem("Cap"));
        itemCatalog.addItem(new GenericItem("Steak"));
        itemCatalog.addItem(new GenericItem("Egg"));
        itemCatalog.addItem(new GenericItem("Helmet"));
        itemCatalog.addItem(new GenericItem("Hammer"));
        itemCatalog.addItem(new GenericItem("Screw"));

        long begin = new Date().getTime();

        for (int i=0; i<100000; ++i) {
            itemCatalog.findItemByID(10);
        }
        long end = new Date().getTime();
        System.out.println("In HashMap: "+(end-begin));

        begin = new Date().getTime();
        for (int i=0; i<100000; ++i) {
            itemCatalog.findItemByIDAL(10);
        }
        end = new Date().getTime();
        System.out.println("In ArrayList: "+(end-begin));

        CatalogLoader loader = new CatalogStubLoader();
        loader.load(itemCatalog);
        itemCatalog.printItems();
    }
}
