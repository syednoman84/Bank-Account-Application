package bankaccountapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Playground {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<Account>();

        //Read a CSV File, then create new accounts based on that data
        String file = "C:\\Noman\\code\\github\\Bank-Account-Application\\playground.csv";
        List<String> fileData = readRows(file);
        for(int i=0; i<fileData.size()-1; i=i+2){
            String s = fileData.get(i) + " - " + fileData.get(i+1);
            System.out.println(s);
        }
    }

    // The CSV file reading utility
    public static List<String> readRows(String file) {
        List<String> data = new LinkedList<String>();
        String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((dataRow = br.readLine()) != null) {
                data.add(dataRow);
            }
        } catch (FileNotFoundException e) {
            System.out.println("COULD NOT FIND FILE");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }

        return data;
    }
}
