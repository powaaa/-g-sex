

//welcome penis class developers

class Penis extends ReproductiveOrgan{
	private double lenght, grith;//in cm (double precision for micropenis)
  private boolean circumcised;
  private boolean girly;
  private boolean canErect;
  private double upDownCurvature;//in DEG
  private double leftRightCurvature;
  
  public Penis (double lenght, double grith, boolean jew, boolean trap, boolean impotent, double upDownCurvature, double leftRightCurvature){
  // looking good, keep going	    
    this.lenght=lenght;
    this.grith=grith;
    this.circumcised=jew;
    this.girly=trap;
    this.canErect=impotent;
    this.upDownCurvature=upDownCurvature;
    this.leftRightCurvature=leftRightCurvature;
  }
  
  public Penis (){//if no arg, we assume OP
    this(0.01, .01, true, true,false,120,120);
  }
  
  public boolean isTrap(){
    return girly;
  }
  public boolean isJew(){
    return circumcised;
  }
  
  public boolean isNigger(){
  	return (lenght>20 || grith>20);
  }
  
  public boolean isOP(){//kek
  	return (lenght == 0.01 && grith == 0.01 && circumcised && girly && !canErect && upDownCurvature == 120 && leftRightCurvature == 120);
  }
  
  public void insert(ReproductiveOrgan r){//TODO we have to support anal in future releases
    try{ 
      erect();
      r.interact(this);
    }catch(UnsuportedOperationException e){
    	sysem.err.println("stop trying, you are embarassing yourself");
      //>laughing_girls.jpg
    }
  }
  
  public void erect(){
    
    if (!canErect) throw new UnsuportedOperationException();
    else circulatorySystem.transferblood(this);//static function to transfer blood
  }
  
}

class Vagina extends ReproductiveOrgan{
  private boolean wet;
  private boolean virgin;
  private double tightness;
  private boolean infected;
  private String pubicHairStyle;
  private boolean trannySurgicalVagina; 
    
  public Vagina(){
    //This is how u spagetthi
  }
  
  public Vagina(boolean wet, boolean virgin, double tightness, boolean infected, String pubicHairStyle, boolean trannySurgicalVagina){
    this.wet=wet;
    this.virgin=virgin;
    this.tightness=tightness;
    this.infected=infected;
    this.pubicHairStyle=pubicHairStyle;
    this.tranny=trannySurgicalVagina;
  }
  
  //getters
  public boolean isWet(){
    return wet;
  }
  
  public getWet(){//not a getter but a wetter jejkek
    this.wet=true;//lel
  }
  
  public boolean isVirgin(){
    return virgin;
  }
  

  public double getTightness(){	
    return tightness;
  }
  
  public boolean isInfected(){
    return infected;
  }
  
  public String pubicHairStyle(){
    return pubicHairStyle;
  }
  
  public boolean isTranny(){
    return trannySurgicalVagina;
  }
  //setters (will add in later)
  //sex functions
  public boolean hymenicDestruction(SexualObject phallicThing){//what do we call it? HimenicDestruction?    lel
    if(!isVirgin) throw new AlreadyDestroyedException();//she is a liar
    //we need to test if penis is long and strong enought to break
    if (!phallicThing.isLongEnough(this) || !phallicThing.isStrongEnough(this))//every vag is different, we need to test for specific vaginas
      throw new ShrimpDickException();//TODO find a better name
  }
  //hygene functions    
  public void shavePubes(){  
    if (!pubicHairStyle.equals("shaved")) 
    {
      pubicHairStyle="shaved";
    }													
  }														
} 

//TODO: public class SexualPOsition
public class Sex{// we have to declare 2 SexualObject hiercally superior to ReproductiveOrgan to include anal oral and dildoes
  SexualObject partnerOne,partnerTwo;//TODO: we must support more than 2 partner in future revisions 
  public static void main(String[] args){
  	/*Penis dick();
  	Vagina pussy();*/
}

public Vaginal extends Sex{
  private SexualPosition position;
  public Vaginal(SexualObject partnerOne, SexualObject PartnerTwo, SexualPosition position){//we assume partnerOne to be the Penis because patriarchy 
		this.partnerOne=partnerOne;
  	this.partnerTwo=partnerTwo;
    this.position=position;
  }
  
  public bool insertion(){
    try{
      partnerOne.insert(PartnerTwo);
    }
    }catch(UnsuportedOperationException e){
    //impotent do something
  	}
  if (partnerTwo.isVirgin()){//we need a try catch to destruct himen
    partnerTwo.setVirgin("false");//TODO: update this
  }
  
  
}



/*
	// Compares this penis to an other penis
	// returns 1 if this penis is bigger, -1 if it is smaller, and 0 if they are equal
	public int compare(Penis otherPenis){
		double diff = ((length * girth) - (otherPenis.getLength()* otherPenis.getGirth())
		if( diff > 0 ){
			return 1;
		} else if( diff < 0 ){
			return -1;
		}else{
			return 0
		}
	}*/

