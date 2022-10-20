package UnitTesting;

public class ParametrTesting {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static double calculator(double a, double b)
    {
        double result = a+b;
        return result;
    }


    public static String encrypt (String stringIn)
    {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<stringIn.length(); i++) {
            int k = stringIn.charAt(i);
            k += 3;
            char encrypted = (char) k;
            sb.append(encrypted);
        }
        String finished = sb.toString();
        return finished;
        }

        public static String decrypt(String stringIn)
        {
            StringBuilder message = new StringBuilder("");
            for(int i =0; i<stringIn.length(); i++) {
                int k = stringIn.charAt(i);
                k -= 3;
                char decrypted = (char) k;
                message.append(decrypted);
            }
            String finished = message.toString();
            return finished;
            }
        }


