package tw.edu.npu.mis;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STP
 */
public class Controller {
    private final Model mModel;

    public Controller(Model model) {
        mModel = model;
    }

    /**
     * Read input and update model accordingly.
     */
    public void readInput() {
        System.out.print("Controller: ");
        /*Scanner s = new Scanner(System.in);
        String input = s.nextLine().trim();
        if (!input.isEmpty()) {
           mModel.setData(input);
        }*/
    }
}
