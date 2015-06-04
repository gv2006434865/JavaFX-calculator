/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package an20150601;

/**
 *
 * @author STP
 */
public class Model extends Subject{
    private String mData;
    public String getData() {
        return mData;
    }
    
    public void setData(String data) {
        mData = data;
        notifyobserver();
    }
    
}
