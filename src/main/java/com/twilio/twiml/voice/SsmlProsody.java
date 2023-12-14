/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.twilio.twiml.TwiML;
import com.twilio.twiml.TwiMLException;

import java.util.HashMap;
import java.util.Map;

/**
 * TwiML wrapper for {@code <prosody>}
 */
@JsonDeserialize(builder = SsmlProsody.Builder.class)
public class SsmlProsody extends TwiML {
    private final String volume;
    private final String rate;
    private final String pitch;
    private final String words;

    /**
     * For XML Serialization/Deserialization
     */
    private SsmlProsody() {
        this(new Builder());
    }

    /**
     * Create a new {@code <prosody>} element
     */
    private SsmlProsody(Builder b) {
        super("prosody", b);
        this.volume = b.volume;
        this.rate = b.rate;
        this.pitch = b.pitch;
        this.words = b.words;
    }

    /**
     * The body of the TwiML element
     *
     * @return Element body as a string if present else null
     */
    protected String getElementBody() {
        return this.getWords() == null ? null : this.getWords();
    }

    /**
     * Attributes to set on the generated XML element
     *
     * @return A Map of attribute keys to values
     */
    protected Map<String, String> getElementAttributes() {
        // Preserve order of attributes
        Map<String, String> attrs = new HashMap<>();

        if (this.getVolume() != null) {
            attrs.put("volume", this.getVolume());
        }
        if (this.getRate() != null) {
            attrs.put("rate", this.getRate());
        }
        if (this.getPitch() != null) {
            attrs.put("pitch", this.getPitch());
        }

        return attrs;
    }

    /**
     * Specify the volume, available values: default, silent, x-soft, soft, medium,
     * loud, x-loud, +ndB, -ndB
     *
     * @return Specify the volume, available values: default, silent, x-soft, soft,
     *         medium, loud, x-loud, +ndB, -ndB
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Specify the rate, available values: x-slow, slow, medium, fast, x-fast, n%
     *
     * @return Specify the rate, available values: x-slow, slow, medium, fast,
     *         x-fast, n%
     */
    public String getRate() {
        return rate;
    }

    /**
     * Specify the pitch, available values: default, x-low, low, medium, high,
     * x-high, +n%, -n%
     *
     * @return Specify the pitch, available values: default, x-low, low, medium,
     *         high, x-high, +n%, -n%
     */
    public String getPitch() {
        return pitch;
    }

    /**
     * Words to speak
     *
     * @return Words to speak
     */
    public String getWords() {
        return words;
    }

    /**
     * Create a new {@code <prosody>} element
     */
    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder extends TwiML.Builder<Builder> {
        /**
         * Create and return a {@code <SsmlProsody.Builder>} from an XML string
         */
        public static Builder fromXml(final String xml) throws TwiMLException {
            try {
                return OBJECT_MAPPER.readValue(xml, Builder.class);
            } catch (final JsonProcessingException jpe) {
                throw new TwiMLException(
                    "Failed to deserialize a SsmlProsody.Builder from the provided XML string: " + jpe.getMessage());
            } catch (final Exception e) {
                throw new TwiMLException("Unhandled exception: " + e.getMessage());
            }
        }

        private String volume;
        private String rate;
        private String pitch;
        private String words;

        /**
         * Create a {@code <prosody>} with words
         */
        public Builder(String words) {
            this.words = words;
        }

        /**
         * Create a {@code <prosody>} with child elements
         */
        public Builder() {
        }

        /**
         * Specify the volume, available values: default, silent, x-soft, soft, medium,
         * loud, x-loud, +ndB, -ndB
         */
        @JacksonXmlProperty(isAttribute = true, localName = "volume")
        public Builder volume(String volume) {
            this.volume = volume;
            return this;
        }

        /**
         * Specify the rate, available values: x-slow, slow, medium, fast, x-fast, n%
         */
        @JacksonXmlProperty(isAttribute = true, localName = "rate")
        public Builder rate(String rate) {
            this.rate = rate;
            return this;
        }

        /**
         * Specify the pitch, available values: default, x-low, low, medium, high,
         * x-high, +n%, -n%
         */
        @JacksonXmlProperty(isAttribute = true, localName = "pitch")
        public Builder pitch(String pitch) {
            this.pitch = pitch;
            return this;
        }

        /**
         * Add a child {@code <break>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "break")
        public Builder break_(SsmlBreak ssmlBreak) {
            this.children.add(ssmlBreak);
            return this;
        }

        /**
         * Add a child {@code <emphasis>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "emphasis")
        public Builder emphasis(SsmlEmphasis ssmlEmphasis) {
            this.children.add(ssmlEmphasis);
            return this;
        }

        /**
         * Add a child {@code <lang>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "lang")
        public Builder lang(SsmlLang ssmlLang) {
            this.children.add(ssmlLang);
            return this;
        }

        /**
         * Add a child {@code <p>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "p")
        public Builder p(SsmlP ssmlP) {
            this.children.add(ssmlP);
            return this;
        }

        /**
         * Add a child {@code <phoneme>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "phoneme")
        public Builder phoneme(SsmlPhoneme ssmlPhoneme) {
            this.children.add(ssmlPhoneme);
            return this;
        }

        /**
         * Add a child {@code <prosody>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "prosody")
        public Builder prosody(SsmlProsody ssmlProsody) {
            this.children.add(ssmlProsody);
            return this;
        }

        /**
         * Add a child {@code <s>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "s")
        public Builder s(SsmlS ssmlS) {
            this.children.add(ssmlS);
            return this;
        }

        /**
         * Add a child {@code <say-as>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "say-as")
        public Builder sayAs(SsmlSayAs ssmlSayAs) {
            this.children.add(ssmlSayAs);
            return this;
        }

        /**
         * Add a child {@code <sub>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "sub")
        public Builder sub(SsmlSub ssmlSub) {
            this.children.add(ssmlSub);
            return this;
        }

        /**
         * Add a child {@code <w>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "w")
        public Builder w(SsmlW ssmlW) {
            this.children.add(ssmlW);
            return this;
        }

        /**
         * Create and return resulting {@code <prosody>} element
         */
        public SsmlProsody build() {
            return new SsmlProsody(this);
        }
    }
}