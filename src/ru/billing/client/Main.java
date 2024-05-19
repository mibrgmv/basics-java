package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        ItemCatalog itemCatalog = new ItemCatalog();
        try {
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
        } catch (ItemAlreadyExistsException e) {
            throw new RuntimeException(e);
        }

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
        try {
            loader.load(itemCatalog);
        } catch (CatalogLoadException e) {
            throw new RuntimeException(e);
        }
        itemCatalog.printItems();
    }

    public static void task2() {
        CatalogFileLoader catalogFileLoader = new CatalogFileLoader("/Users/mibrgmv/IdeaProjects/sem4-java/src/ru/billing/client/example.txt");
        ItemCatalog itemCatalog = new ItemCatalog();
        try {
            catalogFileLoader.load(itemCatalog);
        } catch (CatalogLoadException e) {
            throw new RuntimeException(e);
        }

        itemCatalog.printItems();
    }
}
