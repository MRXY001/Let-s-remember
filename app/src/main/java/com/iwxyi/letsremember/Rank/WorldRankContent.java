package com.iwxyi.letsremember.Rank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorldRankContent {

    public static final List<WorldRankItem> ITEMS = new ArrayList<WorldRankItem>();
    public static final Map<String, WorldRankItem> ITEM_MAP = new HashMap<String, WorldRankItem>();

    private static final int COUNT = 25;


    static {
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(WorldRankItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static WorldRankItem createItem(int rank, String name, int recite, int typein) {
        return new WorldRankItem(""+rank, name, "背诵："+recite+"  录入："+typein);
    }

    private static WorldRankItem createDummyItem(int position) {
        return new WorldRankItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        builder.append("\nMore details information here.");
        return builder.toString();
    }

    public static class WorldRankItem {
        public String id = "";
        public int rank = 0;
        public int user_id = 0;
        public String username;
        public String details;

        public WorldRankItem(String id, String content, String details) {
            this.id = id;
            this.username = content;
            this.details = details;
        }

        public WorldRankItem(int rank, int user_id, String username, String detail) {
            this.rank = rank;
            this.user_id = user_id;
            this.username = username;
            this.details = detail;
        }

        @Override
        public String toString() {
            return username;
        }
    }
}
