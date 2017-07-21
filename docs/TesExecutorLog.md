
# TesExecutorLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startTime** | **String** | Time the executor started, in RFC 3339 format. |  [optional]
**endTime** | **String** | Time the executor ended, in RFC 3339 format. |  [optional]
**stdout** | **String** | Stdout tail. This is not guaranteed to be the entire log. Implementations determine the maximum size. |  [optional]
**stderr** | **String** | Stderr tail. This is not guaranteed to be the entire log. Implementations determine the maximum size. |  [optional]
**exitCode** | **Integer** | Exit code. |  [optional]
**hostIp** | **String** | IP address of host. |  [optional]
**ports** | [**List&lt;OUTPUTONLYPorts&gt;**](OUTPUTONLYPorts.md) | Ports mapped between the container and host. |  [optional]



