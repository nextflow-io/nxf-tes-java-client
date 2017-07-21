
# OUTPUTONLYTasks

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Task identifier assigned by the server. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Task states.   - PAUSED: An implementation *may* have the ability to pause a task, but this is not required. |  [optional]
**name** | **String** |  |  [optional]
**project** | **String** | Describes the project this task is associated with. Commonly used for billing on cloud providers (AWS, Google Cloud, etc). |  [optional]
**description** | **String** |  |  [optional]
**inputs** | [**List&lt;OUTPUTONLYInputs&gt;**](OUTPUTONLYInputs.md) | Input files. Inputs will be downloaded and mounted into the executor container. |  [optional]
**outputs** | [**List&lt;OUTPUTONLYInputs&gt;**](OUTPUTONLYInputs.md) | Output files. Outputs will be uploaded from the executor container to long-term storage. |  [optional]
**resources** | [**OUTPUTONLYResources**](OUTPUTONLYResources.md) |  |  [optional]
**executors** | [**List&lt;OUTPUTONLYExecutors&gt;**](OUTPUTONLYExecutors.md) | A list of executors to be run, sequentially. |  [optional]
**volumes** | **List&lt;String&gt;** | Declared volumes. Volumes are shared between executors. Volumes for inputs and outputs are  inferred and should not be delcared here. |  [optional]
**tags** | **Map&lt;String, String&gt;** | A key-value map of arbitrary tags. |  [optional]
**logs** | [**List&lt;OUTPUTONLY2&gt;**](OUTPUTONLY2.md) | Task logging information. Normally, this will contain only one entry, but in the case where a task fails and is retried, an entry will be appended to this list. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
QUEUED | &quot;QUEUED&quot;
INITIALIZING | &quot;INITIALIZING&quot;
RUNNING | &quot;RUNNING&quot;
PAUSED | &quot;PAUSED&quot;
COMPLETE | &quot;COMPLETE&quot;
ERROR | &quot;ERROR&quot;
SYSTEM_ERROR | &quot;SYSTEM_ERROR&quot;
CANCELED | &quot;CANCELED&quot;



