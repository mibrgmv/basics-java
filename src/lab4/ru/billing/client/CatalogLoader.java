package lab4.ru.billing.client;

import lab4.ru.billing.exceptions.CatalogLoadException;
import lab4.ru.billing.stocklist.ItemCatalog;

public interface CatalogLoader {

    void load(ItemCatalog cat) throws CatalogLoadException;
}
