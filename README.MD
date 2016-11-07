# Running Tomcat 8 + Jersey 2 + Weld 2

## Prerequisites
* [Maven](https://maven.apache.org/)
* [Docker](https://www.docker.com/products/overview#/install_the_platform)

## Running the project
Open the terminal and build the project with maven:
```bash
mvn package
```

Build a docker image and run it.
```bash
docker build -t tomcat8-jersey2-weld2 .
docker run --rm -p 8080:8080 tomcat8-jersey2-weld2
```

That's it!!! After Tomcat initialization, open a url: http://localhost:8080/foo/bar