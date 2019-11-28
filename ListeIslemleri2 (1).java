import java.util.Scanner;

public class ListeIslemleri2 {

	static Scanner input=new Scanner(System.in);
	static String[] isimler=new String[50];
	static String yeniDeger,yenideger5;
	static int yenideger4;
	static boolean tamam_mi = true;
	
	static void Ekleme()
	{
		
		String ekle;
		System.out.print("�sim Girin:");
		ekle = input.next();

		for (int i = 0; i < isimler.length; i++) 
		{
			if (isimler[i] != null) {
			} else {
				isimler[i] = ekle;
				System.out.println(isimler[i] + " eklendi \n");
				break;
			}

		}
		
	}
	
	static void Listeleme()
	{
		
		for (int j = 0; j < isimler.length; j++) 
		{
			if (isimler[j] != null) 
			{
				System.out.println((j + 1) + "-" + isimler[j]); //Ekrana yazd�r�rken 1-isim yazmak i�in
			}
		}
		System.out.println();
	}
	static void Silme()
	{
		System.out.print("Silme: ");
		String sil = input.next();

		for (int k = 0; k < isimler.length; k++) 
		{
			if (isimler[k].equals(sil))
			{
			
				for (int l = k; l < isimler.length - 1; l++) 
				{
					isimler[l] = isimler[l + 1];
				}
				break;
			}
		}

	}
	
	
	static void Degistirme()
	{
		System.out.print("De�i�tirme(�ndeks olarak yaz�n�z): ");
		yenideger4=input.nextInt();
		
		System.out.print("Yeni de�er: ");
		yenideger5=input.next();
	
		isimler[yenideger4 - 1] = yenideger5;
		
		
	}
	
	static void Arama()
	{
		String ara;
		int sayac = 0;
		
		System.out.print("Arama: ");
		ara = input.next();
		
		try {//hesaplanacak i�lemler
			for (int h = 0; h < isimler.length; h++) 
			{
				if (isimler[h].contains(ara)) 
				{ //Aranacak kelimeyi buluyor like% kullan�lam�yor.
					
					System.out.println(isimler[h]);
					sayac++;
				}
			}
			
			System.out.println();

		} 
		catch (Exception e) 
		{ //Bir hata t�r� tespit edilince verilmesi gereken mesaj
			
		}

	}

	static void menu()
	{
		System.out.println("\nMen�\n\nEkleme(E)\nSilme(S)\nDe�i�tirme(D)\nListeleme(L)\nArama(A)\n��k��(C)\n");
		
		System.out.print("Se�im: ");
		String secim1=input.next();
		
		
		if(secim1.equals("E"))
		{
			Ekleme();
			
		}
		
		else if(secim1.equals("S"))
		{
			
			Silme();
		
		}
		else if(secim1.equals("D"))
		{
			
			Degistirme();
		
		}
		else if(secim1.equals("L"))
		{
			
			Listeleme();
		
		}
		else if(secim1.equals("A"))
		{
			
			Arama();
			
		}
		else if(secim1.equals("�"))
		{
			System.out.println("G�le G�le..");
			tamam_mi = false;
		}
		
		else 
		{
			System.out.println("Tekrar se�in.....");
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		
		
		isimler[0] = "�mer";
		isimler[1] = "Furkan";

		while(tamam_mi)
		{
			System.out.println("\nMevcut Liste:");
			Listeleme();
			menu();
		}
		
		
		
	}

}
