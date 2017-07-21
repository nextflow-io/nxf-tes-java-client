# TaskServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelTask**](TaskServiceApi.md#cancelTask) | **POST** /v1/tasks/{id}:cancel | Cancel a task.
[**createTask**](TaskServiceApi.md#createTask) | **POST** /v1/tasks | Create a new task.
[**getServiceInfo**](TaskServiceApi.md#getServiceInfo) | **GET** /v1/tasks/service-info | GetServiceInfo provides information about the service, such as storage details, resource availability, and  other documentation.
[**getTask**](TaskServiceApi.md#getTask) | **GET** /v1/tasks/{id} | Get a task. TaskView is requested as such: \&quot;v1/tasks/{id}?view&#x3D;FULL\&quot;
[**listTasks**](TaskServiceApi.md#listTasks) | **GET** /v1/tasks | List tasks. TaskView is requested as such: \&quot;v1/tasks?view&#x3D;BASIC\&quot;


<a name="cancelTask"></a>
# **cancelTask**
> Object cancelTask(id)

Cancel a task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaskServiceApi;


TaskServiceApi apiInstance = new TaskServiceApi();
String id = "id_example"; // String | 
try {
    Object result = apiInstance.cancelTask(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskServiceApi#cancelTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTask"></a>
# **createTask**
> OUTPUTONLY3 createTask(body)

Create a new task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaskServiceApi;


TaskServiceApi apiInstance = new TaskServiceApi();
Body body = new Body(); // Body | 
try {
    OUTPUTONLY3 result = apiInstance.createTask(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskServiceApi#createTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)|  |

### Return type

[**OUTPUTONLY3**](OUTPUTONLY3.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getServiceInfo"></a>
# **getServiceInfo**
> OUTPUTONLY4 getServiceInfo()

GetServiceInfo provides information about the service, such as storage details, resource availability, and  other documentation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaskServiceApi;


TaskServiceApi apiInstance = new TaskServiceApi();
try {
    OUTPUTONLY4 result = apiInstance.getServiceInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskServiceApi#getServiceInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OUTPUTONLY4**](OUTPUTONLY4.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTask"></a>
# **getTask**
> OUTPUTONLYTasks getTask(id, view)

Get a task. TaskView is requested as such: \&quot;v1/tasks/{id}?view&#x3D;FULL\&quot;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaskServiceApi;


TaskServiceApi apiInstance = new TaskServiceApi();
String id = "id_example"; // String | 
String view = "MINIMAL"; // String | OPTIONAL. Affects the fields included in the returned Task messages. See TaskView below.   - MINIMAL: Task message will include ONLY the fields:   Task.Id   Task.State  - BASIC: Task message will include all fields EXCEPT:   Task.ExecutorLog.stdout   Task.ExecutorLog.stderr   TaskParameter.Contents in Task.Inputs  - FULL: Task message includes all fields.
try {
    OUTPUTONLYTasks result = apiInstance.getTask(id, view);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskServiceApi#getTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **view** | **String**| OPTIONAL. Affects the fields included in the returned Task messages. See TaskView below.   - MINIMAL: Task message will include ONLY the fields:   Task.Id   Task.State  - BASIC: Task message will include all fields EXCEPT:   Task.ExecutorLog.stdout   Task.ExecutorLog.stderr   TaskParameter.Contents in Task.Inputs  - FULL: Task message includes all fields. | [optional] [default to MINIMAL] [enum: MINIMAL, BASIC, FULL]

### Return type

[**OUTPUTONLYTasks**](OUTPUTONLYTasks.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTasks"></a>
# **listTasks**
> OUTPUTONLY listTasks(project, namePrefix, pageSize, pageToken, view)

List tasks. TaskView is requested as such: \&quot;v1/tasks?view&#x3D;BASIC\&quot;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaskServiceApi;


TaskServiceApi apiInstance = new TaskServiceApi();
String project = "project_example"; // String | OPTIONAL. Filter the task list to include tasks in this project.
String namePrefix = "namePrefix_example"; // String | OPTIONAL. Filter the list to include tasks where the name matches this prefix. If unspecified, no task name filtering is done.
Long pageSize = 789L; // Long | OPTIONAL. Number of tasks to return in one page. Must be less than 2048. Defaults to 256.
String pageToken = "pageToken_example"; // String | OPTIONAL. Page token is used to retrieve the next page of results. If unspecified, returns the first page of results. See ListTasksResponse.next_page_token
String view = "MINIMAL"; // String | OPTIONAL. Affects the fields included in the returned Task messages. See TaskView below.   - MINIMAL: Task message will include ONLY the fields:   Task.Id   Task.State  - BASIC: Task message will include all fields EXCEPT:   Task.ExecutorLog.stdout   Task.ExecutorLog.stderr   TaskParameter.Contents in Task.Inputs  - FULL: Task message includes all fields.
try {
    OUTPUTONLY result = apiInstance.listTasks(project, namePrefix, pageSize, pageToken, view);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskServiceApi#listTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | **String**| OPTIONAL. Filter the task list to include tasks in this project. | [optional]
 **namePrefix** | **String**| OPTIONAL. Filter the list to include tasks where the name matches this prefix. If unspecified, no task name filtering is done. | [optional]
 **pageSize** | **Long**| OPTIONAL. Number of tasks to return in one page. Must be less than 2048. Defaults to 256. | [optional]
 **pageToken** | **String**| OPTIONAL. Page token is used to retrieve the next page of results. If unspecified, returns the first page of results. See ListTasksResponse.next_page_token | [optional]
 **view** | **String**| OPTIONAL. Affects the fields included in the returned Task messages. See TaskView below.   - MINIMAL: Task message will include ONLY the fields:   Task.Id   Task.State  - BASIC: Task message will include all fields EXCEPT:   Task.ExecutorLog.stdout   Task.ExecutorLog.stderr   TaskParameter.Contents in Task.Inputs  - FULL: Task message includes all fields. | [optional] [default to MINIMAL] [enum: MINIMAL, BASIC, FULL]

### Return type

[**OUTPUTONLY**](OUTPUTONLY.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

