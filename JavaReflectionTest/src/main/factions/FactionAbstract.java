package main.factions;

public abstract class FactionAbstract {

	String id;
	String name;
	String leader;
	String warcry;
	
	public FactionAbstract(String name, String leader, String warcry) {
		this.name = name;
		this.leader = leader;
		this.warcry = warcry;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public String getWarcry() {
		return warcry;
	}
	public void setWarcry(String warcry) {
		this.warcry = warcry;
	}
	
}
