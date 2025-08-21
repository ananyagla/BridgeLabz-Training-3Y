import java.util.Arrays;

public class OTPGenerator {

    // Method to generate 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // ensures 6 digits
    }

    // Generate 10 OTPs
    public static int[] generateOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Check uniqueness
    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = generateOTPs(10);
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("All OTPs unique? " + areUnique(otps));
    }
}

