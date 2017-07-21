# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.TaskServiceApi;

import java.io.File;
import java.util.*;

public class TaskServiceApiExample {

    public static void main(String[] args) {
        
        TaskServiceApi apiInstance = new TaskServiceApi();
        String id = "id_example"; // String | 
        try {
            Object result = apiInstance.cancelTask(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskServiceApi#cancelTask");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*TaskServiceApi* | [**cancelTask**](docs/TaskServiceApi.md#cancelTask) | **POST** /v1/tasks/{id}:cancel | Cancel a task.
*TaskServiceApi* | [**createTask**](docs/TaskServiceApi.md#createTask) | **POST** /v1/tasks | Create a new task.
*TaskServiceApi* | [**getServiceInfo**](docs/TaskServiceApi.md#getServiceInfo) | **GET** /v1/tasks/service-info | GetServiceInfo provides information about the service, such as storage details, resource availability, and  other documentation.
*TaskServiceApi* | [**getTask**](docs/TaskServiceApi.md#getTask) | **GET** /v1/tasks/{id} | Get a task. TaskView is requested as such: \&quot;v1/tasks/{id}?view&#x3D;FULL\&quot;
*TaskServiceApi* | [**listTasks**](docs/TaskServiceApi.md#listTasks) | **GET** /v1/tasks | List tasks. TaskView is requested as such: \&quot;v1/tasks?view&#x3D;BASIC\&quot;


## Documentation for Models

 - [Body](docs/Body.md)
 - [OUTPUTONLY](docs/OUTPUTONLY.md)
 - [OUTPUTONLY1](docs/OUTPUTONLY1.md)
 - [OUTPUTONLY2](docs/OUTPUTONLY2.md)
 - [OUTPUTONLY3](docs/OUTPUTONLY3.md)
 - [OUTPUTONLY4](docs/OUTPUTONLY4.md)
 - [OUTPUTONLYExecutors](docs/OUTPUTONLYExecutors.md)
 - [OUTPUTONLYInputs](docs/OUTPUTONLYInputs.md)
 - [OUTPUTONLYPorts](docs/OUTPUTONLYPorts.md)
 - [OUTPUTONLYResources](docs/OUTPUTONLYResources.md)
 - [OUTPUTONLYTasks](docs/OUTPUTONLYTasks.md)
 - [TesCancelTaskRequest](docs/TesCancelTaskRequest.md)
 - [TesCancelTaskResponse](docs/TesCancelTaskResponse.md)
 - [TesCreateTaskResponse](docs/TesCreateTaskResponse.md)
 - [TesExecutor](docs/TesExecutor.md)
 - [TesExecutorLog](docs/TesExecutorLog.md)
 - [TesFileType](docs/TesFileType.md)
 - [TesGetTaskRequest](docs/TesGetTaskRequest.md)
 - [TesListTasksRequest](docs/TesListTasksRequest.md)
 - [TesListTasksResponse](docs/TesListTasksResponse.md)
 - [TesOutputFileLog](docs/TesOutputFileLog.md)
 - [TesPorts](docs/TesPorts.md)
 - [TesResources](docs/TesResources.md)
 - [TesServiceInfo](docs/TesServiceInfo.md)
 - [TesServiceInfoRequest](docs/TesServiceInfoRequest.md)
 - [TesState](docs/TesState.md)
 - [TesTask](docs/TesTask.md)
 - [TesTaskLog](docs/TesTaskLog.md)
 - [TesTaskParameter](docs/TesTaskParameter.md)
 - [TesTaskView](docs/TesTaskView.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



