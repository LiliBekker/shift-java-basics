package homework18;


public class LogicalOperationTable {

    public static void main(String[] args) {
        System.out.println("Задача №1- Таблица истинности");
        printTruthTable();
    }

    private static void printTruthTable() {
        System.out.println("P\t\tQ\t\tP AND Q\t\tP OR Q\t\tP XOR Q\t\tNOT P");

        boolean[] values = {false, true};

        for (boolean q : values) {
            for (boolean p : values) {
                System.out.println(
                        p + "\t" + q + "\t" + (p && q) + "\t\t" + (p || q) + "\t\t" + (p ^ q) + "\t\t" + (!p)
                );
            }
        }
    }
}