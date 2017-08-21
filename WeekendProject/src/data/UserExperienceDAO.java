package data;

import java.util.List;

import entities.*;

public interface UserExperienceDAO {
	public List<UserExperience> index();
	public UserExperience show(int id);
	public UserExperience create(String json);
	public boolean delete(UserExperience exp);
}
