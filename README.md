# client

Coindirect
- API version: 1
  - Build date: 2018-07-10T11:44:48.559+02:00

The Coindirect API is offered to all users to make use of our P2P Marketplace, Exchange and Wallets.

  For more information, please visit [https://help.coindirect.com](https://help.coindirect.com)


## Requirements

Building the API client library requires:
1. Java 1.7+
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
  <artifactId>client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users (not in maven public, use a local or private repository)

Add this dependency to your project's build file:

```groovy
compile "org.coindirect:client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.coindirect.client.api.ExchangeApi;
import org.coindirect.client.api.ExchangeOrdersApi;
import org.coindirect.client.invoker.ApiClient;
import org.coindirect.client.invoker.ApiClientFactory;
import org.coindirect.client.model.ExchangeOrder;
import org.coindirect.client.model.ExchangeOrderRequest;
import org.coindirect.client.model.Market;

import java.math.BigDecimal;
import java.util.List;

public class PlaceOrder {
    public static void main(String[] args) {
        ApiClient apiClient = ApiClientFactory.newApiClient("YOUR-KEY", "YOUR-SECRET");
        ExchangeOrdersApi exchangeOrdersApi = new ExchangeOrdersApi(apiClient);
        try {
            ExchangeOrderRequest exchangeOrderRequest = new ExchangeOrderRequest();
            exchangeOrderRequest.setSide(ExchangeOrderRequest.SideEnum.BUY);
            exchangeOrderRequest.setType(ExchangeOrderRequest.TypeEnum.LIMIT);
            exchangeOrderRequest.setAmount(new BigDecimal("1.0"));
            exchangeOrderRequest.setPrice(new BigDecimal("0.1"));
            exchangeOrderRequest.setSymbol("ETH-BTC");

            ExchangeOrder exchangeOrder = exchangeOrdersApi.placeExchangeOrder(exchangeOrderRequest);
            System.out.println("Received exchangeOrder "+exchangeOrder);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}


```

## Documentation for API Endpoints

Please visit: https://coindirect.docs.stoplight.io/

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@coindirect.com

