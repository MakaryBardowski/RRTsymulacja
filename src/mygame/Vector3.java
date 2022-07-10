/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

/**
 *
 * @author Makary Bardowski
 */
public class Vector3{
    private float x;
    private float y;
    private float z;
    
    static Vector3 nonExistent = new Vector3(Float.NaN,Float.NaN,Float.NaN);
    
    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Vector3(Vector3 source){
    x = source.x;
    y = source.y;
    z = source.z;
    }

    
    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
    public  float distance(Vector3 w2){
        
     return (float) Math.sqrt((z-w2.getZ()) *(z-w2.getZ())  +  (x-w2.getX())*(x-w2.getX()));
        
    }
   @Override
    public String toString(){
    
    return "("+x+", "+y+", " +z+")";
    }
   
}
