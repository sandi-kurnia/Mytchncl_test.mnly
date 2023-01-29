@ContactUs-Feature
  Feature: Functional Contact-Us Testing

    Scenario:User Submit Contact Us By Input All Required Fields
      Given User go to "https://moonlay.com/contact-us/"
        When User in "contact-us" page
          And User choose select value "Contact-Us"
          And user fills all the text field
            Then User success submit form
