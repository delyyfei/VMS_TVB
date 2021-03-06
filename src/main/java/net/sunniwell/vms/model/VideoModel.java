package net.sunniwell.vms.model;

public class VideoModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.media_id
     *
     * @mbg.generated
     */
    private String mediaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.media_name
     *
     * @mbg.generated
     */
    private String mediaName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.serial
     *
     * @mbg.generated
     */
    private Integer serial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.bitrate
     *
     * @mbg.generated
     */
    private Integer bitrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.file_path
     *
     * @mbg.generated
     */
    private String filePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.error_detail
     *
     * @mbg.generated
     */
    private String errorDetail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.id
     *
     * @return the value of video.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.id
     *
     * @param id the value for video.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.media_id
     *
     * @return the value of video.media_id
     *
     * @mbg.generated
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.media_id
     *
     * @param mediaId the value for video.media_id
     *
     * @mbg.generated
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId == null ? null : mediaId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.media_name
     *
     * @return the value of video.media_name
     *
     * @mbg.generated
     */
    public String getMediaName() {
        return mediaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.media_name
     *
     * @param mediaName the value for video.media_name
     *
     * @mbg.generated
     */
    public void setMediaName(String mediaName) {
        this.mediaName = mediaName == null ? null : mediaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.serial
     *
     * @return the value of video.serial
     *
     * @mbg.generated
     */
    public Integer getSerial() {
        return serial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.serial
     *
     * @param serial the value for video.serial
     *
     * @mbg.generated
     */
    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.bitrate
     *
     * @return the value of video.bitrate
     *
     * @mbg.generated
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.bitrate
     *
     * @param bitrate the value for video.bitrate
     *
     * @mbg.generated
     */
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.file_path
     *
     * @return the value of video.file_path
     *
     * @mbg.generated
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.file_path
     *
     * @param filePath the value for video.file_path
     *
     * @mbg.generated
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.url
     *
     * @return the value of video.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.url
     *
     * @param url the value for video.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.status
     *
     * @return the value of video.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.status
     *
     * @param status the value for video.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.error_detail
     *
     * @return the value of video.error_detail
     *
     * @mbg.generated
     */
    public String getErrorDetail() {
        return errorDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.error_detail
     *
     * @param errorDetail the value for video.error_detail
     *
     * @mbg.generated
     */
    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail == null ? null : errorDetail.trim();
    }
}