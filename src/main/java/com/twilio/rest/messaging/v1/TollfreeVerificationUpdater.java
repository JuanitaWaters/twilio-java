/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.messaging.v1;

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
import java.util.List;

public class TollfreeVerificationUpdater extends Updater<TollfreeVerification> {

    private String pathSid;
    private String businessName;
    private String businessWebsite;
    private String notificationEmail;
    private List<String> useCaseCategories;
    private String useCaseSummary;
    private String productionMessageSample;
    private List<String> optInImageUrls;
    private TollfreeVerification.OptInType optInType;
    private String messageVolume;
    private String businessStreetAddress;
    private String businessStreetAddress2;
    private String businessCity;
    private String businessStateProvinceRegion;
    private String businessPostalCode;
    private String businessCountry;
    private String additionalInformation;
    private String businessContactFirstName;
    private String businessContactLastName;
    private String businessContactEmail;
    private com.twilio.type.PhoneNumber businessContactPhone;
    private String editReason;

    public TollfreeVerificationUpdater(final String pathSid) {
        this.pathSid = pathSid;
    }

    public TollfreeVerificationUpdater setBusinessName(
        final String businessName
    ) {
        this.businessName = businessName;
        return this;
    }

    public TollfreeVerificationUpdater setBusinessWebsite(
        final String businessWebsite
    ) {
        this.businessWebsite = businessWebsite;
        return this;
    }

    public TollfreeVerificationUpdater setNotificationEmail(
        final String notificationEmail
    ) {
        this.notificationEmail = notificationEmail;
        return this;
    }

    public TollfreeVerificationUpdater setUseCaseCategories(
        final List<String> useCaseCategories
    ) {
        this.useCaseCategories = useCaseCategories;
        return this;
    }

    public TollfreeVerificationUpdater setUseCaseCategories(
        final String useCaseCategories
    ) {
        return setUseCaseCategories(Promoter.listOfOne(useCaseCategories));
    }

    public TollfreeVerificationUpdater setUseCaseSummary(
        final String useCaseSummary
    ) {
        this.useCaseSummary = useCaseSummary;
        return this;
    }

    public TollfreeVerificationUpdater setProductionMessageSample(
        final String productionMessageSample
    ) {
        this.productionMessageSample = productionMessageSample;
        return this;
    }

    public TollfreeVerificationUpdater setOptInImageUrls(
        final List<String> optInImageUrls
    ) {
        this.optInImageUrls = optInImageUrls;
        return this;
    }

    public TollfreeVerificationUpdater setOptInImageUrls(
        final String optInImageUrls
    ) {
        return setOptInImageUrls(Promoter.listOfOne(optInImageUrls));
    }

    public TollfreeVerificationUpdater setOptInType(
        final TollfreeVerification.OptInType optInType
    ) {
        this.optInType = optInType;
        return this;
    }

    public TollfreeVerificationUpdater setMessageVolume(
        final String messageVolume
    ) {
        this.messageVolume = messageVolume;
        return this;
    }

    public TollfreeVerificationUpdater setBusinessStreetAddress(
        final String businessStreetAddress
    ) {
        this.businessStreetAddress = businessStreetAddress;
        return this;
    }

    public TollfreeVerificationUpdater setBusinessStreetAddress2(
        final String businessStreetAddress2
    ) {
        this.businessStreetAddress2 = businessStreetAddress2;
        return this;
    }

    public TollfreeVerificationUpdater setBusinessCity(
        final String businessCity
    ) {
        this.businessCity = businessCity;
        return this;
    }

    public TollfreeVerificationUpdater setBusinessStateProvinceRegion(
        final String businessStateProvinceRegion
    ) {
        this.businessStateProvinceRegion = businessStateProvinceRegion;
        return this;
    }

    public TollfreeVerificationUpdater setBusinessPostalCode(
        final String businessPostalCode
    ) {
        this.businessPostalCode = businessPostalCode;
        return this;
    }

    public TollfreeVerificationUpdater setBusinessCountry(
        final String businessCountry
    ) {
        this.businessCountry = businessCountry;
        return this;
    }

