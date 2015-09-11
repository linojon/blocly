package com.parkerhill.blocly.api.model;

/**
 * Created by Jonathan on 8/29/2015.
 */
public class RssFeed {
    private String title;
    private String description;
    private String siteUrl;
    private String feedUrl;

    public RssFeed(String title, String description, String siteUrl, String feedUrl) {
        this.title = title;
        this.description = description;
        this.siteUrl = siteUrl;
        this.feedUrl = feedUrl;
    }

    public String getFeedUrl() {
        return feedUrl;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

}
