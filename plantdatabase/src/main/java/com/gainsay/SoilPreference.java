package com.gainsay;

import java.util.ArrayList;
import java.util.List;

/*
 * Class SoilType will generate Strings that describe a plant's soil needs
 * The arrayList contains preset descriptors that the constructor can
 * pull from to create a soilPreference for each Plant object
 */

public class SoilPreference {
    private String soil1;
    private String soil2;
    private String soil3;

    private static List<String> soilTypeList = new ArrayList<>();

    public SoilPreference() {
        this("", "", "");
    }

    public SoilPreference(String soil1) {
        this(soil1, "", "");
    }

    public SoilPreference(String soil1, String soil2) {
        this(soil1, soil2, "");
    }

    public SoilPreference(String soil1, String soil2, String soil3) {
        this.soil1 = soil1;
        this.soil2 = soil2;
        this.soil3 = soil3;
    }

    // methods that manipulate ArrayList soilTypeList
    private boolean retrieveSoilTypes(String soil) {
        if(soilTypeList.contains(soil)) {
            System.out.println(soilTypeList.indexOf(soil));
            return true;
        } else {
            System.out.println("Cannot find entry");
            return false;
        }
    }

    private void addSoilTypes(String soil) {
        if(!soilTypeList.contains(soil)) {
            soilTypeList.add(soil);
        } else {
            System.out.println(soil + " is already present");
        }
    }

    // called from main
    public static void initializeSoilList() {
        soilTypeList.add("acidic");
        soilTypeList.add("alkaline");
        soilTypeList.add("well-drained");
        soilTypeList.add("wet");
        soilTypeList.add("dry");
        // the items below may not be used
        soilTypeList.add("Loamy");
        soilTypeList.add("Peaty");
        soilTypeList.add("Chalky");
        soilTypeList.add("Silty");
        soilTypeList.add("Sandy");
        soilTypeList.add("Clay");
    }
}
