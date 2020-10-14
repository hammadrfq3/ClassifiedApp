package com.sell.classified.helper;

import com.sell.classified.model.Category;
import com.sell.classified.model.Featured;
import com.sell.classified.model.LatestAds;

import java.util.ArrayList;

public class GenericFunctions {


    public static ArrayList<Category> getCategories(){

        ArrayList<Category> categories=new ArrayList<>();

        Category cars=new Category();
        cars.setCategoryName("Cars");
        cars.setCategoryImage("ic_car");

        Category bike=new Category();
        bike.setCategoryName("Bikes");
        bike.setCategoryImage("ic_bike");

        Category property=new Category();
        property.setCategoryName("Properties");
        property.setCategoryImage("ic_property");

        Category electronic=new Category();
        electronic.setCategoryName("Electronics");
        electronic.setCategoryImage("ic_electronics");

        Category handphone=new Category();
        handphone.setCategoryName("Handphone");
        handphone.setCategoryImage("ic_smartphone");

        Category showAll=new Category();
        showAll.setCategoryName("Show All");
        showAll.setCategoryImage("ic_show_all");

        categories.add(cars);
        categories.add(bike);
        categories.add(property);
        categories.add(electronic);
        categories.add(handphone);
        categories.add(showAll);

        return categories;

    }

    public static ArrayList<Featured> getFeaturedItems(){

        ArrayList<Featured> featureds=new ArrayList<>();

        Featured car=new Featured();
        car.setFeaturedItemName("Greency-c2 1992");
        car.setFeaturedItemImage("featured_car");
        car.setFeaturedItemPrice("$9400");
        car.setFeaturedItemAddress("New York, US");

        Featured house=new Featured();
        house.setFeaturedItemName("House Type 36/4");
        house.setFeaturedItemImage("featured_house");
        house.setFeaturedItemPrice("$8012");
        house.setFeaturedItemAddress("LA, US");

        Featured bike=new Featured();
        bike.setFeaturedItemName("Motobee c1000");
        bike.setFeaturedItemImage("featured_bike");
        bike.setFeaturedItemPrice("$9400");
        bike.setFeaturedItemAddress("New York, Us");



        featureds.add(car);
        featureds.add(bike);
        featureds.add(house);

        return featureds;

    }

    public static ArrayList<LatestAds> getLatestAdItems(){

        ArrayList<LatestAds> latestAds=new ArrayList<>();

        LatestAds bike=new LatestAds();
        bike.setLatestAdName("Motobike G1");
        bike.setLatestAdImage("latest_bike");
        bike.setLatestAdPrice("$4400");
        bike.setLatestAdAddress("New York, US");

        LatestAds house=new LatestAds();
        house.setLatestAdName("House Type 10");
        house.setLatestAdImage("latest_house");
        house.setLatestAdPrice("$12212");
        house.setLatestAdAddress("LA, US");

        LatestAds laptop=new LatestAds();
        laptop.setLatestAdName("Hp Omen 15");
        laptop.setLatestAdImage("latest_laptop");
        laptop.setLatestAdPrice("$1000");
        laptop.setLatestAdAddress("New York, Us");

        LatestAds car=new LatestAds();
        car.setLatestAdName("Ferrari F16");
        car.setLatestAdImage("latest_car");
        car.setLatestAdPrice("$55000");
        car.setLatestAdAddress("New York, Us");



        latestAds.add(car);
        latestAds.add(bike);
        latestAds.add(house);
        latestAds.add(laptop);

        return latestAds;

    }

}
