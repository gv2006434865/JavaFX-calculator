/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tw.edu.npu.mis;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author AN
 */
public class Window {
    private Controller mController;
    private List<Showable> mInvalidViews;

    /**
     * Start the event loop.
     *
     * @param con The controller.
     * @param views The views to draw on the first loop.
     */
    public void startEventLoop(Controller con, List<Showable> views) {
        mController = con;
        mInvalidViews = new ArrayList<>(views);

        // Simulate how an event loop works.
        while (true) {
            mController.readInput();
            for (Showable v : mInvalidViews) {
                v.onDraw();
            }
            mInvalidViews.clear();
        }
    }

    /**
     * Add a view to a queue for redraw on screen later.
     *
     * @param v View to redraw.
     */
    public void schduleRedraw(Showable v) {
        if(!mInvalidViews.contains(v)){
        mInvalidViews.add(v);
        }
    }
}
