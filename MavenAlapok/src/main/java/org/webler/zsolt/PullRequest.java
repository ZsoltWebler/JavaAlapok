package org.webler.zsolt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URL;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PullRequest {
    private String authorUsername;
    private URL repositoryURL;
    private URL pullRequestURL;
}
