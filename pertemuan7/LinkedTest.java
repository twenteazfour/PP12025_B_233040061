package Tugas_P7;

public class LinkedTest {
	public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addHead(new MataKuliah("IF001", "Dasar Pemrograman", 4));
        list.addHead(new MataKuliah("IF002", "Pemrograman Web", 3));
        list.addHead(new MataKuliah("IF003", "Struktur Diskrit", 3));
       
        list.addHead(new MataKuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.addHead(new MataKuliah("IF003", "Struktur Diskrit", 3));
        list.addHead(new MataKuliah("IF002", "Pemrograman Web", 3));
        list.addHead(new MataKuliah("IF001", "Dasar Pemrograman", 4));
        
        list.displayElement();
    }
	
}
