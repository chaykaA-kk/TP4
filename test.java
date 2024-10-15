package article;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		article tabarticle[]=new article[4];
	    tabarticle[0]=new article("pantalon","levis","100%couton",90f);
		tabarticle[1]=new article("Chemise" ," Sisley",  "100%conton", 60f);
		tabarticle[2]=new article("gilet","Pimkey", "100%Laine" ,70f);
		tabarticle[3]=new article("veste", "D&G", "100%cuir", 190f);
		Scanner sc=new Scanner(System.in);
		for(article a:tabarticle) {
			if(a!=null) {
				System.out.println("donnez le prix de solde");
				float ps=sc.nextFloat();
				System.out.println("prix de vente"+a.calculPrixV(ps));
				a.decrisArticle();
			}
			
			
		}
	}

}
