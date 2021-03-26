package dk.easv;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger n = BigInteger.ONE;
        for(int i = 2; i > 0; i++) {
            for(int j = 2; j > 0; j++){
                n = n.multiply(BigInteger.valueOf(i));
                System.out.println(n);
            }
            n = n.multiply(BigInteger.valueOf(i));
            System.out.println(n);
        }
    }
}
