import java.util.ArrayList;
import java.util.List;

public class Chapter {
	
	private String titlu;
	List<SubChapter> subchapters;
	
	public Chapter(String titlu)
	{
		this.subchapters = new ArrayList<SubChapter>();
		setTitlu(titlu);
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	
	public int createSubChapter(String subchapterName) {
		SubChapter sbchp = new SubChapter(subchapterName);
		subchapters.add(sbchp);
		return subchapters.indexOf(sbchp);
	}
	
	public SubChapter getSubChapter(int index) {
		return subchapters.get(index);
	}
}
