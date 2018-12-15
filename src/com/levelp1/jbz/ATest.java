package com.levelp1.jbz;

public class ATest {
    public static void main(String[] args) {

                    // 1 Beispiel

        System.out.println((new MulOp<Integer>(new Const<Integer>(3), new AddOp<Integer>(new
                Const<Integer>(1), new Const<Integer>(2)))).toString());
        System.out.println((new MulOp<Integer>(new Const<Integer>(3), new AddOp<Integer>(new
                Const<Integer>(1), new Const<Integer>(2)))).evaluate());

                    // 2 Beispiel

        System.out.println((new AndOp<Boolean>(new Const<Boolean>(true), new OrOp<Boolean>(new
                Const<Boolean>(false), new Const<Boolean>(true)))).toString());
        System.out.println((new AndOp<Boolean>(new Const<Boolean>(true), new OrOp<Boolean>(new
                Const<Boolean>(false), new Const<Boolean>(true)))).evaluate());

                    // 3 Beispiel

        System.out.println((new DivOp<Integer>(new Const<Integer>(300), new SubOp<Integer>(new
                Const<Integer>(100), new Const<Integer>(123)))).toString());
        System.out.println((new DivOp<Integer>(new Const<Integer>(300), new SubOp<Integer>(new
                Const<Integer>(100), new Const<Integer>(123)))).evaluate());

                    // 4 Beispiel

        System.out.println((new SubOp<Integer>(new Const<Integer>(43), new MulOp<Integer>(new
                Const<Integer>(1), new Const<Integer>(29)))).toString());
        System.out.println((new SubOp<Integer>(new Const<Integer>(43), new MulOp<Integer>(new
                Const<Integer>(1), new Const<Integer>(29)))).evaluate());


    }
}
