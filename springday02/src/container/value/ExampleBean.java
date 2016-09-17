package container.value;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 注入不同类型的值
 * @author Administrator
 *
 */
public class ExampleBean implements Serializable {
	private String name;
	private String age;
	private List<String> interest;
	private Set<String> cities;
	private Map<String,Double> score; 
	private Properties db;
	public ExampleBean(){
		System.out.println("ExampleBean构造器...");
	}
	@Override
	public String toString() {
		return "ExampleBean [age=" + age + ", cities=" + cities + ", db=" + db
				+ ", interest=" + interest + ", name=" + name + ", score="
				+ score + "]";
	}
	
	public Properties getDb() {
		return db;
	}

	public void setDb(Properties db) {
		this.db = db;
	}

	public Map<String, Double> getScore() {
		return score;
	}

	public void setScore(Map<String, Double> score) {
		this.score = score;
	}

	public Set<String> getCities() {
		return cities;
	}

	public void setCities(Set<String> cities) {
		this.cities = cities;
	}

	public List<String> getInterest() {
		return interest;
	}
	public void setInterest(List<String> interest) {
		this.interest = interest;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
