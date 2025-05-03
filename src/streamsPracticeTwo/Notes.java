package streamsPracticeTwo;

public class Notes {
	Integer tagId;

	String tagName;

	Integer oldTagId;

	public Notes(Integer tagId, String tagName, Integer oldTagId) {
		super();
		this.tagId = tagId;
		this.tagName = tagName;
		this.oldTagId = oldTagId;
	}

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Integer getOldTagId() {
		return oldTagId;
	}

	public void setOldTagId(Integer oldTagId) {
		this.oldTagId = oldTagId;
	}

}
