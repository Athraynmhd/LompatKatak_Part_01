import java.util.Random;
import java.util.Scanner;

public class MainKatakLompat {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int[] kotak = new int[300];
        int level;
        int jumlahkoin1 = 0;
        int jumlahkoin2 = 0;
        int jumlahkoin3 = 0;
        int jumlahmonster1 = 0;
        int jumlahmonster2 = 0;
        int jumlahmonster3 = 0;
        int pilihan;
        int poin;
        int ulang;

        do {
            int posisiKatak = 0;
            poin = 100;

            System.out.println("+-------------------------------+");
            System.out.println("|        SELAMAT DATANG         |");
            System.out.println("|  di permainan Lompat Katak    |");
            System.out.println("|-------------------------------|");
            System.out.println("|           1. Main             |");
            System.out.println("|           2. Keluar           |");
            System.out.println("+-------------------------------+");
            System.out.print("Pilihanmu (1/2): ");
            int opsi = s.nextInt();

            if (opsi == 1) {
                System.out.println("+-----------------------------------+");
                System.out.println("|           SELAMAT DATANG          |");
                System.out.println("|     di permainan Lompat Katak     |");
                System.out.println("+-----------------------------------+");
                System.out.println("|                                   |");
                System.out.println("|       Ketentuan Permainan:        |");
                System.out.println("|                                   |");
                System.out.println("| - Katak berada pada posisi 0      |");
                System.out.println("| - Katak harus melompat hingga     |");
                System.out.println("|   posisi 299                      |");
                System.out.println("| - Jika berhasil memakan Nyamuk,   |");
                System.out.println("|   poin bertambah 10               |");
                System.out.println("| - Jika berhasil memakan Lalat,    |");
                System.out.println("|   poin bertambah 20               |");
                System.out.println("| - Jika berhasil memakan Cacing,   |");
                System.out.println("|   poin bertambah 30               |");
                System.out.println("| - Jika bertemu ular, poin         |");
                System.out.println("|   berkurang 5                     |");
                System.out.println("| - Jika bertemu Burung Elang       |");
                System.out.println("|   poin berkurang 10               |");
                System.out.println("| - Jika bertemu Buaya, poin        |");
                System.out.println("|   berkurang 20                    |");
                System.out.println("| - Katak dapat berbalik arah dan   |");
                System.out.println("|   melompat ke belakang            |");
                System.out.println("|   satu kotak atau selang satu     |");
                System.out.println("|   kotak dengan pilihan            |");
                System.out.println("|   maju atau mundur.               |");
                System.out.println("|                                   |");
                System.out.println("+-----------------------------------+");
            } else {
                System.out.println("\nSampai berjumpa lagi!");
                System.exit(0);
            }

            do {
                System.out.println("\n+-------------------------------+");
                System.out.println("|  PILIHLAH TINGKAT KESULITAN : |");
                System.out.println("|-------------------------------|");
                System.out.println("|           1. Mudah            |");
                System.out.println("|           2. Sedang           |");
                System.out.println("|           3. Sulit            |");
                System.out.println("+-------------------------------+");
                System.out.print("Silahkan pilih level yang anda inginkan (1/2/3): ");
                level = s.nextInt();

                if (level < 1 || level > 3) {
                    System.out.println("LEVEL TIDAK TERSEDIA");
                    System.out.println("Silahkan pilih level yang benar.");
                }
            } while (level < 1 || level > 3);

            switch (level) {
                case 1:
                    System.out.println("Anda memilih tingkat kesulitan Mudah.");
                    break;
                case 2:
                    System.out.println("Anda memilih tingkat kesulitan Sedang.");
                    break;
                case 3:
                    System.out.println("Anda memilih tingkat kesulitan Sulit.");
                    break;
            }

            if (level == 1) {
                jumlahkoin1 = 60;
                jumlahkoin2 = 45;
                jumlahkoin3 = 25;
                jumlahmonster1 = 30;
                jumlahmonster2 = 50;
                jumlahmonster3 = 70;
            } else if (level == 2) {
                jumlahkoin1 = 45;
                jumlahkoin2 = 25;
                jumlahkoin3 = 60;
                jumlahmonster1 = 70;
                jumlahmonster2 = 50;
                jumlahmonster3 = 30;
            } else if (level == 3) {
                jumlahkoin1 = 25;
                jumlahkoin2 = 60;
                jumlahkoin3 = 45;
                jumlahmonster1 = 50;
                jumlahmonster2 = 30;
                jumlahmonster3 = 70;
            }

            Random pengacakan = new Random();
            for (int i = 0; i < jumlahkoin1; i++) {
                int Acak = pengacakan.nextInt(300);
                while (kotak[Acak] != 0) {
                    Acak = pengacakan.nextInt(300);
                }
                kotak[Acak] = 1;
            }

            for (int i = 0; i < jumlahmonster1; i++) {
                int Acak = pengacakan.nextInt(300);
                while (kotak[Acak] != 0) {
                    Acak = pengacakan.nextInt(300);
                }
                kotak[Acak] = 2;
            }

            for (int i = 0; i < jumlahkoin2; i++) {
                int Acak = pengacakan.nextInt(300);
                while (kotak[Acak] != 0) {
                    Acak = pengacakan.nextInt(300);
                }
                kotak[Acak] = 3;
            }

            for (int i = 0; i < jumlahmonster2; i++) {
                int Acak = pengacakan.nextInt(300);
                while (kotak[Acak] != 0) {
                    Acak = pengacakan.nextInt(300);
                }
                kotak[Acak] = 4;
            }

            for (int i = 0; i < jumlahkoin3; i++) {
                int Acak = pengacakan.nextInt(300);
                while (kotak[Acak] != 0) {
                    Acak = pengacakan.nextInt(300);
                }
                kotak[Acak] = 5;
            }

            for (int i = 0; i < jumlahmonster3; i++) {
                int Acak = pengacakan.nextInt(300);
                while (kotak[Acak] != 0) {
                    Acak = pengacakan.nextInt(300);
                }
                kotak[Acak] = 6;
            }

            for (posisiKatak = 0; posisiKatak != 299 && poin > 0;) {
                System.out.println("\nPosisi katak di kotak : [" + posisiKatak + "]");
                System.out.println("Poin anda saat ini: " + poin);
                if (posisiKatak == 298) {
                    System.out.println("1 lompatan maju terakhir");
                }

                System.out.println("\n+-------------------------+");
                System.out.println("|  Tentukan langkah anda  |");
                System.out.println("+-------------------------+");
                System.out.println("== MAJU ==");

                if (posisiKatak <= 297) {
                    System.out.println("1. Maju 1 langkah");
                    System.out.println("2. Maju 2 langkah");
                } else {
                    System.out.println("Anda Hanya Memiliki satu opsi\n");
                    System.out.println("1. Maju 1 langkah");
                }

                System.out.println("\n== MUNDUR ==");
                System.out.println("3. Mundur 1 langkah");
                System.out.println("4. Mundur 2 langkah");

                System.out.print("Masukkan pilihan : ");
                pilihan = s.nextInt();

                if (pilihan == 1) {
                    if (posisiKatak < 299) {
                        posisiKatak += 1;
                    } else {
                        System.out.println("Anda Hanya Memiliki satu opsi\n");
                        System.out.println("1. Maju 1 langkah");
                    }
                } else if (pilihan == 2) {
                    if (posisiKatak < 298) {
                        posisiKatak += 2;
                    }
                } else if (pilihan == 3) {
                    if (posisiKatak > 0) {
                        posisiKatak -= 1;
                    }
                } else if (pilihan == 4) {
                    if (posisiKatak > 1) {
                        posisiKatak -= 2;
                    }
                }
                if (posisiKatak < 0) {
                    posisiKatak = 0;
                }

                if (kotak[posisiKatak] == 1) {
                    poin += 10;
                    System.out.println("Anda memakan nyamuk,poin bertambah 10");
                } else if (kotak[posisiKatak] == 2) {
                    poin -= 5;
                    System.out.println("Ular menyerangmu,poin berkurang 5");
                } else if (kotak[posisiKatak] == 3) {
                    poin += 20;
                    System.out.println("Anda memakan lalat, poin bertambah 20");
                } else if (kotak[posisiKatak] == 4) {
                    poin -= 10;
                    System.out.println("Burung Elang hampir menangkapmu, poin berkurang 10");
                } else if (kotak[posisiKatak] == 5) {
                    poin += 30;
                    System.out.println("Anda memakan cacing, poin bertambah 30");
                } else if (kotak[posisiKatak] == 6) {
                    poin -= 20;
                    System.out.println("Buaya hampir memangsamu, poin berkurang 20");
                }
            }

            if (poin > 500) {
                System.out.println("\nSangat Bagus");
                System.out.println("Pertahankan!");
                System.out.println("\nTingkat kesulitan: " + level);
                System.out.println("Poin anda : " + poin);
            } else if (poin > 300 && poin < 500) {
                System.out.println("\nBagus!");
                System.out.println("Lanjutkan!");
                System.out.println("\nTingkat kesulitan: " + level);
                System.out.println("Poin anda : " + poin);
            } else {
                System.out.println("\nBuruk!.");
                System.out.println("Semoga lebih baik!");
                System.out.println("\nTingkat kesulitan: " + level);
                System.out.println("Poin anda : " + poin);
            }

            System.out.println("\n+--------------------------------+");
            System.out.println("| Apakah anda ingin bermain lagi :|");
            System.out.println("|           1. Ya                |");
            System.out.println("|           2. Tidak             |");
            System.out.println("+--------------------------------+");
            System.out.print("Masukkan pilihan anda (1/2): ");
            ulang = s.next().charAt(0);

            System.out.println();

            for (int i = 0; i < 300; i++) {
                kotak[i] = 0;
            }
        } while (ulang != '2');
        System.out.println("\nTerima kasih telah bermain");
    }
}
