package com.crafterfactory.chatfi.homepage;

/**
 * Created by sujith-5991 on 28/10/17.
 */

public class HomePagePresenter implements HomePagePresenterRequestInterface {

    @Override
    public void onPageLoad() {

    }

    @Override
    public void onSendButtonClicked(String ipAddress, String message) {

    }

    private boolean isValidData(String ipAddress, String message) {
        if (ipAddress == null) {
            String errorMessage = ;
        }
        return true;
    }
}
