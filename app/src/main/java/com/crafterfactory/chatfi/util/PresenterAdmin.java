package com.crafterfactory.chatfi.util;

import com.crafterfactory.chatfi.homepage.HomePagePresenter;
import com.crafterfactory.chatfi.homepage.HomePagePresenterRequestInterface;

/**
 * Created by sujith-5991 on 28/10/17.
 */

public class PresenterAdmin {
    public static HomePagePresenterRequestInterface getHomePagePresenterRequestInterface() {
        return new HomePagePresenter();
    }
}
