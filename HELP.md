# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.1/maven-plugin/reference/html/#build-image)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)

mvn verify sonar:sonar //application.proporties
sonar.token
||
./gradlew sonar //gradle.proporties
systemProp.sonar.host.url
systemProp.sonar.sourceEncoding
systemProp.sonar.forceAuthentication=
systemProp.sonar.projectKey
systemProp.sonar.organization
systemProp.sonar.login

mvn test //targer/site/jacoco
||
./gradlew test //build/jacoco/test