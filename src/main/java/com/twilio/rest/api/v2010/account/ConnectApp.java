/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.api.v2010.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.http.HttpMethod;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Objects;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class ConnectApp extends Resource {

    private static final long serialVersionUID = 203118827948403L;

    public static ConnectAppDeleter deleter(final String pathSid) {
        return new ConnectAppDeleter(pathSid);
    }

    public static ConnectAppDeleter deleter(
        final String pathAccountSid,
        final String pathSid
    ) {
        return new ConnectAppDeleter(pathAccountSid, pathSid);
    }

    public static ConnectAppFetcher fetcher(final String pathSid) {
        return new ConnectAppFetcher(pathSid);
    }

    public static ConnectAppFetcher fetcher(
        final String pathAccountSid,
        final String pathSid
    ) {
        return new ConnectAppFetcher(pathAccountSid, pathSid);
    }

    public static ConnectAppReader reader() {
        return new ConnectAppReader();
    }

    public static ConnectAppReader reader(final String pathAccountSid) {
        return new ConnectAppReader(pathAccountSid);
    }

    public static ConnectAppUpdater updater(final String pathSid) {
        return new ConnectAppUpdater(pathSid);
    }

    public static ConnectAppUpdater updater(
        final String pathAccountSid,
        final String pathSid
    ) {
        return new ConnectAppUpdater(pathAccountSid, pathSid);
    }

    /**
     * Converts a JSON String into a ConnectApp object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return ConnectApp object represented by the provided JSON
     */
    public static ConnectApp fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ConnectApp.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a ConnectApp object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return ConnectApp object represented by the provided JSON
     */
    public static ConnectApp fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ConnectApp.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    public enum Permission {
        GET_ALL("get-all"),
        POST_ALL("post-all");

        private final String value;

        private Permission(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Permission forValue(final String value) {
            return Promoter.enumFromString(value, Permission.values());
        }
    }

    private final String accountSid;
    private final URI authorizeRedirectUrl;
    private final String companyName;
    private final HttpMethod deauthorizeCallbackMethod;
    private final URI deauthorizeCallbackUrl;
    private final String description;
    private final String friendlyName;
    private final URI homepageUrl;
    private final List<ConnectApp.Permission> permissions;
    private final String sid;
    private final String uri;

    @JsonCreator
    private ConnectApp(
        @JsonProperty("account_sid") final String accountSid,
        @JsonProperty("authorize_redirect_url") final URI authorizeRedirectUrl,
        @JsonProperty("company_name") final String companyName,
        @JsonProperty(
            "deauthorize_callback_method"
        ) final HttpMethod deauthorizeCallbackMethod,
        @JsonProperty(
            "deauthorize_callback_url"
        ) final URI deauthorizeCallbackUrl,
        @JsonProperty("description") final String description,
        @JsonProperty("friendly_name") final String friendlyName,
        @JsonProperty("homepage_url") final URI homepageUrl,
        @JsonProperty("permissions") final List<
            ConnectApp.Permission
        > permissions,
        @JsonProperty("sid") final String sid,
        @JsonProperty("uri") final String uri
    ) {
        this.accountSid = accountSid;
        this.authorizeRedirectUrl = authorizeRedirectUrl;
        this.companyName = companyName;
        this.deauthorizeCallbackMethod = deauthorizeCallbackMethod;
        this.deauthorizeCallbackUrl = deauthorizeCallbackUrl;
        this.description = description;
        this.friendlyName = friendlyName;
        this.homepageUrl = homepageUrl;
        this.permissions = permissions;
        this.sid = sid;
        this.uri = uri;
    }

    public final String getAccountSid() {
        return this.accountSid;
    }

    public final URI getAuthorizeRedirectUrl() {
        return this.authorizeRedirectUrl;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final HttpMethod getDeauthorizeCallbackMethod() {
        return this.deauthorizeCallbackMethod;
    }

    public final URI getDeauthorizeCallbackUrl() {
        return this.deauthorizeCallbackUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFriendlyName() {
        return this.friendlyName;
    }

    public final URI getHomepageUrl() {
        return this.homepageUrl;
    }

    public final List<ConnectApp.Permission> getPermissions() {
        return this.permissions;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getUri() {
        return this.uri;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ConnectApp other = (ConnectApp) o;

        return (
            Objects.equals(accountSid, other.accountSid) &&
            Objects.equals(authorizeRedirectUrl, other.authorizeRedirectUrl) &&
            Objects.equals(companyName, other.companyName) &&
            Objects.equals(
                deauthorizeCallbackMethod,
                other.deauthorizeCallbackMethod
            ) &&
            Objects.equals(
                deauthorizeCallbackUrl,
                other.deauthorizeCallbackUrl
            ) &&
            Objects.equals(description, other.description) &&
            Objects.equals(friendlyName, other.friendlyName) &&
            Objects.equals(homepageUrl, other.homepageUrl) &&
            Objects.equals(permissions, other.permissions) &&
            Objects.equals(sid, other.sid) &&
            Objects.equals(uri, other.uri)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountSid,
            authorizeRedirectUrl,
            companyName,
            deauthorizeCallbackMethod,
            deauthorizeCallbackUrl,
            description,
            friendlyName,
            homepageUrl,
            permissions,
            sid,
            uri
        );
    }
}