import java.util.ArrayList;




public class TedVOTest {

	private String description;
	private String event;
	private String mainSpeaker;
	private String name;
	private String publishedDate;
	private ArrayList<String> tags;
	private String title;
	private String url;
	private long views;
	private ArrayList<RatingVOTest> ratingVO;
	private ArrayList<RelatedTalksVOTest> relatedTalksVO;
	private ArrayList<String> speakerOccupation;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public long getViews() {
		return views;
	}
	public void setViews(long views) {
		this.views = views;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getMainSpeaker() {
		return mainSpeaker;
	}
	public void setMainSpeaker(String mainSpeaker) {
		this.mainSpeaker = mainSpeaker;
	}
	public ArrayList<String> getSpeakerOccupation() {
		return speakerOccupation;
	}
	public void setSpeakerOccupation(ArrayList<String> speakerOccupation) {
		this.speakerOccupation = speakerOccupation;
	}
	public ArrayList<RatingVOTest> getRatingVO() {
		return ratingVO;
	}
	public void setRatingVO(ArrayList<RatingVOTest> ratingVO) {
		this.ratingVO = ratingVO;
	}
	public ArrayList<RelatedTalksVOTest> getRelatedTalksVO() {
		return relatedTalksVO;
	}
	public void setRelatedTalksVO(ArrayList<RelatedTalksVOTest> relatedTalksVO) {
		this.relatedTalksVO = relatedTalksVO;
	}
	

}
