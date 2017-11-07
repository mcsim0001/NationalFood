package ua.com.mcsim.national.content;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ua.com.mcsim.national.R;

public class Content {


    private static final int COUNT = 10;

    public static final String[] NAMES = {  "Bacon Burgers on Brioche Buns",  //1
                                            "Umami Burgers with Port and Stilton",  //2
                                            "Pug Burger",  //3
                                            "Cheddar BLT Burgers with Tarragon Russian Dressing",  //4
                                            "All-American Hamburgers with Red Onion Compote",  //5
                                            "Green-Chile Burgers with Fried Eggs",  //6
                                            "Beef Burgers with Peanut-Chipotle Barbecue Sauce",      //7
                                            "Minetta Burger",      //8
                                            "Cheddar-and-Onion Smashed Burgers",     //9
                                            "Chile-Stuffed Cheeseburger"};      //10

    public static final int[] FACE_ID = {   R.drawable.face1,
                                            R.drawable.face2,
                                            R.drawable.face3,
                                            R.drawable.face4,
                                            R.drawable.face5,
                                            R.drawable.face6,
                                            R.drawable.face7,
                                            R.drawable.face8,
                                            R.drawable.face9,
                                            R.drawable.face10,};

    public static final String[] DETAIL_URLS = {"file:///android_asset/page1.html",  //1
                                                "file:///android_asset/page2.html",  //2
                                                "file:///android_asset/page3.html",  //3
                                                "file:///android_asset/page4.html",  //4
                                                "file:///android_asset/page5.html",  //5
                                                "file:///android_asset/page6.html",  //6
                                                "file:///android_asset/page7.html",  //7
                                                "file:///android_asset/page8.html",  //8
                                                "file:///android_asset/page9.html",  //9
                                                "file:///android_asset/page10.html"}; //10

    public static final List<ContentItem> ITEMS = new ArrayList<ContentItem>();
    public static final Map<String, ContentItem> ITEM_MAP = new HashMap<String, ContentItem>();

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createItem(i));
        }
    }

    private static void addItem(ContentItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static ContentItem createItem(int position) {

        return new ContentItem(String.valueOf(position),
                                            NAMES[position-1],
                                            DETAIL_URLS[position-1]);
    }


    public static class ContentItem {

        public final String id;

        public String getName() {
            return name;
        }

        public final String name;
        public final String detailsUrl;



        ContentItem (String id, String name, String detailsUrl) {
            this.id = id;
            this.name = name;
            this.detailsUrl = detailsUrl;
        }


    }
}
