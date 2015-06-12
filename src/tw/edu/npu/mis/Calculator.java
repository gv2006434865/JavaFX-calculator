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
 *
 * @author AN
 */
public class Calculator extends Subject {

    private String mData;
    String mNum = "";
    String mAugendNum = "";
    Boolean mDot = false;
    Boolean mOperatorUsed = false;
    String mOperatorUse = "";
    String mMenStr = "";

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
     *
     * @param digit string of addend and augend
     */
    public void appendDigit(int digit) {
        if (mNum.equals("0")) {
            mNum = String.valueOf(digit);
        } else {
            mNum += digit;
        }
        notifyobserver();
    }

    /**
     * get point to let int tobe float
     */
    public void appendDot() {
        if (!mDot) {
            mNum += ".";
        }
        mDot = true;
        notifyobserver();
    }

    /**
     * choose operator to calculate and get anser digit
     *
     * @param operator available operators
     */
    public void performOperation(Operator operator) {
        //if (!OperatorUsed) {
        switch (operator) {
            case CLEAR:
                mNum = "0";
                mAugendNum = "";
                notifyobserver();
                break;
            case CLEAR_ENTRY:
                if (mNum.length() != 0) {
                    mNum = "0";
                }
                notifyobserver();
                break;
            case BACKSPACE:
                if (mNum.length() == 0 && mAugendNum.length() != 0 && mOperatorUse.length() == 0) {
                    mAugendNum = mAugendNum.replace(mAugendNum, mAugendNum.substring(0, mAugendNum.length() - 1).toString());
                }
                if (mNum.length() == 0 && mAugendNum.length() != 0 && mOperatorUse.length() != 0) {
                    mOperatorUse = "";
                }
                if (mNum.length() != 0) {
                    mNum = mNum.replace(mNum, mNum.substring(0, mNum.length() - 1).toString());
                }
                notifyobserver();
                break;
            case OVER:
                performOperation(Operator.EQUAL);
                if (mNum.length() != 0) {
                    mAugendNum = mNum;
                    mNum = "";
                    mOperatorUse = "/";
                    mOperatorUsed = true;
                }
                notifyobserver();
                break;
            case TIMES:
                performOperation(Operator.EQUAL);
                if (mNum.length() != 0) {
                    mAugendNum = mNum;
                    mNum = "";
                    mOperatorUse = "*";
                    mOperatorUsed = true;
                }
                notifyobserver();
                break;
            case MINUS:
                performOperation(Operator.EQUAL);
                if (mNum.length() != 0) {
                    mAugendNum = mNum;
                    mNum = "";
                    mOperatorUse = "-";
                    mOperatorUsed = true;
                }
                notifyobserver();
                break;
            case PLUS:
                performOperation(Operator.EQUAL);
                if (mNum.length() != 0) {
                    mAugendNum = mNum;
                    mNum = "";
                    mOperatorUse = "+";
                    mOperatorUsed = true;
                }
                notifyobserver();
                break;
            case RECIPROCAL:
                if (mNum.length() != 0) {
                    mNum = String.valueOf(1 / Double.parseDouble(mNum));
                }
                notifyobserver();
                break;
            case PERCENT:
                if (mNum.length() != 0) {
                    NumberFormat nt = NumberFormat.getInstance();
                    nt.setMinimumFractionDigits(2);
                    mNum = String.valueOf(nt.format(Double.parseDouble(mNum) * 0.01));
                }
                notifyobserver();
                break;
            case PLUS_MINUS:
                if (mNum.length() != 0) {
                    if (Double.parseDouble(mNum) > 0) {
                        mNum = "-" + mNum;
                    } else {
                        mNum = String.valueOf(0.0 - Double.parseDouble(mNum));
                    }
                }
                notifyobserver();
                break;
            case EQUAL:
                if ((mNum.length() != 0) && (mAugendNum.length() != 0) && (mOperatorUse.length() != 0)) {
                    switch (mOperatorUse) {
                        case "+":
                            mNum = String.valueOf(Double.parseDouble(mAugendNum) + Double.parseDouble(mNum));
                            break;
                        case "-":
                            mNum = String.valueOf(Double.parseDouble(mAugendNum) - Double.parseDouble(mNum));
                            break;
                        case "*":
                            mNum = String.valueOf(Double.parseDouble(mAugendNum) * Double.parseDouble(mNum));
                            break;
                        case "/":
                            mNum = String.valueOf(Double.parseDouble(mAugendNum) / Double.parseDouble(mNum));
                            break;
                    }
                    mOperatorUse = "";
                    mAugendNum = "";
                    mDot = false;
                    mOperatorUsed = false;
                }
                notifyobserver();
                break;
            case SQRT:
                if (!mOperatorUsed) {
                    mNum = String.valueOf(Math.sqrt(Double.parseDouble(mNum)));
                }
                notifyobserver();
                break;
            case MEM_CLEAR:
                mMenStr = "";
                break;
            case MEM_PLUS:
                break;
            case MEM_MINUS:
                break;
            case MEM_SET:
                performOperation(Operator.EQUAL);
                mMenStr = "";
                if (mNum.length() != 0) {
                    if (Integer.parseInt(mNum) > 0) {
                        performOperation(Operator.MEM_PLUS);
                    } else {
                        performOperation(Operator.MEM_MINUS);
                    }
                }
                break;
            case MEM_RECALL:
                break;
        }
    }

    /**
     * return anser to display on view's label
     *
     * @return anser
     */
    public String getDisplay() {
        String mAugendStr = mAugendNum + " " + mOperatorUse + " " + mNum;
        return mAugendStr;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Layout().setVisible(true);
    }
}
