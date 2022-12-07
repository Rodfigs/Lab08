/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07;

/**
 *
 * @author rodri
 */
public class User {
    
    private String name;
    private String location;
    private boolean locationSet;
    private String following;

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public User(String name, String location, String following) {
        this.name = name;
        this.location = location;
        this.locationSet = true;
        this.following = following;
    }
    
    
    
    public User(String name, String location) {
        this.name = name;
        this.location = location;
        this.locationSet = true;
    }
    public User (String name){
        this.name = name;
        this.location = "No Location Set!";
        this.locationSet = false;
    
    }

    public boolean isLocationSet() {
        return locationSet;
    }

    public void setLocationSet(boolean locationSet) {
        this.locationSet = locationSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public Tweet tweet(String text){
        Tweet newTweet = new Tweet(text, this);
        return newTweet;
    }
}
