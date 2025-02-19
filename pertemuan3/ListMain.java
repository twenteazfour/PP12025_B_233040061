package Tugas2_P3;

public class ListMain {
    public static void main(String[] args) {
        StrukturList listA = new StrukturList();
        StrukturList listB = new StrukturList();
        StrukturList listC = new StrukturList();

        // Latihan 4 (3 4 5)
        System.out.println("Output Latihan 4:");
        listA.addTail(5);  
        listA.addHead(4);   
        listA.addHead(3);   
        listA.display();   

        // Tes- 1a dan 3a (3 2 1)
        System.out.println("\nOutput Tes-1a dan 3a:");
        listB.addTail(1);  // tambah elemen pertama addHead() ga bisa kosong
        listB.addHead(2);  
        listB.addHead(3);
        listB.display(); 
        

        // Tes-1b dan 3b (1 4 5 7)
        System.out.println("\nOutput Tes-1b dan 3b:");
        listC.addTail(1);
        listC.addTail(4);
        listC.addTail(5);
        listC.addTail(7);
        listC.display();  
    }
}



