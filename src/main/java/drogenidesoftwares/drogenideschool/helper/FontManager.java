package drogenidesoftwares.drogenideschool.helper;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by pc1 on 3/27/2018.
 */

public class FontManager {

        public static final String ROOT = "fonts/",
                BRAND = ROOT + "fa_brands_400.ttf",
                REGULAR=ROOT+"fa_regular_400.ttf",
                SOLID=ROOT+"fa_solid_900.ttf";

        public static Typeface getTypeface(Context context, String font) {
            return Typeface.createFromAsset(context.getAssets(), font);
        }

}
