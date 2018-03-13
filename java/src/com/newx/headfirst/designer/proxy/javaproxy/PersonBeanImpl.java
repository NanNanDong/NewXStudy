package com.newx.headfirst.designer.proxy.javaproxy;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 */
public class PersonBeanImpl implements PersonBean {

    private String name;

    private String gender;

    private String interests;

    private int rating;

    private int ratingCount = 0;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return (rating / ratingCount); //平均分
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
