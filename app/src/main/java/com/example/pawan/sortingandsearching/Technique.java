package com.example.pawan.sortingandsearching;

import java.util.ArrayList;

/**
 * Created by Pawan on 27-11-2017.
 */

public class Technique {

    private String title;
    private String code;

    public Technique(String title, String code) {
        this.title = title;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
