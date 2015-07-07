package com.artitk.android_viewholder_example.data;

import android.content.Context;
import android.graphics.Color;

import com.artitk.android_viewholder_example.R;

import java.util.ArrayList;

public class SimulateItems {

    public static ArrayList<LoremItem> getSimulateItems(Context context) {
        int[] loremResId = {
                R.string.lorem_long_1, R.string.lorem_long_2, R.string.lorem_long_3,
                R.string.lorem_long_4, R.string.lorem_long_5
        };

        ArrayList<LoremItem> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            LoremItem loremItem = new LoremItem();
            loremItem.setLoremText(context.getString(loremResId[i]));
            arrayList.add(loremItem);
        }

        arrayList.get(1).setLoremCheck(true);

        return arrayList;
    }

    public static CharSequence[] getSimulateColorNames(Context context) {
        return new CharSequence[] {
                context.getString(R.string.red), context.getString(R.string.green),
                context.getString(R.string.blue), context.getString(R.string.orange)
        };
    }

    public static int getSimulateColor(Context context, int index) {
        int[] colorResId = {
                android.R.color.holo_red_light, android.R.color.holo_green_light,
                android.R.color.holo_blue_light, android.R.color.holo_orange_light
        };

        return index == -1 ? Color.TRANSPARENT : context.getResources().getColor(colorResId[index]);
    }
}
