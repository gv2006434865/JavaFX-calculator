/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import tw.edu.npu.mis.Layout;
/**
 *
 * @author AN
 */
public class View implements Observer, Showable {

    //private final String mName;
    private final Window mWindow;
    private final Model mModel;
    //private Layout mLayout;

    /**
     * set a view object
     *
     * @param window detection view change.
     * @param model use to set or get data.
     */
    //public View(String name, Window window, Model model) {
    public View(Window window, Model model) {
        //mName = name;
        mWindow = window;
        mModel = model;
        mModel.attach(this);

    }

    /**
     * Invalidate the view, which indicates it needs to be redrawn later.
     */
    public void invalidate() {
        mWindow.schduleRedraw(this);
    }

    @Override
    public void onDraw() {
        // System.out.println("View (" + mName + "): " + mModel.getData());
    }

    @Override
    public void upDate() {
        invalidate();
    }

}
