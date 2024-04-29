package folders.model.composite;

import java.util.List;

public class ComposedIssueComposite implements IssueInterfaceComposite{
	private String title;
	private List<IssueInterfaceComposite> issues;

	public ComposedIssueComposite(String title, List<IssueInterfaceComposite> issues) {
		super();
		this.title = title;
		this.issues = issues;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<IssueInterfaceComposite> getIssues() {
		return issues;
	}

	public void setIssues(List<IssueInterfaceComposite> issues) {
		this.issues = issues;
	}

	@Override
	public void print() {
		System.out.println("Issues for " + title + ":");
		for(IssueInterfaceComposite i : issues) {
			i.print();
			System.out.println();
		}
	}
	
	
}
