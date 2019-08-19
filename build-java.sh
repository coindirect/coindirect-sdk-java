VERSION="1.0.2"

java -jar ~/IdeaProjects/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate --artifact-version "$VERSION" --http-user-agent "Coindirect/Java $VERSION" -c config/java.json -l java -i http://localhost:9080/swagger.json  -DhideGenerationTimestamp=true -o .
