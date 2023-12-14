/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Studio
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.studio.v2;

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
public class Flow extends Resource {

    private static final long serialVersionUID = 951890745581L;

    public static FlowCreator creator(
        final String friendlyName,
        final Flow.Status status,
        final Map<String, Object> definition
    ) {
        return new FlowCreator(friendlyName, status, definition);
    }

    public static FlowDeleter deleter(final String pathSid) {
        return new FlowDeleter(pathSid);
    }

    public static FlowFetcher fetcher(final String pathSid) {
        return new FlowFetcher(pathSid);
    }

    public static FlowReader reader() {
        return new FlowReader();
    }

    public static FlowUpdater updater(
        final String pathSid,
        final Flow.Status status
    ) {
        return new FlowUpdater(pathSid, status);
    }

    /**
     * Converts a JSON String into a Flow object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Flow object represented by the provided JSON
     */
    public static Flow fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Flow.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Flow object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Flow object represented by the provided JSON
     */
    public static Flow fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Flow.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    public enum Status {
        DRAFT("draft"),
        PUBLISHED("published");

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
    private final String friendlyName;
    private final Map<String, Object> definition;
    private final Flow.Status status;
    private final Integer revision;
    private final String commitMessage;
    private final Boolean valid;
    private final List<Map<String, Object>> errors;
    private final List<Map<String, Object>> warnings;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI webhookUrl;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Flow(
        @JsonProperty("sid") final String sid,
        @JsonProperty("account_sid") final String accountSid,
        @JsonProperty("friendly_name") final String friendlyName,
        @JsonProperty("definition") final Map<String, Object> definition,
        @JsonProperty("status") final Flow.Status status,
        @JsonProperty("revision") final Integer revision,
        @JsonProperty("commit_message") final String commitMessage,
        @JsonProperty("valid") final Boolean valid,
        @JsonProperty("errors") final List<Map<String, Object>> errors,
        @JsonProperty("warnings") final List<Map<String, Object>> warnings,
        @JsonProperty("date_created") final String dateCreated,
        @JsonProperty("date_updated") final String dateUpdated,
        @JsonProperty("webhook_url") final URI webhookUrl,
        @JsonProperty("url") final URI url,
        @JsonProperty("links") final Map<String, String> links
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.definition = definition;
        this.status = status;
        this.revision = revision;
        this.commitMessage = commitMessage;
        this.valid = valid;
        this.errors = errors;
        this.warnings = warnings;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.webhookUrl = webhookUrl;
        this.url = url;
        this.links = links;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getAccountSid() {
        return this.accountSid;
    }

    public final String getFriendlyName() {
        return this.friendlyName;
    }

    public final Map<String, Object> getDefinition() {
        return this.definition;
    }

    public final Flow.Status getStatus() {
        return this.status;
    }

    public final Integer getRevision() {
        return this.revision;
    }

    public final String getCommitMessage() {
        return this.commitMessage;
    }

    public final Boolean getValid() {
        return this.valid;
    }

    public final List<Map<String, Object>> getErrors() {
        return this.errors;
    }

    public final List<Map<String, Object>> getWarnings() {
        return this.warnings;
    }

    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    public final URI getWebhookUrl() {
        return this.webhookUrl;
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

        Flow other = (Flow) o;

        return (
            Objects.equals(sid, other.sid) &&
            Objects.equals(accountSid, other.accountSid) &&
            Objects.equals(friendlyName, other.friendlyName) &&
            Objects.equals(definition, other.definition) &&
            Objects.equals(status, other.status) &&
            Objects.equals(revision, other.revision) &&
            Objects.equals(commitMessage, other.commitMessage) &&
            Objects.equals(valid, other.valid) &&
            Objects.equals(errors, other.errors) &&
            Objects.equals(warnings, other.warnings) &&
            Objects.equals(dateCreated, other.dateCreated) &&
            Objects.equals(dateUpdated, other.dateUpdated) &&
            Objects.equals(webhookUrl, other.webhookUrl) &&
            Objects.equals(url, other.url) &&
            Objects.equals(links, other.links)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            sid,
            accountSid,
            friendlyName,
            definition,
            status,
            revision,
            commitMessage,
            valid,
            errors,
            warnings,
            dateCreated,
            dateUpdated,
            webhookUrl,
            url,
            links
        );
    }
}