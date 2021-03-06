package com.codecool.shop.model;

import com.codecool.shop.dao.ProductCategoryDao;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.dao.SupplierDao;
import com.codecool.shop.dao.implementation.database.ProductCategoryDaoJdbc;
import com.codecool.shop.dao.implementation.database.ProductDaoJdbc;
import com.codecool.shop.dao.implementation.database.SupplierDaoJdbc;
import com.codecool.shop.dao.implementation.memory.ProductCategoryDaoMem;
import com.codecool.shop.dao.implementation.memory.ProductDaoMem;
import com.codecool.shop.dao.implementation.memory.SupplierDaoMem;


/**
 * Created by csyk on 2016.11.22..
 */

public class PopulateData {
    public static void populateData(String state) {

        ProductDao productDataStore= null;
        ProductCategoryDao productCategoryDataStore = null;
        SupplierDao supplierDataStore = null;

        if (state.equals("DB")) {
            productDataStore = ProductDaoJdbc.getInstance();
            productCategoryDataStore = ProductCategoryDaoJdbc.getInstance();
            supplierDataStore = SupplierDaoJdbc.getInstance();
        } else if (state.equals("MEM")) {
            productDataStore = ProductDaoMem.getInstance();
            productCategoryDataStore = ProductCategoryDaoMem.getInstance();
            supplierDataStore = SupplierDaoMem.getInstance();
        }

        //setting up a new supplier
        Supplier amazon = new Supplier("Amazon", "and you are done");
        supplierDataStore.add(amazon);
        Supplier lenovo = new Supplier("Lenovo", "We make the tools. You make them do.");
        supplierDataStore.add(lenovo);
        Supplier sony = new Supplier("Sony", "Make.believe");
        supplierDataStore.add(sony);
        Supplier canon = new Supplier("Canon", "Delighting You Always.");
        supplierDataStore.add(canon);
        Supplier panasonic = new Supplier("Panasonic", "Ideas For Life.");
        supplierDataStore.add(panasonic);
        Supplier rohan = new Supplier("Rohan", "Where now are the horse and the rider? Where is the horn that was blowing?");
        supplierDataStore.add(rohan);
        Supplier samsung = new Supplier("Samsung", "Make Everything Smarter.");
        supplierDataStore.add(samsung);

        //setting up a new product category
        ProductCategory tablet = new ProductCategory("Tablet", "Hardware", "A tablet computer is a thin, flat mobile computer with a touchscreen display.");
        productCategoryDataStore.add(tablet);
        ProductCategory ebookreader = new ProductCategory("Ebook Reader", "Hardware", "Ebook reader with E-ink screen for better reading experience.");
        productCategoryDataStore.add(ebookreader);
        ProductCategory camera = new ProductCategory("Camera", "Hardware", "Digital cameras");
        productCategoryDataStore.add(camera);
        ProductCategory smartphone = new ProductCategory("Smartphone", "Hardware", "Smartphones with touchscreen");
        productCategoryDataStore.add(smartphone);
        ProductCategory horse = new ProductCategory("Horse", "Hardware", "Where now are the horse and the rider? Where is the horn that was blowing?");
        productCategoryDataStore.add(horse);
        ProductCategory tv = new ProductCategory("TV", "Hardware", "Smart TVs");
        productCategoryDataStore.add(tv);

        //setting up products and printing it
        productDataStore.add(new Product("Amazon Fire", 49.9f, "USD", "Fantastic price. Large content ecosystem. Good parental controls. Helpful technical support.", tablet, amazon));
        productDataStore.add(new Product("Lenovo IdeaPad Miix 700", 479, "USD", "Keyboard cover is included. Fanless Core m5 processor. Full-size USB ports. Adjustable kickstand.", tablet, lenovo));
        productDataStore.add(new Product("Panasonic TX-32CS510E ", 299, "USD", "Experience unrivaled image clarity with 4K Ultra HD direct-lit LED technology.", tv, panasonic));
        productDataStore.add(new Product("Przewalskis 2.0", 1500, "USD", "A rare and endangered subspecies of wild horse (Equus ferus) native to the steppes of central Asia. Przewalskis horse has never been domesticated", horse, rohan));
        productDataStore.add(new Product("Samsung Note7", 450, "USD", "Samsungs fiercest smartphone so far. Designed with that intrepid spirit in mind.", smartphone, samsung));
        productDataStore.add(new Product("Sony LED TV", 250, "USD", "Lose yourself in ultra contrast. It will take your breath away.", tv, sony));
        productDataStore.add(new Product("Amazon Kindle Paperwhite", 79.9f, "USD", "High Resolution Display with Next-Gen Built-in Light. With WiFi", ebookreader, amazon));
        productDataStore.add(new Product("Pampa", 900, "USD", "The Pampa Horse is a horse breed that combines the characteristics of Brazilian Horses.", horse, rohan));
        productDataStore.add(new Product("Sony Z3", 350, "USD", "Don’t settle for good. Demand great. Do more than you thought possible.Impossibly slim and wonderfully powerful.", smartphone, sony));
        productDataStore.add(new Product("Przewalskis 1.0", 15, "USD", "A rare and endangered subspecies of wild horse (Equus ferus). NOW ON SALE!!!", horse, rohan));
        productDataStore.add(new Product("Lenovo Yoga", 450, "USD", "Think you know everything a tablet can do? Think again.", tablet, lenovo));
        productDataStore.add(new Product("Canon EOS 70D", 500, "USD", "Think you know everything a tablet can do? Think again.", camera, canon));
    }
}
