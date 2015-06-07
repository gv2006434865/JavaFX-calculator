/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

/**
 *
 * @author STP
 */
public class Model extends Subject {

    private String mData;
    String Num = "";
    String AugendNum = "";
    Boolean Dot = false;
    String OperatorUse = "";

    public enum Operator {

        CLEAR, // C
        CLEAR_ENTRY, // CE
        BACKSPACE, // ⌫
        EQUAL, // =
        PLUS, // +
        MINUS, // -
        TIMES, // ×
        OVER, // ⁄
        PLUS_MINUS, // ±
        RECIPROCAL, // 1/x
        PERCENT, // %
        SQRT, // √
        MEM_CLEAR, // MC
        MEM_SET, // MS
        MEM_PLUS, // M+
        MEM_MINUS, // M-
        MEM_RECALL   // MR
    }

    public void appendDigit(int digit) {
        if (Num.equals("0")) {
            Num = String.valueOf(digit);
        } else {
            Num += digit;
        }
        notifyobserver();
    }

    public void appendDot() {

    }

    public void performOperation(Operator operator) {
        switch (operator) {
            case CLEAR:
                break;
            case BACKSPACE:
                break;
            case OVER:
                break;
            case TIMES:
                break;
            case MINUS:
                break;
            case PLUS:
                break;
            case PLUS_MINUS:
                break;
            case EQUAL:
                break;
            case SQRT:
                break;
        }
    }

    public String getDisplay() {
        return Num;
    }

    /*public String getData() {
     return mData;
     }

     public void setData(String data) {
     mData = data;
     notifyobserver();
     }*/
}
