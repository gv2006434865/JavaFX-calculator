/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import java.util.ArrayList;

/**
 * subscription from bserver
 *
 * @author AN
 */
public class Subject {

    ArrayList<Observer> al = new ArrayList();

    /**
     * add subscription
     *
     * @param o view'contents
     */
    void attach(Observer o) {
        al.add(o);
    }

    /**
     * delete subscription
     *
     * @param o view'contents
     */
    void datach(Observer o) {
        al.remove(o);
    }

    /**
     * Update model.
     */
    void notifyobserver() {
        for (Observer o : al) {
            o.upDate();
        }
    }
}
