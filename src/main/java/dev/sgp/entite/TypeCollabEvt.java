package dev.sgp.entite;

public enum TypeCollabEvt {
	CREATION_COLLAB("Création d'un nouveau collaborateur"), MODIFICATION_COLLAB("Modification d'un collaborateur");
	
	private String collab;

	private TypeCollabEvt(String collab) {
		this.collab = collab;
	}

	public String getCollab() {
		return collab;
	}

	
}
