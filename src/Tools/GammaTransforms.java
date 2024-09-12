package Tools;

public class GammaTransforms {
    public static double gammaToLinear(double input, double gammaTransform) {
        return Math.pow(input, 1 / gammaTransform);
    }

    public static double linearToGamma(double input, double gammaTransform) {
        return gammaToLinear(input, gammaTransform);
    }
}
