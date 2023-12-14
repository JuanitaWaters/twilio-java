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

package com.twilio.rest.voice.v1.connectionpolicy;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class ConnectionPolicyTargetFetcher
    extends Fetcher<ConnectionPolicyTarget> {

    private String pathConnectionPolicySid;
    private String pathSid;

    public ConnectionPolicyTargetFetcher(
        final String pathConnectionPolicySid,
        final String pathSid
    ) {
        this.pathConnectionPolicySid = pathConnectionPolicySid;
        this.pathSid = pathSid;
    }

    @Override
    public ConnectionPolicyTarget fetch(final TwilioRestClient client) {
        String path =
            "/v1/ConnectionPolicies/{ConnectionPolicySid}/Targets/{Sid}";

        path =
            path.replace(
                "{" + "ConnectionPolicySid" + "}",
                this.pathConnectionPolicySid.toString()
            );
        path = path.replace("{" + "Sid" + "}", this.pathSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.VOICE.toString(),
            path
        );
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "ConnectionPolicyTarget fetch failed: Unable to connect to server"
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

        return ConnectionPolicyTarget.fromJson(
            response.getStream(),
            client.getObjectMapper()
        );
    }
}