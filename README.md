# Product microservice

## Description

<p>This spring boot project is created to understand the architecture of microservices in local, for to work with this project we need to clone other projects because this arquitecture consist of:</p>

1. **Store microservice**
2. **Discovery client**
3. **Config server client**
4. **Config repository**
5. **Gateway**

## Architecture

![Architecture diagram.](https://raw.githubusercontent.com/DeyvidGar/assets/master/Microservice-architecture.png)

## Configuration

<p>This projects was builds with the next dependencies:</p>

- **Spring-boot 3.2.3**
- **Springframework 6.1.4**
- **Lombok**
- **Spring web**
- **Actuator**
- **Eureka client**
- **Config Client**
- **MongoDB**

## Instruction to work with Microservice architecture

### 1. Discovery server

<p>In first instance we need to start up is discovery server, in spring we need a project with eureka server.</p>

<p>You can clone the repository:</p>

```console
https://github.com/DeyvidGar/discovery-server.git
```

### 2. Config server

<p>The second instance we need to start up is config server, in spring we need a project with config server.</p>

<p>You can clone the repository:</p>

```console
https://github.com/DeyvidGar/config-server.git
```

### 3. Config repository

<p>The thrid step is locate or create a remote repository in github that represent an centralized configuration files.</p>

<p>You can use the repository:</p>

```console
https://github.com/DeyvidGar/config-repository-microservices.git
```

### 4. Start up microservices

<p>Finally steps is create the microservice apps, for example you can clone the artifact of a microservice.</p>

<p>You can clone the repository:</p>

```console
https://github.com/DeyvidGar/initial-artifact-microservice.git
```

### 5. Start up Gateway

<p>Finally steps is create the microservice apps, for example you can clone the artifact of a microservice.</p>

<p>You can clone the repository:</p>

```console
https://github.com/DeyvidGar/api-gateway.git
```

## What i need?

<p>You need to have installed:<p>

- Java 17 or >
- Maven.
- Intellij IDE.
- Eclipse or STS IDE.
- Enable Lombok annotation.

## What run the application?

### For Git bash windows console

<p>We can run the application in console following the next steps:</p>

<p>First ensure the path variable in JAVA_HOME should be 17.</p>

1. To find all paths environment variables.

```console
env
```

2. Of only get the JAVA_HOME value.

```console
echo JAVA_HOME
```

3. Now set the route of your jdk-17.

```console
export JAVA_HOME='C:\Program Files\Java\jdk-17'
```

4. Recommended execute the next command to ensure that the correct running.

```console
mvn clean install
```

5. Finally execute the command to start spring boot application.

```console
mvn spring-boot:run
```

### For Intellij IDE

<p>We can run the application in intellij following the next steps:</p>

> 1. Find the main class in com.deyvis.initialartifactms.InitialArtifactMsApplication.java

> 2. Right click and Run 'InitialArtifactMsApplication.main()'

### For Eclipse or STS IDE

<p>We can run the application in Eclipse following the next steps:</p>

> 1. Find in the package explorer this proyect

> 2. Right click and Run as -> Spring boot application.