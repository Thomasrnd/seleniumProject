@run
Feature: Login

  @CreateGist
  Scenario: creating gist
    Given that i want to access "https://gist.github.com/"
    When i want to login with "thomasrnd02@gmail.com" and "Thr5411692!"
    Then should navigate to gist homepage
    And i want to create gist
    When i want to create gist file with following
    |gist_description |gist_file_name |gist_fill  |
    |Testing Gist     |Testing Gist   |Test       |

  @EditGist
  Scenario: editing gist
    Given that i want to access "https://gist.github.com/"
    When i want to login with "thomasrnd02@gmail.com" and "Thr5411692!"
    Then should navigate to gist homepage
    And i want to update gist
    When i want to edit gist file with following
      |gist_description |gist_file_name |gist_fill  |
      |Testing Gist     |Testing Gist 1 |Test1      |

  @SeeAllGist
  Scenario: editing gist
    Given that i want to access "https://gist.github.com/"
    When i want to login with "thomasrnd02@gmail.com" and "Thr5411692!"
    Then should navigate to gist homepage
    And i want to see all my gist

  @DeleteGist
  Scenario: editing gist
    Given that i want to access "https://gist.github.com/"
    When i want to login with "thomasrnd02@gmail.com" and "Thr5411692!"
    Then should navigate to gist homepage
    And i want to delete gist