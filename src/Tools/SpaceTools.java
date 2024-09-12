package Tools;

import ColorObj.*;

public class SpaceTools {
    public static Color[][][] gen8BitColorSpace() {
        Color[][][] colorSpace = new Color[256][256][256];

        for (int i = 1; i < 256; i++) {
            for (int j = 1; j < 256; j++) {
                for (int k = 1; k < 256; k++) {
                    colorSpace[i][j][k] = new Color((i - 1) / 255, (j - 1) / 255, (k - 1) / 255);
                }
            }
        }
        return colorSpace;
    }
}
