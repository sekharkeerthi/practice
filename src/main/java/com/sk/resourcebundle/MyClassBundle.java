package com.sk.resourcebundle;
import java.util.ListResourceBundle;

public class MyClassBundle extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return contents;
    }

    private Object[][] contents = {
            { "price"   , new Double(10.00) },
            { "currency", "EUR" },
    };
}