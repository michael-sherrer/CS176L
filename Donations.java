package edu.monmouth.donations;

class Donations {
	private int numIndividual;
	private double amtIndividual;
	private int numBusiness;
    private double amtBusiness;
    private int numOther;
    private double amtOther;

    public Donations() {
        numIndividual = 0;
        amtIndividual = 0;
        numBusiness = 0;
        amtBusiness = 0;
        numOther = 0;
        amtOther = 0;
    }
    
    public void processDonation(String category, double amount) {
    	if (amount < 0) {
    		amount = Math.abs(amount);
    		switch (category.toLowerCase()) {
    		case "individual":
    			numIndividual--;
    			amtIndividual-= amount;
    			break;
    		case "business":
    			numBusiness--;
    			amtBusiness -= amount;
    			break;
    		default:
    			numOther--;
    			amtOther-= amount;
    			break;	
    		}
    	}else{
    		switch (category.toLowerCase()) {
            case "individual":
                numIndividual++;
                amtIndividual += amount;
                break;
            case "business":
                numBusiness++;
                amtBusiness += amount;
                break;
            default:
                numOther++;
                amtOther += amount;
                break;
    	}
     }		
   }

	public void getStatistics() {
		System.out.println("Individual: #:" + numIndividual + "$" + amtIndividual);
		System.out.println("Individual: #:" + numBusiness + "$" + amtBusiness);
		System.out.println("Individual: #:" + numOther + "$" + amtOther);


	}
}

