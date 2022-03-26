public class Manusia {
    int level;
    Manusia(int l){
    }
    void makan(Makanan m){
        if(m.kalori >= 2000){
            level += 8;
            System.out.println("\t\tMakanan ini terlalu banyak kalori, sebaiknya segera berhenti makan");
        } else if(1200 > m.kalori && m.kalori <= 1999){
            level+= 6;
            System.out.println("\t\tMakanan ini cukup banyak kalori, maksimal makan sekali lagi");
        } else if( 600 > m.kalori && m.kalori <=1199){
            level +=2;
            System.out.println("\t\tMakanan ini mengandung cukup kalori, boleh menambah makan beberapa suap");
        } else{
            level +=1;
            System.out.println("\t\tMakanan ini sedikit kalori, boleh menambah makan lebih banyak");
        }
        System.out.println("\t\tKondisi setelah makan: " + level + " persen");
    }
    void beraktivitas(){
        level -= 25;
        if(level <= 0){
            level = 2;
        }
        System.out.println("\t\tKondisi terkini setelah beraktivitas: " + level + " persen");
    }
    void tampilLevel(){
        System.out.println("\t\tNilai Kebugaran: "+level + " persen");
    }
}
