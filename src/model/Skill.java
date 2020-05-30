package model;


public class Skill
{
	int skilld;
	String skillName;
	
	public Skill(int skilld, String skillName) {
		super();
		this.skilld = skilld;
		this.skillName = skillName;
	}

	public int getSkilld() {
		return skilld;
	}

	public void setSkilld(int skilld) {
		this.skilld = skilld;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	
}
