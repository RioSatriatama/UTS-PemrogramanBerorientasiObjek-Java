package uts_pbo;

import java.util.List;
import java.util.Scanner;

public class Main {
	private String[] MenuList = {"Menginput Product","Melihat Product"};
    private String[] MyProduct = {"Samsung","Iphone"};
    private List<Samsung> listSamsung  = new ArrayList<Samsung>();

    public static void main(String[] args) {
        Main m = new Main();
        m.GenerateSamsung(C:/Users/rio/eclipse-workspace/utspbo/bin/uts_pbo/Database);        
    }


    public void InputMenu() {
        Scanner myObj = new Scanner(System.in);
        int menu;
        
        System.out.println("\n\n--PROGRAM PENJUALAN HANPHONE TOKO. ABC--");
        System.out.println("Pilih menu:\n");
        int i=1;
        for (String mu : this.MenuList) {
            System.out.println(i+". "+mu);
            i++;
        }
        System.out.print("Masukan pilihan menu:");
        String inputMenu = myObj.nextLine();
        menu = Integer.parseInt(inputMenu);

        switch (menu) {
            case 1:
                this.InputMenuProduct();
                break;
            case 2:
                this.ShowMenuProduct();
                break;
        
            default:
            System.out.println("Pilihan tidak terdaftar");
                break;
        }
        myObj.close();
    }

    public void InputMenuProduct(){
        System.out.println("\n-------------------");
        System.out.println("Input Product");
        System.out.println("-------------------\n");
        System.out.println("Pilih Produk:");
        int i=1;
        for (String p : MyProduct) {
            System.out.println(i+". "+p);
            i++;
        }
        System.out.print("Masukan pilihan:");
        Scanner myObj = new Scanner(System.in);
        int product;
        String inputProduct = myObj.nextLine();
        product = Integer.parseInt(inputProduct);
        switch (product) {
            case 1:                
                try {
                    listSamsung = this.InputSamsung();         
                    this.InputMenu();               
                } catch (Exception e) {
                    System.out.println("Failed error input produk samsung");
                    System.out.println("Error: "+e.getMessage());
                }    
            
                break;
            case 2:
                
                break;
        
            default:
                break;
        }
        myObj.close();
    }


    public List InputSamsung() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n===Input Samsung===");
        System.out.print("Masukan jumlah data yang dimasukan:");
        int jmlData=10;
        for (int i = 0; i < jmlData; i++) {
            Samsung s = new Samsung();
            System.out.println("#data ke-"+(i+1)+":");
            System.out.print("Type = ");
            String type = myObj.nextLine();            
            s.setType(type);
            
            System.out.print("OS = ");
            String os = myObj.nextLine();            
            s.setOS(os);

            System.out.print("RAM = ");
            int Ram = Integer.parseInt(myObj.nextLine());            
            s.setRAM(Ram);
            
            System.out.print("Merek = ");
            String merek = myObj.nextLine();            
            s.setMerek(merek);

            System.out.print("Price = ");
            Double prices = Double.parseDouble(myObj.nextLine());            
            s.setPrice(prices);

            System.out.println("---------------------------");
            this.listSamsung.add(s);
        }
        System.out.println("\n");
        myObj.close();
        return this.listSamsung;
        
    }


    public void ShowMenuProduct(){
        for (Samsung s : this.listSamsung) {
            System.out.println("Type = "+ s.getType() );
            System.out.println("OS = "+ s.getOS() );
            System.out.println("RAM = "+ s.getRAM() );
            System.out.println("Merek = "+ s.getMerek() );
            System.out.println("Harga = "+ s.getPrice() );
            System.out.println("========================");
        }
    }    
}