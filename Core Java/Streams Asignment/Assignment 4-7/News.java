package StreamAssignment2;

public class News {
	private int NewsId;
	private String PostedByUser;
	private String CommentByUser;
	private String Comment;
	
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		NewsId = newsId;
		PostedByUser = postedByUser;
		CommentByUser = commentByUser;
		Comment = comment;
	}

	public int getNewsId() {
		return NewsId;
	}

	public String getPostedByUser() {
		return PostedByUser;
	}

	public String getCommentByUser() {
		return CommentByUser;
	}

	public String getComment() {
		return Comment;
	}

	@Override
	public String toString() {
		return "News [NewsId=" + NewsId + ", PostedByUser=" + PostedByUser + ", CommentByUser=" + CommentByUser
				+ ", Comment=" + Comment + "]";
	}
	

}
