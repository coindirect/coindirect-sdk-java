# Coindirect Java SDK

Coindirect
- API version: 1.0.1
  - Build date: 2019-08-14

The Coindirect API is offered to all users to make use of our Payments, P2P Marketplace, Exchange and Wallets.

  For more information, please visit [https://help.coindirect.com](https://help.coindirect.com)


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users (not in maven public, use a local or private repository)

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.coindirect</groupId>
  <artifactId>api</artifactId>
  <version>1.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users (not in maven public, use a local or private repository)

Add this dependency to your project's build file:

```groovy
compile "org.coindirect:api:1.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/api-1.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instructions.

You can then refer to example projects located at https://github.com/coindirect/examples-java



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@coindirect.com

