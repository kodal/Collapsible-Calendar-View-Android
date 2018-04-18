package com.shrikanthravi.collapsiblecalendarview.data;

import java.util.Objects;

/**
 * Created by shrikanthravi on 06/03/18.
 */

public class Event {
    private int mYear;
    private int mMonth;
    private int mDay;

    public Event(int year, int month, int day) {
        this.mYear = year;
        this.mMonth = month;
        this.mDay = day;
    }

    public int getMonth() {
        return mMonth;
    }

    public int getYear() {
        return mYear;
    }

    public int getDay() {
        return mDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return mYear == event.mYear &&
                mMonth == event.mMonth &&
                mDay == event.mDay;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mYear, mMonth, mDay);
    }

}
