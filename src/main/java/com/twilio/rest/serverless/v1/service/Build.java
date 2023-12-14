/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Serverless
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.serverless.v1.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Map;
import java.util.Objects;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Build extends Resource {

    private static final long serialVersionUID = 76818411121781L;

    public static BuildCreator creator(final String pathServiceSid) {
        return new BuildCreator(pathServiceSid);
    }

    public static BuildDeleter deleter(
        final String pathServiceSid,
        final String pathSid
    ) {
        return new BuildDeleter(pathServiceSid, pathSid);
    }

    public static BuildFetcher fetcher(
        final String pathServiceSid,
        final String pathSid
    ) {
        return new BuildFetcher(pathServiceSid, pathSid);
    }

    public static BuildReader reader(final String pathServiceSid) {
        return new BuildReader(pathServiceSid);
    }

    /**
     * Converts a JSON String into a Build object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Build object represented by the provided JSON
     */
    public static Build fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Build.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Build object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Build object represented by the provided JSON
     */
    public static Build fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Build.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    public enum Runtime {
        NODE8("node8"),
        NODE10("node10"),
        NODE12("node12"),
        NODE14("node14"),
        NODE16("node16"),
        NODE18("node18");

        private final String value;

        private Runtime(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Runtime forValue(final String value) {
            return Promoter.enumFromString(value, Runtime.values());
        }
    }

    public enum Status {
        BUILDING("building"),
        COMPLETED("completed"),
        FAILED("failed");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    private final String sid;
    private final String accountSid;
    private final String serviceSid;
    private final Build.Status status;
    private final List<Map<String, Object>> assetVersions;
    private final List<Map<String, Object>> functionVersions;
    private final List<Map<String, Object>> dependencies;
    private final Build.Runtime runtime;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Build(
        @JsonProperty("sid") final String sid,
        @JsonProperty("account_sid") final String accountSid,
        @JsonProperty("service_sid") final String serviceSid,
        @JsonProperty("status") final Build.Status status,
        @JsonProperty("asset_versions") final List<
            Map<String, Object>
        > assetVersions,
        @JsonProperty("function_versions") final List<
            Map<String, Object>
        > functionVersions,
        @JsonProperty("dependencies") final List<
            Map<String, Object>
        > dependencies,
        @JsonProperty("runtime") final Build.Runtime runtime,
        @JsonProperty("date_created") final String dateCreated,
        @JsonProperty("date_updated") final String dateUpdated,
        @JsonProperty("url") final URI url,
        @JsonProperty("links") final Map<String, String> links
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.status = status;
        this.assetVersions = assetVersions;
        this.functionVersions = functionVersions;
        this.dependencies = dependencies;
        this.runtime = runtime;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
        this.links = links;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getAccountSid() {
        return this.accountSid;
    }

    public final String getServiceSid() {
        return this.serviceSid;
    }

    public final Build.Status getStatus() {
        return this.status;
    }

    public final List<Map<String, Object>> getAssetVersions() {
        return this.assetVersions;
    }

    public final List<Map<String, Object>> getFunctionVersions() {
        return this.functionVersions;
    }

    public final List<Map<String, Object>> getDependencies() {
        return this.dependencies;
    }

    public final Build.Runtime getRuntime() {
        return this.runtime;
    }

    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    public final URI getUrl() {
        return this.url;
    }

    public final Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Build other = (Build) o;

        return (
            Objects.equals(sid, other.sid) &&
            Objects.equals(accountSid, other.accountSid) &&
            Objects.equals(serviceSid, other.serviceSid) &&
            Objects.equals(status, other.status) &&
            Objects.equals(assetVersions, other.assetVersions) &&
            Objects.equals(functionVersions, other.functionVersions) &&
            Objects.equals(dependencies, other.dependencies) &&
            Objects.equals(runtime, other.runtime) &&
            Objects.equals(dateCreated, other.dateCreated) &&
            Objects.equals(dateUpdated, other.dateUpdated) &&
            Objects.equals(url, other.url) &&
            Objects.equals(links, other.links)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            sid,
            accountSid,
            serviceSid,
            status,
            assetVersions,
            functionVersions,
            dependencies,
            runtime,
            dateCreated,
            dateUpdated,
            url,
            links
        );
    }
}