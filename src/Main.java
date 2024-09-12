import ColorObj.ColorSpaces;
import Tools.Information;
import Tools.SpaceTools;

public class Main {
    public static void main(String[] args) {

        ColorSpaces firstColorSpace = new ColorSpaces("Space1", 256, 256, 256, null, null  );

        firstColorSpace.setColorArray(SpaceTools.gen8BitColorSpace());

        System.out.println(firstColorSpace.getName());
        System.out.println(firstColorSpace.getColor(10,10,10).getB());
        System.out.printf("%6.5f", firstColorSpace.getColor(200,200,200).getB());

        //Information.printColorSpace(firstColorSpace.getColorArray());

        Information.printMax(firstColorSpace.getColorArray());
    }
}