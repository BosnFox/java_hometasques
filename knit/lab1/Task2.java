package org.knit.lab1;

public class Task2 {
    public void execute() {
        SimpleUrl url = new SimpleUrl("https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText");
        url.setAddress("sgu.ru");
        url.setProtocol("http");
        System.out.println(url);
    }

    static class SimpleUrl {
        private String address;
        private String protocol;
        private String link;
        private String domainZone;
        private String siteName;
        private String webpageName;
        private String webpageExtention;

        public String toString() {
            return String.format("address=%s\nprotocol=%s\nlink=%s\n" +
                    "domainZone=%s\nsiteName=%s\nwebpageName=%s\nwebpageExtention=%s", address, protocol, link,
                    domainZone, siteName, webpageName, webpageExtention);
        }

        public SimpleUrl(String link) {
            this.link = link;
        }

        public void setLink(String inp) {
            this.link = inp;
        }

        public String getLink() {
            return this.link;
        }

        public void setAddress(String inp) {
            this.address = inp;
        }

        public String getAddress() {
            return this.address;
        }

        public void setProtocol(String inp) {
            this.protocol = inp;
        }

        public String getProtocol() {
            return this.protocol;
        }

        public String getDomainZone() {
            return this.domainZone;
        }

        public void setDomainZone(String domainZone) {
            this.domainZone = domainZone;
        }

        public String getSiteName() {
            return this.siteName;
        }

        public void setSiteName(String siteName) {
            this.siteName = siteName;
        }

        public String getWebpageName() {
            return this.webpageName;
        }

        public void setWebpageName(String webpageName) {
            this.webpageName = webpageName;
        }

        public String getWebPageExtention() {
            return this.webpageExtention;
        }

        public void setWebPageExtention(String webPageExtention) {
            this.webpageExtention = webPageExtention;
        }

    }
}
