/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

import static java.lang.Math.pow;

/**
 *
 * @author AbhilashKosaraju
 */
public class HashCode {

    public static void main(String args[]) {

        String code = "This is a Test for hash code";
        int hashcode = 0;
        hashcode = Hashing(code);

        System.out.println(hashcode);
        System.out.println(code.hashCode());

    }

    public static int Hashing(String s) {

        int length = s.length() - 1;
        int hashcode = 0;
        int hash = 0;

        for (int i = 0; i < length; i++) {
            //hash = s.charAt(i);
            //System.out.println(hash);
            //hashing using a prime number 31, to acheive unique hashcode and less collisions
            hashcode += s.charAt(i) * ((pow(31, (length - i))));
        }
        return hashcode;
    }
}
