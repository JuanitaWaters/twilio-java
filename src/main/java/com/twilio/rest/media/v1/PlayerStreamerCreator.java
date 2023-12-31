/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Media
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.media.v1;

import com.twilio.base.Creator;
import com.twilio.constant.EnumConstants;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.net.URI;
import java.net.URI;

public class PlayerStreamerCreator extends Creator<PlayerStreamer> {

    private Boolean video;
    private URI statusCallback;
    private HttpMethod statusCallbackMethod;
    private Integer maxDuration;

    public PlayerStreamerCreator() {}

    public PlayerStreamerCreator setVideo(final Boolean video) {
        this.video = video;
        return this;
    }

    public PlayerStreamerCreator setStatusCallback(final URI statusCallback) {
        this.statusCallback = statusCallback;
        return this;
    }

    public PlayerStreamerCreator setStatusCallback(
        final String statusCallback
    ) {
        return setStatusCallback(Promoter.uriFromString(statusCallback));
    }

    public PlayerStreamerCreator setStatusCallbackMethod(
        final HttpMethod statusCallbackMethod
    ) {
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }

    public PlayerStreamerCreator setMaxDuration(final Integer maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    @Override
    public PlayerStreamer create(final TwilioRestClient client) {
        String path = "/v1/PlayerStreamers";

        Request request = new Request(
            HttpMethod.POST,
            Domains.MEDIA.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException(
                "PlayerStreamer creation failed: Unable to connect to server"
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

        return PlayerStreamer.fromJson(
            response.getStream(),
            client.getObjectMapper()
        );
    }

    private void addPostParams(final Request request) {
        if (video != null) {
            request.addPostParam("Video", video.toString());
        }
        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
        }
        if (statusCallbackMethod != null) {
            request.addPostParam(
                "StatusCallbackMethod",
                statusCallbackMethod.toString()
            );
        }
        if (maxDuration != null) {
            request.addPostParam("MaxDuration", maxDuration.toString());
        }
    }
}
