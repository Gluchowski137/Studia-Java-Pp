public class Main {

    public static void main(String[] args) {
        // Przykładowe użycie funkcji
        wykonajOperacjeMatematyczne(10, 5);
        obliczSrednia(new int[]{1, 2, 3, 4, 5});
        sprawdzParzystosc(4);
        obliczBMI(70, 1.75);
        obliczSredniaOcen(new double[]{2, 3.5, 5, 4.5, 5});
        sprawdzPalindrom("kajak");
        System.out.println(znajdzIndeks(new int[]{10, 20, 30, 40, 50}, 30));
        System.out.println(java.util.Arrays.toString(liczbyPierwszeWZakresie(2, 10)));
        System.out.println(liczWystapienia(new int[]{1, 2, 3, 4, 5, 2, 2}, 2));
        System.out.println(sumaDoN(5));
    }

    public static void wykonajOperacjeMatematyczne(int a, int b) {
        System.out.println("Dodawanie: " + (a + b));
        System.out.println("Odejmowanie: " + (a - b));
        System.out.println("Mnożenie: " + (a * b));
        System.out.println("Dzielenie: " + (a / (double) b));
    }

    public static void obliczSrednia(int[] liczby) {
        int suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }
        double srednia = suma / (double) liczby.length;
        System.out.println("Średnia: " + srednia);
    }

    public static void sprawdzParzystosc(int liczba) {
        System.out.println(liczba + " jest " + (liczba % 2 == 0 ? "parzysta" : "nieparzysta"));
    }

    public static void obliczBMI(double waga, double wzrost) {
        double bmi = waga / (wzrost * wzrost);
        System.out.println("BMI: " + bmi);
    }

    public static void obliczSredniaOcen(double[] oceny) {
        double suma = 0;
        for (double ocena : oceny) {
            suma += ocena;
        }
        double srednia = suma / oceny.length;
        System.out.println("Średnia ocen: " + srednia);
    }

    public static void sprawdzPalindrom(String slowo) {
        String odwrocone = new StringBuilder(slowo).reverse().toString();
        System.out.println("Słowo " + slowo + " jest " + (slowo.equals(odwrocone) ? "" : "nie ") + "palindromem");
    }

    public static int znajdzIndeks(int[] tablica, int liczba) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == liczba) {
                return i;
            }
        }
        return -1; // Jeśli nie znaleziono liczby
    }

    public static int[] liczbyPierwszeWZakresie(int start, int koniec) {
        return java.util.stream.IntStream.rangeClosed(start, koniec)
                .filter(Main::czyPierwsza)
                .toArray();
    }

    private static boolean czyPierwsza(int liczba) {
        if (liczba <= 1) return false;
        for (int i = 2; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) return false;
        }
        return true;
    }

    public static int liczWystapienia(int[] tablica, int liczba) {
        int licznik = 0;
        for (int wartosc : tablica) {
            if (wartosc == liczba) {
                licznik++;
            }
        }
        return licznik;
    }

    public static int sumaDoN(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumaDoN(n - 1);
    }
}
