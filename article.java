package article;

public class article {
	private static int totalearticle;
	private int id;
	private String categorie;
	private String marque;
	private float prixHT;
	private String  composition;
	private int Quantite;
	private final float tva=0.2f;
	private article (){
		totalearticle++;
		id=totalearticle;
	}
	public article(String cat,String marq,String comp) {
		this();
		this.categorie=cat;
		this.marque=marq;
		this.composition=comp;
	}
	public article(String cat,String comp,String marq,float pht){
		this(cat,comp,marq);
		this.prixHT=pht;
	}
	public String toString() {
		return "id:"+this.id+"categoeie:"+this.marque+"le prix:"+this.prixHT+"composition:"+this.composition+"quantité:"+this.Quantite ;
	}
	void decrisArticle() {
		this.toString();
		System.out.println(toString());
	}
	public float getprix() {
		 return prixHT;
	}
	public void setprix(float f){
		if (f>0) {
			this.prixHT=f;
		}
	}
	float calculPrixV() {
		return prixHT *(1+tva);
	}
	float calculPrixV(float ps) {
		float prix=calculPrixV();
		return prixHT- prix;
	}	
	
}