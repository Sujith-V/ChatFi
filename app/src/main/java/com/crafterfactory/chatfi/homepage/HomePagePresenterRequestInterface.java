package com.crafterfactory.chatfi.homepage;

import com.crafterfactory.chatfi.util.RequestInterface;

/**
 * Created by sujith-5991 on 28/10/17.
 */

public interface HomePagePresenterRequestInterface extends RequestInterface {
    void onSendButtonClicked(String ipAddress, String message);
}
