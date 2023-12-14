/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Preview
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.preview.sync;

import com.twilio.base.Updater;
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

public class ServiceUpdater extends Updater<Service> {

    private String pathSid;
    private URI webhookUrl;
    private String friendlyName;
    private Boolean reachabilityWebhooksEnabled;
    private Boolean aclEnabled;

    public ServiceUpdater(final String pathSid) {
        this.pathSid = pathSid;
    }

    public ServiceUpdater setWebhookUrl(final URI webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

    public ServiceUpdater setWebhookUrl(final String webhookUrl) {
        return setWebhookUrl(Promoter.uriFromString(webhookUrl));
    }

    public ServiceUpdater setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    public ServiceUpdater setReachabilityWebhooksEnabled(
        final Boolean reachabilityWebhooksEnabled
    ) {
        this.reachabilityWebhooksEnabled = reachabilityWebhooksEnabled;
        return this;
    }

    public ServiceUpdater setAclEnabled(final Boolean aclEnabled) {
        this.aclEnabled = aclEnabled;
        return this;
    }

    @Override
    public Service update(final TwilioRestClient client) {
        String path = "/Sync/Services/{Sid}";

        path = path.replace("{" + "Sid" + "}", this.pathSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException(
                "Service update failed: Unable to connect to server"
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

        return Service.fromJson(response.getStream(), client.getObjectMapper());
    }

    private void addPostParams(final Request request) {
        if (webhookUrl != null) {
            request.addPostParam("WebhookUrl", webhookUrl.toString());
        }
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }
        if (reachabilityWebhooksEnabled != null) {
            request.addPostParam(
                "ReachabilityWebhooksEnabled",
                reachabilityWebhooksEnabled.toString()
            );
        }
        if (aclEnabled != null) {
            request.addPostParam("AclEnabled", aclEnabled.toString());
        }
    }
}
