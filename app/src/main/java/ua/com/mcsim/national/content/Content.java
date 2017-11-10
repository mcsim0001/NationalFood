package ua.com.mcsim.national.content;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ua.com.mcsim.national.R;

public class Content {


    private static final int COUNT = 10;

    public static final String[] NAMES = {  "Classic Ukrainian Borsht",  //1
                                            "Deruni",  //2
                                            "Homemade sausage",  //3
                                            "Salo with garlic",  //4
                                            "Vareniki with Potatoes",  //5
                                            "Kulish",  //6
                                            "Kapustnyak Zaporizhian",      //7
                                            "Hutsul Banush",      //8
                                            "Cottage cheese pancakes",     //9
                                            "Uzvar"};      //10

    public static final String[] TYPES = {  "Soups",//1
                                            "Mains",  //2
                                            "Mains",  //3
                                            "Appetizers",  //4
                                            "Mains",  //5
                                            "Soups",  //6
                                            "Soups",      //7
                                            "Mains",      //8
                                            "Desserts",     //9
                                            "Drinks"};      //10

    public static final String[] READYS = { "2 hours",//1
                                            "30 min.",  //2
                                            ">3 hours",  //3
                                            "30 min.",  //4
                                            "45 min.",  //5
                                            "1,5 hours",  //6
                                            "1 hour",      //7
                                            "1 hour",      //8
                                            "30 min.",     //9
                                            "45 min."};      //10

    public static final String[] CALORIES = { "Middle",//1
                                            "Middle",  //2
                                            "High",  //3
                                            "High",  //4
                                            "High",  //5
                                            "Middle",  //6
                                            "Middle",      //7
                                            "High",      //8
                                            "Middle",     //9
                                            "Low"};      //10

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
                                            TYPES[position-1],
                                            READYS[position-1],
                                            CALORIES[position-1],
                                            DETAIL_URLS[position-1]);
    }


    public static class ContentItem {

        public final String id;

        public final String name;
        public String getName() {
            return name;
        }

        public final String type;
        public String getType() {
            return type;
        }

        public final String ready;
        public String getReady() {
            return ready;
        }

        public final String calory;
        public String getCalory() {
            return calory;
        }

        public final String detailsUrl;



        ContentItem (String id, String name, String type, String ready, String calory, String detailsUrl) {
            this.id = id;
            this.name = name;
            this.type = type;
            this.ready = ready;
            this.calory = calory;
            this.detailsUrl = detailsUrl;
        }


    }
}
