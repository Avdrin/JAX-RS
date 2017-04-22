package org.glassfish.jersey.examples.entityfiltering.domain;

import org.glassfish.jersey.examples.entityfiltering.DBDataSources;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;


public final class EntityStore {

    private static Map<Long, ProductPrice> PRODUCT_PRICE = new HashMap<>(); //LinkedHashMap<>();
    private static Map<String, Price> PRICES = new HashMap<>();
    static DBDataSources dbDataSources;

    static {
        ProductPrice project = createProject("Jersey", "Jersey is the open source 2.0",
                345768, LocalDate.of(2017, Month.APRIL, 1), LocalDate.of(2017, Month.APRIL, 14));

//        Price price = new Price(123f);
//        PRICES.put("d", price);
//        PRICES.put("f", new Price(89f));
//        PRICES.put("g", new Price(23f));
//        PRICES.put("n", new Price(78f));

        dbDataSources = new DBDataSources();
        dbDataSources.dropTable();
        dbDataSources.createTable();
        dbDataSources.fillTable();
    }


    public static ProductPrice createProject(String productName, String description, Integer productPrice, LocalDate validFrom, LocalDate validTo) {
        ProductPrice project = new ProductPrice(PRODUCT_PRICE.size() + 1L, productName, description, productPrice, validFrom, validTo);
        PRODUCT_PRICE.put(project.getId(), project);
        return project;
    }

    public static ProductPrice getProject(Long id) {
        return PRODUCT_PRICE.get(id);
    }

    public static List<ProductPrice> getProductPrice() {
        return new ArrayList<>(PRODUCT_PRICE.values());
    }


    public static Price getPrice(String productName, LocalDate date) {
        DBDataSources dbDataSources = new DBDataSources();
        Price price = dbDataSources.getPrice(productName, date);
//        ProductPrice productPrice = PRODUCT_PRICE.get(0L);
//        Price price = new Price("cxvcxc", BigDecimal.valueOf(899987f), LocalDate.of(2017, Month.APRIL, 1),LocalDate.of(2017, Month.APRIL, 2)); //productPrice.getProductPrice());
//
//        PRICES.put("s", price); //productPrice.getProductName(), price);

        return price;
    }

    public static List<Price> getListPrices(String productName) {
        DBDataSources dbDataSources = new DBDataSources();

//        List<ResultSet> priceList =
        List<Price> priceList = dbDataSources.getListPrices(productName);
//        List<Price> priceListResult = new ArrayList<>();
//Map<Integer,Price> mapResult = new HashMap<>();


//        for (int i=1;i<=map.size();i++){
//            Float fh = map.get(i);
//    Price price = new Price(fh);
//    mapResult.put(i,price);
//}
//        for (ResultSet productPrice : priceList) {

        Collections.sort(priceList);

        return priceList; //new ArrayList<>(priceList); //mapResult.values()); //PRICES.values());
    }


    private EntityStore() {

    }
}