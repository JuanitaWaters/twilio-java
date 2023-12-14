/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Voice
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.voice.v1;

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

public class SourceIpMappingCreator extends Creator<SourceIpMapping> {

    private String ipRecordSid;
    private String sipDomainSid;

    public SourceIpMappingCreator(
        final String ipRecordSid,
        final String sipDomainSid
    ) {
        this.ipRecordSid = ipRecordSid;
        this.sipDomainSid = sipDomainSid;
    }

    public SourceIpMappingCreator setIpRecordSid(final String ipRecordSid) {
        this.ipRecordSid = ipRecordSid;
        return this;
    }

    public SourceIpMappingCreator setSipDomainSid(final String sipDomainSid) {
        this.sipDomainSid = sipDomainSid;
        return this;
    }

    @Override
    public SourceIpMapping create(final TwilioRestClient client) {
        String path = "/v1/SourceIpMappings";

        path =
            path.replace(
                "{" + "IpRecordSid" + "}",
                this.ipRecordSid.toString()
            );
        path =
            path.replace(
                "{" + "SipDomainSid" + "}",
                this.sipDomainSid.toString()
            );

        Request request = new Request(
            HttpMethod.POST,
            Domains.VOICE.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException(
                "SourceIpMapping creation failed: Unable to connect to server"
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

        return SourceIpMapping.fromJson(
            response.getStream(),
            client.getObjectMapper()
        );
    }

    private void addPostParams(final Request request) {
        if (ipRecordSid != null) {
            request.addPostParam("IpRecordSid", ipRecordSid);
        }
        if (sipDomainSid != null) {
            request.addPostParam("SipDomainSid", sipDomainSid);
        }
    }
}