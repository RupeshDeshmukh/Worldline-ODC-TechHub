package com.techhub.common.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.techhub.common.enums.VotingType;

/**
 * Data transfer object for vote details.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VoteDto implements Serializable {

    /**
     * Generated serial version Id.
     */
    private static final long serialVersionUID = 1763986856498563110L;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("topicId")
    private Integer topicId;

    @JsonProperty("posterId")
    private Integer posterId;

    @JsonProperty("videoId")
    private Integer videoId;

    @JsonProperty("voteType")
    private VotingType voteType;

    /**
     * Getter for id.
     *
     * @return the id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * Setter for id.
     *
     * @param id
     *            the id to set
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for userId.
     *
     * @return the userId
     */
    public final String getUserId() {
        return userId;
    }

    /**
     * Setter for userId.
     *
     * @param userId
     *            the userId to set
     */
    public final void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Getter for topicId.
     *
     * @return the topicId
     */
    public final Integer getTopicId() {
        return topicId;
    }

    /**
     * Setter for topicId.
     *
     * @param topicId
     *            the topicId to set
     */
    public final void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    /**
     * Getter for posterId.
     *
     * @return the posterId
     */
    public final Integer getPosterId() {
        return posterId;
    }

    /**
     * Setter for posterId.
     *
     * @param posterId
     *            the posterId to set
     */
    public final void setPosterId(Integer posterId) {
        this.posterId = posterId;
    }

    /**
     * Getter for videoId.
     *
     * @return the videoId
     */
    public final Integer getVideoId() {
        return videoId;
    }

    /**
     * Setter for videoId.
     *
     * @param videoId
     *            the videoId to set
     */
    public final void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    /**
     * Getter for voteType.
     *
     * @return the voteType
     */
    public final VotingType getVoteType() {
        return voteType;
    }

    /**
     * Setter for voteType.
     *
     * @param voteType
     *            the voteType to set
     */
    public final void setVoteType(VotingType voteType) {
        this.voteType = voteType;
    }
}
