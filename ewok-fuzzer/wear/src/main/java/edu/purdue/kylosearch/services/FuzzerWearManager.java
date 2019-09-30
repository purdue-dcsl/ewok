package edu.purdue.kylosearch.services;

import edu.purdue.dagobah.services.FuzzerManager;
import edu.purdue.kylosearch.R;

public class FuzzerWearManager extends FuzzerManager {

    private static final String TAG = "Kylo/FWMngr";

    public FuzzerWearManager() {
        // set notification icon
        this.notification_icon = R.drawable.notification_icon;
    }

}
