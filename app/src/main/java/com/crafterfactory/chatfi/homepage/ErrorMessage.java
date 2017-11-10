package com.crafterfactory.chatfi.homepage;

/**
 * Created by sujith-5991 on 28/10/17.
 */

public enum ErrorMessage {
    NULL_MESSAGE(ChatFiConstants.NULL_DATA,ChatFiConstants.NULL_MESSAGE),
    EMPTY_MESSAGE(ChatFiConstants.EMPTY_DATA,ChatFiConstants.EMPTY_STRING);

    public static int code;
    public static String message;

    ErrorMessage(int code, String message)
    {
        
    }
}
