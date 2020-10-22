package com.sell.classified.helper;

import com.sell.classified.model.Category;
import com.sell.classified.model.Chat;
import com.sell.classified.model.Featured;
import com.sell.classified.model.Ads;
import com.sell.classified.model.Notification;

import java.util.ArrayList;

public class GenericFunctions {


    public static ArrayList<Category> getCategories(boolean isCategoryPage){

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

        Category job=new Category();
        job.setCategoryName("Jobs");
        job.setCategoryImage("ic_job");

        Category furniture=new Category();
        furniture.setCategoryName("Furniture");
        furniture.setCategoryImage("ic_furniture");

        Category business=new Category();
        business.setCategoryName("Business");
        business.setCategoryImage("ic_business");

        Category book=new Category();
        book.setCategoryName("Books");
        book.setCategoryImage("ic_book");

        Category animal=new Category();
        animal.setCategoryName("Animal");
        animal.setCategoryImage("ic_animal");

        Category craft=new Category();
        craft.setCategoryName("Crafts");
        craft.setCategoryImage("ic_craft");

        Category laptop=new Category();
        laptop.setCategoryName("Laptops");
        laptop.setCategoryImage("ic_laptop");

        Category art=new Category();
        art.setCategoryName("Art");
        art.setCategoryImage("ic_art");

        Category entertainment=new Category();
        entertainment.setCategoryName("Entertainment");
        entertainment.setCategoryImage("ic_entertainment");

        Category decoration=new Category();
        decoration.setCategoryName("Decoration");
        decoration.setCategoryImage("ic_decoration");

        categories.add(cars);
        categories.add(bike);
        categories.add(property);
        categories.add(electronic);
        categories.add(handphone);
        categories.add(showAll);

        categories.add(job);
        categories.add(furniture);
        categories.add(business);
        categories.add(book);
        categories.add(animal);
        categories.add(craft);
        categories.add(laptop);
        categories.add(art);
        categories.add(entertainment);
        categories.add(decoration);

        if(isCategoryPage){
            categories.remove(5);
            return categories;
        }else {
            ArrayList<Category> categoriesForHomePage= new ArrayList(categories.subList(0,6)) ;
            return categoriesForHomePage;
        }

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

    public static ArrayList<Ads> getLatestAdItems(){

        ArrayList<Ads> ads =new ArrayList<>();

        Ads bike=new Ads();
        bike.setLatestAdName("Motobike G1");
        bike.setLatestAdImage("latest_bike");
        bike.setLatestAdPrice("$4400");
        bike.setLatestAdAddress("New York, US");

        Ads house=new Ads();
        house.setLatestAdName("House Type 10");
        house.setLatestAdImage("latest_house");
        house.setLatestAdPrice("$12212");
        house.setLatestAdAddress("LA, US");

        Ads laptop=new Ads();
        laptop.setLatestAdName("Hp Omen 15");
        laptop.setLatestAdImage("latest_laptop");
        laptop.setLatestAdPrice("$1000");
        laptop.setLatestAdAddress("New York, Us");

        Ads car=new Ads();
        car.setLatestAdName("Ferrari F16");
        car.setLatestAdImage("latest_car");
        car.setLatestAdPrice("$55000");
        car.setLatestAdAddress("New York, Us");



        ads.add(car);
        ads.add(bike);
        ads.add(house);
        ads.add(laptop);

        return ads;

    }

    public static ArrayList<Notification> getNotificationItems(){

        ArrayList<Notification> notifications=new ArrayList<>();

        Notification user1=new Notification();
        user1.setUserName("Cali Rayner");
        user1.setUserImage("avatar2");
        user1.setAction("liked the Product");
        user1.setNotificationTime("2 hours ago");

        Notification user2=new Notification();
        user2.setUserName("Kane Albert");
        user2.setUserImage("avatar1");
        user2.setAction("followed you");
        user2.setNotificationTime("about 10 min ago");

        Notification user3=new Notification();
        user3.setUserName("Jonathan ");
        user3.setUserImage("avatar3");
        user3.setAction("followed you");
        user3.setNotificationTime("about 10 min ago");

        Notification user4=new Notification();
        user4.setUserName("Lucca Partridge");
        user4.setUserImage("avatar4");
        user4.setAction("saved the product");
        user4.setNotificationTime("2 hours ago");

        Notification user5=new Notification();
        user5.setUserName("Darin Bright");
        user5.setUserImage("avatar5");
        user5.setAction("followed you");
        user5.setNotificationTime("5 hours ago");

        Notification user6=new Notification();
        user6.setUserName("John Roe");
        user6.setUserImage("avatar6");
        user6.setAction("followed you");
        user6.setNotificationTime("2 hours ago");

        Notification user7=new Notification();
        user7.setUserName("Alix Delacruz");
        user7.setUserImage("avatar7");
        user7.setAction("liked the Product");
        user7.setNotificationTime("2 hours ago");

        Notification user8=new Notification();
        user8.setUserName("Lucca Partridge");
        user8.setUserImage("avatar8");
        user8.setAction("followed you");
        user8.setNotificationTime("2 hours ago");



        notifications.add(user1);
        notifications.add(user2);
        notifications.add(user3);
        notifications.add(user4);
        notifications.add(user5);
        notifications.add(user6);
        notifications.add(user7);
        notifications.add(user8);

        return notifications;

    }

    public static ArrayList<Chat> getChats(){

        ArrayList<Chat> chats=new ArrayList<>();

        Chat chat=new Chat();
        chat.setUserName("Peter");
        chat.setMessage("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore");
        chat.setTime("2 min ago");
        chat.setUserImage("avatar1");

        Chat chat1=new Chat();
        chat1.setUserName("John Mackain");
        chat1.setMessage("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore");
        chat1.setTime("5 min ago");
        chat1.setUserImage("avatar2");

        Chat chat2=new Chat();
        chat2.setUserName("Ali Ahmad");
        chat2.setMessage("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore");
        chat2.setTime("10 hours ago");
        chat2.setUserImage("avatar3");

        Chat chat3=new Chat();
        chat3.setUserName("Michale Stark");
        chat3.setMessage("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore");
        chat3.setTime("6 min ago");
        chat3.setUserImage("avatar4");

        Chat chat4=new Chat();
        chat4.setUserName("Vijay Kumar");
        chat4.setMessage("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore");
        chat4.setTime("15 min ago");
        chat4.setUserImage("avatar5");

        Chat chat5=new Chat();
        chat5.setUserName("Rasheed Sultan");
        chat5.setMessage("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore");
        chat5.setTime("4 min ago");
        chat5.setUserImage("avatar6");

        Chat chat6=new Chat();
        chat6.setUserName("Kashif");
        chat6.setMessage("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore");
        chat6.setTime("2 min ago");
        chat6.setUserImage("avatar7");

        Chat chat7=new Chat();
        chat7.setUserName("Peter");
        chat7.setMessage("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore");
        chat7.setTime("2 min ago");
        chat7.setUserImage("avatar8");

        chats.add(chat);
        chats.add(chat1);
        chats.add(chat2);
        chats.add(chat3);
        chats.add(chat4);
        chats.add(chat5);
        chats.add(chat6);
        chats.add(chat7);

        return chats;

    }

    public static ArrayList<Chat> getPersonalChats(){

        ArrayList<Chat> chats=new ArrayList<>();

        Chat chat1=new Chat();
        chat1.setTime("10:05");
        chat1.setMessage("Hello");
        chat1.setUserImage("avatar1");
        chat1.setViewType(0);

        Chat chat2=new Chat();
        chat2.setTime("10:05");
        chat2.setMessage("Hi, how are you?");
        chat2.setUserImage("avatar2");
        chat2.setViewType(1);

        Chat chat3=new Chat();
        chat3.setTime("10:06");
        chat3.setMessage("whats up buddy?");
        chat3.setUserImage("avatar2");
        chat3.setViewType(1);

        Chat chat4=new Chat();
        chat4.setTime("10:06");
        chat4.setMessage("Nothing special. hbu?");
        chat4.setUserImage("avatar1");
        chat4.setViewType(0);

        Chat chat5=new Chat();
        chat5.setTime("10:07");
        chat5.setMessage("going home");
        chat5.setUserImage("avatar2");
        chat5.setViewType(1);

        chats.add(chat1);
        chats.add(chat2);
        chats.add(chat3);
        chats.add(chat4);
        chats.add(chat5);

        return chats;
    }

}
