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
<<<<<<< HEAD
                mNum = "0";
                mAugendNum = "";
                notifyobserver();
                break;
            case CLEAR_ENTRY:
                if (mNum.length() != 0) {
                    mNum = "0";
=======
                Num = "0";
                AugendNum = "";
                notifyobserver();
                break;
            case CLEAR_ENTRY:
                if (Num.length() != 0) {
                    Num = "0";
>>>>>>> origin/master
                }
                notifyobserver();
                break;
            case BACKSPACE:
<<<<<<< HEAD
                if (mNum.length() == 0 && mAugendNum.length() != 0 && OperatorUse.length() == 0) {
                    mAugendNum = mAugendNum.replace(mAugendNum, mAugendNum.substring(0, mAugendNum.length() - 1).toString());
                }
                if (mNum.length() == 0 && mAugendNum.length() != 0 && OperatorUse.length() != 0) {
                    OperatorUse = "";
                }
                if (mNum.length() != 0) {
                    mNum = mNum.replace(mNum, mNum.substring(0, mNum.length() - 1).toString());
=======
                if (Num.length() == 0 && AugendNum.length() != 0 && OperatorUse.length() == 0) {
                    AugendNum = AugendNum.replace(AugendNum, AugendNum.substring(0, AugendNum.length() - 1).toString());
                }
                if (Num.length() == 0 && AugendNum.length() != 0 && OperatorUse.length() != 0) {
                    OperatorUse = "";
                }
                if (Num.length() != 0) {
                    Num = Num.replace(Num, Num.substring(0, Num.length() - 1).toString());
>>>>>>> origin/master
                }
                notifyobserver();
                break;
            case OVER:
<<<<<<< HEAD
                performOperation(Operator.EQUAL);
                if (mNum.length() != 0) {
                    mAugendNum = mNum;
                    mNum = "";
                    OperatorUse = "/";
                    mOperatorUsed = true;
=======
                if (Num.length() != 0) {
                    AugendNum = Num;
                    Num = "";
                    OperatorUse = "/";
                    OperatorUsed = true;
>>>>>>> origin/master
                }
                notifyobserver();
                break;
            case TIMES:
<<<<<<< HEAD
                performOperation(Operator.EQUAL);
                if (mNum.length() != 0) {
                    mAugendNum = mNum;
                    mNum = "";
                    OperatorUse = "*";
                    mOperatorUsed = true;
=======
                if (Num.length() != 0) {
                    AugendNum = Num;
                    Num = "";
                    OperatorUse = "*";
                    OperatorUsed = true;
>>>>>>> origin/master
                }
                notifyobserver();
                break;
            case MINUS:
<<<<<<< HEAD
                performOperation(Operator.EQUAL);
                if (mNum.length() != 0) {
                    mAugendNum = mNum;
                    mNum = "";
                    OperatorUse = "-";
                    mOperatorUsed = true;
=======
                if (Num.length() != 0) {
                    AugendNum = Num;
                    Num = "";
                    OperatorUse = "-";
                    OperatorUsed = true;
>>>>>>> origin/master
                }
                notifyobserver();
                break;
            case PLUS:
<<<<<<< HEAD
                performOperation(Operator.EQUAL);
                if (mNum.length() != 0) {
                    mAugendNum = mNum;
                    mNum = "";
                    OperatorUse = "+";
                    mOperatorUsed = true;
=======
                if (Num.length() != 0) {
                    AugendNum = Num;
                    Num = "";
                    OperatorUse = "+";
                    OperatorUsed = true;
>>>>>>> origin/master
                }
                notifyobserver();
                break;
            case RECIPROCAL:
<<<<<<< HEAD
                if (mNum.length() != 0) {
                    mNum = String.valueOf(1 / Double.parseDouble(mNum));
=======
                if (Num.length() != 0) {
                    Num = String.valueOf(1 / Double.parseDouble(Num));
>>>>>>> origin/master
                }
                notifyobserver();
                break;
            case PERCENT:
<<<<<<< HEAD
                if (mNum.length() != 0) {
                    NumberFormat nt = NumberFormat.getInstance();
                    nt.setMinimumFractionDigits(2);
                    mNum = String.valueOf(nt.format(Double.parseDouble(mNum) * 0.01));
=======
                if (Num.length() != 0) {
                    NumberFormat nt = NumberFormat.getInstance();
                    nt.setMinimumFractionDigits(2);
                    Num = String.valueOf(nt.format(Double.parseDouble(Num) * 0.01));
>>>>>>> origin/master
                }
                notifyobserver();
                break;
            case PLUS_MINUS:
<<<<<<< HEAD
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
                if ((mNum.length() != 0) && (mAugendNum.length() != 0) && (OperatorUse.length() != 0)) {
                    switch (OperatorUse) {
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
                    OperatorUse = "";
                    mAugendNum = "";
                    mDot = false;
                    mOperatorUsed = false;
=======
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
>>>>>>> origin/master
                }
                notifyobserver();
                break;
            case SQRT:
<<<<<<< HEAD
                if (!mOperatorUsed) {
                    mNum = String.valueOf(Math.sqrt(Double.parseDouble(mNum)));
                }
                notifyobserver();
                break;
        }     
=======
                if (!OperatorUsed) {
                    Num = String.valueOf(Math.sqrt(Double.parseDouble(Num)));
                }
                notifyobserver();
                break;
        }
        /* } else {
         if ((Num.length() != 0) && (AugendNum.length() != 0) && (OperatorUse.length() != 0)) {
         switch (OperatorUse) {
         case "+":
         AugendNum = String.valueOf(Double.parseDouble(AugendNum) + Double.parseDouble(Num));
         break;
         case "-":
         AugendNum = String.valueOf(Double.parseDouble(AugendNum) - Double.parseDouble(Num));
         break;
         case "*":
         AugendNum = String.valueOf(Double.parseDouble(AugendNum) * Double.parseDouble(Num));
         break;
         case "/":
         AugendNum = String.valueOf(Double.parseDouble(AugendNum) / Double.parseDouble(Num));
         break;
         }
         }
         OperatorUse = "";
         Dot = false;
         Num = "";
         OperatorUsed = false;
         switch (operator) {
         case CLEAR:
         Num = "0";
         AugendNum = "";
         notifyobserver();
         break;
         case CLEAR_ENTRY:
         Num = "0";
         AugendNum = "";
         notifyobserver();
         break;
         case BACKSPACE:
         if (Num.length() != 0) {
         Num = Num.replace(Num, Num.substring(0, Num.length() - 1).toString());
         }
         if (Num.length() == 0 && AugendNum.length() != 0) {
         AugendNum = AugendNum.replace(AugendNum, AugendNum.substring(0, AugendNum.length() - 1).toString());
         }
         notifyobserver();
         break;
         case OVER:
         if (AugendNum.length() != 0) {
         //AugendNum = Num;
         Num = "";
         OperatorUse = "/";
         OperatorUsed = true;
         }
         notifyobserver();
         break;
         case TIMES:
         if (AugendNum.length() != 0) {
         //AugendNum = Num;
         Num = "";
         OperatorUse = "*";
         OperatorUsed = true;
         }
         notifyobserver();
         break;
         case MINUS:
         if (AugendNum.length() != 0) {
         //AugendNum = Num;
         Num = "";
         OperatorUse = "-";
         OperatorUsed = true;
         }
         notifyobserver();
         break;
         case PLUS:
         if (AugendNum.length() != 0) {
         //AugendNum = Num;
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
         if (AugendNum.length() != 0) {
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
         AugendNum = String.valueOf(Double.parseDouble(AugendNum) + Double.parseDouble(Num));
         break;
         case "-":
         AugendNum = String.valueOf(Double.parseDouble(AugendNum) - Double.parseDouble(Num));
         break;
         case "*":
         AugendNum = String.valueOf(Double.parseDouble(AugendNum) * Double.parseDouble(Num));
         break;
         case "/":
         AugendNum = String.valueOf(Double.parseDouble(AugendNum) / Double.parseDouble(Num));
         break;
         }
         OperatorUse = "";
         Num = "";
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
         }*/
>>>>>>> origin/master
    }

    /**
     * return anser to display on view's label
     *
     * @return anser
     */
    public String getDisplay() {
        String mAugendStr = mAugendNum + " " + OperatorUse + " " + mNum;
        return mAugendStr;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Layout().setVisible(true);
    }
}
