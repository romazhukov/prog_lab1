import static java.lang.Math .*;

public class Main {
    public static void main(String[] args) {
        short z[] = new short[9];
        double x[] = new double[10];
        double z1[][] = new double[9][10];
        double[] transformed_z = new double[9]; // эта переменная нужна для того чтобы перевести z[] из short в double

        array_filling_1(z); // заполнение первого массива
        array_filling_2(x); // заполнение второго массива
        transformation_short_to_double(z, transformed_z); // метод для перевода массива из одного типа в другой
        array_filling_3(z1, x, transformed_z); // заполнение и вывод третьего массива
    }

    public static void array_filling_1(short[] z) {
        short counter = 19;
        for(int i = 0; i < z.length; i++){
            z[i] = counter;
            counter -= 2;
        }
    }

    public static void array_filling_2(double[] x) {
        double max = 2.0;
        double min = -5.0;
        for(int i = 0; i < x.length; i++) {
            double randomNum = random() * ((max - min)) + min;
            x[i] = randomNum;
        }
    }

    public static void array_filling_3(double[][] z1, double[] x, double[] transformed_z) {
        for(int i = 0; i < z1.length; i++) {
            for (int j = 0; j < z1[i].length; j++) {
                double x1 = x[j];
                if (transformed_z[i] == 17) {
                    z1[i][j] = 2 * log((2 + abs(x1) / 3));
                }
                else if (transformed_z[i] == 7 || transformed_z[i] == 11 || transformed_z[i] == 13 || transformed_z[i] == 15) {
                    z1[i][j] = atan(cos(pow(((atan((x1 - 1.5) / 7) - PI) / 2), 3)));
                }
                else{
                    z1[i][j] = atan(pow((cos(tan(cos(x1)))), 3));
                }
                System.out.printf("%7.3f",z1[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static void transformation_short_to_double(short[] z, double[] transformed_z){
        for (int y = 0; y < z.length; y++) {
            transformed_z[y] = (double)z[y];
        }
    }
}
