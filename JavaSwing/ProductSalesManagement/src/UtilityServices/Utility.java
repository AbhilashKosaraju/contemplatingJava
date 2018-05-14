/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilityServices;

import Business.User;
import Business.UserDirectory;
import java.awt.Component;
import java.awt.Image;
import java.awt.List;
import java.io.FileReader;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AbhilashKosaraju
 */
public class Utility {

    //Method to scale an image with respect to the given width and height
    public static ImageIcon ResizeImage(String ImagePath, int Width, int Height) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Width, Height, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    //Custom method to apply validations
    public static String ValidateTextFields(JTextField txt, boolean checkRequired, int onlyDigitsOrDate, int minlength, int maxlength) {
        if (checkRequired) {
            if ((txt.getText()).equals("")) {
                txt.requestFocusInWindow();
                return "Please fill a value in " + txt.getName();
            }
        }
        if (minlength != 0) {
            if ((txt.getText()).length() < minlength) {
                txt.requestFocusInWindow();
                return "Your input in " + txt.getName() + " has to be atleast " + minlength + " characters long!";
            }
        }
        if (maxlength != 0) {
            if ((txt.getText()).length() > maxlength) {
                txt.requestFocusInWindow();
                return "Your input in " + txt.getName() + " cannot exceed " + maxlength + " characters !";
            }
        }
        if (onlyDigitsOrDate == 1)//check Float
        {
            if (!(txt.getText()).matches("(?:[1-9]\\d*|0)?(?:\\.\\d+)?")) {
                txt.requestFocusInWindow();
                return "Please fill only digits/decimal value in " + txt.getName();
            }
        }
        if (onlyDigitsOrDate == 3)//check Int
        {
            if (!(txt.getText()).matches("[0-9]\\d*")) {
                txt.requestFocusInWindow();
                return "Please fill only digits in " + txt.getName();
            }
        }
        if (onlyDigitsOrDate == 2)//check Date
        {
            if (txt.getText().length() == 10) {
                String date = txt.getText();
                String MM = date.substring(0, 2);
                String DD = date.substring(3, 5);
                String YYYY = date.substring(6);
                if (date.substring(2, 3).equals("/") && date.substring(5, 6).equals("/")) {
                    if (MM.matches("[0-9]\\d*") && DD.matches("[0-9]\\d*") && YYYY.matches("[0-9]\\d*")) {
                        if (!(Integer.parseInt(MM) > 0 && Integer.parseInt(MM) < 13)) {
                            txt.requestFocusInWindow();
                            return "Please enter date in a valid MM/DD/YYYY format!";
                        }
                        if (!(Integer.parseInt(DD) > 0 && Integer.parseInt(DD) < 32)) {
                            txt.requestFocusInWindow();
                            return "Please enter date in a valid MM/DD/YYYY format!";
                        }
                        if (!(Integer.parseInt(YYYY) > 1900 && Integer.parseInt(YYYY) <= Calendar.getInstance().get(Calendar.YEAR) + 10)) {
                            txt.requestFocusInWindow();
                            return "Please enter date in a valid MM/DD/YYYY format!";
                        }
                    } else {
                        txt.requestFocusInWindow();
                        return "Please enter date in a valid MM/DD/YYYY format!";
                    }
                } else {
                    txt.requestFocusInWindow();
                    return "Please enter date in a valid MM/DD/YYYY format!";
                }
            } else {
                txt.requestFocusInWindow();
                return "Please enter date in a valid MM/DD/YYYY format!";
            }
        }
        return "";
    }

    public static User isUserValid(String username, char[] inputPass, UserDirectory userDirectory) {
        try {
            for (User u : userDirectory.getUserDirectory()) {
                if (username.equals(u.getUserName())) {
                    if (checkHash(inputPass, u.getPass())) {
                        return u;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error occurred!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        return null;
    }

    private static final int iterations = 20 * 10;
    private static final int saltLen = 32;
    private static final int desiredKeyLen = 256;

    public static String getHash(String pass) {
        try {
            byte[] salt = SecureRandom.getInstance("SHA1PRNG").generateSeed(saltLen);
            // store the salt with the password
            return Base64.getEncoder().encodeToString(salt) + "$" + hashIt(pass, salt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error occurred while hashing!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    }

    private static String hashIt(String pass, byte[] salt) throws Exception {
        if (pass == null || pass.length() == 0) {
            throw new IllegalArgumentException("Empty passwords are not supported.");
        }
        SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        SecretKey key = f.generateSecret(new PBEKeySpec(
                pass.toCharArray(), salt, iterations, desiredKeyLen)
        );
        return Base64.getEncoder().encodeToString(key.getEncoded());
    }

    public static boolean checkHash(char[] passInput, String stored) throws Exception {
        String[] saltAndPass = stored.split("\\$");
        if (saltAndPass.length != 2) {
            JOptionPane.showMessageDialog(null, "The stored password is corrupt", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }

        String hashOfInput = hashIt(String.valueOf(passInput), Base64.getDecoder().decode(saltAndPass[0]));
        return hashOfInput.equals(saltAndPass[1]);
    }
}
