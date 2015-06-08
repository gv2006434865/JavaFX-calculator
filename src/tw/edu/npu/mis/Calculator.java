/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import java.lang.Math.*;
import java.text.NumberFormat;

/**
 * model class of the calculator
 * @author AN
 */
public class Calculator extends Subject {

    private String mData;
    String Num = "";
    String AugendNum = "";
    Boolean Dot = false;
    Boolean OperatorUsed = false;
    String OperatorUse = "";

    /**
     * available operators
     */
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

    /**
     * get digit from view
     * @param digit string of addend and augend
     */
    public void appendDigit(int digit) {
        if (Num.equals("0")) {
            Num = String.valueOf(digit);
        } else {
            Num += digit;
        }
        notifyobserver();
    }
    
    /**
     * get point to let int tobe float 
     */
    public void appendDot() {
        if (!Dot) {
            Num += ".";
        }
        Dot = true;
        notifyobserver();
    }

    /**
     * choose operator to calculate and get anser digit
     * @param operator available operators
     */
    public void performOperation(Operator operator) {
        switch (operator) {
            case CLEAR:
                Num = "0";
                AugendNum = "";
                notifyobserver();
                break;
            case CLEAR_ENTRY:
                if (Num.length() != 0) {
                    Num = "0";
                    AugendNum = "";
                }
                notifyobserver();
                break;
            case BACKSPACE:
                if (Num.length() != 0) {
                    Num = Num.replace(Num, Num.substring(0, Num.length() - 1).toString());
                }
                notifyobserver();
                break;
            case OVER:
                if (Num.length() != 0) {
                    AugendNum = Num;
                    Num = "";
                    OperatorUse = "/";
                    OperatorUsed = true;
                }
                notifyobserver();
                break;
            case TIMES:
                if (Num.length() != 0) {
                    AugendNum = Num;
                    Num = "";
                    OperatorUse = "*";
                    OperatorUsed = true;
                }
                notifyobserver();
                break;
            case MINUS:
                if (Num.length() != 0) {
                    AugendNum = Num;
                    Num = "";
                    OperatorUse = "-";
                    OperatorUsed = true;
                }
                notifyobserver();
                break;
            case PLUS:
                if (Num.length() != 0) {
                    AugendNum = Num;
                    Num = "";
                    OperatorUse = "+";
                    OperatorUsed = true;
                }
                notifyobserver();
                break;
            case RECIPROCAL:
                if (Num.length() != 0) {
                    Num = String.valueOf(1 / Double.parseDouble(Num));
                }
                notifyobserver();
                break;
            case PERCENT:
                if (Num.length() != 0) {
                    NumberFormat nt = NumberFormat.getInstance();
                    nt.setMinimumFractionDigits(2);
                    Num = String.valueOf(nt.format(Double.parseDouble(Num) * 0.01));
                }
                notifyobserver();
                break;
            case PLUS_MINUS:
                if (Num.length() != 0) {
                    if (Double.parseDouble(Num) > 0) {
                        Num = "-" + Num;
                    } else {
                        Num = String.valueOf(0.0 - Double.parseDouble(Num));
                    }
                }
                notifyobserver();
                break;
            case EQUAL:
                if ((Num.length() != 0) && (AugendNum.length() != 0) && (OperatorUse.length() != 0)) {
                    switch (OperatorUse) {
                        case "+":
                            Num = String.valueOf(Double.parseDouble(AugendNum) + Double.parseDouble(Num));
                            break;
                        case "-":
                            Num = String.valueOf(Double.parseDouble(AugendNum) - Double.parseDouble(Num));
                            break;
                        case "*":
                            Num = String.valueOf(Double.parseDouble(AugendNum) * Double.parseDouble(Num));
                            break;
                        case "/":
                            Num = String.valueOf(Double.parseDouble(AugendNum) / Double.parseDouble(Num));
                            break;
                    }
                    OperatorUse = "";
                    AugendNum = "";
                    Dot = false;
                    OperatorUsed = false;
                }
                notifyobserver();
                break;
            case SQRT:
                if (!OperatorUsed) {
                    Num = String.valueOf(Math.sqrt(Double.parseDouble(Num)));
                }
                notifyobserver();
                break;
        }
    }

    /**
     * return anser to display on view's label
     * @return anser 
     */
    public String getDisplay() {
        String AugendStr = AugendNum + " " + OperatorUse + " " + Num;
        return AugendStr;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Layout().setVisible(true);
    }
}
