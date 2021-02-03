package dk.easv;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger n = BigInteger.ONE;
        for(int i = 2; i > 0; i++) {
            n = n.multiply(BigInteger.valueOf(i));
            System.out.println(n);
        }
    }
}
