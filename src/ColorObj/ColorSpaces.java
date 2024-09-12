package ColorObj;

public class ColorSpaces {

    private String name, colorSpace;
    private int xDim, yDim, zDim;
    private double gamma;
    private Color[][] greyScaleArray;
    private Color[][][] colorArray;


    public ColorSpaces(String name, int xDim, int yDim, int zDim, Color[][] greyColorScale,  Color[][][] colorArray) {
        this.name = name;
        this.xDim = xDim;
        this.yDim = yDim;
        this.zDim = zDim;
        this.greyScaleArray = genGreyScaleArray(xDim, yDim);
        this.colorArray = genColorArray(xDim, yDim, zDim);
    }

    public ColorSpaces() {
    }

    public Color[][] genGreyScaleArray(int xDim, int yDim) {
        Color[][] greyScaleArray = new Color[xDim][yDim];
        return greyScaleArray;
    }

    public Color[][][] genColorArray(int xDim, int yDim, int zDim) {
        Color[][][] colorArray = new Color[xDim][yDim][zDim];
        return colorArray;
    }

    public String getColorSpace() {
        return colorSpace;
    }

    public void setColorSpace(String colorSpace) {
        this.colorSpace = colorSpace;
    }

    public double getGamma() {
        return gamma;
    }

    public void setGamma(double gamma) {
        this.gamma = gamma;
    }

    public Color[][] getGreyScaleArray() {
        return greyScaleArray;
    }

    public void setGreyScaleArray(Color[][] greyScaleArray) {
        this.greyScaleArray = greyScaleArray;
    }

    public Color[][][] getColorArray() {
        return colorArray;
    }

    public void setColorArray(Color[][][] colorArray) {
        if (colorArray != null) {
            this.colorArray = colorArray;
        }
    }

    public Color getColor(int x, int y, int z) {
        return colorArray[x][y][z];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getxDim() {
        return xDim;
    }

    public void setxDim(int xDim) {
        this.xDim = xDim;
    }

    public int getyDim() {
        return yDim;
    }

    public void setyDim(int yDim) {
        this.yDim = yDim;
    }

    public int getzDim() {
        return zDim;
    }

    public void setzDim(int zDim) {
        this.zDim = zDim;
    }
}
