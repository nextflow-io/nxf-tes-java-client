
# TesListTasksRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project** | **String** | Filter the task list to include tasks in this project. |  [optional]
**namePrefix** | **String** | Filter the list to include tasks where the name matches this prefix. If unspecified, no task name filtering is done. |  [optional]
**pageSize** | **Long** | Number of tasks to return in one page. Must be less than 2048. Defaults to 256. |  [optional]
**pageToken** | **String** | Page token is used to retrieve the next page of results. If unspecified, returns the first page of results. See ListTasksResponse.next_page_token |  [optional]
**view** | [**ViewEnum**](#ViewEnum) | TaskView affects the fields returned by the ListTasks endpoint.  Some of the fields in task can be large strings (e.g. logs), which can be a burden on the network. In the default BASIC view, these heavyweight fields are not included, however, a client may request the FULL version to include these fields.   - MINIMAL: Task message will include ONLY the fields:   Task.Id   Task.State  - BASIC: Task message will include all fields EXCEPT:   Task.ExecutorLog.stdout   Task.ExecutorLog.stderr   TaskParameter.Contents in Task.Inputs  - FULL: Task message includes all fields. |  [optional]


<a name="ViewEnum"></a>
## Enum: ViewEnum
Name | Value
---- | -----
MINIMAL | &quot;MINIMAL&quot;
BASIC | &quot;BASIC&quot;
FULL | &quot;FULL&quot;



