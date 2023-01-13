package UcakBileti;

import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int yas , km ,tip ;
		double kfiyat ,fiyat  ,gidisdonus ;
		kfiyat=0.10;
		System.out.print("Mesafeyi giriniz :");
		km = scan.nextInt();
		System.out.print("Yasinizi giriniz :");
		yas=scan.nextInt();
		System.out.println("Ucus tipini giriniz : \n 1:Gidis \n 2:Gidis donus ");
		tip=scan.nextInt();
		if (yas>0 && km>0 && tip ==1 ){
			fiyat=km*kfiyat;
			if(yas<=12) {
				fiyat=fiyat*0.5 ;
				}
			else if (yas>=12 && yas<=24) {
				fiyat=fiyat*0.8 ;	
				
			}
			else if(yas>=65) {
				fiyat = fiyat*0.6 ;	
			}
			System.out.print("Ucus Fiyati" + fiyat);
			
		}
		if (tip==2) {
			if (yas>0 && km>0 && tip ==2 ){
				fiyat=km*kfiyat;
				if(yas<=12) {
					fiyat=fiyat*0.3 ;
					}
				else if (yas>=12 && yas<=24) {
					fiyat=fiyat*0.6 ;	
					
				}
				else if(yas>=65) {
					fiyat = fiyat*0.4 ;	
				}
				System.out.print("Ucus Fiyati: " + fiyat);
		}
			
		}
			
	}

}