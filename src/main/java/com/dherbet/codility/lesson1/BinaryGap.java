package com.dherbet.codility.lesson1;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingRGMR4Z-2RY/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	Not assessed
 * Task score:	100%
 */
public class BinaryGap {

    public int solution(int N) {
        System.out.println("N = " + N);
        String binaryRepresentation = Integer.toBinaryString(N);
        System.out.println("Binary representation of " + N + " = " + binaryRepresentation);
        boolean oneIsFound = false;
        int binaryGap = 0;
        int sequenceBinaryGap = 0;

        for (char position : binaryRepresentation.toCharArray()) {
            if (position == '1') {
                if (!oneIsFound) {
                    oneIsFound = true;
                    sequenceBinaryGap = 0;
                } else {
                    if (sequenceBinaryGap > binaryGap) {
                        binaryGap = sequenceBinaryGap;
                    }
                    sequenceBinaryGap = 0;
                }
            } else {
                sequenceBinaryGap += 1;
            }
        }

        System.out.println("Binary gap = " + binaryGap);
        return binaryGap;
    }

}
