package org.wordpress.android.fluxc.annotations.endpoint;

public class WPAPIEndpoint {
    private static final String WPCOM_REST_PREFIX = "https://public-api.wordpress.com";
    protected static final String WPAPI_PREFIX_V2 = "wp/v2";

    private final String mEndpoint;

    public WPAPIEndpoint(String endpoint) {
        mEndpoint = endpoint;
    }

    public WPAPIEndpoint(String endpoint, long id) {
        this(endpoint + id + "/");
    }

    public WPAPIEndpoint(String endpoint, String value) {
        this(endpoint + value + "/");
    }

    public String getEndpoint() {
        return mEndpoint;
    }

    public String getUrlV2() {
        return WPAPI_PREFIX_V2 + mEndpoint;
    }

    // FIXME: Add a comment justifying/explaining this
    public String getWpComUrlV2(long siteId) {
        return WPCOM_REST_PREFIX + "/" + WPAPI_PREFIX_V2 + "/sites/" + siteId + mEndpoint;
    }
}
