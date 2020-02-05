import java.util.Date;

class MqInput implements java.io.Serializable {

    /***/
    private Integer messageId;

    /***/
    private Date insertedDate;

    /***/
    private String xmlRequest;

    /***/
    private Integer status;

    /***/
    private Integer isKit;

    private Integer messageType;

    private String idRequest;


    public MqInput() {
    }

    public MqInput(Date insertedDate, String xmlRequest, Integer status) {
        this.insertedDate = insertedDate;
        this.xmlRequest = xmlRequest;
        this.status = status;
    }

    public Integer getMessageId() {
        return this.messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }


    public Date getInsertedDate() {
        return this.insertedDate;
    }

    public void setInsertedDate(Date insertedDate) {
        this.insertedDate = insertedDate;
    }

    public String getXmlRequest() {
        return this.xmlRequest;
    }

    public void setXmlRequest(String xmlRequest) {
        this.xmlRequest = xmlRequest;
    }


    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public Integer getIsKit() {
        return isKit;
    }

    public void setIsKit(Integer isKit) {
        this.isKit = isKit;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public String getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(String idRequest) {
        this.idRequest = idRequest;
    }

    @Override
    public String toString() {
        return "MqInput{" +
                "messageId=" + messageId +
                ", insertedDate=" + insertedDate +
                ", xmlRequest='" + xmlRequest + '\'' +
                ", status=" + status +
                ", isKit=" + isKit +
                ", messageType=" + messageType +
                ", idRequest='" + idRequest + '\'' +
                '}';
    }
}

