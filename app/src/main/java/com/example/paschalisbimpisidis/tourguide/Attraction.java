package com.example.paschalisbimpisidis.tourguide;

/**
 * {@link Attraction} represents an attraction in the city.
 * It contains a title, address and info and sometimes an image.
 */
public class Attraction {

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * title of the attraction
     */
    private String mAttractionTitle;
    /**
     * address of the attraction
     */
    private String mAttractionAddress;
    /**
     * information about the attraction
     */
    private String mAttractionInfo;
    /**
     * Image resource ID for the attraction
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    /**
     * Create a new Attraction object.
     *
     * @param attractionTitle   is the title of an attraction (e.g. restaurant, museum etc.)
     * @param attractionAddress is the address of the attraction
     * @param attractionInfo    is the information about the attraction (e.g. opening times etc.)
     */
    public Attraction(String attractionTitle, String attractionAddress, String attractionInfo) {
        mAttractionTitle = attractionTitle;
        mAttractionAddress = attractionAddress;
        mAttractionInfo = attractionInfo;
    }

    /**
     * Create a new Attraction object.
     *
     * @param attractionTitle   is the title of an attraction (e.g. restaurant, museum etc.)
     * @param attractionAddress is the address of the attraction
     * @param attractionInfo    is the information about the attraction (e.g. opening times etc.)
     * @param attractionImage   is the image associated with the attraction
     */
    public Attraction(String attractionTitle, String attractionAddress, String attractionInfo, int attractionImage) {
        mAttractionTitle = attractionTitle;
        mAttractionAddress = attractionAddress;
        mAttractionInfo = attractionInfo;
        mImageResourceId = attractionImage;
    }


    /**
     * Returns the title of the attraction
     */
    public String getAttractionTitle() {
        return mAttractionTitle;
    }

    /**
     * Returns the address of the attraction
     */
    public String getAttractionAddress() {
        return mAttractionAddress;
    }

    /**
     * Returns the information about the attraction
     */
    public String getAttractionInfo() {
        return mAttractionInfo;
    }

    /**
     * Returns the image resource ID of the attraction
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not the attraction has an image.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
