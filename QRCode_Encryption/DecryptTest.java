import java.security.*;
import javax.crypto.*;
import java.util.Base64;
import javax.crypto.spec.*;
import java.io.*;
    
public class DecryptTest {
    public static void main(String[] args) throws Exception {
        /*String code = args[0];
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec skeySpec = new SecretKeySpec(code.getBytes(""), "AES");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        InputStream in = new FileInputStream(new File("psswd"));
        byte[] encrypted = new byte[(int)new File("psswd").length()];
        in.read(encrypted);
        in.close();
        byte[] original = cipher.doFinal(encrypted);
        String originalString = new String(original, "UTF-8");
        System.out.println(originalString);*/
       
        String code = args[0];
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec skeySpec = new SecretKeySpec(code.getBytes(), "AES");
        Base64.Decoder decoder = Base64.getDecoder();//byte[] encryptedTextByte = decoder.decode(encryptedText);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        InputStream in = new FileInputStream(new File("psswd"));
        byte[] encrypted = new byte[(int)new File("psswd").length()];
        in.read(encrypted);
        //String encryp =new String(encrypted);
       // byte[] encryptedTextByte = decoder.decode(encryp);
        in.close();
        String encryp =new String(encrypted);
	byte[] encryptedTextByte = decoder.decode(encryp);
        //byte[] encryptedTextByte = decoder.decode(encrypted);
        byte[] original = cipher.doFinal(encryptedTextByte);
        String originalString = new String(original,"UTF-8");
        
        System.out.println("The result is\n\t"+originalString);
    }
}
