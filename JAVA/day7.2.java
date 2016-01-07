import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        String output = "";
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
            output = arr[i] + " " + output;
        }
        System.out.println(output);
    }
}
