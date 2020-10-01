package calebabg.soundcloud;

public class Track {

    private Integer id;
    private String created_at;
    private Integer user_id;
    private Integer duration;
    private Boolean commentable;
    private String state;
    private String sharing;
    private String tag_list;
    private String permalink;
    private String description;
    private Boolean streamable;
    private Boolean downloadable;
    private String genre;
    private String release;
    private String purchase_url;
    private Integer label_id;
    private String label_name;
    private String isrc;
    private String video_url;
    private String track_type;
    private String key_signature;
    private String bpm;
    private String title;
    private Integer release_year;
    private Integer release_month;
    private Integer release_day;
    private String original_format;
    private Integer original_content_size;
    private String license;
    private String uri;
    private String permalink_url;
    private String artwork_url;
    private String waveform_url;
    private String stream_url;
    private String download_url;
    private Integer playback_count;
    private Integer download_count;
    private Integer favoritings_count;
    private Integer comment_count;
    private String attachments_uri;

    public Track() {}

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public Integer getUserId() {
        return user_id;
    }

    public Integer getDuration() {
        return duration;
    }

    public Boolean isCommentable() {
        return commentable;
    }

    public String getState() {
        return state;
    }

    public String getSharing() {
        return sharing;
    }

    public String getTagList() {
        return tag_list;
    }

    public String getPermalink() {
        return permalink;
    }

    public Boolean isStreamable() {
        return streamable;
    }

    public Boolean isDownloadable() {
        return downloadable;
    }

    public String getGenre() {
        return genre;
    }

    public String getRelease() {
        return release;
    }

    public String getPurchaseUrl() {
        return purchase_url;
    }

    public Integer getLabelId() {
        return label_id;
    }

    public String getLabelName() {
        return label_name;
    }

    public String getIsrc() {
        return isrc;
    }

    public String getVideoUrl() {
        return video_url;
    }

    public String getTrackType() {
        return track_type;
    }

    public String getKeySignature() {
        return key_signature;
    }

    public String getBpm() {
        return bpm;
    }

    public Integer getReleaseYear() {
        return release_year;
    }

    public Integer getReleaseMonth() {
        return release_month;
    }

    public Integer getReleaseDay() {
        return release_day;
    }

    public String getOriginalFormat() {
        return original_format;
    }

    public Integer getOriginalContentSize() {
        return original_content_size;
    }

    public String getLicense() {
        return license;
    }

    public String getUri() {
        return uri;
    }

    public String getPermalinkUrl() {
        return permalink_url;
    }

    public String getArtworkUrl() {
        return artwork_url;
    }

    public String getWaveformUrl() {
        return waveform_url;
    }

    public String getDownloadUrl() {
        return download_url;
    }

    public Integer getPlaybackCount() {
        return playback_count;
    }

    public Integer getDownloadCount() {
        return download_count;
    }

    public Integer getFavoritingsCount() {
        return favoritings_count;
    }

    public Integer getCommentCount() {
        return comment_count;
    }

    public String getAttachmentsUri() {
        return attachments_uri;
    }

    public String getStreamUrl() {
        return this.stream_url;
    }

    public String toString() {
        return "Track [id=" + id + ", created_at=" + created_at + ", user_id="
                + user_id + ", duration=" + duration + ", commentable="
                + commentable + ", state=" + state + ", sharing=" + sharing
                + ", tag_list=" + tag_list + ", permalink=" + permalink
                + ", streamable=" + streamable
                + ", downloadable=" + downloadable + ", genre=" + genre
                + ", release=" + release + ", purchase_url=" + purchase_url
                + ", label_id=" + label_id + ", label_name=" + label_name
                + ", isrc=" + isrc + ", video_url=" + video_url
                + ", track_type=" + track_type + ", key_signature="
                + key_signature + ", bpm=" + bpm + ", title=" + title
                + ", release_year=" + release_year + ", release_month="
                + release_month + ", release_day=" + release_day
                + ", original_format=" + original_format
                + ", original_content_size=" + original_content_size
                + ", license=" + license + ", uri=" + uri + ", permalink_url="
                + permalink_url + ", artwork_url=" + artwork_url
                + ", waveform_url=" + waveform_url
                + ", stream_url=" + stream_url + ", download_url="
                + download_url + ", playback_count=" + playback_count
                + ", download_count=" + download_count + ", favoritings_count="
                + favoritings_count + ", comment_count=" + comment_count
                + ", attachments_uri=" + attachments_uri + "]";
    }
}