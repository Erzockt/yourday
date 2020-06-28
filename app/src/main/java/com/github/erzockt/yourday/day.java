package com.github.erzockt.yourday;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Date;

public class day {
    private Date day;
    private ArrayList<moodEntry> entries = new ArrayList<>();
    private float averageMood;

    public day(Date d) {
        day = d;
    }

    public void newEntry(int m, Date t) {
        entries.add(new moodEntry(m, t));
        float total = 0;
        for (moodEntry entry : entries) {
            total += entry.getMood();
        }
        averageMood = total / entries.size();
    }

    public int getColor() {
        int g = Math.round(averageMood * 255 / 4);
        int b =  Math.round(averageMood * -(255 / 4) + 255);
        return Color.rgb(0, g, b);
    }
}
