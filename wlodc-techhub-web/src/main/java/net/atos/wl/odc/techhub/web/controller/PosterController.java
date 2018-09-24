/*
 * Copyright (C) 2018 Worldline ODC.
 */
package net.atos.wl.odc.techhub.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.atos.wl.odc.techhub.business.service.PosterService;
import net.atos.wl.odc.techhub.common.dto.PosterDto;

/**
 * Spring REST Controller for exposing Posters APIs.
 * 
 * @author a120065
 */
@RestController
@Api(value = "/api/posters", tags = "Posters API")
public class PosterController {

    private static Logger log = LoggerFactory.getLogger(PosterController.class);

    @Autowired
    private PosterService posterService;

    /**
     * REST service to get all posters.
     * 
     * @return ResponseEntity with posters and HTTP status.
     */
    @RequestMapping(value = "/api/posters", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get all posters.")
    public ResponseEntity<List<PosterDto>> getAllQuestions() {
        log.info("Getting all posters.");
        final List<PosterDto> posters = this.posterService.findAllPosters();
        log.info("Total number of posters found " + posters.size());
        return new ResponseEntity<>(posters, HttpStatus.OK);
    }
}
