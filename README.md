# url-shortening-challange

**Challenge**

People are frequently posting URLs using services that limit the length of a
message. They often use shorteners to fit more words into their messages, or do so
for other reasons, such as preventing a URL spanning multiple lines from being split
up and word-wrapped by email software, or just want to shorten lengthy URLs

(and http://lol.ca/ts is so much easier to post to Twitter than http://www.laughing-out-loud.com/FelisSilvestrisCatus.aspx).

_Your task is to build a Restful endpoint that takes a URL and provides a shorter URL.
When resolved, that URL should redirect the user to the original URL._


**Requirements**

• Your solution should be written in Java

• When given a long URL, the service should
shorten it and return the shortened URL

• Visiting the shortened URL should redirect the
visitor to the long URL

• You should provide source code and
instructions to build and run the program



**Attention**

• Attention on your code and design is the key
factor.
• We will be taking a deep look on your problem
solving skills, the loading time and the overall
design and coding standards.
• We will appreciate all your efforts but
recommend you to spend no more than 4 hours
solving this challenge.
• We will take everything in consideration, when
you're ready please send the test as an open
source repo on GitHub to your contact.

## **How to test**

### Test URL Shortening Endpoint:

Use a tool like Postman or cURL to send a POST request to your URL shortening endpoint (e.g., http://localhost:8080/api/shorten).

Example cURL command:

bash
Copy code
curl -X POST -H "Content-Type: text/plain" -d "https://example.com/very/long/url/to/be/shortened" http://localhost:8080/api/shorten

You should receive a response containing the shortened URL.

### Test Redirection:

Open a web browser or use cURL to access the shortened URL (e.g., http://localhost:8080/{shortened}). 
For instance:

bash
Copy code
curl -L http://localhost:8080/{shortened}
This request should redirect you to the original URL associated with the shortened one.

!note replace {shortened} with url/text you received from post request






