package food.models;

public class Step {

	private int no;
	private String text;
	private String imageUrl;

	public Step() {
		super();
	}

	public Step(int no, String text, String imageUrl) {
		super();
		this.no = no;
		this.text = text;
		this.imageUrl = imageUrl;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
