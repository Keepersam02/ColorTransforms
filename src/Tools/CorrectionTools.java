package Tools;

public class CorrectionTools {

    public static double linearExposure(double input, double adjustment) {
        return input * Math.pow(2, adjustment);
    }

    public static double gain(double input, double adjustment) {
        return input * adjustment;
    }


}
