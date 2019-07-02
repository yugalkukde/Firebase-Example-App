package com.example.firebasestorage;

public class Upload {

    private String mName;
    private String mImageUrl;

    public Upload() {
        //needed
    }

    public Upload(String name, String url) {

        if (name.trim().equals(""))
            name = "No Name";
        mName = name;
        mImageUrl = url;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
}
