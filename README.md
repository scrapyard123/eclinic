# eclinic

This is an example application written (mostly) in Forward programming language.

## Installation

**NOTE**: Remember to change all default passwords.

1. Install JDK 17, Maven, Docker.
2. Run `sudo docker run -p 3306:3306 --name eclinic-mysql -e MYSQL_ROOT_PASSWORD=password -d mysql:8`.
3. Connect to the MySQL instance and run all queries from `webapp/src/main/resources/init.sql`.
4. Clone https://github.com/scrapyard123/forward-lang and run `mvn clean install`.
5. Run `mvn clean package` to build the application.
6. Run `mvn spring-boot:run -pl webapp` to run the application.
7. Visit http://localhost:8080/swagger-ui/index.html to perform calls and check `API.md` for examples.

### Running MySQL on Host Machine
Instead of installing Docker in step 1, install MySQL on host and perform initial configuration.
Skip step 2 afterward.
