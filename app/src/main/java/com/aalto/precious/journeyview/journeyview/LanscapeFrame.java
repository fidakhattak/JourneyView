package com.aalto.precious.journeyview.journeyview;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import java.util.List;

/**
 * Created by khatt on 8/10/2016.
 */
public class LanscapeFrame extends FrameLayout {

    LandscapeView backgroundView;
    LinearLayout controlsView;
    Utilities.LandscapeType type;
    private int steps;
    private List<Milestone> milestones;

    public LanscapeFrame(Context context,Utilities.LandscapeType landscapeType) {
        super(context);
    }
}
