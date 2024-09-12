package Tools;

import ColorObj.*;

public class SpaceTools {
    public static Color[][][] gen8BitColorSpace() {
        Color[][][] colorSpace = new Color[256][256][256];

        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 256; j++) {
                for (int k = 0; k < 256; k++) {
                    double red = i / 255.0;
                    double green = j / 255.0;
                    double blue = k / 255.0;
                    colorSpace[i][j][k] = new Color(red, green, blue);
                }
            }
        }
        return colorSpace;
    }
}
