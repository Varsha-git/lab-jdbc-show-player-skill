package controller;
import java.util.List;
import dao.SkillDAO;
import model.Skill;

public class Main
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Displaying all types of skills: ");
		SkillDAO skillDao = new SkillDAO();
		List<Skill> list = skillDao.listAllSkills();
		for(Skill s : list)
		{
			System.out.println(s.getSkillName());
		}
		
	}
}