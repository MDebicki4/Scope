package com.javablop;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": varOne = " + varOne);

    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
        }
        //System.out.println("Vaelue now is " + i);
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    public class InnerClass {
        private int varThree = 3;

        public void InnerClass() {
            System.out.println("Inner Class created, varOne is " + varOne + " and varThree is " + varThree);
        }

        public void timesTwo() {
            ScopeCheck.this.timesTwo();
            System.out.println("varOne is still available here: " + varOne);

            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * varThree);
            }
            //System.out.println("Vaelue now is " + i);
        }
    }
}
