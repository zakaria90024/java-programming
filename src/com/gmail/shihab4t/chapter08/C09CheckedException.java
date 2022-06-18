package com.gmail.shihab4t.chapter08;

class DataFetcher {
    public String fetchFromUrl(String url) throws CheckedException {
        if (url == null) {
            throw new CheckedException("Url not found");
        }
        String data = null;

        // rest of the statements
        // read lots of data over HTTP and return
        // it as a String instance
        return data;
    }
}

class CheckedException extends Exception {
    public CheckedException(String message) {
        super(message);
    }
}


class DataFetcherDemo {
    public void fetchData() {
        DataFetcher dataFetcher = new DataFetcher();
        String url = "https://google.com";

        try {
            dataFetcher.fetchFromUrl(url);
        } catch (CheckedException e) {
            System.out.println("Unable to fetch data");
        }
    }
}

class DataFetcherDemo2 {
    public void fetchData() throws CheckedException {
        DataFetcher dataFetcher = new DataFetcher();
        String url = "https://google.com";

        dataFetcher.fetchFromUrl(url);
    }
}