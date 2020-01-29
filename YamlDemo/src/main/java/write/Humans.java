package write;

public class Humans {

	int age;
	String smile;
	String inovation;
	boolean isBestCreature;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSmile() {
		return smile;
	}
	public void setSmile(String smile) {
		this.smile = smile;
	}
	public String getInovation() {
		return inovation;
	}
	public void setInovation(String inovation) {
		this.inovation = inovation;
	}
	public boolean isBestCreature() {
		return isBestCreature;
	}
	public void setBestCreature(boolean isBestCreature) {
		this.isBestCreature = isBestCreature;
	}
	@Override
	public String toString() {
		return "Humans [age=" + age + ", smile=" + smile + ", inovation=" + inovation + ", isBestCreature="
				+ isBestCreature + "]";
	}
	
	
}
