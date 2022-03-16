import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;

/*
* What is Javalin?
* - A dependency that provides server software
*   - This software allows our backend to actively look for:
*       - HTTP requests
*   - And send back:
*       - HTTP responses
*
* What is HTTP?
* - HyperText Transfer Protocol
*   - Transferring data between computers
*   - Examples: HTML, json, xml
*       - We will primarily be using json
*
* What is an HTTP request?
* - HTTP VERB: Gives us information on what action we should take
*   - POST - Creating entities
*   - PATCH - Partially updating an entity
*   - PUT - Fully updating an entity
*   - GET - Retrieving entities
*   - DELETE - Deleting entities
* - Header: Metadata added to the request/response
*   - Content-Type = "application/json"
* - Body: The data we are passing to the server
*
* What is an HTTP response?
* - Status code: Lets us know how successful the request was
*   - 100s: Informational
*   - 200s: Successful
*   - 300s: Redirects
*   - 400s: Client-Side Errors
*   - 500s: Server-Side Errors
* - Header: Metadata added to the request/response
* - Body: The data we are passing back to the client
*
* What is JSON?
* - JavaScript Object Notation
*   - Universal file format for transferring data
*
* What is Jackson?
* - Converts JSON strings to Java objects and vice/versa
*   - ObjectMapper
*       - writeValueAsString(Object obj); - Converts an object to a json string
*       - readValue(jsonstring, [class].class); - Converts a json string to an object
*
* What is a functional interface?
* - An interface with exactly one abstract method
*
* What is a lambda?
* - A way to implement functional interfaces in-line (in the method)
*
* */

public class MainDriver {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(9000);

        // http://localhost:9000/
        app.get("/", context -> {
           context.result("Hello Javalin");
        });

        app.get("/html", context -> {
           context.contentType("text/html");

           context.result("<html><body><h1>Hello Javalin</h1></body></html>");
        });

        app.get("/json", context -> {
           context.contentType("application/json");

           context.result("{\"username\": \"jah123\", \"password\": \"pass123\" }");
        });

        //Sending data from the client to the server
        /*
        * - Query param: http://localhost:9000/user?id=4
        * - Path param: http://localhost:9000/user/4
        * - Utilize the body to send json
        * - Form param: Forms in HTML
        * */

        //Query parameter
        app.get("/queryparam", context -> {
            //We are retrieving a query param with the key as 'username'
            //[url]/[path]?username=[value]
           String username = context.queryParam("username");

           context.result("Hello, " + username + "!");
        });

        //Path param
        app.get("/pathparam/user/{username}", context -> {
            String username = context.pathParam("username");

            context.result("Hello, " + username + "!");
        });

        app.post("/jackson/user", context -> {

            context.contentType("application/json");

            /*
            * What is Jackson?
            * - Jackson is a dependency that allows us to convert json strings to Java objects and vice/versa
            * */

            ObjectMapper objectMapper = new ObjectMapper();
            String json = context.body();

            User user = objectMapper.readValue(json, User.class);

            //User user2 = context.bodyAsClass(User.class);

            //context.json(user);

            context.result(objectMapper.writeValueAsString(user));
        });

        app.post("jsonbody/user", context -> {
            User user = context.bodyAsClass(User.class);

            context.json(user);
        });

        //Form params
        app.post("/formparam/user", context -> {
           String firstName = context.formParam("firstName");
           String lastName = context.formParam("lastName");

           User user = new User(firstName, lastName);

           context.status(418);

           context.json(user);
        });
    }
}
