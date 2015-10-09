/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory
;

/**
 *
 * @author chaod
 */
public class Manufacturer {
    private String mName,mAddress,mId,mTel;
    public Manufacturer(){
        
    }
    public Manufacturer(String mId,String mName,String mAddress,String mTel){
        this.mName = mName;
        this.mId = mId;
        this.mAddress = mAddress;
        this.mTel = mTel;
    }
    @Override
    public String toString(){
        String manufacturerInfo = "";
        manufacturerInfo += "\n Manufacturer Id:\t\t" + this.getmId();
        manufacturerInfo += "\n Manufacturer Name:\t\t" + this.getmName();
        manufacturerInfo += "\n Manufacturer Address:\t\t" + this.getmAddress();
        manufacturerInfo += "\n Manufacturer Tel:\t\t" + this.getmTel();
        return manufacturerInfo;
    }
    
    public String getmName(){
        return this.mName;
    }
    public String getmAddress(){
        return this.mAddress;
    }
    public String getmId(){
        return this.mId;
    }
    public String getmTel(){
        return this.mTel;
    }
    
    public void setmName(String mName){
        this.mName = mName;
    }
    public void setmAddress(String mAddress){
        this.mAddress = mAddress;       
    }
    public void setmId(String mId){
        this.mId = mId;
    }
    public void setmTel(String mTel){
        this.mTel = mTel;
    }
}

