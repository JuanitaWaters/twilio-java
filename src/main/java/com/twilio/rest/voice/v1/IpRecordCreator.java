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

public class IpRecordCreator extends Creator<IpRecord> {

    private String ipAddress;
    private String friendlyName;
    private Integer cidrPrefixLength;

    public IpRecordCreator(final String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public IpRecordCreator setIpAddress(final String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public IpRecordCreator setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    public IpRecordCreator setCidrPrefixLength(final Integer cidrPrefixLength) {
        this.cidrPrefixLength = cidrPrefixLength;
        return this;
    }

    @Override
    public IpRecord create(final TwilioRestClient client) {
        String path = "/v1/IpRecords";

        path = path.replace("{" + "IpAddress" + "}", this.ipAddress.toString());

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
                "IpRecord creation failed: Unable to connect to server"
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

        return IpRecord.fromJson(
            response.getStream(),
            client.getObjectMapper()
        );
    }

    private void addPostParams(final Request request) {
        if (ipAddress != null) {
            request.addPostParam("IpAddress", ipAddress);
        }
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }
        if (cidrPrefixLength != null) {
            request.addPostParam(
                "CidrPrefixLength",
                cidrPrefixLength.toString()
            );
        }
    }
}
