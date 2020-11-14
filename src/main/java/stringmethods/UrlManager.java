package stringmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UrlManager {

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        protocol = sliceProtocol(url);
        host = sliceHost(url);
        port = slicePort(url);
        path = slicePath(url);
        query = sliceQuery(url);
    }

    private String sliceProtocol(String url) {
        isEmptyOrNull(url, ":", "Invalid url");

        return url.substring(0, url.indexOf(":")).toLowerCase();
    }

    private String sliceHost(String url) {
        isEmptyOrNull(url, ".", "Invalid url");

        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf(":", startIndex);
        if (endIndex == -1) {
            endIndex = url.indexOf("/", startIndex);
        }
        if (endIndex == -1) {
            return url.substring(startIndex).toLowerCase();
        }
        return url.substring(startIndex, endIndex).toLowerCase();
    }

    public boolean hasProperty(String key) {
        if (key == null || key.isBlank()) {
            throw new IllegalArgumentException("No property.");
        }
        String[] properties = query.split("[&=]");
        for (String item: properties) {
            if (item.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public String getProperty(String key) {
        if (key == null || key.isBlank()) {
            throw new IllegalArgumentException("This property it doesn't exist.");
        }
        String[] properties = query.split("[&=]");
        for (int i = 0; i < properties.length / 2; i += 2) {
            if (properties[i].equals(key)) {
                return properties[i + 1];
            }
        }
        return null;
    }



    private void isEmptyOrNull(String url, String searchedString, String errorMessage) {
        if (url == null || url.isBlank() || !url.contains(searchedString)) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    private String slicePath(String url) {
        int startIndex = url.indexOf("://") + 3;
        startIndex = url.indexOf("/", startIndex);
        if (startIndex == -1) {
            return "";
        }
        int endIndex = url.indexOf("?", startIndex);

        return url.substring(startIndex, endIndex);
    }

    private String sliceQuery(String url) {
        if (!url.contains("query")) {
            return "";
        }
        String query = url.substring(url.indexOf("query?") + 6);

        return query;
    }

    public Integer slicePort(String url) {
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf(":", startIndex);
        if (endIndex == -1) {
            return null;
        }
        startIndex = endIndex + 1;
        endIndex = url.indexOf("/", startIndex);
        if (endIndex == -1) {
            return Integer.parseInt(url.substring(startIndex));
        }
        return Integer.parseInt(url.substring(startIndex, endIndex));
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }
}
