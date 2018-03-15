package learning;
import java.io.*;


public class Longestsubsequence {
     static void lcs(String X, String Y, int m, int n)
    {
        int[][] L = new int[m+1][n+1];
  
        // Following steps build L[m+1][n+1] in bottom up fashion. Note
        // that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] 
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }
        int index = L[m][n];
        int temp = index;
  
        // Create a character array to store the lcs string
        char[] lcs = new char[index+1];
        lcs[index] = '\0'; // Set the terminating character
  
        // Starting from the [m.n] element of the matrix and populating the array.
        int i = m, j = n;
        while (i > 0 && j > 0)
        {
            // If the characters in the strings match, then populate the array
            if (X.charAt(i-1) == Y.charAt(j-1))
            {
                lcs[index-1] = X.charAt(i-1); 
                 
                // navigating through the matrix and character arrays.
                i--; 
                j--; 
                index--;     
            }
              //when the characters do not match,then the proceed in the direction of largest value in the matrix
            else if (L[i-1][j] > L[i][j-1])
                i--;
            else
                j--;
        }
  
        // Print the lcs
        System.out.print("LCS of "+X+" and "+Y+" is ");
        for(int k=0;k<=temp;k++)
            System.out.print(lcs[k]);
    }
     
    // driver program
    public static void main (String[] args) throws IOException 
    {
        String X;
        String Y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the strings");
        X=reader.readLine();
        Y=reader.readLine();
//        String X = "AGGTAB";
//        String Y = "GXTXAYB";
        int m = X.length();
        int n = Y.length();
        lcs(X, Y, m, n);
    }
}
