package test;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Random {
    public static void main(String[] args) throws Exception{
        final int number0 =100;
        java.util.Random random = new java.util.Random();
        String[] number1 = new String[100];
        int cot;
        for (int i = 0; i < number0; i++) {
            cot = random.nextInt(100);
            number1[i] = "随机数"+cot+" ";
        }
        File file = new File("D:\\test.txt");
        try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String num:number1) {
                bufferedWriter.write(num);
            }
            bufferedWriter.close();
            fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
