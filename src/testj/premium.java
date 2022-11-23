package testj;

interface premiumAccountInterface{
	public static void deleteAccount() {}
	//add other methods
}

abstract class premiumAccount{
	private boolean isPriorities;
	private boolean isManager;
	
	//Getters n Setters
	//Priority
	public boolean getIsPriorities(boolean isPriorities) {
		return isPriorities;
	}
	public void setPriorities(boolean isPriorities) {
		this.isPriorities = isPriorities;
	}
	//manager
	public boolean getIsManager() {
		return isManager;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
}