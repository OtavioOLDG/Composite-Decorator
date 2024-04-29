package folders.model.composite;

public class SimpleIssueComposite implements IssueInterfaceComposite{
	private String title;
	private String description;
	private String term;
	
	public SimpleIssueComposite(String title, String description, String term) {
		super();
		this.title = title;
		this.description = description;
		this.term = term;
	}
	public SimpleIssueComposite() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	@Override
	public void print(){
		System.out.print(title + " - " + description + " - " + term + "");
	}
	
	
}
