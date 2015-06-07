/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import java.util.ArrayList;


public class Subject {

    ArrayList<Observer> al = new ArrayList();

    void attach(Observer o) {
        al.add(o);
    }

    void datach(Observer o) {
        al.remove(o);
    }

    void notifyobserver() {
        for (Observer o : al) {
            o.upDate();
        }
    }
}
