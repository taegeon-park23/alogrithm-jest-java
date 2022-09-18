package com.example.algorithm.level1;

public class SquareRootDiscriminationImpl implements SquareRootDiscrimination {

    @Override
    public long solution(long n) {
        double squarRoot = Math.sqrt(n);
        long exponent = (long) squarRoot;
        double fraction = squarRoot - exponent;

        if (fraction > 0)
            return -1;

        return (exponent + 1) * (exponent + 1);
    }

}
