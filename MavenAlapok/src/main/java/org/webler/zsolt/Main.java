package org.webler.zsolt;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;
import java.util.*;

public class Main {

    public static Map<Developer, List<Developer>> pullRequestLottery(List<Developer> developerList) {

        Map<Developer, List<Developer>> map = new HashMap<>();
        Random rnd = new Random();

        for (Developer developer : developerList) {
            List<Developer> tmp = new ArrayList<>(developerList);
            tmp.remove(developer);
            Developer developer_1 = tmp.get(rnd.nextInt(tmp.size() - 1));
            tmp.remove(developer_1);
            Developer developer_2 = tmp.get(rnd.nextInt(tmp.size() - 1));
            map.put(developer, Arrays.asList(developer_1, developer_2));
        }

        return map;
    }

    public static void main(String[] args) throws Exception {

        Developer dev_1 = new Developer(
                "Kis",
                "Jakab",
                new PullRequest(
                        "KisJakab",
                        new URL("http://google.com"),
                        new URL("http://google.com")));

        Developer dev_2 = new Developer(
                "Nagy",
                "Ottó",
                new PullRequest(
                        "KisJakab",
                        new URL("http://google.com"),
                        new URL("http://google.com")));

        Developer dev_3 = new Developer(
                "Közepes",
                "Géza",
                new PullRequest(
                        "KisJakab",
                        new URL("http://google.com"),
                        new URL("http://google.com")));

        Developer dev_4 = new Developer(
                "Antal",
                "Zsolt",
                new PullRequest(
                        "KisJakab",
                        new URL("http://google.com"),
                        new URL("http://google.com")));

        JsonPrinter.print(pullRequestLottery(Arrays.asList(dev_1, dev_2, dev_3, dev_4)));

    }
}