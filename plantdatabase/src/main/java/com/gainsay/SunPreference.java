package com.gainsay;

import java.util.ArrayList;
import java.util.List;

public class SunPreference {
    private String sunlight1;
    private String sunlight2;
    private String sunlight3;

    private static List<String> sunlightPreferenceList = new ArrayList<>();

    public SunPreference() {
        this("", "", "");
    }

    public SunPreference(String sunlight1) {
        this(sunlight1, "", "");
    }

    public SunPreference(String sunlight1, String sunlight2) {
        this(sunlight1, sunlight2, "");
    }

    public SunPreference(String sunlight1, String sunlight2, String sunlight3) {
        this.sunlight1 = sunlight1;
        this.sunlight2 = sunlight2;
        this.sunlight3 = sunlight3;
    }

    // called from main
    public static void initializeSunlightList() {
        sunlightPreferenceList.add("Full Sun");
        sunlightPreferenceList.add("Part Sun");
        sunlightPreferenceList.add("Mostly Shady");
        sunlightPreferenceList.add("Shade");
    }
}
