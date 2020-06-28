package com.github.erzockt.yourday;

import java.util.Date;

public class moodEntry {
    private int mood;
    private Date time;

    public int getMood() {
        return mood;
    }

    public Date getTime() {
        return time;
    }

    public moodEntry(int m, Date t) {
        mood = m;
        time = t;
    }
}