    public TollfreeVerificationUpdater setAdditionalInformation(
        final String additionalInformation
    ) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    public TollfreeVerificationUpdater setBusinessContactFirstName(
        final String businessContactFirstName
    ) {
        this.businessContactFirstName = businessContactFirstName;
        return this;
    }

    public TollfreeVerificationUpdater setBusinessContactLastName(
        final String businessContactLastName
    ) {
        this.businessContactLastName = businessContactLastName;
        return this;
    }

    public TollfreeVerificationUpdater setBusinessContactEmail(
        final String businessContactEmail
    ) {
        this.businessContactEmail = businessContactEmail;
        return this;
    }

    public TollfreeVerificationUpdater setBusinessContactPhone(
        final com.twilio.type.PhoneNumber businessContactPhone
    ) {
        this.businessContactPhone = businessContactPhone;
        return this;
    }

    public TollfreeVerificationUpdater setBusinessContactPhone(
        final String businessContactPhone
    ) {
        return setBusinessContactPhone(
            Promoter.phoneNumberFromString(businessContactPhone)
        );
    }

    public TollfreeVerificationUpdater setEditReason(final String editReason) {
        this.editReason = editReason;
        return this;
    }

    @Override
    public TollfreeVerification update(final TwilioRestClient client) {
        String path = "/v1/Tollfree/Verifications/{Sid}";

        path = path.replace("{" + "Sid" + "}", this.pathSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.MESSAGING.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException(
                "TollfreeVerification update failed: Unable to connect to server"
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

        return TollfreeVerification.fromJson(
            response.getStream(),
            client.getObjectMapper()
        );
    }

    private void addPostParams(final Request request) {
        if (businessName != null) {
            request.addPostParam("BusinessName", businessName);
        }
        if (businessWebsite != null) {
            request.addPostParam("BusinessWebsite", businessWebsite);
        }
        if (notificationEmail != null) {
            request.addPostParam("NotificationEmail", notificationEmail);
        }
        if (useCaseCategories != null) {
            for (String prop : useCaseCategories) {
                request.addPostParam("UseCaseCategories", prop);
            }
        }
        if (useCaseSummary != null) {
            request.addPostParam("UseCaseSummary", useCaseSummary);
        }
        if (productionMessageSample != null) {
            request.addPostParam(
                "ProductionMessageSample",
                productionMessageSample
            );
        }
        if (optInImageUrls != null) {
            for (String prop : optInImageUrls) {
                request.addPostParam("OptInImageUrls", prop);
            }
        }
        if (optInType != null) {
            request.addPostParam("OptInType", optInType.toString());
        }
        if (messageVolume != null) {
            request.addPostParam("MessageVolume", messageVolume);
        }
        if (businessStreetAddress != null) {
            request.addPostParam(
                "BusinessStreetAddress",
                businessStreetAddress
            );
        }
        if (businessStreetAddress2 != null) {
            request.addPostParam(
                "BusinessStreetAddress2",
                businessStreetAddress2
            );
        }
        if (businessCity != null) {
            request.addPostParam("BusinessCity", businessCity);
        }
        if (businessStateProvinceRegion != null) {
            request.addPostParam(
                "BusinessStateProvinceRegion",
                businessStateProvinceRegion
            );
        }
        if (businessPostalCode != null) {
            request.addPostParam("BusinessPostalCode", businessPostalCode);
        }
        if (businessCountry != null) {
            request.addPostParam("BusinessCountry", businessCountry);
        }
        if (additionalInformation != null) {
            request.addPostParam(
                "AdditionalInformation",
                additionalInformation
            );
        }
        if (businessContactFirstName != null) {
            request.addPostParam(
                "BusinessContactFirstName",
                businessContactFirstName
            );
        }
        if (businessContactLastName != null) {
            request.addPostParam(
                "BusinessContactLastName",
                businessContactLastName
            );
        }
        if (businessContactEmail != null) {
            request.addPostParam("BusinessContactEmail", businessContactEmail);
        }
        if (businessContactPhone != null) {
            request.addPostParam(
                "BusinessContactPhone",
                businessContactPhone.toString()
            );
        }
        if (editReason != null) {
            request.addPostParam("EditReason", editReason);
        }
    }
}
