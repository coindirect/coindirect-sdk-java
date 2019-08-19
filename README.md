# Coindirect Java SDK

Coindirect
- API version: 1.0.2
  - Build date: 2019-08-19

The Coindirect API is offered to all users to make use of our Payments, P2P Marketplace, Exchange and Wallets.

  For more information, please visit [https://help.coindirect.com](https://help.coindirect.com)


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

### Maven users 

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.coindirect</groupId>
  <artifactId>api</artifactId>
  <version>1.0.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users 

Add this dependency to your project's build file:

```groovy
compile "org.coindirect:api:1.0.2"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/api-1.0.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instructions.

You can then refer to example projects located at https://github.com/coindirect/examples-java



## Recommendation

It's recommended to create an instance of `CoindirectApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@coindirect.com

