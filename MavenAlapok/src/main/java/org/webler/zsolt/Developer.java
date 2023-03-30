package org.webler.zsolt;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Developer {
    private String surname;
    private String lastName;
    private PullRequest pullRequest;

}
