import java.util.Scanner;
public class MainData{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("==== SIMULATION OF HUMAN LIFE NEEDS ====");
        System.out.print("Masukkan jumlah penduduk dalam satu populasi : ");
        int p = sc.nextInt();
        Manusia arrMan[] = new Manusia[p];
        for(int i=0; i<p; i++){
            System.out.print("Masukkan data tingkat kebugaran penduduk ke-" + (i+1) + " : ");
            int l = sc.nextInt();
            arrMan[i] = new Manusia(l);
        }
        System.out.println("\n\nData Makanan");
        System.out.print("Masukkan jumlah jenis makanan yang tersedia : ");
        int m = sc.nextInt();
        Makanan arrMak[] = new Makanan[m];
        for(int i=0; i<m; i++){
            System.out.print("===> Input jumlah kalori pada makanan ke-" + (i+1) + " : ");
            int k = sc.nextInt();
            arrMak[i] = new Makanan(k);
        }
        System.out.println("\n\nData Kebugaran Seluruh Penduduk :");
        for(int i=0; i<p; i++){
            System.out.println("\t\tPenduduk ke-" + (i+1) + "memiliki nilai kebugaran : " + arrMan[i].level);
        }
        System.out.println("\nData Makanan Tersedia :");
        for(int i=0; i<m; i++){
            System.out.println("\t\tMakanan ke-" + (i+1) + "memiliki kalori sejumlah : " + arrMak[i].kalori + " kcal");
        }
        System.out.println("\nData Aktivitas Penduduk :");
        int i=0;
        while(i<1){
            System.out.print("Pilih Penduduk ke : ");
            int a = sc.nextInt();
            System.out.println("Penduduk ke-" + a + " beraktivitas, sehingga :");
            arrMan[a-1].beraktivitas();
            System.out.println("Karena merasa lelah, maka penduduk ke-" + a + " tersebut makan.");
            System.out.print("Makanan yang disantap penduduk ke-" + a + "tersebut adalah makanan ke : ");
            int b = sc.nextInt();
            sc.nextLine();
            System.out.println("Apakah makanan tersebut perlu ditambahkan bumbunya? (yes/no)");
            String pilih = sc.nextLine();
            if (pilih.equalsIgnoreCase("yes")) {
                arrMak[b-1].tambahBumbuMakanan();
                arrMan[a-1].makan(arrMak[b-1]);
            }else{
                arrMan[a-1].makan(arrMak[b-1]);
            }
            System.out.println("Update penduduk ke-" + a + " setelah makan :");
            arrMan[a-1].tampilLevel();
            System.out.println("\nApakah ingin mengulangi data aktivitas penduduk?(yes/no)");
            String ulang = sc .nextLine();
            if (ulang.equalsIgnoreCase("yes")) {
                i+=0;
            } else {
                i++;
            }
        }
        sc.close();
        System.out.println("\n\nSIMULATION ENDS, THANK YOU");
    }
}