/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1;

import com.twilio.base.Creator;
import com.twilio.constant.EnumConstants;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.math.BigDecimal;
import java.math.BigDecimal;

public class InsightsAssessmentsCommentCreator
    extends Creator<InsightsAssessmentsComment> {

    private String categoryId;
    private String categoryName;
    private String comment;
    private String segmentId;
    private String agentId;
    private BigDecimal offset;
    private String authorization;

    public InsightsAssessmentsCommentCreator(
        final String categoryId,
        final String categoryName,
        final String comment,
        final String segmentId,
        final String agentId,
        final BigDecimal offset
    ) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.comment = comment;
        this.segmentId = segmentId;
        this.agentId = agentId;
        this.offset = offset;
    }

    public InsightsAssessmentsCommentCreator setCategoryId(
        final String categoryId
    ) {
        this.categoryId = categoryId;
        return this;
    }

    public InsightsAssessmentsCommentCreator setCategoryName(
        final String categoryName
    ) {
        this.categoryName = categoryName;
        return this;
    }

    public InsightsAssessmentsCommentCreator setComment(final String comment) {
        this.comment = comment;
        return this;
    }

    public InsightsAssessmentsCommentCreator setSegmentId(
        final String segmentId
    ) {
        this.segmentId = segmentId;
        return this;
    }

    public InsightsAssessmentsCommentCreator setAgentId(final String agentId) {
        this.agentId = agentId;
        return this;
    }

    public InsightsAssessmentsCommentCreator setOffset(
        final BigDecimal offset
    ) {
        this.offset = offset;
        return this;
    }

    public InsightsAssessmentsCommentCreator setAuthorization(
        final String authorization
    ) {
        this.authorization = authorization;
        return this;
    }

    @Override
    public InsightsAssessmentsComment create(final TwilioRestClient client) {
        String path = "/v1/Insights/QualityManagement/Assessments/Comments";

        path =
            path.replace("{" + "CategoryId" + "}", this.categoryId.toString());
        path =
            path.replace(
                "{" + "CategoryName" + "}",
                this.categoryName.toString()
            );
        path = path.replace("{" + "Comment" + "}", this.comment.toString());
        path = path.replace("{" + "SegmentId" + "}", this.segmentId.toString());
        path = path.replace("{" + "AgentId" + "}", this.agentId.toString());
        path = path.replace("{" + "Offset" + "}", this.offset.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.FLEXAPI.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        addHeaderParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException(
                "InsightsAssessmentsComment creation failed: Unable to connect to server"
            );
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(
                response.getStream(),
                client.getObjectMapper()
            );
            if (restException == null) {
                throw new ApiException(
                    "Server Error, no content",
                    response.getStatusCode()
                );
            }
            throw new ApiException(restException);
        }

        return InsightsAssessmentsComment.fromJson(
            response.getStream(),
            client.getObjectMapper()
        );
    }

    private void addPostParams(final Request request) {
        if (categoryId != null) {
            request.addPostParam("CategoryId", categoryId);
        }
        if (categoryName != null) {
            request.addPostParam("CategoryName", categoryName);
        }
        if (comment != null) {
            request.addPostParam("Comment", comment);
        }
        if (segmentId != null) {
            request.addPostParam("SegmentId", segmentId);
        }
        if (agentId != null) {
            request.addPostParam("AgentId", agentId);
        }
        if (offset != null) {
            request.addPostParam("Offset", offset.toString());
        }
    }

    private void addHeaderParams(final Request request) {
        if (authorization != null) {
            request.addHeaderParam("Authorization", authorization);
        }
    }
}
