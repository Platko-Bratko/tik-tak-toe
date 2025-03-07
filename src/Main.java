import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.out;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int Ongoing = 1;
        int victory = 0;
        int nullswon = 0;
        int krestswon = 0;

        while (Ongoing == 1) {


                int Iteration = 0;

                int existing = 0;

                Scanner scanner = new Scanner(System.in);

                String hod = " ";

                String[] questions = new String[9];
                questions[0] = "[  ] ";
                questions[1] = "[  ] ";
                questions[2] = "[  ]";
                questions[3] = "[  ] ";
                questions[4] = "[  ] ";
                questions[5] = "[  ]";
                questions[6] = "[  ] ";
                questions[7] = "[  ] ";
                questions[8] = "[  ]";

                String[] nulls = new String[9];
                nulls[0] = "[()] ";
                nulls[1] = "[()] ";
                nulls[2] = "[()]";
                nulls[3] = "[()] ";
                nulls[4] = "[()] ";
                nulls[5] = "[()]";
                nulls[6] = "[()] ";
                nulls[7] = "[()] ";
                nulls[8] = "[()]";

                String[] krests = new String[9];
                krests[0] = "[}{] ";
                krests[1] = "[}{] ";
                krests[2] = "[}{]";
                krests[3] = "[}{] ";
                krests[4] = "[}{] ";
                krests[5] = "[}{]";
                krests[6] = "[}{] ";
                krests[7] = "[}{] ";
                krests[8] = "[}{]";

                String[] pos = new String[9];
                pos[0] = "c1";
                pos[1] = "c2";
                pos[2] = "c3";
                pos[3] = "b1";
                pos[4] = "b2";
                pos[5] = "b3";
                pos[6] = "a1";
                pos[7] = "a2";
                pos[8] = "a3";


                int[] values = new int[9];
                values[0] = 100;
                values[1] = 100;
                values[2] = 100;
                values[3] = 100;
                values[4] = 100;
                values[5] = 100;
                values[6] = 100;
                values[7] = 100;
                values[8] = 100;

            String[] lastvalues = new String[10];
            lastvalues[0] = "";
            lastvalues[1] = "";
            lastvalues[2] = "";
            lastvalues[3] = "";
            lastvalues[4] = "";
            lastvalues[5] = "";
            lastvalues[6] = "";
            lastvalues[7] = "";
            lastvalues[8] = "";
            lastvalues[9] = "";

                out.println();
                out.println("to place your null or krest enter a cell name from a table below:");
                out.println();
                out.println("[c1] [c2] [c3]");
                out.println("[b1] [b2] [b3]");
                out.println("[a1] [a2] [a3]");
                out.println();
                out.println();

                while (true) {

                    if (victory == 0) {

                        for (int ib = 0; ib < 10; ib++) {

                            if (victory == 0) {

                                for (int i = 0; i < 9; i++) {
                                    out.print(questions[i]);

                                    if (i == 2 | i == 5) {
                                        out.println();
                                    }
                                }

                                if (values[0] + values[3] + values[6] == 3 | values[1] + values[4] + values[7] == 3 | values[2] + values[5] + values[8] == 3) {
                                    out.println();
                                    out.println("krests won (column)");
                                    victory = 1;
                                    krestswon++;
                                    out.println(nullswon + "-" + krestswon);
                                }
                                if (values[0] + values[3] + values[6] == 6 | values[1] + values[4] + values[7] == 6 | values[2] + values[5] + values[8] == 6) {
                                    out.println();
                                    out.println("nulls won (column)");
                                    victory = 1;
                                    nullswon++;
                                    out.println(nullswon + "-" + krestswon);
                                }

                                if (values[0] + values[1] + values[2] == 3 | values[3] + values[4] + values[5] == 3 | values[6] + values[7] + values[8] == 3) {
                                    out.println();
                                    out.println("krests won(array)");
                                    victory = 1;
                                    krestswon++;
                                    out.println(nullswon + "-" + krestswon);
                                }
                                if (values[0] + values[1] + values[2] == 6 | values[3] + values[4] + values[5] == 6 | values[6] + values[7] + values[8] == 6) {
                                    out.println();
                                    out.println("nulls won(array)");
                                    victory = 1;
                                    nullswon++;
                                    out.println(nullswon + "-" + krestswon);
                                }
                                if (values[2] + values[4] + values[6] == 3 | values[8] + values[4] + values[0] == 3) {
                                    out.println();
                                    out.println("krests won(diagonal)");
                                    victory = 1;
                                    krestswon++;
                                    out.println(nullswon + "-" + krestswon);
                                }
                                if (values[2] + values[4] + values[6] == 6 | values[8] + values[4] + values[0] == 6) {
                                    out.println();
                                    out.println("nulls won(diagonal)");
                                    victory = 1;
                                    nullswon++;
                                    out.println(nullswon + "-" + krestswon);
                                }
                                if (Iteration == 9) {
                                if (victory ==0){
                                    out.println();
                                    out.println("DRAW 0-0");
                                    victory = 1;
                                    out.println();
                                    out.println(nullswon + "-" + krestswon);
                                }}
                                if (victory == 0) {

                                    Iteration++;
                                    out.println();
                                    while (true) {
                                        hod = scanner.next();
                                        if (hod.equals("a1") || hod.equals("a2") || hod.equals("a3") ||
                                                hod.equals("b1") || hod.equals("b2") || hod.equals("b3") ||
                                                hod.equals("c1") || hod.equals("c2") || hod.equals("c3")) {

                                            if (!(hod.equals(lastvalues[0]) || hod.equals(lastvalues[1]) || hod.equals(lastvalues[2]) ||
                                                    hod.equals(lastvalues[3]) || hod.equals(lastvalues[4]) || hod.equals(lastvalues[5]) ||
                                                    hod.equals(lastvalues[6]) || hod.equals(lastvalues[7]) || hod.equals(lastvalues[8]))){

                                                existing++;
                                                lastvalues[existing] = hod;

                                            for (int i = 0; i < 9; i++) {
                                                if (Iteration == 1 | Iteration == 3 | Iteration == 5 | Iteration == 7 | Iteration == 9) {
                                                    if (Objects.equals(hod, pos[i])) {
                                                        questions[i] = krests[i];
                                                        values[i] = 1;
                                                    }
                                                } else {
                                                    if (Objects.equals(hod, pos[i])) {
                                                        questions[i] = nulls[i];
                                                        values[i] = 2;
                                                    }
                                                }
                                            } break;
                                        } else {
                                            out.println("введи нормальное значение, молю бога");
                                            continue;}
                                        } else {
                                            out.println("введи нормальное значение, молю бога");
                                            continue;}
                                    }
                                }

                                out.println();

                            } else {
                                break;
                            }
                        }
                    } else {
                        out.println("do you want to try again ? (print yes)");
                        if (scanner.next().equals("yes")) {
                            victory = 0;
                            break;
                        } else {
                            out.println("ебал в рот");
                            Ongoing = 0;
                            break;
                        }
                    }

                }
        }
        }

    }



