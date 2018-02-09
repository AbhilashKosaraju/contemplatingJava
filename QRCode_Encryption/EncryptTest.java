import java.security.*;
import javax.crypto.*;
import java.util.Base64;
import javax.crypto.spec.*;
import java.io.*;
 
public class EncryptTest 
  {
    String code;
    public static void main(String[] args) throws IOException 
    {
    EncryptTest tester = new EncryptTest();
    tester.start(args);
    }
    public void start (String[] args) 
    {
        code = args[0];
        args[0] = null;
        for (String lines : args) 
          {
            if (lines != null) 
               {
                if (lines == args[1])
                  {
                    createFile(lines);
                  }
                else 
                  {
                    addToFile(lines);
                  }
               }
         }
    }
   
    public void createFile (String toEncode) 
    {
     try{
       /* SecretKeySpec skeySpec = new SecretKeySpec(code.getBytes("UTF-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(toEncode.getBytes("UTF-8"));
        OutputStream out = new FileOutputStream("psswd");
        out.write(encrypted);
        out.close();*/
        SecretKeySpec skeySpec = new SecretKeySpec(code.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(toEncode.getBytes()); 
        Base64.Encoder encoder = Base64.getEncoder();
        OutputStream out = new FileOutputStream("psswd");   
        String encryptedText = encoder.encodeToString(encrypted);
        out.write(encryptedText.getBytes());
        out.close();
        }
     catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public void addToFile(String toEncode) 
    {
    try
     {
       /* SecretKeySpec skeySpec = new SecretKeySpec(code.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(toEncode.getBytes());
        byte[] spacer = cipher.doFinal(System.getProperty("line.separator").getBytes());
            OutputStream out = new FileOutputStream("psswd", true);
            out.write(spacer);
            out.write(encrypted);
            out.close();*/
       
        SecretKeySpec skeySpec = new SecretKeySpec(code.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        Base64.Encoder encoder = Base64.getEncoder();
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(toEncode.getBytes());
        String encrypt = encoder.encodeToString(encrypted);
        //Base64.Encoder encoder = Base64.getEncoder();
        byte[] spacer = cipher.doFinal(System.getProperty("line.separator").getBytes());
        String encryptText = encoder.encodeToString(spacer);
            OutputStream out = new FileOutputStream("psswd", true);
            out.write(encryptText.getBytes());
            out.write(encrypt.getBytes());
            out.close();
     }
    catch (Exception e)
     {
            System.err.println("Error: " + e.getMessage());
     }
   }
}
