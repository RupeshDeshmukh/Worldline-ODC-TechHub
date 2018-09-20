/*
 * Copyright (C) 2018 Worldline ODC.
 */
package net.atos.wl.odc.techhub.data.dao;

import java.util.List;

import net.atos.wl.odc.techhub.common.dto.FeedbackDto;
import net.atos.wl.odc.techhub.data.entity.Feedback;

/**
 * Feedback DAO.
 * 
 * @author a120065
 */
public interface FeedbackDAO extends GenericDAO<Feedback> {

    /**
     * Method to post all user feedbacks.
     * 
     * @param userFeedbacks
     *            List of
     *            <code>net.atos.wl.odc.techhub.common.dto.FeedbackDto</code>.
     */
    void postUserFeedback(final List<FeedbackDto> userFeedbacks);
}
