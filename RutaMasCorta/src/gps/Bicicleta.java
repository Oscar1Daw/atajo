package gps;

public class Bicicleta {
    public Bicicleta() {
        int ruedas = true;
        boolean luces = false;
        String marca = "Orbea";
    }

    public static int longitud(int[] camino1, int[] camino2, int[] camino3) {
        int longitud1 = camino1.length;
        int longitud2 = camino2.length;
        int longitud3 = camino3.length;
        if (longitud2 < longitud1 && longitud3 < longitud1) {
            return longitud1;
        } else if (longitud1 < longitud2 && longitud3 < longitud2) {
            return longitud2;
        } else if (longitud1 < longitud3 && longitud2 < longitud3) {
            return longitud3;
        } else if (longitud1 == longitud2 && longitud2 == longitud3) {
            return longitud1;
        } else if (longitud1 == longitud2) {
            return longitud1;
        } else {
            return longitud2 == longitud3 ? longitud2 : longitud3;
        }
    }

    public static String rutaCorta(int[] camino1, int[] camino2, int[] camino3) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for(int i = 0; i < longitud(camino1, camino2, camino3); ++i) {
            if (i < camino1.length) {
                sum1 += camino1[i];
            }

            if (i < camino2.length) {
                sum2 += camino2[i];
            }

            if (i < camino3.length) {
                sum3 += camino3[i];
            }
        }

        if (sum1 < sum2 && sum1 < sum3) {
            return "camino 1";
        } else if (sum2 < sum3 && sum2 < sum1) {
            return "camino 2";
        } else if (sum3 < sum1 && sum3 < sum2) {
            return "camino 3";
        } else if (sum1 == sum2 && sum2 == sum3) {
            return "camino 1, 2 y 3";
        } else if (sum1 == sum3) {
            return "caminos 1 y 3";
        } else if (sum2 == sum3) {
            return "caminos 2 y 3";
        } else {
            return "caminos 1 y 2";
        }
    }

    public static void main(String[] args) {
        new Bicicleta();
        int[] camino1 = new int[]{12, 34, 21, 46, 25};
        int[] camino2 = new int[]{24, 1, 5, 64, 10, 15, 21};
        int[] camino3 = new int[]{1, 5, 6, 7, 8, 10, 20, 46, 104};
        int longitud1 = camino1.length;
        int longitud2 = camino2.length;
        int longitud3 = camino3.length;
        System.out.println("El camino más corto es:" + rutaCorta(camino1, camino2, camino3) + ".");
    }
}
