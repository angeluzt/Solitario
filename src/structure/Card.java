/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structure;

import common.Constants;
import common.Utils;
import java.awt.image.BufferedImage;


/**
 *
 * @author angel
 */
public class Card {
    
    private int x_location;
    private int y_location;
    
    private int x_size = Constants.CARD_X_SIZE;
    private int y_size = Constants.CARD_Y_SIZE;
    
    private int number;
    private boolean isRedColor;
    private int group;
    private String path;
    private BufferedImage image;
    
    private boolean isSelected = false;
    private boolean isVisile = false;
    
    public Card(){
    }
    
    public Card(String path){
        this.path = path;
        
        image = Utils.readImage(path);
    }
    
    public Card(String path, int x_location, int y_location){
        this.path = path;
        this.x_location = x_location;
        this.y_location = y_location;
        
        image = Utils.readImage(path);
    }
    
    public Card(String path, int x_location, int y_location, boolean isRedColor, int number, int group){
        this.path = path;
        this.x_location = x_location;
        this.y_location = y_location;
        this.isRedColor = isRedColor;
        this.number = number;
        this.group = group;
        
        image = Utils.readImage(path);
    }    
    
    public void setPath(String path){
        this.path = path;
        image = Utils.readImage(path);
    }
    
    public void setImageXLocation(int x_location){
        this.x_location = x_location;
    }
    
    public void setImageYLocation(int y_location){
        this.y_location = y_location;
    }
    
    public void setImageXSize(int x_size){
        this.x_size = x_size;
    }
    
    public void setImageYSize(int y_size){
        this.y_size = y_size;
    }
    
    public void setImage(BufferedImage image){
        this.image = image;
    }
    
    public void setIsSelected(boolean isSelected){
        this.isSelected = isSelected;
    }
    
    public void setIsVisible(boolean isVisible){
        this.isVisile= isVisible;
    }
    
    public String getPath(){
        return this.path;
    }
    
    public int getImageXLocation(){
        return this.x_location;
    }
    
    public int getImageYLocation(){
        return this.y_location;
    }
    
    public int getImageXSize(){
        return this.x_size;
    }
    
    public int getImageYSize(){
        return this.y_size;
    }
    
    public BufferedImage getImage(){
        return this.image;
    }
    
    public boolean isSelected(){
        return this.isSelected;
    }
    
    public boolean isVisible(){
        return this.isVisile;
    }
    
    public boolean isRedColor(){
        return this.isRedColor;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public int getGroup(){
        return this.group;
    }
}
