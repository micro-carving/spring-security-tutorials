# [Spring Security OAuth 2.4 Migration Sample](https://github.com/jgrandja/spring-security-oauth-2-4-migrate)

This sample should be used for migrating a Spring Security OAuth 2.x application to Spring Security 5.2.

This is the Spring Security OAuth 2.4 sample and the corresponding Spring Security 5.2 sample is [here](https://github.com/jgrandja/spring-security-oauth-5-2-migrate).

See the [OAuth 2.0 Migration Guide](https://github.com/spring-projects/spring-security/wiki/OAuth-2.0-Migration-Guide) for further details.

## Run the Sample

- Build the sample -> `./mvnw clean package`
- Run Authorization Server -> `./mvnw -f auth-server spring-boot:run`
  -- IMPORTANT: Make sure to modify your `/etc/hosts` file to avoid problems with session cookie overwrites between `client-app` and `auth-server`. Simply add the entry `127.0.0.1	auth-server`
- Run Resource Server -> `./mvnw -f resource-server spring-boot:run`
- Run Client App -> `./mvnw -f client-app spring-boot:run`
- Go to `http://localhost:8080` and login using **user1/password**
