package Tools;

import ColorObj.Color;
import ColorObj.ColorSpaces;

import java.awt.color.ColorSpace;

public class Information {

    public static void printColorSpace(Color[][][] colorArray) {


        for (int i = 0; i < colorArray.length; i++) {
            for (int j = 0; j < colorArray[i].length; j++) {
                for (int k = 0; k < colorArray[i][j].length; k++) {
                    double b = 0;
                    double g = 0;
                    double r = 0;
                    if (colorArray[i][j][k] != null) {
                        r = colorArray[i][j][k].getR();
                        g = colorArray[i][j][k].getG();
                        b = colorArray[i][j][k].getB();
                        System.out.printf("[%4.3f,%4.3f,%4.3f]", r, g, b);

                    } else {
                        System.out.printf("[%4.3f,%4.3f,%4.3f]", r, g, b);
                    }
                }
            }
        }
    }

    public static void printMax(Color[][][] colorArray) {
        int min = 0;
        int max = colorArray.length;
        Color old = new Color(0,0,0);
        for(int i = 0; i < colorArray.length; i++){
            for(int j = 0; j < colorArray[i].length; j++){
                for(int k = 0; k < colorArray[i][j].length; k++){
                    double newAverage = (colorArray[i][j][k].getR() + colorArray[i][j][k].getG() + colorArray[i][j][k].getB()) / 3;
                    double oldAverage = (old.getR() + old.getG() + old.getB()) / 3;
                    if(newAverage > oldAverage){
                        old = colorArray[i][j][k];

                    }
                }
            }
        }
        double finalAverage = (old.getR() + old.getG() + old.getB()) / 3;
        System.out.printf("Max Color for your array %6.5f", finalAverage);
    }


}
