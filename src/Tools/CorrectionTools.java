package Tools;

public class CorrectionTools {

    public static double linearExposure(double input, double adjustment) {
        double output = input * Math.pow(2, adjustment);
        checkClip(output);
        return output;
    }

    public static double gain(double input, double adjustment) {
        double output = input * adjustment;
        checkClip(output);
        return output;
    }

    public static double lift(double input, double adjustment) {
        double output;
        output = adjustment * (input - 1) + 1;
        checkClip(output);
        return output;
    }

    public static double gamma(double input, double adjustment) {
        double output;
        output = Math.pow(input, 1 / adjustment);
        checkClip(output);
        return output;
    }

    public static double offset(double input, double adjustment) {
        double output;
        output = input + adjustment;
        checkClip(output);
        return output;
    }

    public static double checkClip(double input) {
        if (input > 1) {
            return 1;
        } else if (input < 0) {
            return 0;
        } else {
            return input;
        }
    }
}
